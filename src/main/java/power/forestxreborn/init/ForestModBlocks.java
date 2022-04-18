
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.block.YellowCrystalBlockBlock;
import power.forestxreborn.block.WindowBlockBlock;
import power.forestxreborn.block.WildflowerBlock;
import power.forestxreborn.block.VioletCrystalBlockBlock;
import power.forestxreborn.block.UndergroundCrystalBlock;
import power.forestxreborn.block.SilverOreBlock;
import power.forestxreborn.block.SilverBlockBlock;
import power.forestxreborn.block.SapphireOreBlock;
import power.forestxreborn.block.SapphireBlockBlock;
import power.forestxreborn.block.SaltOreBlock;
import power.forestxreborn.block.SaltBlockBlock;
import power.forestxreborn.block.RedCrystalBlockBlock;
import power.forestxreborn.block.RedCrushedSandstoneWallBlock;
import power.forestxreborn.block.RedCrushedSandstoneStairsBlock;
import power.forestxreborn.block.RedCrushedSandstoneSlabBlock;
import power.forestxreborn.block.RedCrushedSandstoneBlock;
import power.forestxreborn.block.Raspberrybush1Block;
import power.forestxreborn.block.Raspberrybush0Block;
import power.forestxreborn.block.QuicksandBlock;
import power.forestxreborn.block.PurpleCrystalBlockBlock;
import power.forestxreborn.block.PinkCrystalBlockBlock;
import power.forestxreborn.block.PearWoodBlock;
import power.forestxreborn.block.PearStairsBlock;
import power.forestxreborn.block.PearSlabBlock;
import power.forestxreborn.block.PearSaplingBlock;
import power.forestxreborn.block.PearPlanksBlock;
import power.forestxreborn.block.PearLogBlock;
import power.forestxreborn.block.PearLeavesBlock;
import power.forestxreborn.block.PearFenceGateBlock;
import power.forestxreborn.block.PearFenceBlock;
import power.forestxreborn.block.PeachWoodBlock;
import power.forestxreborn.block.PeachStairsBlock;
import power.forestxreborn.block.PeachSlabBlock;
import power.forestxreborn.block.PeachSaplingBlock;
import power.forestxreborn.block.PeachPlanksBlock;
import power.forestxreborn.block.PeachLogBlock;
import power.forestxreborn.block.PeachLeavesBlock;
import power.forestxreborn.block.PeachFenceGateBlock;
import power.forestxreborn.block.PeachFenceBlock;
import power.forestxreborn.block.OrangeCrystalBlockBlock;
import power.forestxreborn.block.LimeCrystalBlockBlock;
import power.forestxreborn.block.LightBlueCrystalBlockBlock;
import power.forestxreborn.block.LemonWoodBlock;
import power.forestxreborn.block.LemonStairsBlock;
import power.forestxreborn.block.LemonSlabBlock;
import power.forestxreborn.block.LemonSaplingBlock;
import power.forestxreborn.block.LemonPlanksBlock;
import power.forestxreborn.block.LemonLogBlock;
import power.forestxreborn.block.LemonLeavesBlock;
import power.forestxreborn.block.LemonFenceGateBlock;
import power.forestxreborn.block.LemonFenceBlock;
import power.forestxreborn.block.LavanderBlock;
import power.forestxreborn.block.GreenCrystalBlockBlock;
import power.forestxreborn.block.GrayCrystalBlockBlock;
import power.forestxreborn.block.DeepslateSilverOreBlock;
import power.forestxreborn.block.CrystalBlockBlock;
import power.forestxreborn.block.CrushedSandstoneWallBlock;
import power.forestxreborn.block.CrushedSandstoneStairsBlock;
import power.forestxreborn.block.CrushedSandstoneSlabBlock;
import power.forestxreborn.block.CrushedSandstoneBlock;
import power.forestxreborn.block.Cranberrybush1Block;
import power.forestxreborn.block.Cranberrybush0Block;
import power.forestxreborn.block.CherryWoodBlock;
import power.forestxreborn.block.CherryStairsBlock;
import power.forestxreborn.block.CherrySlabBlock;
import power.forestxreborn.block.CherrySaplingBlock;
import power.forestxreborn.block.CherryPlanksBlock;
import power.forestxreborn.block.CherryLogBlock;
import power.forestxreborn.block.CherryLeavesBlock;
import power.forestxreborn.block.CherryFenceGateBlock;
import power.forestxreborn.block.CherryFenceBlock;
import power.forestxreborn.block.BurningblossomBlock;
import power.forestxreborn.block.BurnedPressurePlateBlock;
import power.forestxreborn.block.BurnedPlanksBlock;
import power.forestxreborn.block.BurnedLogBlock;
import power.forestxreborn.block.BurnedLeavesBlock;
import power.forestxreborn.block.BrownCrystalBlockBlock;
import power.forestxreborn.block.Blueberrybush1Block;
import power.forestxreborn.block.Blueberrybush0Block;
import power.forestxreborn.block.BlueCrystalBlockBlock;
import power.forestxreborn.block.Blackberrybush1Block;
import power.forestxreborn.block.Blackberrybush0Block;
import power.forestxreborn.block.BlackWindowsBlockBlock;
import power.forestxreborn.block.AshBlockBlock;
import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class ForestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForestMod.MODID);
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> CHERRY_WOOD = REGISTRY.register("cherry_wood", () -> new CherryWoodBlock());
	public static final RegistryObject<Block> CHERRY_LOG = REGISTRY.register("cherry_log", () -> new CherryLogBlock());
	public static final RegistryObject<Block> CHERRY_PLANKS = REGISTRY.register("cherry_planks", () -> new CherryPlanksBlock());
	public static final RegistryObject<Block> CHERRY_LEAVES = REGISTRY.register("cherry_leaves", () -> new CherryLeavesBlock());
	public static final RegistryObject<Block> CHERRY_STAIRS = REGISTRY.register("cherry_stairs", () -> new CherryStairsBlock());
	public static final RegistryObject<Block> CHERRY_SLAB = REGISTRY.register("cherry_slab", () -> new CherrySlabBlock());
	public static final RegistryObject<Block> CHERRY_FENCE = REGISTRY.register("cherry_fence", () -> new CherryFenceBlock());
	public static final RegistryObject<Block> CHERRY_FENCE_GATE = REGISTRY.register("cherry_fence_gate", () -> new CherryFenceGateBlock());
	public static final RegistryObject<Block> CHERRY_SAPLING = REGISTRY.register("cherry_sapling", () -> new CherrySaplingBlock());
	public static final RegistryObject<Block> LEMON_LOG = REGISTRY.register("lemon_log", () -> new LemonLogBlock());
	public static final RegistryObject<Block> LEMON_WOOD = REGISTRY.register("lemon_wood", () -> new LemonWoodBlock());
	public static final RegistryObject<Block> LEMON_PLANKS = REGISTRY.register("lemon_planks", () -> new LemonPlanksBlock());
	public static final RegistryObject<Block> LEMON_LEAVES = REGISTRY.register("lemon_leaves", () -> new LemonLeavesBlock());
	public static final RegistryObject<Block> LEMON_STAIRS = REGISTRY.register("lemon_stairs", () -> new LemonStairsBlock());
	public static final RegistryObject<Block> LEMON_SLAB = REGISTRY.register("lemon_slab", () -> new LemonSlabBlock());
	public static final RegistryObject<Block> LEMON_FENCE = REGISTRY.register("lemon_fence", () -> new LemonFenceBlock());
	public static final RegistryObject<Block> LEMON_FENCE_GATE = REGISTRY.register("lemon_fence_gate", () -> new LemonFenceGateBlock());
	public static final RegistryObject<Block> LEMON_SAPLING = REGISTRY.register("lemon_sapling", () -> new LemonSaplingBlock());
	public static final RegistryObject<Block> PEACH_WOOD = REGISTRY.register("peach_wood", () -> new PeachWoodBlock());
	public static final RegistryObject<Block> PEACH_LOG = REGISTRY.register("peach_log", () -> new PeachLogBlock());
	public static final RegistryObject<Block> PEACH_PLANKS = REGISTRY.register("peach_planks", () -> new PeachPlanksBlock());
	public static final RegistryObject<Block> PEACH_LEAVES = REGISTRY.register("peach_leaves", () -> new PeachLeavesBlock());
	public static final RegistryObject<Block> PEACH_STAIRS = REGISTRY.register("peach_stairs", () -> new PeachStairsBlock());
	public static final RegistryObject<Block> PEACH_SLAB = REGISTRY.register("peach_slab", () -> new PeachSlabBlock());
	public static final RegistryObject<Block> PEACH_FENCE = REGISTRY.register("peach_fence", () -> new PeachFenceBlock());
	public static final RegistryObject<Block> PEACH_FENCE_GATE = REGISTRY.register("peach_fence_gate", () -> new PeachFenceGateBlock());
	public static final RegistryObject<Block> PEACH_SAPLING = REGISTRY.register("peach_sapling", () -> new PeachSaplingBlock());
	public static final RegistryObject<Block> PEAR_WOOD = REGISTRY.register("pear_wood", () -> new PearWoodBlock());
	public static final RegistryObject<Block> PEAR_LOG = REGISTRY.register("pear_log", () -> new PearLogBlock());
	public static final RegistryObject<Block> PEAR_PLANKS = REGISTRY.register("pear_planks", () -> new PearPlanksBlock());
	public static final RegistryObject<Block> PEAR_LEAVES = REGISTRY.register("pear_leaves", () -> new PearLeavesBlock());
	public static final RegistryObject<Block> PEAR_STAIRS = REGISTRY.register("pear_stairs", () -> new PearStairsBlock());
	public static final RegistryObject<Block> PEAR_SLAB = REGISTRY.register("pear_slab", () -> new PearSlabBlock());
	public static final RegistryObject<Block> PEAR_FENCE = REGISTRY.register("pear_fence", () -> new PearFenceBlock());
	public static final RegistryObject<Block> PEAR_FENCE_GATE = REGISTRY.register("pear_fence_gate", () -> new PearFenceGateBlock());
	public static final RegistryObject<Block> PEAR_SAPLING = REGISTRY.register("pear_sapling", () -> new PearSaplingBlock());
	public static final RegistryObject<Block> WILDFLOWER = REGISTRY.register("wildflower", () -> new WildflowerBlock());
	public static final RegistryObject<Block> BURNINGBLOSSOM = REGISTRY.register("burningblossom", () -> new BurningblossomBlock());
	public static final RegistryObject<Block> LAVANDER = REGISTRY.register("lavander", () -> new LavanderBlock());
	public static final RegistryObject<Block> ASH_BLOCK = REGISTRY.register("ash_block", () -> new AshBlockBlock());
	public static final RegistryObject<Block> BURNED_LOG = REGISTRY.register("burned_log", () -> new BurnedLogBlock());
	public static final RegistryObject<Block> BURNED_PLANKS = REGISTRY.register("burned_planks", () -> new BurnedPlanksBlock());
	public static final RegistryObject<Block> BURNED_LEAVES = REGISTRY.register("burned_leaves", () -> new BurnedLeavesBlock());
	public static final RegistryObject<Block> ROCK_SALT = REGISTRY.register("rock_salt", () -> new SaltOreBlock());
	public static final RegistryObject<Block> SALT_BLOCK = REGISTRY.register("salt_block", () -> new SaltBlockBlock());
	public static final RegistryObject<Block> BLACKBERRYBUSH_0 = REGISTRY.register("blackberrybush_0", () -> new Blackberrybush0Block());
	public static final RegistryObject<Block> BLACKBERRYBUSH_1 = REGISTRY.register("blackberrybush_1", () -> new Blackberrybush1Block());
	public static final RegistryObject<Block> RASPBERRYBUSH_0 = REGISTRY.register("raspberrybush_0", () -> new Raspberrybush0Block());
	public static final RegistryObject<Block> RASPBERRYBUSH_1 = REGISTRY.register("raspberrybush_1", () -> new Raspberrybush1Block());
	public static final RegistryObject<Block> CRANBERRYBUSH_0 = REGISTRY.register("cranberrybush_0", () -> new Cranberrybush0Block());
	public static final RegistryObject<Block> CRANBERRYBUSH_1 = REGISTRY.register("cranberrybush_1", () -> new Cranberrybush1Block());
	public static final RegistryObject<Block> BLUEBERRYBUSH_0 = REGISTRY.register("blueberrybush_0", () -> new Blueberrybush0Block());
	public static final RegistryObject<Block> BLUEBERRYBUSH_1 = REGISTRY.register("blueberrybush_1", () -> new Blueberrybush1Block());
	public static final RegistryObject<Block> CRUSHED_SANDSTONE = REGISTRY.register("crushed_sandstone", () -> new CrushedSandstoneBlock());
	public static final RegistryObject<Block> CRUSHED_SANDSTONE_STAIRS = REGISTRY.register("crushed_sandstone_stairs",
			() -> new CrushedSandstoneStairsBlock());
	public static final RegistryObject<Block> CRUSHED_SANDSTONE_SLAB = REGISTRY.register("crushed_sandstone_slab",
			() -> new CrushedSandstoneSlabBlock());
	public static final RegistryObject<Block> CRUSHED_SANDSTONE_WALL = REGISTRY.register("crushed_sandstone_wall",
			() -> new CrushedSandstoneWallBlock());
	public static final RegistryObject<Block> RED_CRUSHED_SANDSTONE = REGISTRY.register("red_crushed_sandstone",
			() -> new RedCrushedSandstoneBlock());
	public static final RegistryObject<Block> RED_CRUSHED_SANDSTONE_STAIRS = REGISTRY.register("red_crushed_sandstone_stairs",
			() -> new RedCrushedSandstoneStairsBlock());
	public static final RegistryObject<Block> RED_CRUSHED_SANDSTONE_SLAB = REGISTRY.register("red_crushed_sandstone_slab",
			() -> new RedCrushedSandstoneSlabBlock());
	public static final RegistryObject<Block> RED_CRUSHED_SANDSTONE_WALL = REGISTRY.register("red_crushed_sandstone_wall",
			() -> new RedCrushedSandstoneWallBlock());
	public static final RegistryObject<Block> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandBlock());
	public static final RegistryObject<Block> UNDERGROUND_CRYSTAL = REGISTRY.register("underground_crystal", () -> new UndergroundCrystalBlock());
	public static final RegistryObject<Block> CRYSTAL_BLOCK = REGISTRY.register("crystal_block", () -> new CrystalBlockBlock());
	public static final RegistryObject<Block> GRAY_CRYSTAL_BLOCK = REGISTRY.register("gray_crystal_block", () -> new GrayCrystalBlockBlock());
	public static final RegistryObject<Block> BROWN_CRYSTAL_BLOCK = REGISTRY.register("brown_crystal_block", () -> new BrownCrystalBlockBlock());
	public static final RegistryObject<Block> RED_CRYSTAL_BLOCK = REGISTRY.register("red_crystal_block", () -> new RedCrystalBlockBlock());
	public static final RegistryObject<Block> ORANGE_CRYSTAL_BLOCK = REGISTRY.register("orange_crystal_block", () -> new OrangeCrystalBlockBlock());
	public static final RegistryObject<Block> YELLOW_CRYSTAL_BLOCK = REGISTRY.register("yellow_crystal_block", () -> new YellowCrystalBlockBlock());
	public static final RegistryObject<Block> LIME_CRYSTAL_BLOCK = REGISTRY.register("lime_crystal_block", () -> new LimeCrystalBlockBlock());
	public static final RegistryObject<Block> GREEN_CRYSTAL_BLOCK = REGISTRY.register("green_crystal_block", () -> new GreenCrystalBlockBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_CRYSTAL_BLOCK = REGISTRY.register("light_blue_crystal_block",
			() -> new LightBlueCrystalBlockBlock());
	public static final RegistryObject<Block> BLUE_CRYSTAL_BLOCK = REGISTRY.register("blue_crystal_block", () -> new BlueCrystalBlockBlock());
	public static final RegistryObject<Block> VIOLET_CRYSTAL_BLOCK = REGISTRY.register("violet_crystal_block", () -> new VioletCrystalBlockBlock());
	public static final RegistryObject<Block> PURPLE_CRYSTAL_BLOCK = REGISTRY.register("purple_crystal_block", () -> new PurpleCrystalBlockBlock());
	public static final RegistryObject<Block> PINK_CRYSTAL_BLOCK = REGISTRY.register("pink_crystal_block", () -> new PinkCrystalBlockBlock());
	public static final RegistryObject<Block> WINDOW_BLOCK = REGISTRY.register("window_block", () -> new WindowBlockBlock());
	public static final RegistryObject<Block> BLACK_WINDOWS_BLOCK = REGISTRY.register("black_windows_block", () -> new BlackWindowsBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> BURNED_PRESSURE_PLATE = REGISTRY.register("burned_pressure_plate",
			() -> new BurnedPressurePlateBlock());
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", () -> new DeepslateSilverOreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CherrySaplingBlock.registerRenderLayer();
			LemonSaplingBlock.registerRenderLayer();
			PeachSaplingBlock.registerRenderLayer();
			PearSaplingBlock.registerRenderLayer();
			WildflowerBlock.registerRenderLayer();
			BurningblossomBlock.registerRenderLayer();
			LavanderBlock.registerRenderLayer();
			Blackberrybush0Block.registerRenderLayer();
			Blackberrybush1Block.registerRenderLayer();
			Raspberrybush0Block.registerRenderLayer();
			Raspberrybush1Block.registerRenderLayer();
			Cranberrybush0Block.registerRenderLayer();
			Cranberrybush1Block.registerRenderLayer();
			Blueberrybush0Block.registerRenderLayer();
			Blueberrybush1Block.registerRenderLayer();
			WindowBlockBlock.registerRenderLayer();
			BlackWindowsBlockBlock.registerRenderLayer();
		}
	}
}
