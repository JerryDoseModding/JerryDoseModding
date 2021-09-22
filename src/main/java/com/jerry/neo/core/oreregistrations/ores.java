package com.jerry.neo.core.oreregistrations;

import com.jerry.neo.NotEnoughOres;
import com.jerry.neo.core.mineraldeposits.Copper;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ores {

	public static final DeferredRegister<Block> ORES = DeferredRegister.create(ForgeRegistries.BLOCKS, NotEnoughOres.MODID);
	public static final DeferredRegister<Block> VORES = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
	
	public static final RegistryObject<Block> COPPER_ORE = ORES.register("copper_ore", () -> new Copper(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> ANDESITE_COPPER_ORE = ORES.register("andesite_copper_ore", () -> new Copper(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> DIORITE_COPPER_ORE = ORES.register("diorite_copper_ore", () -> new Copper(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> GRANITE_COPPER_ORE = ORES.register("granite_copper_ore", () -> new Copper(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> GOLD_ORE = VORES.register("gold_ore", () -> new Copper(AbstractBlock.Properties.copy(Blocks.GOLD_ORE)));
}
