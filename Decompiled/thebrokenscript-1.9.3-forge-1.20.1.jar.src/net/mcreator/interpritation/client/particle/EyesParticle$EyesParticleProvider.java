/*    */ package net.mcreator.interpritation.client.particle;
/*    */ 
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.particle.Particle;
/*    */ import net.minecraft.client.particle.ParticleProvider;
/*    */ import net.minecraft.client.particle.SpriteSet;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EyesParticleProvider
/*    */   implements ParticleProvider<SimpleParticleType>
/*    */ {
/*    */   private final SpriteSet spriteSet;
/*    */   
/*    */   public EyesParticleProvider(SpriteSet spriteSet) {
/* 25 */     this.spriteSet = spriteSet;
/*    */   }
/*    */   
/*    */   public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
/* 29 */     return (Particle)new EyesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\particle\EyesParticle$EyesParticleProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */