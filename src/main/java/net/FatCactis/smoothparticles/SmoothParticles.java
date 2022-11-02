package net.FatCactis.smoothparticles;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.Particle;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
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

	}
}
