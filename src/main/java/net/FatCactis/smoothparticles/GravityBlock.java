package net.FatCactis.smoothparticles;

import net.FatCactis.smoothparticles.RandomMathStuffThatsCompletelyUselessAndIFeelLikeDyingBecauseIDontWantToCodeMoreParticlesAndDoUselessStuffThatWillTakeForeverAndImJustGoingToMakeAnotherClassThatExtendsThisOneJustBecauseIDontWantToTypeThisOutAndThisIsATerribleIdeaButIDontCare.Math2;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class GravityBlock extends SpriteBillboardParticle {
    Math2<Float> random = new Math2<>();
    protected GravityBlock(ClientWorld level, double xCoord, double yCoord, double zCoord,
                              SpriteProvider spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.velocityMultiplier = 0.9F;
        this.x = xd * 1.25;
        this.y = yd * 1.25;
        this.z = zd * 1.25;
        this.scale *= 0.75F;
        this.maxAge = 25;
        this.setSpriteForAge(spriteSet);

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;



        this.rotationDirection = (float) random.getRandom(1f, 2f, -1f, -2f);
        //dont worry about this stupid

    }

    @Override
    public void tick() {
        super.tick();
        rotate();
        move();
        fadeOut();
    }

    private final float rotationDirection;

    protected void rotate() {
        if (!this.onGround) {this.angle += this.rotationDirection/40;}
            this.prevAngle = this.angle;

    }

    void move() {
        velocityY = velocityY - 0.012;
    }

    void fadeOut() {
        this.alpha = (float) Math2.flipAroundNumber(easeOut(this.age, this.maxAge), 0.5);
    }

    public static float easeOut(float t,float b , float c, float d) {
        return c*(t/=d)*t + b;
    }

    public static float easeOut(float t, float d) {
        return (t/=d)*t;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(DefaultParticleType particleType, ClientWorld level, double x, double y, double z,
                                       double dx, double dy, double dz) {
            return new GravityBlock(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
