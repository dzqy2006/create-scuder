package com.onedone666.createscuder;

import com.onedone666.createscuder.fluid.ModFluids;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Createscuder.MODID);

    // ------------------------------------------------------------------
    // 流体
    // ------------------------------------------------------------------

    /**
     * 胶体流体方块的属性，对齐原版 {@code Blocks.WATER}。
     * <p>
     * 两个关键项缺一不可：
     * <ul>
     *   <li>{@code replaceable()} —— 允许在流体中放置方块。{@link LiquidBlock} 并没有覆盖
     *       {@code canBeReplaced}，是否可替换完全由该属性决定；缺了它方块就放不进去。</li>
     *   <li>{@code pushReaction(DESTROY)} —— 活塞推动时销毁，与原版水一致。</li>
     * </ul>
     */
    private static BlockBehaviour.Properties colloidProperties() {
        return BlockBehaviour.Properties.of()
                .liquid()
                .replaceable()
                .noCollission()
                .strength(100.0F)
                .pushReaction(PushReaction.DESTROY)
                .noLootTable();
    }

    public static final DeferredBlock<LiquidBlock> SCULK_COLLOID =
            BLOCKS.register("sculk_colloid", () -> new LiquidBlock(
                    ModFluids.SCULK_COLLOID_SOURCE.get(), colloidProperties()));

    public static final DeferredBlock<LiquidBlock> ENDER_COLLOID =
            BLOCKS.register("ender_colloid", () -> new LiquidBlock(
                    ModFluids.ENDER_COLLOID_SOURCE.get(), colloidProperties()));

    // ------------------------------------------------------------------
    // 沉降胶体（流体沉积后形成的固体方块）
    // ------------------------------------------------------------------

    /**
     * 沉降方块的属性：目前按"压实过的沉积物"处理 —— 徒手可挖、沙子音效。
     * 若后续要改成需要铲/镐，或加重力下落行为，改这里即可。
     */
    private static BlockBehaviour.Properties depositedProperties() {
        return BlockBehaviour.Properties.of()
                .strength(1.5F)
                .sound(SoundType.SAND);
    }

    /** 幽末沉降胶体 */
    public static final DeferredBlock<Block> DEPOSITED_SCUDER_COLLOID =
            BLOCKS.registerBlock("deposited_scuder_colloid", Block::new, depositedProperties());

    /** 沉降幽匿胶体 */
    public static final DeferredBlock<Block> DEPOSITED_SCULK_COLLOID =
            BLOCKS.registerBlock("deposited_sculk_colloid", Block::new, depositedProperties());

    /** 末影沉降胶体 */
    public static final DeferredBlock<Block> DEPOSITED_ENDER_COLLOID =
            BLOCKS.registerBlock("deposited_ender_colloid", Block::new, depositedProperties());
}
