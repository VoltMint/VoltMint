package io.gomint.server.network.packet;

import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.network.Protocol;
import io.gomint.taglib.NBTTagCompound;

public class PacketEditorNetwork extends Packet {
	private NBTTagCompound payload;

	public PacketEditorNetwork() {
		super(Protocol.PACKET_EDITOR_NETWORK);
	}

	public static PacketEditorNetwork create(NBTTagCompound payload) {
		PacketEditorNetwork packet = new PacketEditorNetwork();
		packet.payload = payload;
		return packet;
	}

	public NBTTagCompound getPayload() {
		return payload;
	}

	@Override
	public void serialize(PacketBuffer buffer, int protocolID) {
		buffer.writeNBT(this.payload);
	}

	@Override
	public void deserialize(PacketBuffer buffer, int protocolID) {
		this.payload = buffer.readNBT();
	}

}
