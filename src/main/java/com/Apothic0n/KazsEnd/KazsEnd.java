package com.Apothic0n.KazsEnd;

import com.Apothic0n.KazsEnd.core.objects.KazsEndBlocks;
import com.Apothic0n.KazsEnd.core.objects.KazsEndItems;
import net.minecraft.world.level.block.ComposterBlock;
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
            ComposterBlock.add(0.3f, KazsEndItems.EBONY_LEAVES.get());
            ComposterBlock.add(0.3f, KazsEndItems.EBONY_SAPLING.get());
            ComposterBlock.add(0.3f, KazsEndItems.ENDERVIOLET_LEAVES.get());
            ComposterBlock.add(0.3f, KazsEndItems.ENDERVIOLET_SAPLING.get());
            ComposterBlock.add(0.65f, KazsEndItems.ENDER_ROOTS.get());
            ComposterBlock.add(0.65f, KazsEndItems.ENDER_CLOVER.get());
            ComposterBlock.add(0.65f, KazsEndItems.ENDERGREEN.get());
            ComposterBlock.add(0.65f, KazsEndItems.SPROUTING_ENDERVINES.get());
            ComposterBlock.add(0.65f, KazsEndItems.CREEPING_ENDRILS.get());
        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        KazsEndBlocks.fixBlockRenderLayers();
    }
}