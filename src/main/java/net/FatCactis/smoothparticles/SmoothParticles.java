package net.FatCactis.smoothparticles;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SmoothParticles implements ModInitializer {
	public static final String MOD_ID = "smoothparticles";

	public static final DefaultParticleType SAUL = FabricParticleTypes.simple();

	public static final DefaultParticleType GREEN_FLAME = FabricParticleTypes.simple();
	public static final DefaultParticleType ANGRY = FabricParticleTypes.simple();
	public static final DefaultParticleType ENCH_HIT = FabricParticleTypes.simple();
	public static final DefaultParticleType FLAME = FabricParticleTypes.simple();
	public static final DefaultParticleType EMERALD = FabricParticleTypes.simple();
	public static final DefaultParticleType HEART = FabricParticleTypes.simple();
	public static final DefaultParticleType LAVA = FabricParticleTypes.simple();
	public static final DefaultParticleType CONDUIT = FabricParticleTypes.simple();
	public static final DefaultParticleType STONE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType DIORITE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType ANDESITE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType GRANITE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType DEEPSLATE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType CALCITE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType TUFF_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType DRIPSTONE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType DIRT_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType GRASS_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType COARSE_DIRT_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType MUD_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType NETHERRACK_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType CRIMSON_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType WARPED_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType COBBLESTONE_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType OAK_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType SPRUCE_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType BIRCH_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType JUNGLE_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType ACACIA_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType DARK_OAK_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType MANGROVE_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType CRIMSON_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType WARPED_SPLINTER = FabricParticleTypes.simple();
	public static final DefaultParticleType BEDROCK_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType SAND_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType RED_SAND_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType GRAVEL_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType COAL_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType RAW_IRON_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType COPPER_PEBBLE_ORANGE = FabricParticleTypes.simple();
	public static final DefaultParticleType COPPER_PEBBLE_ORANGE_GREEN = FabricParticleTypes.simple();
	public static final DefaultParticleType COPPER_PEBBLE_GREEN = FabricParticleTypes.simple();
	public static final DefaultParticleType GOLD_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType REDSTONE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType EMERALD_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType LAPIS_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType DIAMOND_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType QUARTZ_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType DEBRIS_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType AMETHYST_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType IRON_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType NETHERITE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType OAK_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType BIRCH_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType SPRUCE_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType JUNGLE_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType ACACIA_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType DARK_OAK_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType MANGROVE_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType CRIMSON_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType WARPED_BARK = FabricParticleTypes.simple();
	public static final DefaultParticleType OAK_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType BIRCH_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType SPRUCE_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType JUNGLE_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType ACACIA_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType DARK_OAK_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType MANGROVE_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType AZALEA_LEAF = FabricParticleTypes.simple();
	public static final DefaultParticleType SPONGE_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType GLASS_SHARD = FabricParticleTypes.simple();
	public static final DefaultParticleType SANDSTONE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType COBWEB = FabricParticleTypes.simple();
	public static final DefaultParticleType STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType RED_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType YELLOW_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType ORANGE_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType MAGENTA_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType LIGHT_BLUE_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType LIME_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType PINK_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType GRAY_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType LIGHT_GRAY_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType CYAN_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType PURPLE_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType BLUE_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType BROWN_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType GREEN_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType BLACK_STRING = FabricParticleTypes.simple();
	public static final DefaultParticleType SMOOTH_STONE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType BRICK = FabricParticleTypes.simple();
	public static final DefaultParticleType MUD_BRICK = FabricParticleTypes.simple();
	public static final DefaultParticleType NETHER_BRICK = FabricParticleTypes.simple();
	public static final DefaultParticleType PURPUR_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType PRISMARINE_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType DARK_PRISMARINE_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType END_STONE_PIECE = FabricParticleTypes.simple();
	public static final DefaultParticleType RED_NETHER_BRICK = FabricParticleTypes.simple();
	public static final DefaultParticleType BLACKSTONE_PEBBLE = FabricParticleTypes.simple();
	public static final DefaultParticleType HONEYCOMB = FabricParticleTypes.simple();
	public static final DefaultParticleType ICE_CUBE = FabricParticleTypes.simple();
	public static final DefaultParticleType SNOWBALL = FabricParticleTypes.simple();
	public static final DefaultParticleType SLIMEBALL = FabricParticleTypes.simple();
	public static final DefaultParticleType CLAY_BALL = FabricParticleTypes.simple();
	public static final DefaultParticleType JUKEBOX = FabricParticleTypes.simple();
	public static final DefaultParticleType PUMPKIN = FabricParticleTypes.simple();
	public static final DefaultParticleType BASALT = FabricParticleTypes.simple();
	public static final DefaultParticleType SMOOTH_BASALT = FabricParticleTypes.simple();
	public static final DefaultParticleType BRIGHT_GLOWSTONE = FabricParticleTypes.simple();
	public static final DefaultParticleType DARK_GLOWSTONE = FabricParticleTypes.simple();
	public static final DefaultParticleType PACKED_MUD = FabricParticleTypes.simple();
	public static final DefaultParticleType BROWN_MUSHROOM = FabricParticleTypes.simple();
	public static final DefaultParticleType RED_MUSHROOM = FabricParticleTypes.simple();
	public static final DefaultParticleType MUSHROOM_STEM = FabricParticleTypes.simple();
	public static final DefaultParticleType MYCELIUM = FabricParticleTypes.simple();
	public static final DefaultParticleType SCULK_BLOCK = FabricParticleTypes.simple();
	public static final DefaultParticleType BONE_BLOCK = FabricParticleTypes.simple();
	public static final DefaultParticleType WHITE_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType ORANGE_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType MAGENTA_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType LIGHT_BLUE_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType YELLOW_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType LIME_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType PINK_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType GRAY_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType LIGHT_GRAY_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType CYAN_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType PURPLE_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType BROWN_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType BLUE_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType GREEN_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType RED_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType BLACK_TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType HAY_BALE = FabricParticleTypes.simple();
	public static final DefaultParticleType TERRACOTTA = FabricParticleTypes.simple();
	public static final DefaultParticleType EIGHTH_NOTE = FabricParticleTypes.simple();
	public static final DefaultParticleType BEAMED_EIGHTH_NOTE = FabricParticleTypes.simple();
	public static final DefaultParticleType WHOLE_NOTE = FabricParticleTypes.simple();
	public static final DefaultParticleType HALF_NOTE = FabricParticleTypes.simple();
	public static final DefaultParticleType QUARTER_NOTE = FabricParticleTypes.simple();
	public static final DefaultParticleType DRIED_KELP = FabricParticleTypes.simple();
	public static final DefaultParticleType SHROOMLIGHT = FabricParticleTypes.simple();
	public static final DefaultParticleType FROGLIGHT_MIDDLE = FabricParticleTypes.simple();
	public static final DefaultParticleType OCHRE_FROGLIGHT = FabricParticleTypes.simple();
	public static final DefaultParticleType VERDANT_FROGLIGHT = FabricParticleTypes.simple();
	public static final DefaultParticleType PEARLESCENT_FROGLIGHT = FabricParticleTypes.simple();

	public static void scrollpointdontworry() {}

	@Override
	public void onInitialize() {
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "angry"), ANGRY);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "enchanted_hit"), ENCH_HIT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "flame"), FLAME);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "glint"), EMERALD);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "heart"), HEART);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "lava"), LAVA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "nautilus"), CONDUIT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "saul"), SAUL);

		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "green_flame"), GREEN_FLAME);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "stone_pebble"), STONE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "diorite_pebble"), DIORITE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "granite_pebble"), GRANITE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "andesite_pebble"), ANDESITE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "deepslate_pebble"), DEEPSLATE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "calcite_pebble"), CALCITE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "tuff_pebble"), TUFF_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dripstone_pebble"), DRIPSTONE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dirt_pebble"), DIRT_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "grass_piece"), GRASS_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "coarse_dirt_pebble"), COARSE_DIRT_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "mud_piece"), MUD_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "netherrack_pebble"), NETHERRACK_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "crimson_piece"), CRIMSON_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "warped_piece"), WARPED_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "cobblestone_pebble"), COBBLESTONE_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "oak_splinter"), OAK_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "birch_splinter"),BIRCH_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "spruce_splinter"), SPRUCE_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "jungle_splinter"), JUNGLE_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "acacia_splinter"), ACACIA_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dark_oak_splinter"), DARK_OAK_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "mangrove_splinter"), MANGROVE_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "crimson_splinter"), CRIMSON_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "warped_splinter"), WARPED_SPLINTER);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "bedrock_pebble"), BEDROCK_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "sand_piece"), SAND_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "red_sand_piece"), RED_SAND_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "gravel_piece"), GRAVEL_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "coal_pebble"), COAL_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "raw_iron_pebble"), RAW_IRON_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "copper_pebble_orange"), COPPER_PEBBLE_ORANGE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "copper_pebble_orange_green"), COPPER_PEBBLE_ORANGE_GREEN);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "copper_pebble_green"), COPPER_PEBBLE_GREEN);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "gold_pebble"), GOLD_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "redstone_pebble"), REDSTONE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "emerald_pebble"), EMERALD_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "lapis_pebble"), LAPIS_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "diamond_pebble"), DIAMOND_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "quartz_pebble"), QUARTZ_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "debris_pebble"), DEBRIS_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "amethyst_pebble"), AMETHYST_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "iron_pebble"), IRON_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "netherite_pebble"), NETHERITE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "oak_bark"), OAK_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "birch_bark"), BIRCH_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "spruce_bark"), SPRUCE_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "jungle_bark"), JUNGLE_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "acacia_bark"), ACACIA_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dark_oak_bark"), DARK_OAK_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "mangrove_bark"), MANGROVE_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "crimson_bark"), CRIMSON_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "warped_bark"), WARPED_BARK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "oak_leaf"), OAK_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "birch_leaf"), BIRCH_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "spruce_leaf"), SPRUCE_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "jungle_leaf"), JUNGLE_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "acacia_leaf"), ACACIA_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dark_oak_leaf"), DARK_OAK_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "mangrove_leaf"), MANGROVE_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "azalea_leaf"), AZALEA_LEAF);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "sponge_piece"), SPONGE_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "glass_shard"), GLASS_SHARD);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "sandstone_pebble"), SANDSTONE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "cobweb"), COBWEB);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "string"), STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "red_string"), RED_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "yellow_string"), YELLOW_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "orange_string"), ORANGE_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "magenta_string"), MAGENTA_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "light_blue_string"), LIGHT_BLUE_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "lime_string"), LIME_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "pink_string"), PINK_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "gray_string"), GRAY_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "light_gray_string"), LIGHT_GRAY_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "cyan_string"), CYAN_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "purple_string"), PURPLE_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "blue_string"), BLUE_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "brown_string"), BROWN_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "green_string"), GREEN_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "black_string"), BLACK_STRING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "smooth_stone_pebble"), SMOOTH_STONE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "brick"), BRICK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "mud_brick"), MUD_BRICK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "nether_brick"), NETHER_BRICK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "purpur_piece"), PURPUR_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "prismarine_piece"), PRISMARINE_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dark_prismarine_piece"), DARK_PRISMARINE_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "end_stone_piece"), END_STONE_PIECE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "red_nether_brick"), RED_NETHER_BRICK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "blackstone_pebble"), BLACKSTONE_PEBBLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "honeycomb"), HONEYCOMB);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "ice_cube"), ICE_CUBE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "snowball"), SNOWBALL);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "slimeball"), SLIMEBALL);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "clay_ball"), CLAY_BALL);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "jukebox"), JUKEBOX);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "pumpkin"), PUMPKIN);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "basalt"), BASALT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "smooth_basalt"), SMOOTH_BASALT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "bright_glowstone"), BRIGHT_GLOWSTONE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dark_glowstone"), DARK_GLOWSTONE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "packed_mud"), PACKED_MUD);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "brown_mushroom"), BROWN_MUSHROOM);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "red_mushroom"), RED_MUSHROOM);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "mushroom_stem"), MUSHROOM_STEM);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "mycelium"), MYCELIUM);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "sculk_block"), SCULK_BLOCK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "bone_block"), BONE_BLOCK);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "white_terracotta"), WHITE_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "orange_terracotta"), ORANGE_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "magenta_terracotta"), MAGENTA_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "light_blue_terracotta"), LIGHT_BLUE_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "yellow_terracotta"), YELLOW_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "lime_terracotta"), LIME_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "pink_terracotta"), PINK_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "gray_terracotta"), GRAY_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "light_gray_terracotta"), LIGHT_GRAY_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "cyan_terracotta"), CYAN_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "purple_terracotta"), PURPLE_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "brown_terracotta"), BROWN_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "blue_terracotta"), BLUE_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "green_terracotta"), GREEN_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "red_terracotta"), RED_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "black_terracotta"), BLACK_TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "hay_bale"), HAY_BALE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "terracotta"), TERRACOTTA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "eighth_note"), EIGHTH_NOTE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "beamed_eighth_note"), BEAMED_EIGHTH_NOTE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "whole_note"), WHOLE_NOTE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "half_note"), HALF_NOTE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "quarter_note"), QUARTER_NOTE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "dried_kelp"), DRIED_KELP);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "shroomlight"), SHROOMLIGHT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "froglight_middle"), FROGLIGHT_MIDDLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "ochre_froglight"), OCHRE_FROGLIGHT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "verdant_froglight"), VERDANT_FROGLIGHT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "pearlescent_froglight"), PEARLESCENT_FROGLIGHT);

		scrollpointdontworry();
	}
}
