import os
import jwt
import time
import requests

GH_APP_ID = os.getenv("GH_APP_ID")
GH_INSTALLATION_ID = os.getenv("GH_INSTALLATION_ID")
GH_PRIVATE_KEY = os.getenv("GH_APP_PRIVATE_KEY").replace("\\n", "\n")

REPO = "VoltMint/VoltMint"

def get_jwt():
    now = int(time.time())
    payload = {
        "iat": now - 60,
        "exp": now + (10 * 60),
        "iss": GH_APP_ID,
    }
    return jwt.encode(payload, GH_PRIVATE_KEY, algorithm="RS256")

def get_installation_token():
    jwt_token = get_jwt()
    url = f"https://api.github.com/app/installations/{GH_INSTALLATION_ID}/access_tokens"
    headers = {"Authorization": f"Bearer {jwt_token}", "Accept": "application/vnd.github+json"}
    response = requests.post(url, headers=headers)
    return response.json().get("token")

def check_build_status():
    with open("build.log", "r") as log_file:
        log_content = log_file.read()
        return "BUILD FAILURE" in log_content

def extract_error_logs():
    with open("build.log", "r") as log_file:
        lines = log_file.readlines()

    error_logs = []
    capture = False

    for line in lines:
        if "BUILD FAILURE" in line:
            capture = True
        if capture:
            error_logs.append(line)

    # Gabungkan error log dan batasi panjang agar tidak terlalu besar
    error_message = "".join(error_logs).strip()
    return f"```\n{error_message[:3000]}\n```" if error_message else "No error details found."

def create_issue():
    if not check_build_status():
        print("Build succeeded, no issue created.")
        return

    title = "Build Failed: mvn clean package"
    body = extract_error_logs()  # Masukkan log error ke dalam issue

    token = get_installation_token()
    issue_url = f"https://api.github.com/repos/{REPO}/issues"
    headers = {"Authorization": f"token {token}", "Accept": "application/vnd.github+json"}

    labels_url = f"https://api.github.com/repos/{REPO}/labels"
    labels_response = requests.get(labels_url, headers=headers).json()
    existing_labels = {label["name"] for label in labels_response}

    labels_to_add = ["Type: Bug", "Category: Build Failure"]
    for label in labels_to_add:
        if label not in existing_labels:
            requests.post(labels_url, headers=headers, json={"name": label, "color": "d73a4a"})

    issue_data = {"title": title, "body": body, "labels": labels_to_add}
    response = requests.post(issue_url, headers=headers, json=issue_data)

    if response.status_code == 201:
        print(f"Issue '{title}' created successfully!")
    else:
        print(f"Failed to create issue: {response.text}")

if __name__ == "__main__":
    create_issue()
