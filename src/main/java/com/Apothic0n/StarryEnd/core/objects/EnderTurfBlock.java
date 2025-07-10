package com.Apothic0n.StarryEnd.core.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.lighting.LayerLightEngine;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class EnderTurfBlock extends Block implements BonemealableBlock {
    public EnderTurfBlock(Properties properties) {
        super(properties);
    }

    private static boolean canBeGrass(BlockState p_56824_, LevelReader p_56825_, BlockPos p_56826_) {
        BlockPos blockpos = p_56826_.above();
        BlockState blockstate = p_56825_.getBlockState(blockpos);
        if (blockstate.is(Blocks.SNOW) && blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else if (blockstate.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int i = LayerLightEngine.getLightBlockInto(p_56825_, p_56824_, p_56826_, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(p_56825_, blockpos));
            return i < p_56825_.getMaxLightLevel();
        }
    }

    @Override
    public void randomTick(@NotNull BlockState state, ServerLevel level, @NotNull BlockPos pos, @NotNull Random random) {
        if (!canBeGrass(state, level, pos)) {
            level.setBlock(pos, Blocks.END_STONE.defaultBlockState(), UPDATE_ALL);
        }
    }

    @Override
    public boolean isRandomlyTicking(@NotNull BlockState state) {
        return true;
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter p_50897_, BlockPos p_50898_, BlockState p_50899_, boolean p_50900_) {
        return p_50897_.getBlockState(p_50898_.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(Level p_50901_, Random p_50902_, BlockPos p_50903_, BlockState p_50904_) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, Random random, BlockPos pos, BlockState state) {
        BlockPos blockpos = pos.above();
        BlockState blockstate = StarryEndBlocks.SPODOSOL.get().defaultBlockState();

        label46:
        for(int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockpos;

            for(int j = 0; j < i / 16; ++j) {
                blockpos1 = blockpos1.offset(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                BlockPos belowPos = blockpos1.below();
                BlockState belowState = level.getBlockState(belowPos);
                if (belowState.is(Blocks.END_STONE) && canBeGrass(belowState, level, belowPos)) {
                    belowState = this.defaultBlockState();
                    level.setBlock(belowPos, belowState, UPDATE_ALL);
                }
                if (!belowState.is(this) || level.getBlockState(blockpos1).isCollisionShapeFullBlock(level, blockpos1)) {
                    continue label46;
                }
            }

            BlockState blockstate1 = level.getBlockState(blockpos1);
            if (blockstate1.is(blockstate.getBlock()) && random.nextInt(10) == 0) {
                ((BonemealableBlock)blockstate.getBlock()).performBonemeal(level, random, blockpos1, blockstate1);
            }

            if (blockstate1.isAir()) {
                Holder<PlacedFeature> holder;
                if (random.nextInt(420) == 0) {
                    holder = StarryEndPlacedFeatures.ENDER_CLOVER_BONEMEAL;
                } else {
                    holder = StarryEndPlacedFeatures.ENDERGREEN_BONEMEAL;
                }

                holder.value().place(level, level.getChunkSource().getGenerator(), random, blockpos1);
            }
        }
    }
}
