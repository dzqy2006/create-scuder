package com.onedone666.createscuder;

import com.onedone666.createscuder.fluid.ModFluids;
import com.onedone666.createscuder.itemstothrow.BakedEnderPearlItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Createscuder.MODID);

    public static DeferredItem<Item> BAKED_ENDER_PEARL = ITEMS.register("baked_ender_pearl",
            () -> new BakedEnderPearlItem(new Item.Properties()
                    .stacksTo(16)));
    public static DeferredItem<Item> BLOODY_ENDER_PEARL = ITEMS.register("bloody_ender_pearl",
            () -> new Item(new Item.Properties()));
    public static DeferredItem<Item> ENDER_EGG = ITEMS.register("ender_egg",
            () -> new Item(new Item.Properties()));
    public static DeferredItem<BucketItem> SCULK_COLLOID_BUCKET =
            ITEMS.register("sculk_colloid_bucket", () -> new BucketItem(
                    ModFluids.SCULK_COLLOID_SOURCE.get(),
                    new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static DeferredItem<BucketItem> ENDER_COLLOID_BUCKET =
            ITEMS.register("ender_colloid_bucket", () -> new BucketItem(
                    ModFluids.ENDER_COLLOID_SOURCE.get(),
                    new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)
            ));

    // ------------------------------------------------------------------
    // 沉降胶体方块对应的物品
    // ------------------------------------------------------------------
    // registerSimpleBlockItem 会沿用方块的注册名，并自动用同一个 id 注册 BlockItem。

    public static DeferredItem<BlockItem> DEPOSITED_SCUDER_COLLOID =
            ITEMS.registerSimpleBlockItem(ModBlocks.DEPOSITED_SCUDER_COLLOID);
    public static DeferredItem<BlockItem> DEPOSITED_SCULK_COLLOID =
            ITEMS.registerSimpleBlockItem(ModBlocks.DEPOSITED_SCULK_COLLOID);
    public static DeferredItem<BlockItem> DEPOSITED_ENDER_COLLOID =
            ITEMS.registerSimpleBlockItem(ModBlocks.DEPOSITED_ENDER_COLLOID);
}
