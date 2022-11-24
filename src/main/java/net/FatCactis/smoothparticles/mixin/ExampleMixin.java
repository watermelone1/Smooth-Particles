package net.FatCactis.smoothparticles.mixin;

import net.FatCactis.smoothparticles.SmoothParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.math.Vector3d;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
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
		spawnBlockParticles(SmoothParticles.OAK_BARK, OAK_LOG, 15);
		spawnBlockParticles(SmoothParticles.OAK_SPLINTER, OAK_LOG, 15);
		spawnBlockParticles(SmoothParticles.BIRCH_BARK, BIRCH_LOG, 15);
		spawnBlockParticles(SmoothParticles.BIRCH_SPLINTER, BIRCH_LOG, 15);
		spawnBlockParticles(SmoothParticles.SPRUCE_BARK, SPRUCE_LOG, 15);
		spawnBlockParticles(SmoothParticles.SPRUCE_SPLINTER, SPRUCE_LOG, 15);
		spawnBlockParticles(SmoothParticles.JUNGLE_BARK, JUNGLE_LOG, 15);
		spawnBlockParticles(SmoothParticles.JUNGLE_SPLINTER, JUNGLE_LOG, 15);
		spawnBlockParticles(SmoothParticles.ACACIA_BARK, ACACIA_LOG, 15);
		spawnBlockParticles(SmoothParticles.ACACIA_SPLINTER, ACACIA_LOG, 15);
		spawnBlockParticles(SmoothParticles.DARK_OAK_BARK, DARK_OAK_LOG, 15);
		spawnBlockParticles(SmoothParticles.DARK_OAK_SPLINTER, DARK_OAK_LOG, 15);
		spawnBlockParticles(SmoothParticles.MANGROVE_BARK, MANGROVE_LOG, 15);
		spawnBlockParticles(SmoothParticles.MANGROVE_SPLINTER, MANGROVE_LOG, 15);
		spawnBlockParticles(SmoothParticles.MANGROVE_BARK, MANGROVE_ROOTS);
		spawnBlockParticles(SmoothParticles.MANGROVE_BARK, MUDDY_MANGROVE_ROOTS);
		spawnBlockParticles(SmoothParticles.MUD_PIECE, MUDDY_MANGROVE_ROOTS);
		spawnBlockParticles(SmoothParticles.CRIMSON_BARK, CRIMSON_STEM, 15);
		spawnBlockParticles(SmoothParticles.CRIMSON_SPLINTER, CRIMSON_STEM, 15);
		spawnBlockParticles(SmoothParticles.WARPED_BARK, WARPED_STEM, 15);
		spawnBlockParticles(SmoothParticles.WARPED_SPLINTER, WARPED_STEM, 15);
		spawnBlockParticles(SmoothParticles.OAK_SPLINTER, STRIPPED_OAK_LOG);
		spawnBlockParticles(SmoothParticles.BIRCH_SPLINTER, STRIPPED_BIRCH_LOG);
		spawnBlockParticles(SmoothParticles.SPRUCE_SPLINTER, STRIPPED_SPRUCE_LOG);
		spawnBlockParticles(SmoothParticles.JUNGLE_SPLINTER, STRIPPED_JUNGLE_LOG);
		spawnBlockParticles(SmoothParticles.ACACIA_SPLINTER, STRIPPED_ACACIA_LOG);
		spawnBlockParticles(SmoothParticles.DARK_OAK_SPLINTER, STRIPPED_DARK_OAK_LOG);
		spawnBlockParticles(SmoothParticles.MANGROVE_SPLINTER, STRIPPED_MANGROVE_LOG);
		spawnBlockParticles(SmoothParticles.CRIMSON_SPLINTER, STRIPPED_CRIMSON_STEM);
		spawnBlockParticles(SmoothParticles.WARPED_SPLINTER, STRIPPED_WARPED_STEM);
		spawnBlockParticles(SmoothParticles.OAK_SPLINTER, STRIPPED_OAK_WOOD);
		spawnBlockParticles(SmoothParticles.BIRCH_SPLINTER, STRIPPED_BIRCH_WOOD);
		spawnBlockParticles(SmoothParticles.SPRUCE_SPLINTER, STRIPPED_SPRUCE_WOOD);
		spawnBlockParticles(SmoothParticles.JUNGLE_SPLINTER, STRIPPED_JUNGLE_WOOD);
		spawnBlockParticles(SmoothParticles.ACACIA_SPLINTER, STRIPPED_ACACIA_WOOD);
		spawnBlockParticles(SmoothParticles.DARK_OAK_SPLINTER, STRIPPED_DARK_OAK_WOOD);
		spawnBlockParticles(SmoothParticles.MANGROVE_SPLINTER, STRIPPED_MANGROVE_WOOD);
		spawnBlockParticles(SmoothParticles.CRIMSON_SPLINTER, STRIPPED_CRIMSON_HYPHAE);
		spawnBlockParticles(SmoothParticles.WARPED_SPLINTER, STRIPPED_WARPED_HYPHAE);
		spawnBlockParticles(SmoothParticles.OAK_BARK, OAK_WOOD);
		spawnBlockParticles(SmoothParticles.BIRCH_BARK, BIRCH_WOOD);
		spawnBlockParticles(SmoothParticles.SPRUCE_BARK, SPRUCE_WOOD);
		spawnBlockParticles(SmoothParticles.JUNGLE_BARK, JUNGLE_WOOD);
		spawnBlockParticles(SmoothParticles.ACACIA_BARK, ACACIA_WOOD);
		spawnBlockParticles(SmoothParticles.DARK_OAK_BARK, DARK_OAK_WOOD);
		spawnBlockParticles(SmoothParticles.MANGROVE_BARK, MANGROVE_WOOD);
		spawnBlockParticles(SmoothParticles.CRIMSON_BARK, CRIMSON_HYPHAE);
		spawnBlockParticles(SmoothParticles.WARPED_BARK, WARPED_HYPHAE);
		spawnBlockParticles(SmoothParticles.OAK_LEAF, OAK_LEAVES);
		spawnBlockParticles(SmoothParticles.BIRCH_LEAF, BIRCH_LEAVES);
		spawnBlockParticles(SmoothParticles.SPRUCE_LEAF, SPRUCE_LEAVES);
		spawnBlockParticles(SmoothParticles.JUNGLE_LEAF, JUNGLE_LEAVES);
		spawnBlockParticles(SmoothParticles.ACACIA_LEAF, ACACIA_LEAVES);
		spawnBlockParticles(SmoothParticles.DARK_OAK_LEAF, DARK_OAK_LEAVES);
		spawnBlockParticles(SmoothParticles.MANGROVE_LEAF, MANGROVE_LEAVES);
		spawnBlockParticles(SmoothParticles.AZALEA_LEAF, AZALEA_LEAVES);
		spawnBlockParticles(SmoothParticles.AZALEA_LEAF, FLOWERING_AZALEA_LEAVES);
		spawnBlockParticles(SmoothParticles.SPONGE_PIECE, SPONGE);
		spawnBlockParticles(SmoothParticles.SPONGE_PIECE, WET_SPONGE);
		wetSpongeParticle();
		spawnBlockParticles(SmoothParticles.GLASS_SHARD, GLASS);
		spawnBlockParticles(SmoothParticles.GLASS_SHARD, TINTED_GLASS);
		spawnBlockParticles(SmoothParticles.LAPIS_PEBBLE, LAPIS_BLOCK);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, SANDSTONE);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, CHISELED_SANDSTONE);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, CUT_SANDSTONE);
		spawnBlockParticles(SmoothParticles.COBWEB, COBWEB);
		spawnBlockParticles(SmoothParticles.STRING, WHITE_WOOL);
		spawnBlockParticles(SmoothParticles.RED_STRING, RED_WOOL);
		spawnBlockParticles(SmoothParticles.YELLOW_STRING, YELLOW_WOOL);
		spawnBlockParticles(SmoothParticles.ORANGE_STRING, ORANGE_WOOL);
		spawnBlockParticles(SmoothParticles.MAGENTA_STRING, MAGENTA_WOOL);
		spawnBlockParticles(SmoothParticles.LIGHT_BLUE_STRING, LIGHT_BLUE_WOOL);
		spawnBlockParticles(SmoothParticles.LIME_STRING, LIME_WOOL);
		spawnBlockParticles(SmoothParticles.PINK_STRING, PINK_WOOL);
		spawnBlockParticles(SmoothParticles.GRAY_STRING, GRAY_WOOL);
		spawnBlockParticles(SmoothParticles.LIGHT_GRAY_STRING, LIGHT_GRAY_WOOL);
		spawnBlockParticles(SmoothParticles.CYAN_STRING, CYAN_WOOL);
		spawnBlockParticles(SmoothParticles.PURPLE_STRING, PURPLE_WOOL);
		spawnBlockParticles(SmoothParticles.BLUE_STRING, BLUE_WOOL);
		spawnBlockParticles(SmoothParticles.BROWN_STRING, BROWN_WOOL);
		spawnBlockParticles(SmoothParticles.GREEN_STRING, GREEN_WOOL);
		spawnBlockParticles(SmoothParticles.BLACK_STRING, BLACK_WOOL);

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

	private void wetSpongeParticle() {
		if(bs.getBlock() == WET_SPONGE) {
			for(int i = 0; i < 360; i++) {
				if (i % 40 == 0) {
					w.addParticle(ParticleTypes.DRIPPING_WATER, bp.getX(), bp.getY(), bp.getZ(), Math.cos(i) * 0.25d, Math.sin(i) * 0.25d, Math.sin(i) * 0.25d);
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