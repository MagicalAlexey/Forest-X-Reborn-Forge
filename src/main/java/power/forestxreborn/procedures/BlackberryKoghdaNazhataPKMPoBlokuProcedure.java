package power.forestxreborn.procedures;

import power.forestxreborn.init.ForestModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlackberryKoghdaNazhataPKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), ForestModBlocks.BLACKBERRYBUSH_0.get().defaultBlockState(), 3);
	}
}
