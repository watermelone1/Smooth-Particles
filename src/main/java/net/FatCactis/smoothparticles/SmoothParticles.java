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

	@Override
	public void onInitialize() {
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "angry"), ANGRY);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "enchanted_hit"), ENCH_HIT);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "flame"), FLAME);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "glint"), EMERALD);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "heart"), HEART);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "lava"), LAVA);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, "nautilus"), CONDUIT);

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

	}
}
