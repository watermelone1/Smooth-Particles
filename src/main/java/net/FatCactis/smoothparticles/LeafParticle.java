package net.FatCactis.smoothparticles;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.BlockPos;

public class LeafParticle extends GravityBlock{
    protected LeafParticle(ClientWorld level, double xCoord, double yCoord, double zCoord, SpriteProvider spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, spriteSet, xd, yd, zd);
    }

    @Override
    public void tick() {
        super.tick();
        int color = BiomeColors.getFoliageColor(world, new BlockPos((int) this.x, (int) this.y, (int) this.z));
        float r = (float) (color >> 16 & 0xFF) / 255.0f;
        float g = (float) (color >> 8 & 0xFF) / 255.0f;
        float b = (float) (color & 0xFF) / 255.0f;
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(DefaultParticleType particleType, ClientWorld level, double x, double y, double z,
                                       double dx, double dy, double dz) {
            return new LeafParticle(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
