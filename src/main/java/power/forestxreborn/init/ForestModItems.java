
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.item.SilverSwordItem;
import power.forestxreborn.item.SilverShovelItem;
import power.forestxreborn.item.SilverPickaxeItem;
import power.forestxreborn.item.SilverIngotItem;
import power.forestxreborn.item.SilverHoeItem;
import power.forestxreborn.item.SilverAxeItem;
import power.forestxreborn.item.SapphireItem;
import power.forestxreborn.item.SaltTropicalFishItem;
import power.forestxreborn.item.SaltSamlonItem;
import power.forestxreborn.item.SaltEggItem;
import power.forestxreborn.item.SaltDustItem;
import power.forestxreborn.item.SaltCodItem;
import power.forestxreborn.item.RaspberryItem;
import power.forestxreborn.item.QuicksandItem;
import power.forestxreborn.item.PearItem;
import power.forestxreborn.item.PeachItem;
import power.forestxreborn.item.MusicDiscEgyptItem;
import power.forestxreborn.item.LemonItem;
import power.forestxreborn.item.CrystalDustItem;
import power.forestxreborn.item.CranberryItem;
import power.forestxreborn.item.CherryItem;
import power.forestxreborn.item.BlueberryItem;
import power.forestxreborn.item.BlackberryItem;
import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class ForestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForestMod.MODID);
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SilverPickaxeItem());
	public static final RegistryObject<Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final RegistryObject<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final RegistryObject<Item> SILVER_HOE = REGISTRY.register("silver_hoe", () -> new SilverHoeItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_BLOCK = block(ForestModBlocks.SILVER_BLOCK, ForestModTabs.TAB_SILVER_CATEGORY);
	public static final RegistryObject<Item> SILVER_ORE = block(ForestModBlocks.SILVER_ORE, ForestModTabs.TAB_SILVER_CATEGORY);
	public static final RegistryObject<Item> CHERRY_WOOD = block(ForestModBlocks.CHERRY_WOOD, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_LOG = block(ForestModBlocks.CHERRY_LOG, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_PLANKS = block(ForestModBlocks.CHERRY_PLANKS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_LEAVES = block(ForestModBlocks.CHERRY_LEAVES, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_STAIRS = block(ForestModBlocks.CHERRY_STAIRS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_SLAB = block(ForestModBlocks.CHERRY_SLAB, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_FENCE = block(ForestModBlocks.CHERRY_FENCE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_FENCE_GATE = block(ForestModBlocks.CHERRY_FENCE_GATE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> CHERRY_SAPLING = block(ForestModBlocks.CHERRY_SAPLING, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_LOG = block(ForestModBlocks.LEMON_LOG, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_WOOD = block(ForestModBlocks.LEMON_WOOD, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_PLANKS = block(ForestModBlocks.LEMON_PLANKS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_LEAVES = block(ForestModBlocks.LEMON_LEAVES, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_STAIRS = block(ForestModBlocks.LEMON_STAIRS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_SLAB = block(ForestModBlocks.LEMON_SLAB, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_FENCE = block(ForestModBlocks.LEMON_FENCE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_FENCE_GATE = block(ForestModBlocks.LEMON_FENCE_GATE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> LEMON_SAPLING = block(ForestModBlocks.LEMON_SAPLING, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_WOOD = block(ForestModBlocks.PEACH_WOOD, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_LOG = block(ForestModBlocks.PEACH_LOG, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_PLANKS = block(ForestModBlocks.PEACH_PLANKS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_LEAVES = block(ForestModBlocks.PEACH_LEAVES, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_STAIRS = block(ForestModBlocks.PEACH_STAIRS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_SLAB = block(ForestModBlocks.PEACH_SLAB, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_FENCE = block(ForestModBlocks.PEACH_FENCE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_FENCE_GATE = block(ForestModBlocks.PEACH_FENCE_GATE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEACH_SAPLING = block(ForestModBlocks.PEACH_SAPLING, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_WOOD = block(ForestModBlocks.PEAR_WOOD, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_LOG = block(ForestModBlocks.PEAR_LOG, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_PLANKS = block(ForestModBlocks.PEAR_PLANKS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_LEAVES = block(ForestModBlocks.PEAR_LEAVES, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_STAIRS = block(ForestModBlocks.PEAR_STAIRS, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_SLAB = block(ForestModBlocks.PEAR_SLAB, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_FENCE = block(ForestModBlocks.PEAR_FENCE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_FENCE_GATE = block(ForestModBlocks.PEAR_FENCE_GATE, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> PEAR_SAPLING = block(ForestModBlocks.PEAR_SAPLING, ForestModTabs.TAB_FRUCTIC_FOREST_CATEGORY);
	public static final RegistryObject<Item> WILDFLOWER = block(ForestModBlocks.WILDFLOWER, ForestModTabs.TAB_FLOWERS_CATEGORY);
	public static final RegistryObject<Item> BURNINGBLOSSOM = block(ForestModBlocks.BURNINGBLOSSOM, ForestModTabs.TAB_FLOWERS_CATEGORY);
	public static final RegistryObject<Item> LAVANDER = block(ForestModBlocks.LAVANDER, ForestModTabs.TAB_FLOWERS_CATEGORY);
	public static final RegistryObject<Item> ASH_BLOCK = block(ForestModBlocks.ASH_BLOCK, ForestModTabs.TAB_BURNED_FOREST_CATEGORY);
	public static final RegistryObject<Item> BURNED_LOG = block(ForestModBlocks.BURNED_LOG, ForestModTabs.TAB_BURNED_FOREST_CATEGORY);
	public static final RegistryObject<Item> BURNED_PLANKS = block(ForestModBlocks.BURNED_PLANKS, ForestModTabs.TAB_BURNED_FOREST_CATEGORY);
	public static final RegistryObject<Item> BURNED_LEAVES = block(ForestModBlocks.BURNED_LEAVES, ForestModTabs.TAB_BURNED_FOREST_CATEGORY);
	public static final RegistryObject<Item> ASHENCOW = REGISTRY.register("ashencow_spawn_egg",
			() -> new ForgeSpawnEggItem(ForestModEntities.ASHENCOW, -12698048, -13230764,
					new Item.Properties().tab(ForestModTabs.TAB_BURNED_FOREST_CATEGORY)));
	public static final RegistryObject<Item> ROCK_SALT = block(ForestModBlocks.ROCK_SALT, ForestModTabs.TAB_SALT_CATEGORY);
	public static final RegistryObject<Item> SALT_BLOCK = block(ForestModBlocks.SALT_BLOCK, ForestModTabs.TAB_SALT_CATEGORY);
	public static final RegistryObject<Item> SALT_DUST = REGISTRY.register("salt_dust", () -> new SaltDustItem());
	public static final RegistryObject<Item> BLACKBERRYBUSH_0 = block(ForestModBlocks.BLACKBERRYBUSH_0, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> BLACKBERRYBUSH_1 = block(ForestModBlocks.BLACKBERRYBUSH_1, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> RASPBERRYBUSH_0 = block(ForestModBlocks.RASPBERRYBUSH_0, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> RASPBERRYBUSH_1 = block(ForestModBlocks.RASPBERRYBUSH_1, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> CRANBERRYBUSH_0 = block(ForestModBlocks.CRANBERRYBUSH_0, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> CRANBERRYBUSH_1 = block(ForestModBlocks.CRANBERRYBUSH_1, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> BLUEBERRYBUSH_0 = block(ForestModBlocks.BLUEBERRYBUSH_0, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> BLUEBERRYBUSH_1 = block(ForestModBlocks.BLUEBERRYBUSH_1, ForestModTabs.TAB_BERRIES);
	public static final RegistryObject<Item> CRUSHED_SANDSTONE = block(ForestModBlocks.CRUSHED_SANDSTONE, ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> CRUSHED_SANDSTONE_STAIRS = block(ForestModBlocks.CRUSHED_SANDSTONE_STAIRS,
			ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> CRUSHED_SANDSTONE_SLAB = block(ForestModBlocks.CRUSHED_SANDSTONE_SLAB,
			ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> CRUSHED_SANDSTONE_WALL = block(ForestModBlocks.CRUSHED_SANDSTONE_WALL,
			ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> RED_CRUSHED_SANDSTONE = block(ForestModBlocks.RED_CRUSHED_SANDSTONE, ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> RED_CRUSHED_SANDSTONE_STAIRS = block(ForestModBlocks.RED_CRUSHED_SANDSTONE_STAIRS,
			ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> RED_CRUSHED_SANDSTONE_SLAB = block(ForestModBlocks.RED_CRUSHED_SANDSTONE_SLAB,
			ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> RED_CRUSHED_SANDSTONE_WALL = block(ForestModBlocks.RED_CRUSHED_SANDSTONE_WALL,
			ForestModTabs.TAB_DESERT_CATEGORY);
	public static final RegistryObject<Item> MUSIC_DISC_EGYPT = REGISTRY.register("music_disc_egypt", () -> new MusicDiscEgyptItem());
	public static final RegistryObject<Item> MUMMY = REGISTRY.register("mummy_spawn_egg",
			() -> new ForgeSpawnEggItem(ForestModEntities.MUMMY, -2972393, -7727400, new Item.Properties().tab(ForestModTabs.TAB_DESERT_CATEGORY)));
	public static final RegistryObject<Item> QUICKSAND_BUCKET = REGISTRY.register("quicksand_bucket", () -> new QuicksandItem());
	public static final RegistryObject<Item> CRYSTAL_DUST = REGISTRY.register("crystal_dust", () -> new CrystalDustItem());
	public static final RegistryObject<Item> UNDERGROUND_CRYSTAL = block(ForestModBlocks.UNDERGROUND_CRYSTAL, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> CRYSTAL_BLOCK = block(ForestModBlocks.CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> GRAY_CRYSTAL_BLOCK = block(ForestModBlocks.GRAY_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> BROWN_CRYSTAL_BLOCK = block(ForestModBlocks.BROWN_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> RED_CRYSTAL_BLOCK = block(ForestModBlocks.RED_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> ORANGE_CRYSTAL_BLOCK = block(ForestModBlocks.ORANGE_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> YELLOW_CRYSTAL_BLOCK = block(ForestModBlocks.YELLOW_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> LIME_CRYSTAL_BLOCK = block(ForestModBlocks.LIME_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> GREEN_CRYSTAL_BLOCK = block(ForestModBlocks.GREEN_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> LIGHT_BLUE_CRYSTAL_BLOCK = block(ForestModBlocks.LIGHT_BLUE_CRYSTAL_BLOCK,
			ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> BLUE_CRYSTAL_BLOCK = block(ForestModBlocks.BLUE_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> VIOLET_CRYSTAL_BLOCK = block(ForestModBlocks.VIOLET_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> PURPLE_CRYSTAL_BLOCK = block(ForestModBlocks.PURPLE_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> PINK_CRYSTAL_BLOCK = block(ForestModBlocks.PINK_CRYSTAL_BLOCK, ForestModTabs.TAB_CRYSTAL_CATEGORY);
	public static final RegistryObject<Item> WINDOW_BLOCK = block(ForestModBlocks.WINDOW_BLOCK, ForestModTabs.TAB_DECORATIVE_CATEGORY);
	public static final RegistryObject<Item> BLACK_WINDOWS_BLOCK = block(ForestModBlocks.BLACK_WINDOWS_BLOCK, ForestModTabs.TAB_DECORATIVE_CATEGORY);
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(ForestModBlocks.SAPPHIRE_ORE, ForestModTabs.TAB_SAPPHIRE_CATEGORY);
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(ForestModBlocks.SAPPHIRE_BLOCK, ForestModTabs.TAB_SAPPHIRE_CATEGORY);
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> BURNED_PRESSURE_PLATE = block(ForestModBlocks.BURNED_PRESSURE_PLATE, null);
	public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = block(ForestModBlocks.DEEPSLATE_SILVER_ORE, ForestModTabs.TAB_SILVER_CATEGORY);
	public static final RegistryObject<Item> CHERRY = REGISTRY.register("cherry", () -> new CherryItem());
	public static final RegistryObject<Item> LEMON = REGISTRY.register("lemon", () -> new LemonItem());
	public static final RegistryObject<Item> PEACH = REGISTRY.register("peach", () -> new PeachItem());
	public static final RegistryObject<Item> PEAR = REGISTRY.register("pear", () -> new PearItem());
	public static final RegistryObject<Item> BLACKBERRY = REGISTRY.register("blackberry", () -> new BlackberryItem());
	public static final RegistryObject<Item> RASPBERRY = REGISTRY.register("raspberry", () -> new RaspberryItem());
	public static final RegistryObject<Item> CRANBERRY = REGISTRY.register("cranberry", () -> new CranberryItem());
	public static final RegistryObject<Item> BLUEBERRY = REGISTRY.register("blueberry", () -> new BlueberryItem());
	public static final RegistryObject<Item> SALT_COD = REGISTRY.register("salt_cod", () -> new SaltCodItem());
	public static final RegistryObject<Item> SALT_SAMLON = REGISTRY.register("salt_samlon", () -> new SaltSamlonItem());
	public static final RegistryObject<Item> SALT_TROPICAL_FISH = REGISTRY.register("salt_tropical_fish", () -> new SaltTropicalFishItem());
	public static final RegistryObject<Item> SALT_EGG = REGISTRY.register("salt_egg", () -> new SaltEggItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
