
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

public abstract class AzaleaArmorItem extends ArmorItem {
	public AzaleaArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 3;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 3, 3, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.AZALEA));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "azalea";
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

	public static class Helmet extends AzaleaArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Chestplate extends AzaleaArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Leggings extends AzaleaArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Boots extends AzaleaArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}
}
