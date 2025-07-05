package com.Apothic0n.KazsEnd.core.objects;

import com.Apothic0n.KazsEnd.KazsEnd;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class KazsEndItems extends Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KazsEnd.MODID);

    public static final RegistryObject<Item> ENDERGRANATE = ITEMS.register("endergranate", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.APPLE)));

    public static final RegistryObject<Item> SPODOSOL = ITEMS.register("spodosol", () ->
            new BlockItem(KazsEndBlocks.SPODOSOL.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_TURF = ITEMS.register("ender_turf", () ->
            new BlockItem(KazsEndBlocks.ENDER_TURF.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> ENDER_ROOTS = ITEMS.register("ender_roots", () ->
            new BlockItem(KazsEndBlocks.ENDER_ROOTS.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDER_CLOVER = ITEMS.register("ender_clover", () ->
            new BlockItem(KazsEndBlocks.ENDER_CLOVER.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDERGREEN = ITEMS.register("endergreen", () ->
            new BlockItem(KazsEndBlocks.ENDERGREEN.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CREEPING_ENDRILS = ITEMS.register("creeping_endrils", () ->
            new BlockItem(KazsEndBlocks.CREEPING_ENDRILS.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SPROUTING_ENDERVINES = ITEMS.register("sprouting_endervines", () ->
            new BlockItem(KazsEndBlocks.SPROUTING_ENDERVINES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> EBONY_SAPLING = ITEMS.register("ebony_sapling", () ->
            new BlockItem(KazsEndBlocks.EBONY_SAPLING.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> EBONY_LEAVES = ITEMS.register("ebony_leaves", () ->
            new BlockItem(KazsEndBlocks.EBONY_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> EBONY_LOG = ITEMS.register("ebony_log", () ->
            new BlockItem(KazsEndBlocks.EBONY_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_WOOD = ITEMS.register("ebony_wood", () ->
            new BlockItem(KazsEndBlocks.EBONY_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_EBONY = ITEMS.register("stripped_ebony", () ->
            new BlockItem(KazsEndBlocks.STRIPPED_EBONY.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_EBONY_WOOD = ITEMS.register("stripped_ebony_wood", () ->
            new BlockItem(KazsEndBlocks.STRIPPED_EBONY_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_PLANKS = ITEMS.register("ebony_planks", () ->
            new BlockItem(KazsEndBlocks.EBONY_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_SLAB = ITEMS.register("ebony_slab", () ->
            new BlockItem(KazsEndBlocks.EBONY_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EBONY_STAIRS = ITEMS.register("ebony_stairs", () ->
            new BlockItem(KazsEndBlocks.EBONY_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> ENDERVIOLET_SAPLING = ITEMS.register("enderviolet_sapling", () ->
            new BlockItem(KazsEndBlocks.ENDERVIOLET_SAPLING.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDERVIOLET_LEAVES = ITEMS.register("enderviolet_leaves", () ->
            new BlockItem(KazsEndBlocks.ENDERVIOLET_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ENDERVIOLET_LOG = ITEMS.register("enderviolet_log", () ->
            new BlockItem(KazsEndBlocks.ENDERVIOLET_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_WOOD = ITEMS.register("enderviolet_wood", () ->
            new BlockItem(KazsEndBlocks.ENDERVIOLET_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_ENDERVIOLET = ITEMS.register("stripped_enderviolet", () ->
            new BlockItem(KazsEndBlocks.STRIPPED_ENDERVIOLET.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_ENDERVIOLET_WOOD = ITEMS.register("stripped_enderviolet_wood", () ->
            new BlockItem(KazsEndBlocks.STRIPPED_ENDERVIOLET_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_PLANKS = ITEMS.register("enderviolet_planks", () ->
            new BlockItem(KazsEndBlocks.ENDERVIOLET_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_SLAB = ITEMS.register("enderviolet_slab", () ->
            new BlockItem(KazsEndBlocks.ENDERVIOLET_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ENDERVIOLET_STAIRS = ITEMS.register("enderviolet_stairs", () ->
            new BlockItem(KazsEndBlocks.ENDERVIOLET_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
