
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moorarmorfabric.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class MoorArmorFabricModTabs {
	public static CreativeModeTab TAB_MOOR_ARMOR;

	public static void load() {
		TAB_MOOR_ARMOR = FabricItemGroupBuilder.create(new ResourceLocation("moor_armor_fabric", "moor_armor"))
				.icon(() -> new ItemStack(Items.DIAMOND_CHESTPLATE)).build();
	}
}
