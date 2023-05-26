package net.FatCactis.smoothparticles;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;

public class GravityEffect extends DefaultParticleType {
    protected GravityEffect(boolean alwaysShow) {
        super(alwaysShow);
    }

    public void setScale(double scale) {

    }
}
