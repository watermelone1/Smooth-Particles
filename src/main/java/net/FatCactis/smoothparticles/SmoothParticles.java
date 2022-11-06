package net.FatCactis.smoothparticles;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmoothParticles implements ModInitializer {
	public static final String MOD_ID = "smoothparticles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

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

	}
}
