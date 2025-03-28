<img src=".github/ASSETS/voltmint-logo-with-text.svg" width="512" alt="VoltMint">

<!-- BUILD BADGE -->
<a href="https://github.com/VoltMint/VoltMint/actions?query=workflow%3A%22CI%22">
  <img alt="Build Status" src="https://github.com/VoltMint/VoltMint/workflows/CI/badge.svg">
</a>

<!-- STAR BADGE -->
<a href="https://github.com/VoltMint/VoltMint/stargazers">
  <img alt="GitHub Stars" src="https://img.shields.io/github/stars/VoltMint/VoltMint.svg">
</a>

<!-- ISSUES BADGE -->
<a href="https://github.com/VoltMint/VoltMint/issues">
  <img alt="GitHub Stars" src="https://img.shields.io/github/issues/VoltMint/VoltMint.svg">
</a>

<!-- VERSION BADGE -->
<a href="https://github.com/VoltMint/VoltMint/releases">
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-green.svg">
</a>

<!-- LICENSE BADGE -->
<a href="https://opensource.org/licenses/BSD-3-Clause">
  <img alt="License" src="https://img.shields.io/badge/License-BSD%203--Clause-blue.svg">
</a>

GoMint is a modern Minecraft Bedrock Edition server enabling you to make your visions come true

![Start Sequence](https://cdn.discordapp.com/attachments/746763011875799040/798663623547158539/sNgUe2IpW6.gif)

## ❇ Getting Started
- [🌐 Website](https://gomint.io)
- [📖 Documentation](https://docs.gomint.io)
- [🗣 Discord Server](https://discord.com/invite/qC4nJVN)

## 📦 Features
- ⚡ High performance, fast startup and low resource usage
- 🔧 Highly configurable via configuration files
- 🔌 Functionality extendable via plugins
- 🗝 Cryptography implementations in Rust
- 💫 Crafting, enchanting, all blocks, all items

## ⏬ Download
- [🟢 Latest tag](https://github.com/gomint/gomint/releases/download/1.0.0-RC6/1.0.0-RC6.zip)
- [🟡 Latest build](https://gomint-artifacts.s3.amazonaws.com/latest.zip)

⚠ **The following one-liner scripts download the latest build, not the latest tag!**
⚠ **GoMint requires Java version 11 or higher!**

#### Windows Command Line
```bash
powershell.exe "$ProgressPreference = 'SilentlyContinue'; Invoke-WebRequest -Uri 'https://gomint-artifacts.s3.amazonaws.com/latest.zip' -OutFile gomint.zip; $Random = Get-Random -Maximum 0xFFFFFF; Expand-Archive -LiteralPath gomint.zip -DestinationPath gomint-$Random; Write-Output gomint-$Random"
```

#### PowerShell
```powershell
$ProgressPreference = 'SilentlyContinue'; `
    Invoke-WebRequest -Uri 'https://gomint-artifacts.s3.amazonaws.com/latest.zip' -OutFile gomint.zip; `
    $Random = Get-Random -Maximum 0xFFFFFF; `
    Expand-Archive -LiteralPath gomint.zip -DestinationPath gomint-$Random; `
    Write-Output gomint-$Random
```

#### Unix (Curl + Core Utils)
```bash
WORKSPACE=gomint-$(cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 6 | head -n 1) && \
	curl --silent -o gomint.zip https://gomint-artifacts.s3.amazonaws.com/latest.zip && \
	unzip gomint.zip -d $WORKSPACE && echo $WORKSPACE
```

#### Unix (Wget + Core Utils)
```bash
WORKSPACE=gomint-$(cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 6 | head -n 1) && \
	wget --quiet -O gomint.zip https://gomint-artifacts.s3.amazonaws.com/latest.zip && \
	unzip gomint.zip -d $WORKSPACE && echo $WORKSPACE
```

## 💠 Integration
### CloudNet V3
_Guide coming soon_

### Docker
_Guide coming soon_

### Pterodactyl
_Guide coming soon_

## ⚒ Compilation
**Bundled Maven (Windows Command Line)**
```bash
mvnw clean install
```

**Bundled Maven (Shell)**
```bash
./mvnw.sh clean install
```

**Local Maven Installation**
```bash
mvn clean install
```

## 🚀 Developer setup
You need to run compilation at least once since there is a code generator configured. Once you have done that you can add `io.gomint.server.Bootstrap` as a runner. 
That runner needs custom options for Netty `--add-opens java.base/java.nio=io.netty.common --add-exports java.base/jdk.internal.misc=io.netty.common --add-modules ALL-DEFAULT`.

If not properly configured you will see this error when the first connection arrives:

```
[jRaknet events] WARN  io.netty.channel.DefaultChannelPipeline - An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.
java.lang.UnsupportedOperationException: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available
```

## 👥 Contributors
#### 📝 Code Contributors
This project exists thanks to all the people who contribute. [[Contribute](CONTRIBUTING.md)].
<a href="https://github.com/GoMint/GoMint/graphs/contributors"><img src="https://opencollective.com/GoMint/contributors.svg?width=890&button=false" /></a>

#### 💸 Financial Contributors
Become a financial contributor and help us sustain our community. [[Contribute](https://opencollective.com/GoMint/contribute)]

##### Individuals
<a href="https://opencollective.com/GoMint"><img src="https://opencollective.com/GoMint/individuals.svg?width=890"></a>

##### Organizations
Support this project with your organization. Your logo will show up here with a link to your website. [[Contribute](https://opencollective.com/GoMint/contribute)]

<a href="https://opencollective.com/GoMint/organization/0/website"><img src="https://opencollective.com/GoMint/organization/0/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/1/website"><img src="https://opencollective.com/GoMint/organization/1/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/2/website"><img src="https://opencollective.com/GoMint/organization/2/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/3/website"><img src="https://opencollective.com/GoMint/organization/3/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/4/website"><img src="https://opencollective.com/GoMint/organization/4/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/5/website"><img src="https://opencollective.com/GoMint/organization/5/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/6/website"><img src="https://opencollective.com/GoMint/organization/6/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/7/website"><img src="https://opencollective.com/GoMint/organization/7/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/8/website"><img src="https://opencollective.com/GoMint/organization/8/avatar.svg"></a>
<a href="https://opencollective.com/GoMint/organization/9/website"><img src="https://opencollective.com/GoMint/organization/9/avatar.svg"></a>
