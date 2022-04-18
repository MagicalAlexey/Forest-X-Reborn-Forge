
package power.forestxreborn.item;

import power.forestxreborn.init.ForestModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SapphireItem extends Item {
	public SapphireItem() {
		super(new Item.Properties().tab(ForestModTabs.TAB_SAPPHIRE_CATEGORY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
