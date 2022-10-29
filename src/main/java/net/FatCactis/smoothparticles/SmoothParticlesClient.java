package net.FatCactis.smoothparticles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.block.BubbleColumnBlock;
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

        //bubble
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/bubble"));
        }));

        //crit
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/critical_hit"));
        }));

        //damage heart
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/damage"));
        }));

        //enchanted hit
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/enchanted_hit"));
        }));

        //flame
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/flame"));
        }));

        //vilager get block (glint)
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/glint"));
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

        //soul flame
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("smoothparticles", "particle/soul_fire_flame"));
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
            registry.register(new Identifier("smoothparticles", "particle/andesite_pebble"));
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

        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GREEN_FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ANGRY, EmotionParticle.AngryVillagerFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.BUBBLE, WaterBubbleParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CONDUIT, EnchantGlyphParticle.NautilusFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CRIT, DamageParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DAMAGE, DamageParticle.DefaultFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ENCH_HIT, DamageParticle.EnchantedHitFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.EMERALD, SuspendParticle.HappyVillagerFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.HEART, EmotionParticle.HeartFactory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.LAVA, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.STONE_PEBBLE, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.GRANITE_PEBBLE, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DIORITE_PEBBLE, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.ANDESITE_PEBBLE, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DEEPSLATE_PEBBLE, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.CALCITE_PEBBLE, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.TUFF_PEBBLE, LavaEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SmoothParticles.DRIPSTONE_PEBBLE, LavaEmberParticle.Factory::new);

    }
}
