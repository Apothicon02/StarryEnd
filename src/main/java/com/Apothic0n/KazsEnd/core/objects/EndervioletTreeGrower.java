package com.Apothic0n.KazsEnd.core.objects;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class EndervioletTreeGrower extends AbstractTreeGrower {
    @Override
    protected @Nullable Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean idk) {
        return KazsEndConfiguredFeatures.ENDERVIOLET_TREE;
    }
}
