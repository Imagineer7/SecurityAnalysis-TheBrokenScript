/*    */ package net.mcreator.interpritation.client.particle;
/*    */ 
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.particle.Particle;
/*    */ import net.minecraft.client.particle.ParticleProvider;
/*    */ import net.minecraft.client.particle.ParticleRenderType;
/*    */ import net.minecraft.client.particle.SpriteSet;
/*    */ import net.minecraft.client.particle.TextureSheetParticle;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ @OnlyIn(Dist.CLIENT)
/*    */ public class NullParticleParticle
/*    */   extends TextureSheetParticle {
/*    */   public static NullParticleParticleProvider provider(SpriteSet spriteSet) {
/* 18 */     return new NullParticleParticleProvider(spriteSet);
/*    */   }
/*    */   private final SpriteSet spriteSet;
/*    */   
/*    */   public static class NullParticleParticleProvider implements ParticleProvider<SimpleParticleType> { private final SpriteSet spriteSet;
/*    */     
/*    */     public NullParticleParticleProvider(SpriteSet spriteSet) {
/* 25 */       this.spriteSet = spriteSet;
/*    */     }
/*    */     
/*    */     public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
/* 29 */       return (Particle)new NullParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected NullParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
/* 36 */     super(world, x, y, z);
/* 37 */     this.spriteSet = spriteSet;
/* 38 */     m_107250_(0.2F, 0.2F);
/* 39 */     this.f_107663_ *= 5.0F;
/* 40 */     this.f_107225_ = Math.max(1, 27 + this.f_107223_.m_188503_(60) - 30);
/* 41 */     this.f_107226_ = 0.0F;
/* 42 */     this.f_107219_ = true;
/* 43 */     this.f_107215_ = vx * 0.0D;
/* 44 */     this.f_107216_ = vy * 0.0D;
/* 45 */     this.f_107217_ = vz * 0.0D;
/* 46 */     m_108335_(spriteSet);
/*    */   }
/*    */ 
/*    */   
/*    */   public ParticleRenderType m_7556_() {
/* 51 */     return ParticleRenderType.f_107430_;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5989_() {
/* 56 */     super.m_5989_();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\particle\NullParticleParticle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */