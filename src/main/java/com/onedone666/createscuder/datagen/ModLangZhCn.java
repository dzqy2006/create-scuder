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

    }
}