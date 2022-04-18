
package power.forestxreborn.item;

import power.forestxreborn.init.ForestModTabs;
import power.forestxreborn.init.ForestModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscEgyptItem extends RecordItem {
	public MusicDiscEgyptItem() {
		super(0, ForestModSounds.REGISTRY.get(new ResourceLocation("forest:record.egypt")),
				new Item.Properties().tab(ForestModTabs.TAB_DESERT_CATEGORY).stacksTo(1).rarity(Rarity.RARE));
	}
}
