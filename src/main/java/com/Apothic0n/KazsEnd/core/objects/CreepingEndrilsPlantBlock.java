package com.Apothic0n.KazsEnd.core.objects;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CreepingEndrilsPlantBlock extends GrowingPlantBodyBlock {
    public static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public CreepingEndrilsPlantBlock(BlockBehaviour.Properties p_154975_) {
        super(p_154975_, Direction.DOWN, SHAPE, false);
    }

    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) KazsEndBlocks.CREEPING_ENDRILS.get();
    }
}