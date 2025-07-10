package com.Apothic0n.StarryEnd.core.objects;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class EbonyTreeGrower extends AbstractMegaTreeGrower {
    @Override
    protected @Nullable Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean idk) {
        return StarryEndConfiguredFeatures.EBONY_TREE;
    }

    @Override
    protected @Nullable Holder<? extends ConfiguredFeature<?, ?>> getConfiguredMegaFeature(Random random) {
        return StarryEndConfiguredFeatures.EBONY_GIANT_TREE;
    }
}
