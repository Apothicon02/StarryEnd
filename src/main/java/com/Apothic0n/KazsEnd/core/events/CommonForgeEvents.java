package com.Apothic0n.KazsEnd.core.events;

import com.Apothic0n.KazsEnd.KazsEnd;
import com.Apothic0n.KazsEnd.core.objects.KazsEndBlocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KazsEnd.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonForgeEvents {

    @SubscribeEvent
    public static void onToolUse(BlockEvent.BlockToolInteractEvent event) {
        if (event.getToolAction().equals(ToolActions.AXE_STRIP)) {
            BlockState state = event.getState();
            if (state.is(KazsEndBlocks.EBONY_LOG.get())) {
                event.setFinalState(KazsEndBlocks.STRIPPED_EBONY.get().defaultBlockState());
            } else if (state.is(KazsEndBlocks.EBONY_WOOD.get())) {
                event.setFinalState(KazsEndBlocks.STRIPPED_EBONY_WOOD.get().defaultBlockState());
            } else if (state.is(KazsEndBlocks.ENDERVIOLET_LOG.get())) {
                event.setFinalState(KazsEndBlocks.STRIPPED_ENDERVIOLET.get().defaultBlockState());
            } else if (state.is(KazsEndBlocks.ENDERVIOLET_WOOD.get())) {
                event.setFinalState(KazsEndBlocks.STRIPPED_ENDERVIOLET_WOOD.get().defaultBlockState());
            }
        }
    }
}
