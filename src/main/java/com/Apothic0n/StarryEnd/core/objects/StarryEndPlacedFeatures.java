package com.Apothic0n.StarryEnd.core.objects;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class StarryEndPlacedFeatures {
    public static final Holder<PlacedFeature> ENDER_ROOTS_BONEMEAL = PlacementUtils.register("kazsend:ender_roots_bonemeal", StarryEndConfiguredFeatures.ENDER_ROOT, PlacementUtils.isEmpty());
    public static final Holder<PlacedFeature> ENDERGREEN_BONEMEAL = PlacementUtils.register("kazsend:endergreen_bonemeal", StarryEndConfiguredFeatures.ENDERGREEN, PlacementUtils.isEmpty());
    public static final Holder<PlacedFeature> ENDER_CLOVER_BONEMEAL = PlacementUtils.register("kazsend:ender_clover_bonemeal", StarryEndConfiguredFeatures.ENDER_CLOVER, PlacementUtils.isEmpty());
}
