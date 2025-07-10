package com.Apothic0n.StarryEnd.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.predicate.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;
import java.util.function.BiConsumer;

@Mixin(AlterGroundDecorator.class)
public abstract class AlterGroundDecoratorMixin extends TreeDecorator {

    @Shadow @Final private BlockStateProvider provider;

    @Inject(at = @At("HEAD"), method = "placeBlockAt(Lnet/minecraft/world/level/LevelSimulatedReader;Ljava/util/function/BiConsumer;Ljava/util/Random;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    public void placeBlockAt(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> p_161701_, Random p_161702_, BlockPos p_161703_, CallbackInfo ci) {
        for(int i = 2; i >= -3; --i) {
            BlockPos blockpos = p_161703_.above(i);
            if (Feature.isGrassOrDirt(level, blockpos) || level.isStateAtPosition(blockpos, BlockPredicate.forBlock(Blocks.END_STONE))) {
                p_161701_.accept(blockpos, this.provider.getState(p_161702_, p_161703_));
                break;
            }

            if (!Feature.isAir(level, blockpos) && i < 0) {
                break;
            }
        }
    }
}
