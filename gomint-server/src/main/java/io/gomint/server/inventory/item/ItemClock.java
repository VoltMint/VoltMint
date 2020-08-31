package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:clock", id = 347 )
 public class ItemClock extends ItemStack implements io.gomint.inventory.item.ItemClock {



    @Override
    public ItemType getItemType() {
        return ItemType.CLOCK;
    }

}