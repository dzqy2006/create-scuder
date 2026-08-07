package com.onedone666.createscuder.fluid;

import com.onedone666.createscuder.Createscuder;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluidTypes {
    public  static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, Createscuder.MODID);
    public  static  final DeferredHolder<FluidType, FluidType> SCULK_COLLOID =
            FLUID_TYPES.register("sculk_colloid", () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("fluid.createscuder.sculk_colloid")
                    .density(3000)
                    .viscosity(3000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));
    public  static  final DeferredHolder<FluidType, FluidType> ENDER_COLLOID =
            FLUID_TYPES.register("ender_colloid", () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("fluid.createscuder.ender_colloid")
                    .density(3000)
                    .viscosity(3000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));
}
