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

    }
}
