package com.Apothic0n.KazsEnd.core.objects;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.NetherVines;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class SproutingEndervinesBlock extends GrowingPlantHeadBlock {
    public static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 15.0D, 12.0D);

    public SproutingEndervinesBlock(Properties p_154966_) {
        super(p_154966_, Direction.UP, SHAPE, false, 0.1D);
    }

    protected int getBlocksToGrowWhenBonemealed(Random p_154968_) {
        return NetherVines.getBlocksToGrowWhenBonemealed(p_154968_);
    }

    protected Block getBodyBlock() {
        return KazsEndBlocks.SPROUTING_ENDERVINES_PLANT.get();
    }

    protected boolean canGrowInto(BlockState p_154971_) {
        return NetherVines.isValidGrowthState(p_154971_);
    }
}