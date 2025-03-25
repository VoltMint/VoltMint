/*
 * Copyright (c) 2020 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.network.packet.types;

import io.gomint.jraknet.PacketBuffer;

public class ItemStackRequestSlotInfo {

    private byte slot;
    private byte hotbarSlot;
    private int itemStackId;
    private String customName;

    /**
     * Deserialize packet data from buffer.
     * 
     * @param buffer PacketBuffer containing data
     * @param protocolID Protocol version (not used but kept for compatibility)
     * @throws Exception If deserialization fails
     */
    public void deserialize(PacketBuffer buffer, int protocolID) throws Exception {
        this.slot = buffer.readByte();
        this.hotbarSlot = buffer.readByte();
        this.itemStackId = buffer.readSignedVarInt();
        this.customName = buffer.readString();
    }

    public byte getSlot() {
        return this.slot;
    }

    public byte getHotbarSlot() {
        return this.hotbarSlot;
    }

    public int getItemStackId() {
        return this.itemStackId;
    }

    public String getCustomName() {
        return this.customName;
    }

    @Override
    public String toString() {
        return "{\"_class\":\"ItemStackRequestSlotInfo\", " +
            "\"slot\":\"" + this.slot + "\", " +
            "\"hotbarSlot\":\"" + this.hotbarSlot + "\", " +
            "\"itemStackId\":\"" + this.itemStackId + "\", " +
            "\"customName\":\"" + this.customName + "\"" +
            "}";
    }

}
