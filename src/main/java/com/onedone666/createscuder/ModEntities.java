package com.onedone666.createscuder;

import com.onedone666.createscuder.itemstothrow.BakedEnderPearlEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public  static  final DeferredRegister<EntityType<?> > ENTITY_TYPES =
        DeferredRegister.create(Registries.ENTITY_TYPE, Createscuder.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<BakedEnderPearlEntity>> BAKED_ENDER_PEARL_ENTITY =
            ENTITY_TYPES.register("baked_ender_pearl",()-> EntityType.Builder.<BakedEnderPearlEntity>of(BakedEnderPearlEntity::new, MobCategory.MISC)
                    .sized(0.25F,0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build("baked_ender_pearl"));
}
