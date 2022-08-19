
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

public abstract class AncientDebrisArmorItem extends ArmorItem {
	public AncientDebrisArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.ANCIENT_DEBRIS));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "ancientdebris";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.05f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AncientDebrisArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Chestplate extends AncientDebrisArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Leggings extends AncientDebrisArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Boots extends AncientDebrisArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}
}
