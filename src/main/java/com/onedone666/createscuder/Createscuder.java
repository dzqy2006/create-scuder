package com.onedone666.createscuder;

import com.onedone666.createscuder.fluid.ModFluidTypes;
import com.onedone666.createscuder.fluid.ModFluids;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import static com.onedone666.createscuder.ModBlocks.BLOCKS;
import static com.onedone666.createscuder.ModItems.ITEMS;

@Mod(Createscuder.MODID)
public class Createscuder {

    public static final String MODID = "createscuder";

    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);





    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATE_SCUDER_CREATE_TAB =
            CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.createscuder"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.BAKED_ENDER_PEARL.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.BAKED_ENDER_PEARL.get());
                output.accept(ModItems.SCULK_COLLOID_BUCKET.get());
                output.accept(ModItems.ENDER_COLLOID_BUCKET.get());
            }).build());


    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Createscuder(IEventBus modEventBus) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModFluidTypes.FLUID_TYPES.register(modEventBus);

        ModFluids.FLUIDS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);

        ModEntities.ENTITY_TYPES.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (Createscuder) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);



    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }



    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}