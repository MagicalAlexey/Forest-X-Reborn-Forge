
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForestModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("forest", "record.egypt"), new SoundEvent(new ResourceLocation("forest", "record.egypt")));
		REGISTRY.put(new ResourceLocation("forest", "mummy.ambient"), new SoundEvent(new ResourceLocation("forest", "mummy.ambient")));
		REGISTRY.put(new ResourceLocation("forest", "mummy.step"), new SoundEvent(new ResourceLocation("forest", "mummy.step")));
		REGISTRY.put(new ResourceLocation("forest", "mummy.hurt"), new SoundEvent(new ResourceLocation("forest", "mummy.hurt")));
		REGISTRY.put(new ResourceLocation("forest", "mummy.death"), new SoundEvent(new ResourceLocation("forest", "mummy.death")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
