package com.Apothic0n.StarryEnd.core.objects;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.OptionalInt;

public final class StarryEndConfiguredFeatures {
    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> ENDER_ROOT = FeatureUtils.register("kazsend:ender_root", Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(StarryEndBlocks.ENDER_ROOTS.get().defaultBlockState())));
    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> ENDERGREEN = FeatureUtils.register("kazsend:endergreen", Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(StarryEndBlocks.ENDERGREEN.get().defaultBlockState())));
    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> ENDER_CLOVER = FeatureUtils.register("kazsend:ender_clover", Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(StarryEndBlocks.ENDER_CLOVER.get().defaultBlockState())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EBONY_TREE = FeatureUtils.register("kazsend:ebony_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(StarryEndBlocks.EBONY_LOG.get()),
            new StraightTrunkPlacer(5, 2, 1),
            BlockStateProvider.simple(StarryEndBlocks.EBONY_LEAVES.get()),
            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
            new TwoLayersFeatureSize(2, 0, 2))
    ).ignoreVines().build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EBONY_GIANT_TREE = FeatureUtils.register("kazsend:ebony_giant_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(StarryEndBlocks.EBONY_LOG.get()),
            new GiantTrunkPlacer(13, 2, 14),
            BlockStateProvider.simple(StarryEndBlocks.EBONY_LEAVES.get()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7)),
            new TwoLayersFeatureSize(1, 1, 2))
    ).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(StarryEndBlocks.SPODOSOL.get())))).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ENDERVIOLET_TREE = FeatureUtils.register("kazsend:enderviolet_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(StarryEndBlocks.ENDERVIOLET_LOG.get()),
            new FancyTrunkPlacer(3, 11, 0),
            BlockStateProvider.simple(StarryEndBlocks.ENDERVIOLET_LEAVES.get()),
            new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
    ).ignoreVines().build());
}