package com.Apothic0n.StarryEnd.core.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CloverBlock extends BushBlock implements net.minecraftforge.common.IForgeShearable {
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);

    public CloverBlock(BlockBehaviour.Properties p_57318_) {
        super(p_57318_);
    }

    public VoxelShape getShape(BlockState p_57336_, BlockGetter p_57337_, BlockPos p_57338_, CollisionContext p_57339_) {
        return SHAPE;
    }

    public BlockBehaviour.OffsetType getOffsetType() {
        return BlockBehaviour.OffsetType.XYZ;
    }
}