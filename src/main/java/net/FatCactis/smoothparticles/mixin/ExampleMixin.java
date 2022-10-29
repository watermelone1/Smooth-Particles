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

import static net.minecraft.block.Blocks.*;

@Mixin(Block.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "onPlaced")
	protected void spawnParticles(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack, CallbackInfo ci) {
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, STONE, state, world, pos);
		spawnBlockParticles(SmoothParticles.GRANITE_PEBBLE, GRANITE, state, world, pos);
		spawnBlockParticles(SmoothParticles.GRANITE_PEBBLE, POLISHED_GRANITE, state, world, pos);
		spawnBlockParticles(SmoothParticles.DIORITE_PEBBLE, DIORITE, state, world, pos);
		spawnBlockParticles(SmoothParticles.DIORITE_PEBBLE, POLISHED_DIORITE, state, world, pos);
		spawnBlockParticles(SmoothParticles.ANDESITE_PEBBLE, ANDESITE, state, world, pos);
		spawnBlockParticles(SmoothParticles.ANDESITE_PEBBLE, POLISHED_ANDESITE, state, world, pos);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE, state, world, pos);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, COBBLED_DEEPSLATE, state, world, pos);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, POLISHED_DEEPSLATE, state, world, pos);
		spawnBlockParticles(SmoothParticles.CALCITE_PEBBLE, CALCITE, state, world, pos);
		spawnBlockParticles(SmoothParticles.TUFF_PEBBLE, TUFF, state, world, pos);
		spawnBlockParticles(SmoothParticles.DRIPSTONE_PEBBLE, DRIPSTONE_BLOCK, state, world, pos);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, GRASS_BLOCK, 12, state, world, pos);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, GRASS_BLOCK, 6, state, world, pos);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, DIRT, state, world, pos);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, COARSE_DIRT, 9, state, world, pos);
		spawnBlockParticles(SmoothParticles.COARSE_DIRT_PEBBLE, COARSE_DIRT, 9, state, world, pos);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, PODZOL, 9, state, world, pos);
		spawnBlockParticles(SmoothParticles.COARSE_DIRT_PEBBLE, PODZOL, 9, state, world, pos);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, ROOTED_DIRT, state, world, pos);
		spawnBlockParticles(SmoothParticles.MUD_PIECE, MUD, state, world, pos);
		spawnBlockParticles(SmoothParticles.NETHERRACK_PEBBLE, CRIMSON_NYLIUM, 12, state, world, pos);
		spawnBlockParticles(SmoothParticles.CRIMSON_PIECE, CRIMSON_NYLIUM, 6, state, world, pos);


	}

	private void spawnBlockParticles(ParticleEffect particle, Block block, BlockState blockState,  World world, BlockPos pos) {
		if(blockState.getBlock() == block) {
			for(int i = 0; i < 360; i++) {
				if (i % 20 == 0) {
					world.addParticle(particle,
							pos.getX() + Math.random(), pos.getY() + Math.random(), pos.getZ() + Math.random(),
							Math.cos(i) * 0.25d, Math.sin(i) * 0.25d, Math.sin(i) * 0.25d);
				}
			}
		}
	}

	private void spawnBlockParticles(ParticleEffect particle, Block block, int num, BlockState blockState,  World world, BlockPos pos) {
		if(blockState.getBlock() == block) {
			for(int i = 0; i < 360; i++) {
				if (i % 360/num == 0) {
					world.addParticle(particle,
							pos.getX() + Math.random(), pos.getY() + Math.random(), pos.getZ() + Math.random(),
							Math.cos(i) * 0.25d, Math.sin(i) * 0.25d, Math.sin(i) * 0.25d);
				}
			}
		}
	}


}