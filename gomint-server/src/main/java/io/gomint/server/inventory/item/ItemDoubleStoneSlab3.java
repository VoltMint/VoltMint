/*
 * Copyright (c) 2018, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:double_stone_slab3", id = -162 )
public class ItemDoubleStoneSlab3 extends ItemStack implements io.gomint.inventory.item.ItemDoubleStoneSlab3 {

    @Override
    public ItemType getItemType() {
        return ItemType.DOUBLE_STONE_SLAB3;
    }

}
