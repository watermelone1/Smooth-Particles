package net.FatCactis.smoothparticles.mixin;

import net.FatCactis.smoothparticles.GravityBlock;
import net.FatCactis.smoothparticles.RandomMathStuffThatsCompletelyUselessAndIFeelLikeDyingBecauseIDontWantToCodeMoreParticlesAndDoUselessStuffThatWillTakeForeverAndImJustGoingToMakeAnotherClassThatExtendsThisOneJustBecauseIDontWantToTypeThisOutAndThisIsATerribleIdeaButIDontCare.Math2;
import net.FatCactis.smoothparticles.SmoothParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.math.Vector3d;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DefaultParticleType;
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
public class ParticleSpawning {

	Math2<Integer> math2 = new Math2<Integer>();

	BlockState bs;
	BlockPos bp;
	World w;

	@Inject(at = @At("HEAD"), method = "onPlaced")
	protected void spawnParticles(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack, CallbackInfo ci) {




		bs = state;
		bp = pos;
		w = world;
		/*for (double i = 0; i < 10; i += 0.05) {
				spawnBlockParticles(SmoothParticles.SAUL, JIGSAW, 360, new Vector3d(i, i, i));
		}*/

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
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, COBBLESTONE, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, COBBLESTONE, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, COBBLESTONE, 6);
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
		spawnBlockParticles(SmoothParticles.EMERALD, EMERALD_BLOCK);
		spawnBlockParticles(SmoothParticles.EMERALD_PEBBLE, EMERALD_BLOCK);
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
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, CUT_COPPER_SLAB);
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, EXPOSED_CUT_COPPER_SLAB);
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WEATHERED_CUT_COPPER_SLAB);
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_GREEN, OXIDIZED_CUT_COPPER_SLAB);
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
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_ORANGE, WAXED_CUT_COPPER_SLAB);
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN,WAXED_EXPOSED_CUT_COPPER_SLAB);
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, WAXED_WEATHERED_CUT_COPPER_SLAB);
		spawnSlabParticles(SmoothParticles.COPPER_PEBBLE_GREEN, WAXED_OXIDIZED_CUT_COPPER_SLAB);
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
		spawnBlockParticles(SmoothParticles.LAPIS_PEBBLE, LAPIS_BLOCK);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, SANDSTONE);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, CHISELED_SANDSTONE);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, CUT_SANDSTONE);
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
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, MOSS_BLOCK);
		spawnSlabParticles(SmoothParticles.OAK_SPLINTER, OAK_SLAB);
		spawnSlabParticles(SmoothParticles.SPRUCE_SPLINTER, SPRUCE_SLAB);
		spawnSlabParticles(SmoothParticles.BIRCH_SPLINTER, BIRCH_SLAB);
		spawnSlabParticles(SmoothParticles.JUNGLE_SPLINTER, JUNGLE_SLAB);
		spawnSlabParticles(SmoothParticles.ACACIA_SPLINTER, ACACIA_SLAB);
		spawnSlabParticles(SmoothParticles.DARK_OAK_SPLINTER, DARK_OAK_SLAB);
		spawnSlabParticles(SmoothParticles.MANGROVE_SPLINTER, MANGROVE_SLAB);
		spawnSlabParticles(SmoothParticles.CRIMSON_SPLINTER, CRIMSON_SLAB);
		spawnSlabParticles(SmoothParticles.WARPED_SPLINTER, WARPED_SLAB);
		spawnSlabParticles(SmoothParticles.STONE_PEBBLE, STONE_SLAB);
		spawnSlabParticles(SmoothParticles.SMOOTH_STONE_PEBBLE, SMOOTH_STONE_SLAB);
		spawnSlabParticles(SmoothParticles.SAND_PIECE, SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.SAND_PIECE, CUT_SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.OAK_SPLINTER, PETRIFIED_OAK_SLAB);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, COBBLESTONE_SLAB, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, COBBLESTONE_SLAB, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, COBBLESTONE_SLAB, 3);
		spawnSlabParticles(SmoothParticles.BRICK, BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.STONE_PEBBLE, STONE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.MUD_BRICK, MUD_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.NETHER_BRICK, NETHER_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.QUARTZ_PEBBLE, QUARTZ_SLAB);
		spawnSlabParticles(SmoothParticles.RED_SAND_PIECE, RED_SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.RED_SAND_PIECE, CUT_RED_SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.PURPUR_PIECE, PURPUR_SLAB);
		spawnSlabParticles(SmoothParticles.PRISMARINE_PIECE, PRISMARINE_SLAB);
		spawnSlabParticles(SmoothParticles.PRISMARINE_PIECE, PRISMARINE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.GRANITE_PEBBLE, POLISHED_GRANITE_SLAB);
		spawnSlabParticles(SmoothParticles.DARK_PRISMARINE_PIECE, DARK_PRISMARINE_SLAB);
		spawnSlabParticles(SmoothParticles.RED_SAND_PIECE, SMOOTH_RED_SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.STONE_PEBBLE, MOSSY_STONE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.GRASS_PIECE, MOSSY_STONE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.DIORITE_PEBBLE, POLISHED_DIORITE_SLAB);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, MOSSY_COBBLESTONE_SLAB, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, MOSSY_COBBLESTONE_SLAB, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, MOSSY_COBBLESTONE_SLAB, 3);
		spawnSlabParticles(SmoothParticles.GRASS_PIECE, MOSSY_COBBLESTONE_SLAB);
		spawnSlabParticles(SmoothParticles.END_STONE_PIECE, END_STONE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.SAND_PIECE, SMOOTH_SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.QUARTZ_PEBBLE, SMOOTH_QUARTZ_SLAB);
		spawnSlabParticles(SmoothParticles.GRANITE_PEBBLE, GRANITE_SLAB);
		spawnSlabParticles(SmoothParticles.ANDESITE_PEBBLE, ANDESITE_SLAB);
		spawnSlabParticles(SmoothParticles.RED_NETHER_BRICK, RED_NETHER_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.ANDESITE_PEBBLE, POLISHED_ANDESITE_SLAB);
		spawnSlabParticles(SmoothParticles.DIORITE_PEBBLE, DIORITE_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, COBBLED_DEEPSLATE_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, POLISHED_DEEPSLATE_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_TILE_SLAB);
		spawnSlabParticles(SmoothParticles.BLACKSTONE_PEBBLE, BLACKSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_BRICK_SLAB);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, SMOOTH_QUARTZ);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, SMOOTH_RED_SANDSTONE);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, SMOOTH_SANDSTONE_SLAB);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, SMOOTH_SANDSTONE);
		spawnBlockParticles(SmoothParticles.SMOOTH_STONE_PEBBLE, SMOOTH_STONE);
		spawnBlockParticles(SmoothParticles.BRICK, BRICKS);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, MOSSY_COBBLESTONE);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, MOSSY_COBBLESTONE, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, MOSSY_COBBLESTONE, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, MOSSY_COBBLESTONE, 6);
		spawnBlockParticles(SmoothParticles.HONEYCOMB, HONEYCOMB_BLOCK);
		spawnBlockParticles(SmoothParticles.PURPUR_PIECE, PURPUR_BLOCK);
		spawnBlockParticles(SmoothParticles.PURPUR_PIECE, PURPUR_PILLAR);
		spawnBlockParticles(SmoothParticles.PURPUR_PIECE, PURPUR_STAIRS);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, FARMLAND);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, COBBLESTONE_STAIRS, 4);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, COBBLESTONE_STAIRS, 4);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, COBBLESTONE_STAIRS, 4);
		spawnBlockParticles(SmoothParticles.ICE_CUBE, ICE);
		spawnBlockParticles(SmoothParticles.ICE_CUBE, PACKED_ICE);
		spawnBlockParticles(SmoothParticles.ICE_CUBE, BLUE_ICE);
		spawnSnowParticles(SmoothParticles.SNOWBALL, SNOW);
		spawnBlockParticles(SmoothParticles.SNOWBALL, SNOW_BLOCK);
		spawnBlockParticles(SmoothParticles.SLIMEBALL, SLIME_BLOCK);
		spawnBlockParticles(SmoothParticles.CLAY_BALL, CLAY);
		spawnBlockParticles(SmoothParticles.OAK_SPLINTER, BOOKSHELF);
		spawnBlockParticles(SmoothParticles.RED_STRING, BOOKSHELF, 5);
		spawnBlockParticles(SmoothParticles.YELLOW_STRING, BOOKSHELF, 5);
		spawnBlockParticles(SmoothParticles.BLUE_STRING, BOOKSHELF, 5);
		spawnBlockParticles(SmoothParticles.CYAN_STRING, BOOKSHELF, 5);
		spawnBlockParticles(SmoothParticles.JUKEBOX, JUKEBOX);
		spawnBlockParticles(SmoothParticles.OAK_SPLINTER, OAK_FENCE, 8);
		spawnBlockParticles(SmoothParticles.SPRUCE_SPLINTER, SPRUCE_FENCE, 8);
		spawnBlockParticles(SmoothParticles.BIRCH_SPLINTER, BIRCH_FENCE, 8);
		spawnBlockParticles(SmoothParticles.JUNGLE_SPLINTER, JUNGLE_FENCE, 8);
		spawnBlockParticles(SmoothParticles.ACACIA_SPLINTER, ACACIA_FENCE, 8);
		spawnBlockParticles(SmoothParticles.DARK_OAK_SPLINTER, DARK_OAK_FENCE, 8);
		spawnBlockParticles(SmoothParticles.MANGROVE_SPLINTER, MANGROVE_FENCE, 8);
		spawnBlockParticles(SmoothParticles.CRIMSON_SPLINTER, CRIMSON_FENCE, 8);
		spawnBlockParticles(SmoothParticles.WARPED_SPLINTER, WARPED_FENCE, 8);
		spawnBlockParticles(SmoothParticles.NETHERRACK_PEBBLE, NETHERRACK);
		spawnBlockParticles(SmoothParticles.PUMPKIN, CARVED_PUMPKIN);
		spawnBlockParticles(SmoothParticles.PUMPKIN, JACK_O_LANTERN);
		spawnBlockParticles(ParticleTypes.SOUL, SOUL_SOIL, new Vector3d(0.15, 0.15, 0.15));
		spawnBlockParticles(ParticleTypes.SOUL, SOUL_SAND, new Vector3d(0.15, 0.15, 0.15));
		spawnBlockParticles(SmoothParticles.BASALT, BASALT);
		spawnBlockParticles(SmoothParticles.BASALT, POLISHED_BASALT);
		spawnBlockParticles(SmoothParticles.SMOOTH_BASALT, SMOOTH_BASALT);
		spawnBlockParticles(SmoothParticles.DARK_GLOWSTONE, GLOWSTONE, 10);
		spawnBlockParticles(SmoothParticles.BRIGHT_GLOWSTONE, GLOWSTONE, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, INFESTED_STONE, 10);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, INFESTED_COBBLESTONE, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, INFESTED_COBBLESTONE, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, INFESTED_COBBLESTONE, 3);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, INFESTED_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, INFESTED_MOSSY_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, INFESTED_MOSSY_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, INFESTED_CRACKED_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, INFESTED_CHISELED_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, INFESTED_DEEPSLATE, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, MOSSY_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, MOSSY_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, CRACKED_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, CHISELED_STONE_BRICKS, 10);
		spawnBlockParticles(SmoothParticles.PACKED_MUD, PACKED_MUD);
		spawnBlockParticles(SmoothParticles.PACKED_MUD, MUD_BRICKS);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_BRICKS);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, CRACKED_DEEPSLATE_BRICKS);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_TILES);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, CRACKED_DEEPSLATE_TILES);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, CHISELED_DEEPSLATE);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, REINFORCED_DEEPSLATE);
		spawnBlockParticles(SmoothParticles.BROWN_MUSHROOM, BROWN_MUSHROOM_BLOCK);
		spawnBlockParticles(SmoothParticles.RED_MUSHROOM, RED_MUSHROOM_BLOCK);
		spawnBlockParticles(SmoothParticles.MUSHROOM_STEM, MUSHROOM_STEM);
		spawnBlockParticles(SmoothParticles.BRICK, BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, STONE_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.MUD_BRICK, MUD_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.MYCELIUM, MYCELIUM, 10);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, MYCELIUM, 10);
		spawnBlockParticles(SmoothParticles.NETHER_BRICK, NETHER_BRICKS);
		spawnBlockParticles(SmoothParticles.NETHER_BRICK, CRACKED_NETHER_BRICKS);
		spawnBlockParticles(SmoothParticles.NETHER_BRICK, CHISELED_NETHER_BRICKS);
		spawnBlockParticles(SmoothParticles.NETHER_BRICK, NETHER_BRICK_FENCE, 10);
		spawnBlockParticles(SmoothParticles.NETHER_BRICK, NETHER_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.SCULK_BLOCK, SCULK);
		spawnBlockParticles(SmoothParticles.SCULK_BLOCK, SCULK_CATALYST, 10);
		spawnBlockParticles(SmoothParticles.BONE_BLOCK, SCULK_CATALYST, 10);
		spawnBlockParticles(SmoothParticles.SCULK_BLOCK, SCULK_SHRIEKER, 10);
		spawnBlockParticles(SmoothParticles.BONE_BLOCK, SCULK_SHRIEKER, 10);
		spawnBlockParticles(SmoothParticles.END_STONE_PIECE, END_PORTAL_FRAME, 10);
		spawnBlockParticles(SmoothParticles.DARK_PRISMARINE_PIECE, END_PORTAL_FRAME, 10);
		spawnBlockParticles(SmoothParticles.END_STONE_PIECE, END_STONE);
		spawnBlockParticles(SmoothParticles.END_STONE_PIECE, END_STONE_BRICKS);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, SANDSTONE_STAIRS);
		spawnBlockParticles(SmoothParticles.OAK_SPLINTER, OAK_STAIRS);
		spawnBlockParticles(SmoothParticles.SPRUCE_SPLINTER, SPRUCE_STAIRS);
		spawnBlockParticles(SmoothParticles.BIRCH_SPLINTER, BIRCH_STAIRS);
		spawnBlockParticles(SmoothParticles.JUNGLE_SPLINTER, JUNGLE_STAIRS);
		spawnBlockParticles(SmoothParticles.ACACIA_SPLINTER, ACACIA_STAIRS);
		spawnBlockParticles(SmoothParticles.DARK_OAK_SPLINTER, DARK_OAK_STAIRS);
		spawnBlockParticles(SmoothParticles.MANGROVE_SPLINTER, MANGROVE_STAIRS);
		spawnBlockParticles(SmoothParticles.CRIMSON_SPLINTER, CRIMSON_STAIRS);
		spawnBlockParticles(SmoothParticles.WARPED_SPLINTER, WARPED_STAIRS);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, COBBLESTONE_WALL, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, COBBLESTONE_WALL, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, COBBLESTONE_WALL, 6);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, MOSSY_COBBLESTONE_WALL, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, MOSSY_COBBLESTONE_WALL, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, MOSSY_COBBLESTONE_WALL, 3);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, MOSSY_COBBLESTONE_WALL, 10);
		spawnBlockParticles(SmoothParticles.BRICK, BRICK_WALL);
		spawnBlockParticles(SmoothParticles.PRISMARINE_PIECE, PRISMARINE_WALL);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, RED_SANDSTONE_WALL);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, MOSSY_STONE_BRICK_WALL, 10);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, MOSSY_STONE_BRICK_WALL, 10);
		spawnBlockParticles(SmoothParticles.GRANITE_PEBBLE, GRANITE_WALL);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, STONE_BRICK_WALL);
		spawnBlockParticles(SmoothParticles.MUD_BRICK, MUD_BRICK_WALL);
		spawnBlockParticles(SmoothParticles.NETHER_BRICK, NETHER_BRICK_WALL);
		spawnBlockParticles(SmoothParticles.ANDESITE_PEBBLE, ANDESITE_WALL);
		spawnBlockParticles(SmoothParticles.RED_NETHER_BRICK, RED_NETHER_BRICK_WALL);
		spawnBlockParticles(SmoothParticles.SAND_PIECE	, SANDSTONE_WALL);
		spawnBlockParticles(SmoothParticles.END_STONE_PIECE, END_STONE_BRICK_WALL);
		spawnBlockParticles(SmoothParticles.DIORITE_PEBBLE, DIORITE_WALL);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, BLACKSTONE_WALL);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_WALL);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_BRICK_WALL);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, COBBLED_DEEPSLATE_WALL);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, POLISHED_DEEPSLATE_WALL);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_BRICK_WALL);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_TILE_WALL);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, CHISELED_QUARTZ_BLOCK);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, QUARTZ_BLOCK);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, QUARTZ_BRICKS);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, QUARTZ_PILLAR);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, QUARTZ_STAIRS);
		spawnBlockParticles(SmoothParticles.WHITE_TERRACOTTA, WHITE_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.ORANGE_TERRACOTTA, ORANGE_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.MAGENTA_TERRACOTTA, MAGENTA_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.LIGHT_BLUE_TERRACOTTA, LIGHT_BLUE_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.YELLOW_TERRACOTTA, YELLOW_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.LIME_TERRACOTTA, LIME_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.PINK_TERRACOTTA, PINK_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.GRAY_TERRACOTTA, GRAY_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.LIGHT_GRAY_TERRACOTTA, LIGHT_GRAY_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.CYAN_TERRACOTTA, CYAN_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.PURPLE_TERRACOTTA, PURPLE_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.BROWN_TERRACOTTA, BROWN_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.BLUE_TERRACOTTA, BLUE_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.GREEN_TERRACOTTA, GREEN_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.RED_TERRACOTTA, RED_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.BLACK_TERRACOTTA, BLACK_TERRACOTTA);
		spawnBlockParticles(SmoothParticles.HAY_BALE, HAY_BLOCK);
		spawnSnowParticles(SmoothParticles.STRING, WHITE_CARPET);
		spawnSnowParticles(SmoothParticles.ORANGE_STRING, ORANGE_CARPET);
		spawnSnowParticles(SmoothParticles.MAGENTA_STRING, MAGENTA_CARPET);
		spawnSnowParticles(SmoothParticles.LIGHT_BLUE_STRING, LIGHT_BLUE_CARPET);
		spawnSnowParticles(SmoothParticles.YELLOW_STRING, YELLOW_CARPET);
		spawnSnowParticles(SmoothParticles.LIME_STRING, LIME_CARPET);
		spawnSnowParticles(SmoothParticles.PINK_STRING, PINK_CARPET);
		spawnSnowParticles(SmoothParticles.GRAY_STRING, GRAY_CARPET);
		spawnSnowParticles(SmoothParticles.LIGHT_GRAY_STRING, LIGHT_GRAY_CARPET);
		spawnSnowParticles(SmoothParticles.CYAN_STRING, CYAN_CARPET);
		spawnSnowParticles(SmoothParticles.PURPLE_STRING, PURPLE_CARPET);
		spawnSnowParticles(SmoothParticles.BLUE_STRING, BLUE_CARPET);
		spawnSnowParticles(SmoothParticles.BROWN_STRING, BROWN_CARPET);
		spawnSnowParticles(SmoothParticles.GREEN_STRING, GREEN_CARPET);
		spawnSnowParticles(SmoothParticles.RED_STRING, RED_CARPET);
		spawnSnowParticles(SmoothParticles.BLACK_STRING, BLACK_CARPET);
		spawnBlockParticles(SmoothParticles.TERRACOTTA, TERRACOTTA);
		spawnBlockParticles(SmoothParticles.DIRT_PEBBLE, DIRT_PATH);
		spawnBlockParticles(SmoothParticles.PRISMARINE_PIECE, PRISMARINE);
		spawnBlockParticles(SmoothParticles.PRISMARINE_PIECE, PRISMARINE_BRICKS);
		spawnBlockParticles(SmoothParticles.DARK_PRISMARINE_PIECE, DARK_PRISMARINE);
		spawnBlockParticles(SmoothParticles.PRISMARINE_PIECE, PRISMARINE_STAIRS);
		spawnBlockParticles(SmoothParticles.PRISMARINE_PIECE, PRISMARINE_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.DARK_PRISMARINE_PIECE, DARK_PRISMARINE_STAIRS);
		spawnBlockParticles(SmoothParticles.PRISMARINE_PIECE, SEA_LANTERN);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, RED_SANDSTONE);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, CHISELED_RED_SANDSTONE);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, CUT_RED_SANDSTONE);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, RED_SANDSTONE_STAIRS);
		spawnBlockParticles(SmoothParticles.CRIMSON_PIECE, NETHER_WART_BLOCK);
		spawnBlockParticles(SmoothParticles.WARPED_PIECE, WARPED_WART_BLOCK);
		spawnBlockParticles(SmoothParticles.RED_NETHER_BRICK, RED_NETHER_BRICKS);
		spawnBlockParticles(SmoothParticles.BONE_BLOCK, BONE_BLOCK);
		spawnBlockParticles(SmoothParticles.GRANITE_PEBBLE, POLISHED_GRANITE_STAIRS);
		spawnBlockParticles(SmoothParticles.RED_SAND_PIECE, SMOOTH_RED_SANDSTONE_STAIRS);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, MOSSY_STONE_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, MOSSY_STONE_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.DIORITE_PEBBLE, POLISHED_DIORITE_STAIRS);
		spawnBlockParticles(SmoothParticles.GRASS_PIECE, MOSSY_COBBLESTONE_STAIRS);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, MOSSY_COBBLESTONE_STAIRS, 4);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, MOSSY_COBBLESTONE_STAIRS, 4);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, MOSSY_COBBLESTONE_STAIRS, 4);
		spawnBlockParticles(SmoothParticles.END_STONE_PIECE, END_STONE_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.STONE_PEBBLE, STONE_STAIRS);
		spawnBlockParticles(SmoothParticles.SAND_PIECE, SMOOTH_SANDSTONE_STAIRS);
		spawnBlockParticles(SmoothParticles.QUARTZ_PEBBLE, SMOOTH_QUARTZ_STAIRS);
		spawnBlockParticles(SmoothParticles.GRANITE_PEBBLE, GRANITE_STAIRS);
		spawnBlockParticles(SmoothParticles.ANDESITE_PEBBLE, ANDESITE_STAIRS);
		spawnBlockParticles(SmoothParticles.RED_NETHER_BRICK, RED_NETHER_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.ANDESITE_PEBBLE, POLISHED_ANDESITE_STAIRS);
		spawnBlockParticles(SmoothParticles.DIORITE_PEBBLE, DIORITE_STAIRS);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, COBBLED_DEEPSLATE_STAIRS);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, POLISHED_DEEPSLATE_STAIRS);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_TILE_STAIRS);
		spawnSlabParticles(SmoothParticles.GRANITE_PEBBLE, POLISHED_GRANITE_SLAB);
		spawnSlabParticles(SmoothParticles.RED_SAND_PIECE, SMOOTH_RED_SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.GRASS_PIECE, MOSSY_STONE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.STONE_PEBBLE, MOSSY_STONE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.DIORITE_PEBBLE, POLISHED_DIORITE_SLAB);
		spawnSlabParticles(SmoothParticles.GRASS_PIECE, MOSSY_COBBLESTONE_SLAB);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE1, MOSSY_COBBLESTONE_SLAB, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE2, MOSSY_COBBLESTONE_SLAB, 3);
		spawnBlockParticles(SmoothParticles.COBBLESTONE_PIECE3, MOSSY_COBBLESTONE_SLAB, 3);
		spawnSlabParticles(SmoothParticles.END_STONE_PIECE, END_STONE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.SAND_PIECE, SMOOTH_SANDSTONE_SLAB);
		spawnSlabParticles(SmoothParticles.QUARTZ_PEBBLE, SMOOTH_QUARTZ_SLAB);
		spawnSlabParticles(SmoothParticles.GRANITE_PEBBLE, GRANITE_SLAB);
		spawnSlabParticles(SmoothParticles.ANDESITE_PEBBLE, ANDESITE_SLAB);
		spawnSlabParticles(SmoothParticles.RED_NETHER_BRICK, RED_NETHER_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.ANDESITE_PEBBLE, POLISHED_ANDESITE_SLAB);
		spawnSlabParticles(SmoothParticles.DIORITE_PEBBLE, DIORITE_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, COBBLED_DEEPSLATE_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, POLISHED_DEEPSLATE_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_BRICK_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_TILE_SLAB);
		spawnSlabParticles(SmoothParticles.DEEPSLATE_PEBBLE, DEEPSLATE_TILE_SLAB);
		spawnSlabParticles(SmoothParticles.HONEYCOMB, HONEY_BLOCK);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, BLACKSTONE);
		spawnSlabParticles(SmoothParticles.BLACKSTONE_PEBBLE, BLACKSTONE_SLAB);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, BLACKSTONE_STAIRS);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, GILDED_BLACKSTONE);
		spawnBlockParticles(SmoothParticles.GOLD_PEBBLE, GILDED_BLACKSTONE, 5);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE);
		spawnSlabParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_SLAB);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_STAIRS);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, CHISELED_POLISHED_BLACKSTONE);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_BRICKS);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_BRICK_SLAB);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, POLISHED_BLACKSTONE_BRICK_STAIRS);
		spawnBlockParticles(SmoothParticles.BLACKSTONE_PEBBLE, CRACKED_POLISHED_BLACKSTONE_BRICKS);
		spawnNoteBlockParticles();
		spawnBlockParticles(SmoothParticles.DRIED_KELP, DRIED_KELP_BLOCK);
		spawnBlockParticles(SmoothParticles.SHROOMLIGHT, SHROOMLIGHT);
		spawnBlockParticles(SmoothParticles.FROGLIGHT_MIDDLE, OCHRE_FROGLIGHT);
		spawnBlockParticles(SmoothParticles.OCHRE_FROGLIGHT, OCHRE_FROGLIGHT);
		spawnBlockParticles(SmoothParticles.FROGLIGHT_MIDDLE, VERDANT_FROGLIGHT);
		spawnBlockParticles(SmoothParticles.VERDANT_FROGLIGHT, VERDANT_FROGLIGHT);
		spawnBlockParticles(SmoothParticles.FROGLIGHT_MIDDLE, PEARLESCENT_FROGLIGHT);
		spawnBlockParticles(SmoothParticles.PEARLESCENT_FROGLIGHT, PEARLESCENT_FROGLIGHT);
	}


	private void spawnNoteBlockParticles() {
		double rng = (double) math2.getRandomList(1, 2, 3, 4, 5);
		if(bs.getBlock() == NOTE_BLOCK) {
			for(int i = 0; i < 360; i++) {
				if (i % 40 == 0) {
					DefaultParticleType particle = SmoothParticles.WHOLE_NOTE;
					if (rng == 1) {
						particle = SmoothParticles.WHOLE_NOTE;
					}
					if (rng == 2) {
						particle = SmoothParticles.HALF_NOTE;
					}
					if (rng == 3) {
						particle = SmoothParticles.QUARTER_NOTE;
					}
					if (rng == 4) {
						particle = SmoothParticles.EIGHTH_NOTE;
					}
					if (rng == 5) {
						particle = SmoothParticles.BEAMED_EIGHTH_NOTE;
					}
					w.addParticle(particle,
							bp.getX() + Math.random(), bp.getY() + Math.random(), bp.getZ() + Math.random(),
							Math.cos(i) * 0.25d, Math.sin(i) * 0.25d, Math.sin(i) * 0.25d);
					rng = (double) math2.getRandomList(1, 2, 3, 4, 5);
				}
			}
		}
	}

	private void spawnSlabParticles(ParticleEffect particleEffect, Block block) {
		if(bs.getBlock() == block) {
			if (Block.hasTopRim(w, bp)) {
				for(int i = 0; i < 360; i++) {
					if (i % 30 == 0) {
						w.addParticle(particleEffect,
								bp.getX() + Math.random(), bp.getY()  + 0.75, bp.getZ() + Math.random(),
								Math.cos(i) * 0.18d, Math.sin(i) * 0.18d, Math.sin(i) * 0.18d);
					}
				}
			}
		}
		if(bs.getBlock() == block) {
			if (!Block.hasTopRim(w, bp)) {
				for(int i = 0; i < 360; i++) {
					if (i % 30 == 0) {
						w.addParticle(particleEffect,
								bp.getX() + Math.random(), bp.getY()  + 0.25, bp.getZ() + Math.random(),
								Math.cos(i) * 0.18d, Math.sin(i) * 0.18d, Math.sin(i) * 0.18d);
					}
				}
			}
		}

	}

	private void spawnSnowParticles(ParticleEffect particleEffect, Block block) {
		if(bs.getBlock() == block) {
			if (!Block.hasTopRim(w, bp)) {
				for(int i = 0; i < 360; i++) {
					if (i % 30 == 0) {
						w.addParticle(particleEffect,
								bp.getX() + Math.random(), bp.getY()  + 0.0125, bp.getZ() + Math.random(),
								Math.cos(i) * 0.18d, Math.sin(i) * 0.3d, Math.sin(i) * 0.18d);
					}
				}
			}
		}

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

	private void spawnBlockParticles(ParticleEffect particle, Block block, float scale) {
		if (bs.getBlock() == block) {
			GravityBlock gb = ((GravityBlock) particle);
			gb.setScale(scale);
			particle = ((ParticleEffect) gb);
		}
		spawnBlockParticles(particle, block);
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

	private void spawnBlockParticles(ParticleEffect particle, Block block, int num, float scale) {
		if (bs.getBlock() == block) {
			GravityBlock gb = ((GravityBlock) particle);
			gb.setScale(scale);
			particle = ((ParticleEffect) gb);
		}


		spawnBlockParticles(particle, block, num);
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
	private void spawnBlockParticles(ParticleEffect particle, Block block, int num, Vector3d vector3d, float scale) {
		GravityBlock gb = (GravityBlock) particle;
		gb.setScale(0.5F);
		if(bs.getBlock() == block) {
			for(int i = 0; i < 360; i++) {
				if (i % 360/num == 0) {
					w.addParticle((ParticleEffect) gb,
							bp.getX() + Math.random(), bp.getY() + Math.random(), bp.getZ() + Math.random(),
							(Math.random() - 0.5) * 0.25d * vector3d.x, (Math.random() - 0.5) * 0.25d * vector3d.y, (Math.random() - 0.5) * 0.25d * vector3d.z);
				}
			}
		}
	}


}