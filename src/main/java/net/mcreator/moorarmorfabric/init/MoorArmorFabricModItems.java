
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moorarmorfabric.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.moorarmorfabric.item.RedstoneArmorItem;
import net.mcreator.moorarmorfabric.item.LapisArmorItem;
import net.mcreator.moorarmorfabric.item.EmeraldArnmorItem;
import net.mcreator.moorarmorfabric.item.BedrockArmorItem;
import net.mcreator.moorarmorfabric.item.BarrierArmorItem;
import net.mcreator.moorarmorfabric.item.AzaleaArmorItem;
import net.mcreator.moorarmorfabric.item.AnvilArmorItem;
import net.mcreator.moorarmorfabric.item.AncientDebrisArmorItem;
import net.mcreator.moorarmorfabric.MoorArmorFabricMod;

public class MoorArmorFabricModItems {
	public static Item EMERALD_ARNMOR_HELMET;
	public static Item EMERALD_ARNMOR_CHESTPLATE;
	public static Item EMERALD_ARNMOR_LEGGINGS;
	public static Item EMERALD_ARNMOR_BOOTS;
	public static Item BEDROCK_ARMOR_HELMET;
	public static Item BEDROCK_ARMOR_CHESTPLATE;
	public static Item BEDROCK_ARMOR_LEGGINGS;
	public static Item BEDROCK_ARMOR_BOOTS;
	public static Item BARRIER_ARMOR_HELMET;
	public static Item BARRIER_ARMOR_CHESTPLATE;
	public static Item BARRIER_ARMOR_LEGGINGS;
	public static Item BARRIER_ARMOR_BOOTS;
	public static Item LAPIS_ARMOR_HELMET;
	public static Item LAPIS_ARMOR_CHESTPLATE;
	public static Item LAPIS_ARMOR_LEGGINGS;
	public static Item LAPIS_ARMOR_BOOTS;
	public static Item REDSTONE_ARMOR_HELMET;
	public static Item REDSTONE_ARMOR_CHESTPLATE;
	public static Item REDSTONE_ARMOR_LEGGINGS;
	public static Item REDSTONE_ARMOR_BOOTS;
	public static Item AZALEA_ARMOR_HELMET;
	public static Item AZALEA_ARMOR_CHESTPLATE;
	public static Item AZALEA_ARMOR_LEGGINGS;
	public static Item AZALEA_ARMOR_BOOTS;
	public static Item ANVIL_ARMOR_HELMET;
	public static Item ANVIL_ARMOR_CHESTPLATE;
	public static Item ANVIL_ARMOR_LEGGINGS;
	public static Item ANVIL_ARMOR_BOOTS;
	public static Item ANCIENT_DEBRIS_ARMOR_HELMET;
	public static Item ANCIENT_DEBRIS_ARMOR_CHESTPLATE;
	public static Item ANCIENT_DEBRIS_ARMOR_LEGGINGS;
	public static Item ANCIENT_DEBRIS_ARMOR_BOOTS;

	public static void load() {
		EMERALD_ARNMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "emerald_arnmor_helmet"),
				new EmeraldArnmorItem.Helmet());
		EMERALD_ARNMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "emerald_arnmor_chestplate"),
				new EmeraldArnmorItem.Chestplate());
		EMERALD_ARNMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "emerald_arnmor_leggings"),
				new EmeraldArnmorItem.Leggings());
		EMERALD_ARNMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "emerald_arnmor_boots"),
				new EmeraldArnmorItem.Boots());
		BEDROCK_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "bedrock_armor_helmet"),
				new BedrockArmorItem.Helmet());
		BEDROCK_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "bedrock_armor_chestplate"),
				new BedrockArmorItem.Chestplate());
		BEDROCK_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "bedrock_armor_leggings"),
				new BedrockArmorItem.Leggings());
		BEDROCK_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "bedrock_armor_boots"),
				new BedrockArmorItem.Boots());
		BARRIER_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "barrier_armor_helmet"),
				new BarrierArmorItem.Helmet());
		BARRIER_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "barrier_armor_chestplate"),
				new BarrierArmorItem.Chestplate());
		BARRIER_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "barrier_armor_leggings"),
				new BarrierArmorItem.Leggings());
		BARRIER_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "barrier_armor_boots"),
				new BarrierArmorItem.Boots());
		LAPIS_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "lapis_armor_helmet"),
				new LapisArmorItem.Helmet());
		LAPIS_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "lapis_armor_chestplate"),
				new LapisArmorItem.Chestplate());
		LAPIS_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "lapis_armor_leggings"),
				new LapisArmorItem.Leggings());
		LAPIS_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "lapis_armor_boots"),
				new LapisArmorItem.Boots());
		REDSTONE_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "redstone_armor_helmet"),
				new RedstoneArmorItem.Helmet());
		REDSTONE_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "redstone_armor_chestplate"),
				new RedstoneArmorItem.Chestplate());
		REDSTONE_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "redstone_armor_leggings"),
				new RedstoneArmorItem.Leggings());
		REDSTONE_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "redstone_armor_boots"),
				new RedstoneArmorItem.Boots());
		AZALEA_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "azalea_armor_helmet"),
				new AzaleaArmorItem.Helmet());
		AZALEA_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "azalea_armor_chestplate"),
				new AzaleaArmorItem.Chestplate());
		AZALEA_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "azalea_armor_leggings"),
				new AzaleaArmorItem.Leggings());
		AZALEA_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "azalea_armor_boots"),
				new AzaleaArmorItem.Boots());
		ANVIL_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "anvil_armor_helmet"),
				new AnvilArmorItem.Helmet());
		ANVIL_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "anvil_armor_chestplate"),
				new AnvilArmorItem.Chestplate());
		ANVIL_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "anvil_armor_leggings"),
				new AnvilArmorItem.Leggings());
		ANVIL_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "anvil_armor_boots"),
				new AnvilArmorItem.Boots());
		ANCIENT_DEBRIS_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "ancient_debris_armor_helmet"),
				new AncientDebrisArmorItem.Helmet());
		ANCIENT_DEBRIS_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(MoorArmorFabricMod.MODID, "ancient_debris_armor_chestplate"), new AncientDebrisArmorItem.Chestplate());
		ANCIENT_DEBRIS_ARMOR_LEGGINGS = Registry.register(Registry.ITEM,
				new ResourceLocation(MoorArmorFabricMod.MODID, "ancient_debris_armor_leggings"), new AncientDebrisArmorItem.Leggings());
		ANCIENT_DEBRIS_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(MoorArmorFabricMod.MODID, "ancient_debris_armor_boots"),
				new AncientDebrisArmorItem.Boots());
	}
}
