package com.Apothic0n.StarryEnd.core.objects;

import com.Apothic0n.StarryEnd.StarryEnd;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class StarryEndItems extends Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StarryEnd.MODID);

    public static final RegistryObject<Item> ENDERGRANATE = ITEMS.register("endergranate", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.APPLE)));

    public static final RegistryObject<Item> ENDER_NEBULA = ITEMS.register("ender_nebula", () ->
            new BlockItem(StarryEndBlocks.ENDER_NEBULA.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_NEBULA_DUST = ITEMS.register("ender_nebula_dust", () ->
            new BlockItem(StarryEndBlocks.ENDER_NEBULA_DUST.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_NEBULA_DUST_BLOCK = ITEMS.register("ender_nebula_dust_block", () ->
            new BlockItem(StarryEndBlocks.ENDER_NEBULA_DUST_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_PROTOSTAR = ITEMS.register("ender_protostar", () ->
            new BlockItem(StarryEndBlocks.ENDER_PROTOSTAR.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_PROTOSTAR_DUST = ITEMS.register("ender_protostar_dust", () ->
            new BlockItem(StarryEndBlocks.ENDER_PROTOSTAR_DUST.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_PROTOSTAR_DUST_BLOCK = ITEMS.register("ender_protostar_dust_block", () ->
            new BlockItem(StarryEndBlocks.ENDER_PROTOSTAR_DUST_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_STAR = ITEMS.register("ender_star", () ->
            new BlockItem(StarryEndBlocks.ENDER_STAR.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_STAR_DUST = ITEMS.register("ender_star_dust", () ->
            new BlockItem(StarryEndBlocks.ENDER_STAR_DUST.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_STAR_DUST_BLOCK = ITEMS.register("ender_star_dust_block", () ->
            new BlockItem(StarryEndBlocks.ENDER_STAR_DUST_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_NEUTRON = ITEMS.register("ender_neutron", () ->
            new BlockItem(StarryEndBlocks.ENDER_NEUTRON.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_NEUTRON_DUST = ITEMS.register("ender_neutron_dust", () ->
            new BlockItem(StarryEndBlocks.ENDER_NEUTRON_DUST.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_NEUTRON_DUST_BLOCK = ITEMS.register("ender_neutron_dust_block", () ->
            new BlockItem(StarryEndBlocks.ENDER_NEUTRON_DUST_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> SPODOSOL = ITEMS.register("spodosol", () ->
            new BlockItem(StarryEndBlocks.SPODOSOL.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_TURF = ITEMS.register("ender_turf", () ->
            new BlockItem(StarryEndBlocks.ENDER_TURF.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> ENDER_ROOTS = ITEMS.register("ender_roots", () ->
            new BlockItem(StarryEndBlocks.ENDER_ROOTS.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_CLOVER = ITEMS.register("ender_clover", () ->
            new BlockItem(StarryEndBlocks.ENDER_CLOVER.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDERGREEN = ITEMS.register("endergreen", () ->
            new BlockItem(StarryEndBlocks.ENDERGREEN.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CREEPING_ENDRILS = ITEMS.register("creeping_endrils", () ->
            new BlockItem(StarryEndBlocks.CREEPING_ENDRILS.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SPROUTING_ENDERVINES = ITEMS.register("sprouting_endervines", () ->
            new BlockItem(StarryEndBlocks.SPROUTING_ENDERVINES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> EBONY_SAPLING = ITEMS.register("ebony_sapling", () ->
            new BlockItem(StarryEndBlocks.EBONY_SAPLING.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> EBONY_LEAVES = ITEMS.register("ebony_leaves", () ->
            new BlockItem(StarryEndBlocks.EBONY_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> EBONY_LOG = ITEMS.register("ebony_log", () ->
            new BlockItem(StarryEndBlocks.EBONY_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_WOOD = ITEMS.register("ebony_wood", () ->
            new BlockItem(StarryEndBlocks.EBONY_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_EBONY = ITEMS.register("stripped_ebony", () ->
            new BlockItem(StarryEndBlocks.STRIPPED_EBONY.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_EBONY_WOOD = ITEMS.register("stripped_ebony_wood", () ->
            new BlockItem(StarryEndBlocks.STRIPPED_EBONY_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_PLANKS = ITEMS.register("ebony_planks", () ->
            new BlockItem(StarryEndBlocks.EBONY_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_SLAB = ITEMS.register("ebony_slab", () ->
            new BlockItem(StarryEndBlocks.EBONY_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_STAIRS = ITEMS.register("ebony_stairs", () ->
            new BlockItem(StarryEndBlocks.EBONY_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_FENCE = ITEMS.register("ebony_fence", () ->
            new BlockItem(StarryEndBlocks.EBONY_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> EBONY_FENCE_GATE = ITEMS.register("ebony_fence_gate", () ->
            new BlockItem(StarryEndBlocks.EBONY_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> EBONY_PRESSURE_PLATE = ITEMS.register("ebony_pressure_plate", () ->
            new BlockItem(StarryEndBlocks.EBONY_PRESSURE_PLATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> EBONY_BUTTON = ITEMS.register("ebony_button", () ->
            new BlockItem(StarryEndBlocks.EBONY_BUTTON.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> EBONY_DOOR = ITEMS.register("ebony_door", () ->
            new BlockItem(StarryEndBlocks.EBONY_DOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> EBONY_TRAPDOOR = ITEMS.register("ebony_trapdoor", () ->
            new BlockItem(StarryEndBlocks.EBONY_TRAPDOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Item> ENDERVIOLET_SAPLING = ITEMS.register("enderviolet_sapling", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_SAPLING.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDERVIOLET_LEAVES = ITEMS.register("enderviolet_leaves", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDERVIOLET_LOG = ITEMS.register("enderviolet_log", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_WOOD = ITEMS.register("enderviolet_wood", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_ENDERVIOLET = ITEMS.register("stripped_enderviolet", () ->
            new BlockItem(StarryEndBlocks.STRIPPED_ENDERVIOLET.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_ENDERVIOLET_WOOD = ITEMS.register("stripped_enderviolet_wood", () ->
            new BlockItem(StarryEndBlocks.STRIPPED_ENDERVIOLET_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_PLANKS = ITEMS.register("enderviolet_planks", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_SLAB = ITEMS.register("enderviolet_slab", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_STAIRS = ITEMS.register("enderviolet_stairs", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_FENCE = ITEMS.register("enderviolet_fence", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDERVIOLET_FENCE_GATE = ITEMS.register("enderviolet_fence_gate", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> ENDERVIOLET_PRESSURE_PLATE = ITEMS.register("enderviolet_pressure_plate", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_PRESSURE_PLATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> ENDERVIOLET_BUTTON = ITEMS.register("enderviolet_button", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_BUTTON.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> ENDERVIOLET_DOOR = ITEMS.register("enderviolet_door", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_DOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> ENDERVIOLET_TRAPDOOR = ITEMS.register("enderviolet_trapdoor", () ->
            new BlockItem(StarryEndBlocks.ENDERVIOLET_TRAPDOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
}
