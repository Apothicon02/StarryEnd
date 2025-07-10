package com.Apothic0n.StarryEnd.core.events;

import com.Apothic0n.StarryEnd.StarryEnd;
import com.Apothic0n.StarryEnd.core.objects.StarryEndBlocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StarryEnd.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonForgeEvents {

    @SubscribeEvent
    public static void onToolUse(BlockEvent.BlockToolInteractEvent event) {
        if (event.getToolAction().equals(ToolActions.AXE_STRIP)) {
            BlockState state = event.getState();
            if (state.is(StarryEndBlocks.EBONY_LOG.get())) {
                event.setFinalState(StarryEndBlocks.STRIPPED_EBONY.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS)));
            } else if (state.is(StarryEndBlocks.EBONY_WOOD.get())) {
                event.setFinalState(StarryEndBlocks.STRIPPED_EBONY_WOOD.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS)));
            } else if (state.is(StarryEndBlocks.ENDERVIOLET_LOG.get())) {
                event.setFinalState(StarryEndBlocks.STRIPPED_ENDERVIOLET.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS)));
            } else if (state.is(StarryEndBlocks.ENDERVIOLET_WOOD.get())) {
                event.setFinalState(StarryEndBlocks.STRIPPED_ENDERVIOLET_WOOD.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS)));
            }
        }
    }
}
