package io.gomint.server.network.packet;

import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.network.Protocol;
import java.util.List;

public class PacketDeathInfo extends Packet {
	private String messageTranslationKey;
	private List<String> messageParameters;

	public PacketDeathInfo() {
		super(Protocol.PACKET_DEATH_INFO);
	}

	public static PacketDeathInfo create(String messageTranslationKey, List<String> messageParameters) {
		PacketDeathInfo packet = new PacketDeathInfo();
		packet.messageTranslationKey = messageTranslationKey;
		packet.messageParameters = messageParameters;
		return packet;
	}

	public String getMessageTranslationKey() {
		return messageTranslationKey;
	}

	public List<String> getMessageParameters() {
		return messageParameters;
	}

	@Override
	public void serialize(PacketBuffer buffer, int protocolID) {
		buffer.writeString(this.messageTranslationKey);
		buffer.writeUnsignedVarInt(this.messageParameters.size());
		for (String parameter : this.messageParameters) {
			buffer.writeString(parameter);
		}
	}

	@Override
	public void deserialize(PacketBuffer buffer, int protocolID) {
		this.messageTranslationKey = buffer.readString();
		int paramCount = buffer.readUnsignedVarInt();
		for (int i = 0; i < paramCount; i++) {
			this.messageParameters.add(buffer.readString());
		}
	}
}
