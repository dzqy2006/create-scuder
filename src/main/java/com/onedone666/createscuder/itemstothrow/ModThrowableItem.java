package com.onedone666.createscuder.itemstothrow;

import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;


public abstract class ModThrowableItem extends Item {
    private final int cooldown;

    protected  ModThrowableItem(Properties properties,int cooldown){
        super(properties);
        this.cooldown = cooldown;
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){
        ItemStack itemstack = player.getItemInHand(hand);
        if (!player.getAbilities().instabuild){
            itemstack.shrink(1);
        }
        level.playSound(null,player.getX(),player.getY(),player.getZ(),
                this.getThrowSound(),SoundSource.NEUTRAL,0.5F,
                0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        player.getCooldowns().addCooldown(this,cooldown);
        if (!level.isClientSide){
            ThrowableItemProjectile projectile = this.createProjectile(level,player);
            projectile.setItem(itemstack);
            projectile.shootFromRotation(player,player.getXRot(),player.getYRot(),0.0F,1.5F,1.0F);
            level.addFreshEntity(projectile);
        }
        return InteractionResultHolder.success(itemstack);
    }
    protected  abstract ThrowableItemProjectile createProjectile(Level level,Player player);

    protected SoundEvent getThrowSound(){
        return SoundEvents.ENDER_PEARL_THROW;
    }
}
