package net.FatCactis.smoothparticles.mixin;

import net.FatCactis.smoothparticles.SmoothParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class ParticleSpawning {

	BlockState bs;
	BlockPos bp;
	World w;

	@Inject(at = @At("HEAD"), method = "onPlaced")
	protected void spawnParticles(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack, CallbackInfo ci) {

		if (state.isOpaque() || SmoothParticles.allowed.contains(state.getBlock())) {
			world.addBlockBreakParticles(pos, state);
		}
	}
}