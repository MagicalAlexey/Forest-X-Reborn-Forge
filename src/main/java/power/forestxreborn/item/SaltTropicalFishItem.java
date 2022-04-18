
package power.forestxreborn.item;

import power.forestxreborn.init.ForestModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SaltTropicalFishItem extends Item {
	public SaltTropicalFishItem() {
		super(new Item.Properties().tab(ForestModTabs.TAB_SALT_CATEGORY).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.6f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
