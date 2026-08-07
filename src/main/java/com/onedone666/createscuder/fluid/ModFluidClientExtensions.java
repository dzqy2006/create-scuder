package com.onedone666.createscuder.fluid;


import com.onedone666.createscuder.Createscuder;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import org.jetbrains.annotations.NotNull;

@EventBusSubscriber(modid = Createscuder.MODID, value = Dist.CLIENT)
public class ModFluidClientExtensions {
    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public @NotNull ResourceLocation getStillTexture() {
                return ResourceLocation.fromNamespaceAndPath(Createscuder.MODID, "block/fluid/sculk_colloid_still");
            }

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {
                return ResourceLocation.fromNamespaceAndPath(Createscuder.MODID, "block/fluid/sculk_colloid_flow");
            }
        }, ModFluidTypes.SCULK_COLLOID.get());


        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public @NotNull ResourceLocation getStillTexture() {
                return ResourceLocation.fromNamespaceAndPath(Createscuder.MODID, "block/fluid/ender_colloid_still");
            }

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {
                return ResourceLocation.fromNamespaceAndPath(Createscuder.MODID, "block/fluid/ender_colloid_flow");
            }
        }, ModFluidTypes.ENDER_COLLOID.get());
    }
}
