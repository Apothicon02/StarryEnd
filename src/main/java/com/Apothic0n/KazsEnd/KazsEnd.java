package com.Apothic0n.KazsEnd;

import com.Apothic0n.KazsEnd.core.objects.KazsEndBlocks;
import com.Apothic0n.KazsEnd.core.objects.KazsEndItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KazsEnd.MODID)
public class KazsEnd {
    public static final String MODID = "kazsend";

    public KazsEnd() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        KazsEndBlocks.BLOCKS.register(eventBus);
        KazsEndItems.ITEMS.register(eventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        KazsEndBlocks.fixBlockRenderLayers();
    }
}