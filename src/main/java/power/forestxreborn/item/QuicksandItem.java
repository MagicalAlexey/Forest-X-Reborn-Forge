
package power.forestxreborn.item;

import power.forestxreborn.init.ForestModTabs;
import power.forestxreborn.init.ForestModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class QuicksandItem extends BucketItem {
	public QuicksandItem() {
		super(ForestModFluids.QUICKSAND,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(ForestModTabs.TAB_DESERT_CATEGORY));
	}
}
