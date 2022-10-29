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

        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GREEN_FLAME, FlameParticle.Factory::new);
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

    }
}
