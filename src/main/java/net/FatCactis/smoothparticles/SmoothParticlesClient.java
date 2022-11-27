package net.FatCactis.smoothparticles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.*;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class SmoothParticlesClient implements ClientModInitializer  {

    @Override
    public void onInitializeClient() {


        //saul
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/saul"));
        }));

        //green flame
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/green_flame"));
        }));

        //angry particle
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/angry"));
        }));

        //enchanted hit
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/enchanted_hit"));
        }));

        //flame
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/flame"));
        }));

        //villager heart
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/heart"));
        }));

        //lava
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/lava"));
        }));

        //conduit (nautilus)
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/nautilus"));
        }));

        //stone pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/stone_pebble"));
        }));

        //grainte pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/granite_pebble"));
        }));

        //diorte pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/diorite_pebble"));
        }));

        //andesite_pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/andesite_pebble"));
        }));

        //deepslate pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/deepslate_pebble"));
        }));

        //calcite_pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/calcite_pebble"));
        }));

        //tuff pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/tuff_pebble"));
        }));

        //dripstone pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dripstone_pebble"));
        }));

        //dirt pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dirt_pebble"));
        }));

        //grass piece
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dirt_pebble"));
        }));

        //coarse_dirt_pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dirt_pebble"));
        }));

        //mud piece
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/mud_piece"));
        }));

        //netherrack pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/netherrack_pebble"));
        }));

        //crimson_piece
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/crimson_piece"));
        }));

        //warped piece
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/warped_piece"));
        }));

        //oak_splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/oak_splinter"));
        }));

        //spruce_splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/spruce_splinter"));
        }));

        //birch splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/birch_splinter"));
        }));

        //jungle splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/jungle_splinter"));
        }));

        //acaica splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/acacia_splinter"));
        }));

        //dark oak splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dark_oak_splinter"));
        }));

        //dark oak splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/mangrove_splinter"));
        }));

        //crimson splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/crimson_splinter"));
        }));

        //crimson splinter
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/warped_splinter"));
        }));

        //bedrock
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/bedrock_pebble"));
        }));

        //sand
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/sand_piece"));
        }));

        //red sand
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/red_sand_piece"));
        }));

        //gravel
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/gravel_piece"));
        }));

        //coaL_pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/coal_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/raw_iron_pebble"));
        }));

        //orange copper
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/copper_pebble_orange"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/copper_pebble_orange_green"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/copper_pebble_green"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/gold_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/redstone_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/emerald_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/lapis_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/diamond_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/quartz_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/debris_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/amethyst_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/iron_pebble"));
        }));

        //iron pebble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/netherite_pebble"));
        }));

        //oak bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/oak_bark"));
        }));

        //birch bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/birch_bark"));
        }));

        //birch bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/spruce_bark"));
        }));

        //jungkle bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/jungle_bark"));
        }));

        //acacia bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/acacia_bark"));
        }));

        //dark oak bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dark_oak_bark"));
        }));

        //dark oak bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/mangrove_bark"));
        }));

        //crimson bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/crimson_bark"));
        }));

        //warped bark
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/warped_bark"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/warped_bark"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/birch_leaf"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/spruce_leaf"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/jungle_leaf"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/acacia_leaf"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dark_oak_leaf"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/mangrove_leaf"));
        }));

        //oak leaf
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/azalea_leaf"));
        }));

        //sponge
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/sponge_piece"));
        }));

        //sandstone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/glass_shard"));
        }));

        //sponge
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/sandstone_pebble"));
        }));

        //cobweb
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/cobweb"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/red_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/yellow_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/orange_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/magenta_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/light_blue_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/lime_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/pink_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/gray_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/light_gray_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/cyan_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/purple_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/blue_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/brown_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/green_string"));
        }));

        //string
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/black_string"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/smooth_stone_pebble"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/brick"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/nether_brick"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/purpur_piece"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/prismarine_piece"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/dark_prismarine_piece"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/end_stone_piece"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/red_nether_brick"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/blackstone_pebble"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/honeycomb"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/ice_cube"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/snowball"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/slimeball"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/clay_ball"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/jukebox"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/pumpkin"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/basalt"));
        }));

        //smooth  stone
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/smooth_basalt"));
        }));

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
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.COBBLESTONE_PIECE, GravityBlock.Factory::new);
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
    }
}