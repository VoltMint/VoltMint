/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.inventory;

import io.gomint.math.BlockPosition;
import io.gomint.server.entity.EntityPlayer;
import io.gomint.server.inventory.item.Items;
import io.gomint.server.network.packet.PacketBlockEvent;
import io.gomint.server.network.type.WindowType;
import io.gomint.server.world.WorldAdapter;
import io.gomint.world.Sound;

/**
 * @author geNAZt
 * @version 1.0
 */
public class ChestInventory extends ContainerInventory implements io.gomint.inventory.ChestInventory {

    /**
     * Create new chest inventory
     *
     * @param owner tile entity of the chest
     */
    public ChestInventory(Items items, InventoryHolder owner) {
        super(items, owner, 27);
    }

    @Override
    public WindowType getType() {
        return WindowType.CONTAINER;
    }

    @Override
    public void onOpen(EntityPlayer player) {
        // Sound and open animation
        if (this.viewer.size() == 1) {
            BlockPosition position = this.getContainerPosition();
            WorldAdapter world = this.getWorld();

            PacketBlockEvent blockEvent = new PacketBlockEvent();
            blockEvent.setPosition(position);
            blockEvent.setData1(1);
            blockEvent.setData2(2);

            world.sendToVisible(position, blockEvent, entity -> true);
            world.playSound(position.toVector().add(0.5f, 0.5f, 0.5f), Sound.CHEST_OPEN, (byte) 1);
        }
    }

    @Override
    public void onClose(EntityPlayer player) {
        // Sound and close animation
        if (this.viewer.size() == 1) {
            BlockPosition position = this.getContainerPosition();
            WorldAdapter world = this.getWorld();

            PacketBlockEvent blockEvent = new PacketBlockEvent();
            blockEvent.setPosition(position);
            blockEvent.setData1(1);
            blockEvent.setData2(0);

            world.sendToVisible(position, blockEvent, entity -> true);
            world.playSound(position.toVector().add(0.5f, 0.5f, 0.5f), Sound.CHEST_CLOSED, (byte) 1);
        }
    }

}
