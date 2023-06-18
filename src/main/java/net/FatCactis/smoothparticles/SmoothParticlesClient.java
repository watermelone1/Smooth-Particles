package net.FatCactis.smoothparticles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class SmoothParticlesClient implements ClientModInitializer  {

    @Override
    public void onInitializeClient() {

        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GREEN_FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SAUL, FlameParticle.Factory::new);

        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ANGRY, EmotionParticle.AngryVillagerFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CONDUIT, EnchantGlyphParticle.NautilusFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ENCH_HIT, DamageParticle.EnchantedHitFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.EMERALD, SuspendParticle.HappyVillagerFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.HEART, EmotionParticle.HeartFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LAVA, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.STONE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GRANITE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DIORITE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ANDESITE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DEEPSLATE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CALCITE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.TUFF_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DRIPSTONE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DIRT_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GRASS_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COARSE_DIRT_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MUD_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.NETHERRACK_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CRIMSON_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.WARPED_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COBBLESTONE_PIECE1, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COBBLESTONE_PIECE2, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COBBLESTONE_PIECE3, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.OAK_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SPRUCE_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BIRCH_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.JUNGLE_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ACACIA_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DARK_OAK_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MANGROVE_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CRIMSON_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.WARPED_SPLINTER, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BEDROCK_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SAND_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.RED_SAND_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GRAVEL_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COAL_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.RAW_IRON_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COPPER_PEBBLE_ORANGE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COPPER_PEBBLE_ORANGE_GREEN, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COPPER_PEBBLE_GREEN, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GOLD_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.REDSTONE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.EMERALD_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LAPIS_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DIAMOND_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.QUARTZ_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DEBRIS_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.AMETHYST_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.IRON_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.NETHERITE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.OAK_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BIRCH_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SPRUCE_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.JUNGLE_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ACACIA_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DARK_OAK_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MANGROVE_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CRIMSON_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.WARPED_BARK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.OAK_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BIRCH_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SPRUCE_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.JUNGLE_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ACACIA_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DARK_OAK_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MANGROVE_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.AZALEA_LEAF, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SPONGE_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GLASS_SHARD, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SANDSTONE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COBWEB, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.RED_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.YELLOW_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ORANGE_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MAGENTA_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LIGHT_BLUE_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LIME_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PINK_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GRAY_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LIGHT_GRAY_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CYAN_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PURPLE_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BLUE_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BROWN_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GREEN_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BLACK_STRING, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SMOOTH_STONE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BRICK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MUD_BRICK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.NETHER_BRICK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PURPUR_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PRISMARINE_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DARK_PRISMARINE_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.END_STONE_PIECE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.RED_NETHER_BRICK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BLACKSTONE_PEBBLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.HONEYCOMB, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ICE_CUBE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SNOWBALL, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SLIMEBALL, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CLAY_BALL, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.JUKEBOX, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PUMPKIN, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BASALT, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SMOOTH_BASALT, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BRIGHT_GLOWSTONE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DARK_GLOWSTONE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PACKED_MUD, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BROWN_MUSHROOM, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.RED_MUSHROOM, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MUSHROOM_STEM, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MYCELIUM, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SCULK_BLOCK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BONE_BLOCK, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.WHITE_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ORANGE_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.MAGENTA_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LIGHT_BLUE_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.YELLOW_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PINK_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GRAY_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LIGHT_GRAY_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CYAN_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PURPLE_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LIME_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BROWN_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BLUE_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GREEN_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.RED_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BLACK_TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.HAY_BALE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.TERRACOTTA, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.EIGHTH_NOTE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BEAMED_EIGHTH_NOTE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.WHOLE_NOTE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.HALF_NOTE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.QUARTER_NOTE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DRIED_KELP, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.SHROOMLIGHT, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.FROGLIGHT_MIDDLE, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.OCHRE_FROGLIGHT, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.VERDANT_FROGLIGHT, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.PEARLESCENT_FROGLIGHT, GravityBlock.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CHERRY_BARK, GravityBlock.Factory::new);
    }

}