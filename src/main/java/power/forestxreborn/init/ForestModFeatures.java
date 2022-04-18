
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.world.features.plants.WildflowerFeature;
import power.forestxreborn.world.features.plants.Raspberrybush1Feature;
import power.forestxreborn.world.features.plants.LavanderFeature;
import power.forestxreborn.world.features.plants.Cranberrybush1Feature;
import power.forestxreborn.world.features.plants.BurningblossomFeature;
import power.forestxreborn.world.features.plants.Blueberrybush1Feature;
import power.forestxreborn.world.features.plants.Blackberrybush1Feature;
import power.forestxreborn.world.features.ores.UndergroundCrystalFeature;
import power.forestxreborn.world.features.ores.SilverOreFeature;
import power.forestxreborn.world.features.ores.SapphireOreFeature;
import power.forestxreborn.world.features.ores.SaltOreFeature;
import power.forestxreborn.world.features.ores.DeepslateSilverOreFeature;
import power.forestxreborn.world.features.ores.CrushedSandstoneFeature;
import power.forestxreborn.world.features.lakes.QuicksandFeature;
import power.forestxreborn.world.features.PearTreeFeature;
import power.forestxreborn.world.features.PeachTreeFeature;
import power.forestxreborn.world.features.LemonTreeFeature;
import power.forestxreborn.world.features.CherryTreeFeature;
import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ForestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForestMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDFLOWER = register("wildflower", WildflowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, WildflowerFeature.GENERATE_BIOMES, WildflowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BURNINGBLOSSOM = register("burningblossom", BurningblossomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BurningblossomFeature.GENERATE_BIOMES,
					BurningblossomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAVANDER = register("lavander", LavanderFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, LavanderFeature.GENERATE_BIOMES, LavanderFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROCK_SALT = register("rock_salt", SaltOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SaltOreFeature.GENERATE_BIOMES, SaltOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLACKBERRYBUSH_1 = register("blackberrybush_1", Blackberrybush1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Blackberrybush1Feature.GENERATE_BIOMES,
					Blackberrybush1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RASPBERRYBUSH_1 = register("raspberrybush_1", Raspberrybush1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Raspberrybush1Feature.GENERATE_BIOMES,
					Raspberrybush1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> CRANBERRYBUSH_1 = register("cranberrybush_1", Cranberrybush1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Cranberrybush1Feature.GENERATE_BIOMES,
					Cranberrybush1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUEBERRYBUSH_1 = register("blueberrybush_1", Blueberrybush1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Blueberrybush1Feature.GENERATE_BIOMES,
					Blueberrybush1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> CRUSHED_SANDSTONE = register("crushed_sandstone", CrushedSandstoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CrushedSandstoneFeature.GENERATE_BIOMES,
					CrushedSandstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> QUICKSAND = register("quicksand", QuicksandFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, QuicksandFeature.GENERATE_BIOMES, QuicksandFeature::placedFeature));
	public static final RegistryObject<Feature<?>> UNDERGROUND_CRYSTAL = register("underground_crystal", UndergroundCrystalFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, UndergroundCrystalFeature.GENERATE_BIOMES,
					UndergroundCrystalFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = register("sapphire_ore", SapphireOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, SapphireOreFeature.GENERATE_BIOMES, SapphireOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CHERRY_TREE = register("cherry_tree", CherryTreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, CherryTreeFeature.GENERATE_BIOMES, CherryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PEAR_TREE = register("pear_tree", PearTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PearTreeFeature.GENERATE_BIOMES, PearTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PEACH_TREE = register("peach_tree", PeachTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PeachTreeFeature.GENERATE_BIOMES, PeachTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LEMON_TREE = register("lemon_tree", LemonTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LemonTreeFeature.GENERATE_BIOMES, LemonTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", DeepslateSilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateSilverOreFeature.GENERATE_BIOMES,
					DeepslateSilverOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
