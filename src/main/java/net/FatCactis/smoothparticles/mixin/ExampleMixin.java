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
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, BEDROCK);
		spawnBlockParticles(SmoothParticles.COAL_PEBBLE, BEDROCK);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, SAND);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, RED_SAND);
		spawnBlockParticles(SmoothParticles.GRAVEL_PIECE, GRAVEL);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, COAL_ORE, 10);
		spawnBlockParticles(SmoothParticles.COAL_PEBBLE, COAL_ORE, 20);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_COAL_ORE, 10);
		spawnBlockParticles(SmoothParticles.COAL_PEBBLE, DEEPSLATE_COAL_ORE, 20);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, IRON_ORE, 20);
		spawnBlockParticles(SmoothParticles.RAW_IRON_PEBBLE, IRON_ORE, 20);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_IRON_ORE, 20);
		spawnBlockParticles(SmoothParticles.RAW_IRON_PEBBLE, DEEPSLATE_IRON_ORE, 20);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, COPPER_ORE, 10);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, COPPER_ORE, 3);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, COPPER_ORE, 3);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, COPPER_ORE, 3);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_COPPER_ORE, 10);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, DEEPSLATE_COPPER_ORE, 3);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, DEEPSLATE_COPPER_ORE, 3);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, DEEPSLATE_COPPER_ORE, 3);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, GOLD_ORE, 10);
		spawnBlockParticles(SmoothParticles.GOLD_PEBBLE, GOLD_ORE, 10);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_GOLD_ORE, 10);
		spawnBlockParticles(SmoothParticles.GOLD_PEBBLE, DEEPSLATE_GOLD_ORE, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, REDSTONE_ORE, 10);
		spawnBlockParticles(SmoothParticles.REDSTONE_PEBBLE, REDSTONE_ORE, 10);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_REDSTONE_ORE, 10);
		spawnBlockParticles(SmoothParticles.REDSTONE_PEBBLE, DEEPSLATE_REDSTONE_ORE, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, EMERALD_ORE, 10);
		spawnBlockParticles(SmoothParticles.EMERALD_PEBBLE, EMERALD_ORE, 10);
		spawnBlockParticles(SmoothParticles.EMERALD, EMERALD_ORE, 10);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_EMERALD_ORE, 10);
		spawnBlockParticles(SmoothParticles.EMERALD_PEBBLE, DEEPSLATE_EMERALD_ORE, 10);
		spawnBlockParticles(SmoothParticles.EMERALD, DEEPSLATE_EMERALD_ORE, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, LAPIS_ORE, 10);
		spawnBlockParticles(SmoothParticles.LAPIS_PEBBLE, LAPIS_ORE, 10);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_LAPIS_ORE, 10);
		spawnBlockParticles(SmoothParticles.LAPIS_PEBBLE, DEEPSLATE_LAPIS_ORE, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, DIAMOND_ORE, 10);
		spawnBlockParticles(SmoothParticles.DIAMOND_PEBBLE, DIAMOND_ORE, 10);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_DIAMOND_ORE, 10);
		spawnBlockParticles(SmoothParticles.DIAMOND_PEBBLE, DEEPSLATE_DIAMOND_ORE, 10);
		spawnBlockParticles(SmoothParticles.NETHERRACK_PEBBLE, NETHER_GOLD_ORE, 10);
		spawnBlockParticles(SmoothParticles.GOLD_PEBBLE, NETHER_GOLD_ORE, 10);
		spawnBlockParticles(SmoothParticles.NETHERRACK_PEBBLE, NETHER_QUARTZ_ORE, 10);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, NETHER_QUARTZ_ORE, 10);
		spawnBlockParticles(SmoothParticles.DEBRIS_PEBBLE, ANCIENT_DEBRIS);
		spawnBlockParticles(SmoothParticles.COAL_PEBBLE, COAL_BLOCK);
		spawnBlockParticles(SmoothParticles.RAW_IRON_PEBBLE, RAW_IRON_BLOCK);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, RAW_COPPER_BLOCK, 12);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, RAW_COPPER_BLOCK, 4);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, RAW_COPPER_BLOCK, 4);
		spawnBlockParticles(SmoothParticles.GOLD_PEBBLE, RAW_GOLD_BLOCK);
		spawnBlockParticles(SmoothParticles.AMETHYST_PEBBLE, AMETHYST_BLOCK);
		spawnBlockParticles(SmoothParticles.AMETHYST_PEBBLE, BUDDING_AMETHYST);
		spawnBlockParticles(SmoothParticles.IRON_PEBBLE, IRON_BLOCK);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, COPPER_BLOCK);
		spawnBlockParticles(SmoothParticles.GOLD_PEBBLE, GOLD_BLOCK);
		spawnBlockParticles(SmoothParticles.DIAMOND_PEBBLE, DIAMOND_BLOCK);
		spawnBlockParticles(SmoothParticles.NETHERITE_PEBBLE, NETHERITE_BLOCK, 5);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, EXPOSED_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WEATHERED_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, OXIDIZED_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, EXPOSED_CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WEATHERED_CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, OXIDIZED_CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, EXPOSED_CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WEATHERED_CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, OXIDIZED_CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, CUT_COPPER_SLAB);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, EXPOSED_CUT_COPPER_SLAB);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WEATHERED_CUT_COPPER_SLAB);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, OXIDIZED_CUT_COPPER_SLAB);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, WAXED_COPPER_BLOCK);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_EXPOSED_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_WEATHERED_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, WAXED_OXIDIZED_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, WAXED_CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_EXPOSED_CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_WEATHERED_CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, WAXED_OXIDIZED_CUT_COPPER);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, WAXED_CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_EXPOSED_CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_WEATHERED_CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, WAXED_OXIDIZED_CUT_COPPER_STAIRS);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, WAXED_CUT_COPPER_SLAB);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN,WAXED_EXPOSED_CUT_COPPER_SLAB);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_WEATHERED_CUT_COPPER_SLAB);
		spawnBlockParticles(SmoothParticles.COPPER_PEBBLE_GREEN, WAXED_OXIDIZED_CUT_COPPER_SLAB);

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