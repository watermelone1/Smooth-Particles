package net.FatCactis.smoothparticles.mixin;

import net.FatCactis.smoothparticles.SmoothParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.particle.SoulParticle;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "onPlaced")
	protected void spawnParticles(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack, CallbackInfo ci) {
		world.addParticle(SmoothParticles.GREEN_FLAME,
				pos.getX() + .5, pos.getY() + 1.5, pos.getZ() + .5, 0, 0, 0);

	}

}

/*

	public void addEmitter(Entity entity, ParticleEffect parameters) {
        this.newEmitterParticles.add(new EmitterParticle(this.world, entity, parameters));
    }

 */