package com.onedone666.createscuder.datagen;

import com.onedone666.createscuder.Createscuder;
import com.onedone666.createscuder.ModBlocks;
import com.onedone666.createscuder.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLangZhCn extends LanguageProvider {
    public ModLangZhCn(PackOutput output){
        super(output, Createscuder.MODID,"zh_cn");
    }
    @Override
    protected void addTranslations() {
        add("itemGroup.createscuder","机械动力：幽末");
        add(ModItems.BAKED_ENDER_PEARL.get(),"烘干末影珍珠");
        add("fluid.createscuder.sculk_colloid", "幽匿胶体");
        add(ModItems.SCULK_COLLOID_BUCKET.get(), "幽匿胶体桶");
        add(ModBlocks.SCULK_COLLOID.get(), "幽匿胶体");
        add("fluid.createscuder.ender_colloid", "末影胶体");
        add(ModItems.ENDER_COLLOID_BUCKET.get(), "末影胶体桶");
        add(ModBlocks.ENDER_COLLOID.get(), "末影胶体");
        add(ModItems.ENDER_EGG.get(),"末影之卵");
        add(ModItems.BLOODY_ENDER_PEARL.get(),"血腥珍珠");
        // 鼓风机处理（JEI 分类标题 + 触媒名称）
        add("createscuder.recipe.scuding", "幽匿胶体处理");
        add("createscuder.recipe.scuding.fan", "鼓风机（幽匿胶体处理）");
        add("createscuder.recipe.cudering", "末影胶体处理");
        add("createscuder.recipe.cudering.fan", "鼓风机（末影胶体处理）");
        // Create: Connected 联动方块（用字符串键：CC 缺失时方块不存在，不能走 Block 重载）
        add("block.createscuder.fan_scuding_catalyst", "幽匿鼓风机触媒");
        add("block.createscuder.fan_cudering_catalyst", "末影鼓风机触媒");
        add("block.createscuder.empty_fan_catalyst", "空鼓风机触媒");
        // 沉降胶体方块
        add(ModBlocks.DEPOSITED_SCUDER_COLLOID.get(), "幽末沉降胶体");
        add(ModBlocks.DEPOSITED_SCULK_COLLOID.get(), "沉降幽匿胶体");
        add(ModBlocks.DEPOSITED_ENDER_COLLOID.get(), "末影沉降胶体");

    }
}