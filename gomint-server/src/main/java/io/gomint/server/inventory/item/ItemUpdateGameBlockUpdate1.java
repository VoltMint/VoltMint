package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:info_update", id = 248)
public class ItemUpdateGameBlockUpdate1 extends ItemStack {

    @Override
    public ItemType getItemType() {
        return ItemType.UPDATE_GAME_BLOCK_UPDATE1;
    }

}
