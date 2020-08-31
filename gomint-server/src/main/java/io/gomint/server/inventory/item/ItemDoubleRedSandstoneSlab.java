package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:double_stone_slab2", id = 181)
public class ItemDoubleRedSandstoneSlab extends ItemStack implements io.gomint.inventory.item.ItemDoubleRedSandstoneSlab {

    @Override
    public ItemType getItemType() {
        return ItemType.DOUBLE_RED_SANDSTONE_SLAB;
    }

}
