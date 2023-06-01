package net.FatCactis.smoothparticles.mixin;

import net.FatCactis.smoothparticles.SmoothParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.BlockDustParticle;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import org.apache.commons.io.file.Counters;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.util.Counter;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

@Mixin(Block.class)
public class ParticleSpawning {

	BlockState bs;
	BlockPos bp;
	World w;

	@Inject(at = @At("HEAD"), method = "onPlaced")
	protected void spawnParticles(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack, CallbackInfo ci) {



		if (state.isOpaque() || SmoothParticles.allowed.contains(state.getBlock())) {
			AtomicInteger counter = new AtomicInteger();

			if (!state.isAir()) {
				VoxelShape voxelShape = state.getOutlineShape(world, pos);
				voxelShape.forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> {
					double d = Math.min(1.0, maxX - minX);
					double e = Math.min(1.0, maxY - minY);
					double f = Math.min(1.0, maxZ - minZ);
					int i = Math.max(2, MathHelper.ceil(d / (0.25)));
					int j = Math.max(2, MathHelper.ceil(e / (0.25)));
					int k = Math.max(2, MathHelper.ceil(f / (0.25)));

					for(int l = 0; l < i; ++l) {
						for(int m = 0; m < j; ++m) {
							for(int n = 0; n < k; ++n) {
								double g = ((double)l + 0.5) / (double)i;
								double h = ((double)m + 0.5) / (double)j;
								double o = ((double)n + 0.5) / (double)k;
								double p = g * d + minX;
								double q = h * e + minY;
								double r = o * f + minZ;
								counter.getAndIncrement();
								if (counter.get() % 7 == 1) {
									MinecraftClient.getInstance().particleManager.addParticle(new BlockDustParticle(MinecraftClient.getInstance().world, (double)pos.getX() + p, (double)pos.getY() + q, (double)pos.getZ() + r, g - 0.5, h - 0.5, o - 0.5, state, pos));
								}
							}
						}
					}

				});
			}
//			world.addBlockBreakParticles(pos, state);
		}
	}
}