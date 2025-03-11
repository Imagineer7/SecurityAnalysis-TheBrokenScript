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
/*    */ public class EyesParticle
/*    */   extends TextureSheetParticle {
/*    */   public static EyesParticleProvider provider(SpriteSet spriteSet) {
/* 18 */     return new EyesParticleProvider(spriteSet);
/*    */   }
/*    */   private final SpriteSet spriteSet;
/*    */   
/*    */   public static class EyesParticleProvider implements ParticleProvider<SimpleParticleType> { private final SpriteSet spriteSet;
/*    */     
/*    */     public EyesParticleProvider(SpriteSet spriteSet) {
/* 25 */       this.spriteSet = spriteSet;
/*    */     }
/*    */     
/*    */     public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
/* 29 */       return (Particle)new EyesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected EyesParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
/* 36 */     super(world, x, y, z);
/* 37 */     this.spriteSet = spriteSet;
/* 38 */     m_107250_(0.2F, 0.2F);
/* 39 */     this.f_107663_ *= 2.0F;
/* 40 */     this.f_107225_ = 7;
/* 41 */     this.f_107226_ = 0.0F;
/* 42 */     this.f_107219_ = false;
/* 43 */     this.f_107215_ = vx * 0.0D;
/* 44 */     this.f_107216_ = vy * 0.0D;
/* 45 */     this.f_107217_ = vz * 0.0D;
/* 46 */     m_108335_(spriteSet);
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_6355_(float partialTick) {
/* 51 */     return 15728880;
/*    */   }
/*    */ 
/*    */   
/*    */   public ParticleRenderType m_7556_() {
/* 56 */     return ParticleRenderType.f_107432_;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5989_() {
/* 61 */     super.m_5989_();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\particle\EyesParticle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */