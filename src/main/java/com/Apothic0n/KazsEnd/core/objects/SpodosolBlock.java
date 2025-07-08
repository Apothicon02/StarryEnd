package com.Apothic0n.KazsEnd.core.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.Random;

public class SpodosolBlock extends Block implements BonemealableBlock {
    public SpodosolBlock(Properties properties) {
        super(properties);
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
        BlockState blockstate = KazsEndBlocks.SPODOSOL.get().defaultBlockState();

        label46:
        for(int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockpos;

            for(int j = 0; j < i / 16; ++j) {
                blockpos1 = blockpos1.offset(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!level.getBlockState(blockpos1.below()).is(this) || level.getBlockState(blockpos1).isCollisionShapeFullBlock(level, blockpos1)) {
                    continue label46;
                }
            }

            BlockState blockstate1 = level.getBlockState(blockpos1);
            if (blockstate1.is(blockstate.getBlock()) && random.nextInt(10) == 0) {
                ((BonemealableBlock)blockstate.getBlock()).performBonemeal(level, random, blockpos1, blockstate1);
            }

            if (blockstate1.isAir()) {
                Holder<PlacedFeature> holder = KazsEndPlacedFeatures.ENDER_ROOTS_BONEMEAL;

                holder.value().place(level, level.getChunkSource().getGenerator(), random, blockpos1);
            }
        }
    }
}
