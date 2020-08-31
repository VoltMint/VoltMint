package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:paper", id = 339 )
 public class ItemPaper extends ItemStack implements io.gomint.inventory.item.ItemPaper {



    @Override
    public ItemType getItemType() {
        return ItemType.PAPER;
    }

}