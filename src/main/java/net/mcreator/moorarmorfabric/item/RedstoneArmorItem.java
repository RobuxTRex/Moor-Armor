
package net.mcreator.moorarmorfabric.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.moorarmorfabric.init.MoorArmorFabricModTabs;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public abstract class RedstoneArmorItem extends ArmorItem {
	public RedstoneArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 5;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 3, 4, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.REDSTONE_WIRE));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "redstone";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RedstoneArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Chestplate extends RedstoneArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Leggings extends RedstoneArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Boots extends RedstoneArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}
}
