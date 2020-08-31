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
@RegisterInfo( sId = "minecraft:structure_block", id = 252 )
public class ItemStructureBlock extends ItemStack implements io.gomint.inventory.item.ItemStructureBlock {

    @Override
    public ItemType getItemType() {
        return ItemType.STRUCTURE_BLOCK;
    }

}
