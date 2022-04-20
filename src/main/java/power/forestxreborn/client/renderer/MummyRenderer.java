
package power.forestxreborn.client.renderer;

import power.forestxreborn.entity.MummyEntity;
import power.forestxreborn.client.model.Modelmummy;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MummyRenderer extends MobRenderer<MummyEntity, Modelmummy<MummyEntity>> {
	public MummyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmummy(context.bakeLayer(Modelmummy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MummyEntity entity) {
		return new ResourceLocation("forest:textures/entities/mummy.png");
	}
}
