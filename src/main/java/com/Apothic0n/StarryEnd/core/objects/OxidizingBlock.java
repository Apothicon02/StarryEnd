package com.Apothic0n.StarryEnd.core.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class OxidizingBlock extends Block {
    public OxidizingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(@NotNull BlockState state, ServerLevel level, @NotNull BlockPos pos, @NotNull Random random) {
        String dimName = level.dimension().toString();
        if (!dimName.contains("end")) { //oxidize if not in the end
            if (random.nextFloat() < 0.05688889F) {
                if (state.is(StarryEndBlocks.ENDER_NEBULA.get())) {
                    level.setBlock(pos, StarryEndBlocks.ENDER_PROTOSTAR.get().defaultBlockState(), UPDATE_ALL);
                } else if (state.is(StarryEndBlocks.ENDER_PROTOSTAR.get())) {
                    level.setBlock(pos, StarryEndBlocks.ENDER_STAR.get().defaultBlockState(), UPDATE_ALL);
                } else if (state.is(StarryEndBlocks.ENDER_STAR.get())) {
                    level.setBlock(pos, StarryEndBlocks.ENDER_NEUTRON.get().defaultBlockState(), UPDATE_ALL);
                }
            }
        } else { //un-oxidize if in the end
            if (state.is(StarryEndBlocks.ENDER_NEUTRON.get())) {
                level.setBlock(pos, StarryEndBlocks.ENDER_STAR.get().defaultBlockState(), UPDATE_ALL);
            } else if (state.is(StarryEndBlocks.ENDER_STAR.get())) {
                level.setBlock(pos, StarryEndBlocks.ENDER_PROTOSTAR.get().defaultBlockState(), UPDATE_ALL);
            } else if (state.is(StarryEndBlocks.ENDER_PROTOSTAR.get())) {
                level.setBlock(pos, StarryEndBlocks.ENDER_NEBULA.get().defaultBlockState(), UPDATE_ALL);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(@NotNull BlockState state) {
        return true;
    }
}
