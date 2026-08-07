package com.onedone666.createscuder.itemstothrow;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.level.Level;

public class BakedEnderPearlItem extends  ModThrowableItem {
    public BakedEnderPearlItem(Properties properties){
        super(properties,20);
    }

    @Override
    protected ThrowableItemProjectile createProjectile(Level level, Player player){
        return new BakedEnderPearlEntity(level,player);
    }
}
