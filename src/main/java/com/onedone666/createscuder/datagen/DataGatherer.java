package com.onedone666.createscuder.datagen;

import com.onedone666.createscuder.Createscuder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Createscuder.MODID)
public class DataGatherer {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();

        gen.addProvider(event.includeClient(), new ModLangEnUs(output));
        gen.addProvider(event.includeClient(), new ModLangZhCn(output));
    }
}
