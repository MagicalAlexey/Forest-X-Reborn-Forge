
package power.forestxreborn.fluid;

import power.forestxreborn.init.ForestModItems;
import power.forestxreborn.init.ForestModFluids;
import power.forestxreborn.init.ForestModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

public abstract class QuicksandFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ForestModFluids.QUICKSAND,
			ForestModFluids.FLOWING_QUICKSAND,
			FluidAttributes.builder(new ResourceLocation("forest:blocks/quicksand"), new ResourceLocation("forest:blocks/quicksand"))

					.temperature(400)

	).explosionResistance(100f)

			.tickRate(120).levelDecreasePerBlock(5).slopeFindDistance(1).bucket(ForestModItems.QUICKSAND_BUCKET)
			.block(() -> (LiquidBlock) ForestModBlocks.QUICKSAND.get());

	private QuicksandFluid() {
		super(PROPERTIES);
	}

	public static class Source extends QuicksandFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends QuicksandFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
