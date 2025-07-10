package com.Apothic0n.StarryEnd;

import com.Apothic0n.StarryEnd.core.objects.StarryEndBlocks;
import com.Apothic0n.StarryEnd.core.objects.StarryEndItems;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StarryEnd.MODID)
public class StarryEnd {
    public static final String MODID = "starryend";

    public StarryEnd() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        StarryEndBlocks.BLOCKS.register(eventBus);
        StarryEndItems.ITEMS.register(eventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.add(0.3f, StarryEndItems.EBONY_LEAVES.get());
            ComposterBlock.add(0.3f, StarryEndItems.EBONY_SAPLING.get());
            ComposterBlock.add(0.3f, StarryEndItems.ENDERVIOLET_LEAVES.get());
            ComposterBlock.add(0.3f, StarryEndItems.ENDERVIOLET_SAPLING.get());
            ComposterBlock.add(0.65f, StarryEndItems.ENDER_ROOTS.get());
            ComposterBlock.add(0.65f, StarryEndItems.ENDER_CLOVER.get());
            ComposterBlock.add(0.65f, StarryEndItems.ENDERGREEN.get());
            ComposterBlock.add(0.65f, StarryEndItems.SPROUTING_ENDERVINES.get());
            ComposterBlock.add(0.65f, StarryEndItems.CREEPING_ENDRILS.get());
        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        StarryEndBlocks.fixBlockRenderLayers();
    }
}