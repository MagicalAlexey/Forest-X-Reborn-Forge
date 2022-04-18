
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ForestModTabs {
	public static CreativeModeTab TAB_SILVER_CATEGORY;
	public static CreativeModeTab TAB_FLOWERS_CATEGORY;
	public static CreativeModeTab TAB_FRUCTIC_FOREST_CATEGORY;
	public static CreativeModeTab TAB_BURNED_FOREST_CATEGORY;
	public static CreativeModeTab TAB_SALT_CATEGORY;
	public static CreativeModeTab TAB_BERRIES;
	public static CreativeModeTab TAB_DESERT_CATEGORY;
	public static CreativeModeTab TAB_CRYSTAL_CATEGORY;
	public static CreativeModeTab TAB_DECORATIVE_CATEGORY;
	public static CreativeModeTab TAB_SAPPHIRE_CATEGORY;

	public static void load() {
		TAB_SILVER_CATEGORY = new CreativeModeTab("tabsilver_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModItems.SILVER_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FLOWERS_CATEGORY = new CreativeModeTab("tabflowers_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModBlocks.LAVANDER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FRUCTIC_FOREST_CATEGORY = new CreativeModeTab("tabfructic_forest_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModItems.CHERRY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BURNED_FOREST_CATEGORY = new CreativeModeTab("tabburned_forest_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModBlocks.BURNED_LOG.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SALT_CATEGORY = new CreativeModeTab("tabsalt_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModItems.SALT_DUST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BERRIES = new CreativeModeTab("tabberries") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModItems.BLUEBERRY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DESERT_CATEGORY = new CreativeModeTab("tabdesert_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModBlocks.CRUSHED_SANDSTONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CRYSTAL_CATEGORY = new CreativeModeTab("tabcrystal_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModItems.CRYSTAL_DUST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DECORATIVE_CATEGORY = new CreativeModeTab("tabdecorative_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModBlocks.WINDOW_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SAPPHIRE_CATEGORY = new CreativeModeTab("tabsapphire_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForestModItems.SAPPHIRE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
