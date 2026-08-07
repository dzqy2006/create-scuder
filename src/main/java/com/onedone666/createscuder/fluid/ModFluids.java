package com.onedone666.createscuder.fluid;

import com.onedone666.createscuder.Createscuder;
import com.onedone666.createscuder.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import java.util.function.Supplier;

public class ModFluids {
    public  static  final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, Createscuder.MODID);
    public  static  final DeferredHolder<Fluid, FlowingFluid> SCULK_COLLOID_SOURCE =
            FLUIDS.register("sculk_colloid", () -> new BaseFlowingFluid.Source(baseProperties(
                    ModFluidTypes.SCULK_COLLOID,ModFluids.SCULK_COLLOID_SOURCE,
                    ModFluids.SCULK_COLLOID_FLOWING, ModBlocks.SCULK_COLLOID
            )));
    public  static  final DeferredHolder<Fluid, FlowingFluid> SCULK_COLLOID_FLOWING =
            FLUIDS.register("flowing_sculk_colloid", () -> new BaseFlowingFluid.Flowing(baseProperties(
                    ModFluidTypes.SCULK_COLLOID,ModFluids.SCULK_COLLOID_SOURCE,
                    ModFluids.SCULK_COLLOID_FLOWING,ModBlocks.SCULK_COLLOID
            )));
    public  static  final DeferredHolder<Fluid, FlowingFluid> ENDER_COLLOID_SOURCE =
            FLUIDS.register("ender_colloid", () -> new BaseFlowingFluid.Source(baseProperties(
                    ModFluidTypes.ENDER_COLLOID,ModFluids.ENDER_COLLOID_SOURCE,
                    ModFluids.ENDER_COLLOID_FLOWING, ModBlocks.ENDER_COLLOID
            )));
    public  static  final DeferredHolder<Fluid, FlowingFluid> ENDER_COLLOID_FLOWING =
            FLUIDS.register("flowing_ender_colloid", () -> new BaseFlowingFluid.Flowing(baseProperties(
                    ModFluidTypes.ENDER_COLLOID,ModFluids.ENDER_COLLOID_SOURCE,
                    ModFluids.ENDER_COLLOID_FLOWING,ModBlocks.ENDER_COLLOID
            )));



    private  static BaseFlowingFluid.Properties baseProperties(
            Supplier<? extends FluidType> fluidType,
            Supplier<? extends Fluid> still,
            Supplier<? extends Fluid> flowing,
            Supplier<? extends LiquidBlock> block) {
        return new BaseFlowingFluid.Properties(fluidType, still, flowing).block(block);


    }

}
