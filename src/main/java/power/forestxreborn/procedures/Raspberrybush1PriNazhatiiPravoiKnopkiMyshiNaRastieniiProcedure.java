package power.forestxreborn.procedures;

import power.forestxreborn.init.ForestModBlocks;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class Raspberrybush1PriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ForestModBlocks.RASPBERRYBUSH_1.get());
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		world.setBlock(new BlockPos(x, y, z), ForestModBlocks.RASPBERRYBUSH_0.get().defaultBlockState(), 3);
	}
}
