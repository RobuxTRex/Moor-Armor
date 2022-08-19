
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

public abstract class BarrierArmorItem extends ArmorItem {
	public BarrierArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{100, 100, 100, 100}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return new SoundEvent(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BARRIER));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "barrier";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BarrierArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Chestplate extends BarrierArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Leggings extends BarrierArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}

	public static class Boots extends BarrierArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoorArmorFabricModTabs.TAB_MOOR_ARMOR));
		}
	}
}
