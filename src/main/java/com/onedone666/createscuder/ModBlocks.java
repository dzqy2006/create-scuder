package com.onedone666.createscuder;
import com.onedone666.createscuder.fluid.ModFluids;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Createscuder.MODID);
    public static final DeferredBlock<LiquidBlock> SCULK_COLLOID =
            BLOCKS.register("sculk_colloid", () -> new LiquidBlock(
                    ModFluids.SCULK_COLLOID_SOURCE.get(),
                    BlockBehaviour.Properties.of().liquid().noCollission().strength(100.0f).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ENDER_COLLOID =
            BLOCKS.register("ender_colloid", () -> new LiquidBlock(
                    ModFluids.SCULK_COLLOID_SOURCE.get(),
                    BlockBehaviour.Properties.of().liquid().noCollission().strength(100.0f).noLootTable()));
}
