/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 213 )
public class ItemMagma extends ItemStack implements io.gomint.inventory.item.ItemMagmaCream {

    // CHECKSTYLE:OFF
    public ItemMagma( short data, int amount ) {
        super( 213, data, amount );
    }

    public ItemMagma( short data, int amount, NBTTagCompound nbt ) {
        super( 213, data, amount, nbt );
    }
    // CHECKSTYLE:ON

    @Override
    public ItemType getType() {
        return ItemType.MAGMA;
    }

}
