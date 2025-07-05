package com.Apothic0n.KazsEnd.core.objects;

import com.Apothic0n.KazsEnd.KazsEnd;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.grower.SpruceTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class KazsEndBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KazsEnd.MODID);

    public static final RegistryObject<Block> SPODOSOL = BLOCKS.register("spodosol", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PODZOL).sound(SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> ENDER_TURF = BLOCKS.register("ender_turf", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PODZOL).sound(SoundType.ROOTED_DIRT)));

    public static final RegistryObject<Block> ENDER_ROOTS = BLOCKS.register("ender_roots", () ->
            new TallGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).sound(SoundType.ROOTS)));
    public static final RegistryObject<Block> ENDER_CLOVER = BLOCKS.register("ender_clover", () ->
            new CloverBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).sound(SoundType.ROOTS)));
    public static final RegistryObject<Block> ENDERGREEN = BLOCKS.register("endergreen", () ->
            new TallGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).sound(SoundType.ROOTS)));
    public static final RegistryObject<Block> CREEPING_ENDRILS = BLOCKS.register("creeping_endrils", () ->
            new CreepingEndrilsBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES).sound(SoundType.WEEPING_VINES)));
    public static final RegistryObject<Block> CREEPING_ENDRILS_PLANT = BLOCKS.register("creeping_endrils_plant", () ->
            new CreepingEndrilsPlantBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT).sound(SoundType.WEEPING_VINES)));
    public static final RegistryObject<Block> SPROUTING_ENDERVINES = BLOCKS.register("sprouting_endervines", () ->
            new SproutingEndervinesBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES).sound(SoundType.TWISTING_VINES)));
    public static final RegistryObject<Block> SPROUTING_ENDERVINES_PLANT = BLOCKS.register("sprouting_endervines_plant", () ->
            new SproutingEndervinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES_PLANT).sound(SoundType.TWISTING_VINES)));

    public static final RegistryObject<Block> EBONY_SAPLING = BLOCKS.register("ebony_sapling", () ->
            new SaplingBlock(new SpruceTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> EBONY_LEAVES = BLOCKS.register("ebony_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> EBONY_LOG = BLOCKS.register("ebony_log", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_BLACK;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_WOOD = BLOCKS.register("ebony_wood", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_BLACK;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_EBONY = BLOCKS.register("stripped_ebony", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_BLACK;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = BLOCKS.register("stripped_ebony_wood", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_BLACK;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_PLANKS = BLOCKS.register("ebony_planks", () ->
            new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_SLAB = BLOCKS.register("ebony_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_STAIRS = BLOCKS.register("ebony_stairs", () ->
            new StairBlock(EBONY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ENDERVIOLET_SAPLING = BLOCKS.register("enderviolet_sapling", () ->
            new SaplingBlock(new OakTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> ENDERVIOLET_LEAVES = BLOCKS.register("enderviolet_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> ENDERVIOLET_LOG = BLOCKS.register("enderviolet_log", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_PURPLE;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_WOOD = BLOCKS.register("enderviolet_wood", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_PURPLE;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_ENDERVIOLET = BLOCKS.register("stripped_enderviolet", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_PURPLE;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_ENDERVIOLET_WOOD = BLOCKS.register("stripped_enderviolet_wood", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (state) -> {
                return MaterialColor.COLOR_PURPLE;
            }).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_PLANKS = BLOCKS.register("enderviolet_planks", () ->
            new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_SLAB = BLOCKS.register("enderviolet_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_STAIRS = BLOCKS.register("enderviolet_stairs", () ->
            new StairBlock(EBONY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));


    public static void fixBlockRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(ENDER_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDER_CLOVER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERGREEN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CREEPING_ENDRILS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CREEPING_ENDRILS_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SPROUTING_ENDERVINES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SPROUTING_ENDERVINES_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBONY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERVIOLET_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERVIOLET_LEAVES.get(), RenderType.cutout());
    }
}
