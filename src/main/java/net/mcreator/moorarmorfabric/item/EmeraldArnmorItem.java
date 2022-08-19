
package net.mcreator.moorarmorfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
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

public abstract class EmeraldArnmorItem extends ArmorItem {
	public EmeraldArnmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 60;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 9, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.EMERALD));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "emerald";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.05f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EmeraldArnmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Chestplate extends EmeraldArnmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Leggings extends EmeraldArnmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Boots extends EmeraldArnmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}
}
