package com.onedone666.createscuder.itemstothrow;

import com.onedone666.createscuder.ModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.level.Level;
import com.onedone666.createscuder.ModItems;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.item.Item;
import net.minecraft.world.phys.BlockHitResult;



public class BakedEnderPearlEntity extends ThrowableItemProjectile {
    public  BakedEnderPearlEntity(EntityType<? extends  BakedEnderPearlEntity> type, Level level) {
        super (type,level);
    }
    public  BakedEnderPearlEntity(Level level, LivingEntity shooter){
        super(ModEntities.BAKED_ENDER_PEARL_ENTITY.get(), shooter,level);
    }

    @Override
    protected  Item getDefaultItem(){
        return ModItems.BAKED_ENDER_PEARL.get();
    }
    @Override
    protected void onHitBlock(BlockHitResult result) {
        super.onHitBlock(result);
        if(!this.level().isClientSide) {
            if(this.random.nextFloat()< 0.5F){
                Endermite endermite = EntityType.ENDERMITE.create(this.level());
                if (endermite != null){
                    endermite.moveTo(this.getX(),this.getY(),this.getZ());
                    this.level().addFreshEntity(endermite);
                }
            }
            this.discard();
        }
    }
}
