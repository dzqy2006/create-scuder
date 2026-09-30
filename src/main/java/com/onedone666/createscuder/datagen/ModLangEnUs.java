package com.onedone666.createscuder.datagen;

import com.onedone666.createscuder.Createscuder;
import com.onedone666.createscuder.ModBlocks;
import com.onedone666.createscuder.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLangEnUs extends LanguageProvider {
    public ModLangEnUs(PackOutput output){
        super(output, Createscuder.MODID,"en_us");
    }
    @Override
    protected void addTranslations() {
        add("itemGroup.createscuder","Create scuder");
        add(ModItems.BAKED_ENDER_PEARL.get(),"Baked Ender Pearl");
        add("fluid.createscuder.sculk_colloid", "Sculk Colloid Bucket");
        add(ModItems.SCULK_COLLOID_BUCKET.get(), "Sculk Dragon Breath Bucket");
        add(ModBlocks.SCULK_COLLOID.get(), "Sculk Dragon Breath");
        add("fluid.createscuder.ender_colloid", "Ender Colloid");
        add(ModItems.ENDER_COLLOID_BUCKET.get(), "Ender Colloid Bucket");
        add(ModBlocks.ENDER_COLLOID.get(), "Ender Colloid");
        add(ModItems.BLOODY_ENDER_PEARL.get(),"Bloody Ender Pearl");
        add(ModItems.ENDER_EGG.get(),"Ender Egg");
        // 鼓风机处理（JEI 分类标题 + 触媒名称）
        add("createscuder.recipe.scuding", "Bulk Scuding");
        add("createscuder.recipe.scuding.fan", "Encased Fan (Bulk Scuding)");
        add("createscuder.recipe.cudering", "Bulk Cudering");
        add("createscuder.recipe.cudering.fan", "Encased Fan (Bulk Cudering)");
        // Create: Connected 联动方块（用字符串键：CC 缺失时方块不存在，不能走 Block 重载）
        add("block.createscuder.fan_scuding_catalyst", "Fan Scuding Catalyst");
        add("block.createscuder.fan_cudering_catalyst", "Fan Cudering Catalyst");
        add("block.createscuder.empty_fan_catalyst", "Empty Fan Catalyst");
        // 沉降胶体方块
        add(ModBlocks.DEPOSITED_SCUDER_COLLOID.get(), "Deposited Scuder Colloid");
        add(ModBlocks.DEPOSITED_SCULK_COLLOID.get(), "Deposited Sculk Colloid");
        add(ModBlocks.DEPOSITED_ENDER_COLLOID.get(), "Deposited Ender Colloid");

    }
}
