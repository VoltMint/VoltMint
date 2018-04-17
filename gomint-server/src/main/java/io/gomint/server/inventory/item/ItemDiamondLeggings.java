package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.math.Vector;
import io.gomint.server.entity.EntityPlayer;
import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;
import io.gomint.world.block.Block;
import io.gomint.world.block.BlockFace;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 312 )
public class ItemDiamondLeggings extends ItemArmor implements io.gomint.inventory.item.ItemDiamondLeggings {

    // CHECKSTYLE:OFF
    public ItemDiamondLeggings( short data, int amount ) {
        super( 312, data, amount );
    }

    public ItemDiamondLeggings( short data, int amount, NBTTagCompound nbt ) {
        super( 312, data, amount, nbt );
    }
    // CHECKSTYLE:ON

    @Override
    public float getReductionValue() {
        return 6;
    }

    @Override
    public boolean interact( EntityPlayer entity, BlockFace face, Vector clickPosition, Block clickedBlock ) {
        if ( clickedBlock == null ) {
            if ( isBetter( (ItemStack) entity.getArmorInventory().getLeggings() ) ) {
                ItemStack old = (ItemStack) entity.getArmorInventory().getLeggings();
                entity.getArmorInventory().setLeggings( this );
                entity.getInventory().setItem( entity.getInventory().getItemInHandSlot(), old );
            }
        }

        return false;
    }

    @Override
    public ItemType getType() {
        return ItemType.DIAMOND_LEGGINGS;
    }

}
