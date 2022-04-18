
package power.forestxreborn.item;

import power.forestxreborn.init.ForestModTabs;
import power.forestxreborn.init.ForestModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class SilverAxeItem extends AxeItem {
	public SilverAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 450;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForestModItems.SILVER_INGOT.get()));
			}
		}, 1, -3.4f, new Item.Properties().tab(ForestModTabs.TAB_SILVER_CATEGORY));
	}
}
