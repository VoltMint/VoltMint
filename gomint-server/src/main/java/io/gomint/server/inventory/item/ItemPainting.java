package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 321 )
 public class ItemPainting extends ItemStack implements io.gomint.inventory.item.ItemPainting {



    @Override
    public ItemType getItemType() {
        return ItemType.PAINTING;
    }

}
