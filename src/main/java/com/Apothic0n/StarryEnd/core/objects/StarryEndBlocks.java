package com.Apothic0n.StarryEnd.core.objects;

import com.Apothic0n.StarryEnd.StarryEnd;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class StarryEndBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StarryEnd.MODID);

    public static final RegistryObject<Block> ENDER_NEBULA = BLOCKS.register("ender_nebula", () ->
            new OxidizingBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STAGNANT_ENDER_NEBULA = BLOCKS.register("stagnant_ender_nebula", () ->
            new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ENDER_NEBULA_DUST = BLOCKS.register("ender_nebula_dust", () ->
            new ThinBlock(BlockBehaviour.Properties.of(Material.POWDER_SNOW, MaterialColor.COLOR_PURPLE).noCollission().instabreak().noOcclusion().strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.POWDER_SNOW).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ENDER_NEBULA_DUST_BLOCK = BLOCKS.register("ender_nebula_dust_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PURPLE).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ENDER_PROTOSTAR = BLOCKS.register("ender_protostar", () ->
            new OxidizingBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 12)));
    public static final RegistryObject<Block> STAGNANT_ENDER_PROTOSTAR = BLOCKS.register("stagnant_ender_protostar", () ->
            new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 12)));
    public static final RegistryObject<Block> ENDER_PROTOSTAR_DUST = BLOCKS.register("ender_protostar_dust", () ->
            new ThinBlock(BlockBehaviour.Properties.of(Material.POWDER_SNOW, MaterialColor.COLOR_ORANGE).noCollission().instabreak().noOcclusion().strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.POWDER_SNOW).lightLevel((state) -> 12)));
    public static final RegistryObject<Block> ENDER_PROTOSTAR_DUST_BLOCK = BLOCKS.register("ender_protostar_dust_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.SAND).lightLevel((state) -> 12)));
    public static final RegistryObject<Block> ENDER_STAR = BLOCKS.register("ender_star", () ->
            new OxidizingBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_YELLOW).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 9)));
    public static final RegistryObject<Block> STAGNANT_ENDER_STAR = BLOCKS.register("stagnant_ender_star", () ->
            new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_YELLOW).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 9)));
    public static final RegistryObject<Block> ENDER_STAR_DUST = BLOCKS.register("ender_star_dust", () ->
            new ThinBlock(BlockBehaviour.Properties.of(Material.POWDER_SNOW, MaterialColor.COLOR_YELLOW).noCollission().instabreak().noOcclusion().strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.POWDER_SNOW).lightLevel((state) -> 9)));
    public static final RegistryObject<Block> ENDER_STAR_DUST_BLOCK = BLOCKS.register("ender_star_dust_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_YELLOW).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.SAND).lightLevel((state) -> 9)));
    public static final RegistryObject<Block> ENDER_NEUTRON = BLOCKS.register("ender_neutron", () ->
            new OxidizingBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_CYAN).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 6)));
    public static final RegistryObject<Block> STAGNANT_ENDER_NEUTRON = BLOCKS.register("stagnant_ender_neutron", () ->
            new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_CYAN).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.AMETHYST).lightLevel((state) -> 6)));
    public static final RegistryObject<Block> ENDER_NEUTRON_DUST = BLOCKS.register("ender_neutron_dust", () ->
            new ThinBlock(BlockBehaviour.Properties.of(Material.POWDER_SNOW, MaterialColor.COLOR_CYAN).noCollission().instabreak().noOcclusion().strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.POWDER_SNOW).lightLevel((state) -> 6)));
    public static final RegistryObject<Block> ENDER_NEUTRON_DUST_BLOCK = BLOCKS.register("ender_neutron_dust_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_CYAN).strength(3.0F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.SAND).lightLevel((state) -> 6)));

    public static final RegistryObject<Block> SPODOSOL = BLOCKS.register("spodosol", () ->
            new SpodosolBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).sound(StarryEndSoundTypes.GRASSY_STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENDER_TURF = BLOCKS.register("ender_turf", () ->
            new EnderTurfBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).sound(StarryEndSoundTypes.GRASSY_STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDER_ROOTS = BLOCKS.register("ender_roots", () ->
            new EnderFoliageBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).sound(SoundType.ROOTS)));
    public static final RegistryObject<Block> ENDER_CLOVER = BLOCKS.register("ender_clover", () ->
            new CloverBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).sound(SoundType.ROOTS)));
    public static final RegistryObject<Block> ENDERGREEN = BLOCKS.register("endergreen", () ->
            new EnderFoliageBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).sound(SoundType.ROOTS)));
    public static final RegistryObject<Block> CREEPING_ENDRILS = BLOCKS.register("creeping_endrils", () ->
            new CreepingEndrilsBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES).sound(SoundType.WEEPING_VINES)));
    public static final RegistryObject<Block> CREEPING_ENDRILS_PLANT = BLOCKS.register("creeping_endrils_plant", () ->
            new CreepingEndrilsPlantBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT).sound(SoundType.WEEPING_VINES)));
    public static final RegistryObject<Block> SPROUTING_ENDERVINES = BLOCKS.register("sprouting_endervines", () ->
            new SproutingEndervinesBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES).sound(SoundType.TWISTING_VINES)));
    public static final RegistryObject<Block> SPROUTING_ENDERVINES_PLANT = BLOCKS.register("sprouting_endervines_plant", () ->
            new SproutingEndervinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES_PLANT).sound(SoundType.TWISTING_VINES)));

    public static final RegistryObject<Block> EBONY_SAPLING = BLOCKS.register("ebony_sapling", () ->
            new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> POTTED_EBONY_SAPLING = BLOCKS.register("potted_ebony_sapling", () ->
            new FlowerPotBlock(EBONY_SAPLING.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
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
            new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_SLAB = BLOCKS.register("ebony_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_STAIRS = BLOCKS.register("ebony_stairs", () ->
            new StairBlock(EBONY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_FENCE = BLOCKS.register("ebony_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, EBONY_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_FENCE_GATE = BLOCKS.register("ebony_fence_gate", () ->
            new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, EBONY_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = BLOCKS.register("ebony_pressure_plate", () ->
            new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, EBONY_PLANKS.get().defaultMaterialColor()).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_BUTTON = BLOCKS.register("ebony_button", () ->
            new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_DOOR = BLOCKS.register("ebony_door", () ->
            new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, EBONY_PLANKS.get().defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> EBONY_TRAPDOOR = BLOCKS.register("ebony_trapdoor", () ->
            new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(Blocks::never)));

    public static final RegistryObject<Block> ENDERVIOLET_SAPLING = BLOCKS.register("enderviolet_sapling", () ->
            new SaplingBlock(new EndervioletTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> POTTED_ENDERVIOLET_SAPLING = BLOCKS.register("potted_enderviolet_sapling", () ->
            new FlowerPotBlock(ENDERVIOLET_SAPLING.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
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
            new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_SLAB = BLOCKS.register("enderviolet_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_STAIRS = BLOCKS.register("enderviolet_stairs", () ->
            new StairBlock(ENDERVIOLET_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_FENCE = BLOCKS.register("enderviolet_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, ENDERVIOLET_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_FENCE_GATE = BLOCKS.register("enderviolet_fence_gate", () ->
            new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, ENDERVIOLET_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_PRESSURE_PLATE = BLOCKS.register("enderviolet_pressure_plate", () ->
            new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, ENDERVIOLET_PLANKS.get().defaultMaterialColor()).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_BUTTON = BLOCKS.register("enderviolet_button", () ->
            new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENDERVIOLET_DOOR = BLOCKS.register("enderviolet_door", () ->
            new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, ENDERVIOLET_PLANKS.get().defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> ENDERVIOLET_TRAPDOOR = BLOCKS.register("enderviolet_trapdoor", () ->
            new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(Blocks::never)));

    public static void fixBlockRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(ENDER_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDER_CLOVER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERGREEN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CREEPING_ENDRILS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CREEPING_ENDRILS_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SPROUTING_ENDERVINES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SPROUTING_ENDERVINES_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBONY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(POTTED_EBONY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBONY_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBONY_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERVIOLET_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(POTTED_ENDERVIOLET_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERVIOLET_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERVIOLET_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDERVIOLET_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDER_NEBULA_DUST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDER_PROTOSTAR_DUST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDER_STAR_DUST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ENDER_NEUTRON_DUST.get(), RenderType.cutout());
    }
}
