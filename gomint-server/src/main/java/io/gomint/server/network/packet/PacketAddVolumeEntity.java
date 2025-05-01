package io.gomint.server.network.packet;

import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.network.Protocol;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author YourName
 * @version 1.0
 */
public class PacketAddVolumeEntity extends Packet {

    private int entityNetId;
    private NBTTagCompound data;

    public PacketAddVolumeEntity() {
        super(Protocol.PACKET_ADD_VOLUME_ENTITY);
    }

    public static PacketAddVolumeEntity create(int entityNetId, NBTTagCompound data) {
        PacketAddVolumeEntity packet = new PacketAddVolumeEntity();
        packet.entityNetId = entityNetId;
        packet.data = data;
        return packet;
    }

    @Override
    public void serialize(PacketBuffer buffer, int protocolID) {
        buffer.writeUnsignedVarInt(this.entityNetId);
        buffer.writeBytes(this.data.toByteArray());
    }

    @Override
    public void deserialize(PacketBuffer buffer, int protocolID) {
        this.entityNetId = buffer.readUnsignedVarInt();
        this.data = NBTTagCompound.fromByteArray(buffer.readBytes(buffer.getRemaining()));
    }

    public int getEntityNetId() {
        return this.entityNetId;
    }

    public NBTTagCompound getData() {
        return this.data;
    }
}
