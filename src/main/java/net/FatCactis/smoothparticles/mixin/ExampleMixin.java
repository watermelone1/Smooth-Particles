package net.FatCactis.smoothparticles.mixin;

import net.FatCactis.smoothparticles.SmoothParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.math.Vector3d;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.block.Blocks.*;

@Mixin(Block.class)
public class ExampleMixin {

	BlockState bs;
	BlockPos bp;
	World w;

	@Inject(at = @At("HEAD"), method = "onPlaced")
	protected void spawnParticles(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack, CallbackInfo ci) {
		bs = state;
		bp = pos;
		w = world;

		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);
		spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360);

		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, STONE);
		spawnBlockParticles(SmoothParticles.GRANITE_PEBBLE, GRANITE);
		spawnBlockParticles(SmoothParticles.GRANITE_PEBBLE, POLISHED_GRANITE);
		spawnBlockParticles(SmoothParticles.DIORITE_PEBBLE, DIORITE);
		spawnBlockParticles(SmoothParticles.DIORITE_PEBBLE, POLISHED_DIORITE);
		spawnBlockParticles(SmoothParticles.ANDESITE_PEBBLE, ANDESITE);
		spawnBlockParticles(SmoothParticles.ANDESITE_PEBBLE, POLISHED_ANDESITE);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, COBBLED_DEEPSLATE);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, POLISHED_DEEPSLATE);
		spawnBlockParticles(SmoothParticles.CALCITE_PEBBLE, CALCITE);
		spawnBlockParticles(SmoothParticles.TUFF_PEBBLE, TUFF);
		spawnBlockParticles(SmoothParticles.DRIPSTONE_PEBBLE, DRIPSTONE_BLOCK);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, GRASS_BLOCK, 12);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, GRASS_BLOCK, 6);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, DIRT);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, COARSE_DIRT, 9);
		spawnBlockParticles(SmoothParticles.COARSE_DIRT_PEBBLE, COARSE_DIRT, 9);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, PODZOL, 9);
		spawnBlockParticles(SmoothParticles.COARSE_DIRT_PEBBLE, PODZOL, 9);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, ROOTED_DIRT);
		spawnBlockParticles(SmoothParticles.MUD_PIECE, MUD);
		spawnBlockParticles(SmoothParticles.NETHERRACK_PEBBLE, CRIMSON_NYLIUM, 12);
		spawnBlockParticles(SmoothParticles.CRIMSON_PIECE, CRIMSON_NYLIUM, 6);
		spawnBlockParticles(SmoothParticles.NETHERRACK_PEBBLE, WARPED_NYLIUM, 6);
		spawnBlockParticles(SmoothParticles.WARPED_PIECE, WARPED_NYLIUM, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE, COBBLESTONE);
		spawnBlockParticles(SmoothParticles.OAK_SPLINTER, OAK_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.SPRUCE_SPLINTER, SPRUCE_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.BIRCH_SPLINTER, BIRCH_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.JUNGLE_SPLINTER, JUNGLE_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.ACACIA_SPLINTER, ACACIA_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.DARK_OAK_SPLINTER, DARK_OAK_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.MANGROVE_SPLINTER, MANGROVE_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.CRIMSON_SPLINTER, CRIMSON_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));
		spawnBlockParticles(SmoothParticles.WARPED_SPLINTER, WARPED_PLANKS, 30, new Vector3d(0.65, 0.65, 0.65));

	}

	private void spawnBlockParticles(ParticleEffect particle, Block block) {
		if(bs.getBlock() == block) {
			for(int i = 0; i < 360; i++) {
				if (i % 20 == 0) {
					w.addParticle(particle,
							bp.getX() + Math.random(), bp.getY() + Math.random(), bp.getZ() + Math.random(),
							Math.cos(i) * 0.25d, Math.sin(i) * 0.25d, Math.sin(i) * 0.25d);
				}
			}
		}
	}

	private void spawnBlockParticles(ParticleEffect particle, Block block, int num) {
		if(bs.getBlock() == block) {
			for(int i = 0; i < 360; i++) {
				if (i % 360/num == 0) {
					w.addParticle(particle,
							bp.getX() + Math.random(), bp.getY() + Math.random(), bp.getZ() + Math.random(),
							(Math.random() - 0.5) * 0.25d, (Math.random() - 0.5) * 0.25d, (Math.random() - 0.5) * 0.25d);
				}
			}
		}
	}

	private void spawnBlockParticles(ParticleEffect particle, Block block, Vector3d vector3d) {
		if(bs.getBlock() == block) {
			for(int i = 0; i < 360; i++) {
				if (i % 20 == 0) {
					w.addParticle(particle,
							bp.getX() + Math.random(), bp.getY() + Math.random(), bp.getZ() + Math.random(),
							(Math.random() - 0.5) * 0.25d * vector3d.x, (Math.random() - 0.5) * 0.25d * vector3d.y, (Math.random() - 0.5) * 0.25d * vector3d.z);
				}
			}
		}
	}

	private void spawnBlockParticles(ParticleEffect particle, Block block, int num, Vector3d vector3d) {
		if(bs.getBlock() == block) {
			for(int i = 0; i < 360; i++) {
				if (i % 360/num == 0) {
					w.addParticle(particle,
							bp.getX() + Math.random(), bp.getY() + Math.random(), bp.getZ() + Math.random(),
							(Math.random() - 0.5) * 0.25d * vector3d.x, (Math.random() - 0.5) * 0.25d * vector3d.y, (Math.random() - 0.5) * 0.25d * vector3d.z);
				}
			}
		}
	}


}