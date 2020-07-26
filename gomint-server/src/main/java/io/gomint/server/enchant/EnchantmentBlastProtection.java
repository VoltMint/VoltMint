/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.enchant;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.inventory.item.ItemStack;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 3 )
public class EnchantmentBlastProtection extends Enchantment implements io.gomint.enchant.EnchantmentBlastProtection {

    /**
     * Create new enchantment blast protection
     */
    public EnchantmentBlastProtection() {
        super( (short) 4 );
    }

    @Override
    public byte getMinEnchantAbility( short level ) {
        return (byte) ( 5 + ( level - 1 ) * 8 );
    }

    @Override
    public byte getMaxEnchantAbility( short level ) {
        return (byte) ( getMinEnchantAbility( level ) + 12 );
    }

    @Override
    public boolean canBeApplied( ItemStack itemStack ) {
        return itemStack.getItemType() == ItemType.CHAIN_HELMET ||
            itemStack.getItemType() == ItemType.DIAMOND_HELMET ||
            itemStack.getItemType() == ItemType.GOLDEN_HELMET ||
            itemStack.getItemType() == ItemType.IRON_HELMET ||
            itemStack.getItemType() == ItemType.LEATHER_HELMET ||
            itemStack.getItemType() == ItemType.CHAIN_LEGGINGS ||
            itemStack.getItemType() == ItemType.DIAMOND_LEGGINGS ||
            itemStack.getItemType() == ItemType.GOLDEN_LEGGINGS ||
            itemStack.getItemType() == ItemType.IRON_LEGGINGS ||
            itemStack.getItemType() == ItemType.LEATHER_LEGGINGS ||
            itemStack.getItemType() == ItemType.CHAIN_CHESTPLATE ||
            itemStack.getItemType() == ItemType.DIAMOND_CHESTPLATE ||
            itemStack.getItemType() == ItemType.GOLDEN_CHESTPLATE ||
            itemStack.getItemType() == ItemType.IRON_CHESTPLATE ||
            itemStack.getItemType() == ItemType.LEATHER_CHESTPLATE ||
            itemStack.getItemType() == ItemType.CHAIN_BOOTS ||
            itemStack.getItemType() == ItemType.DIAMOND_BOOTS ||
            itemStack.getItemType() == ItemType.GOLDEN_BOOTS ||
            itemStack.getItemType() == ItemType.IRON_BOOTS ||
            itemStack.getItemType() == ItemType.LEATHER_BOOTS;
    }
}
