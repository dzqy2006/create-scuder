package com.onedone666.createscuder;

import com.onedone666.createscuder.fluid.ModFluids;
import com.onedone666.createscuder.itemstothrow.BakedEnderPearlItem;
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
    public static DeferredItem<BucketItem> SCULK_COLLOID_BUCKET =
            ITEMS.register("sculk_colloid_bucket", () -> new BucketItem(
                    ModFluids.SCULK_COLLOID_SOURCE.get(),
                    new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static DeferredItem<BucketItem> ENDER_COLLOID_BUCKET =
            ITEMS.register("ender_colloid_bucket", () -> new BucketItem(
                    ModFluids.SCULK_COLLOID_SOURCE.get(),
                    new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)
            ));
}
