package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:chorus_fruit_popped", id = 433 )
 public class ItemPoppedChorusFruit extends ItemStack implements io.gomint.inventory.item.ItemPoppedChorusFruit {



    @Override
    public ItemType getItemType() {
        return ItemType.POPPED_CHORUS_FRUIT;
    }

}