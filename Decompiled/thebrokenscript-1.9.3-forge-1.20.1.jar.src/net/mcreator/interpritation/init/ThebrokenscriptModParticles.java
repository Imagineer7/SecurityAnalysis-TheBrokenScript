/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.client.particle.EyesParticle;
/*    */ import net.mcreator.interpritation.client.particle.NullParticleParticle;
/*    */ import net.mcreator.interpritation.client.particle.ParticleOfCurvedParticle;
/*    */ import net.mcreator.interpritation.client.particle.WretchedParticleParticle;
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ThebrokenscriptModParticles
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerParticles(RegisterParticleProvidersEvent event) {
/* 21 */     event.registerSpriteSet((ParticleType)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), NullParticleParticle::provider);
/* 22 */     event.registerSpriteSet((ParticleType)ThebrokenscriptModParticleTypes.EYES.get(), EyesParticle::provider);
/* 23 */     event.registerSpriteSet((ParticleType)ThebrokenscriptModParticleTypes.WRETCHED_PARTICLE.get(), WretchedParticleParticle::provider);
/* 24 */     event.registerSpriteSet((ParticleType)ThebrokenscriptModParticleTypes.PARTICLE_OF_CURVED.get(), ParticleOfCurvedParticle::provider);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModParticles.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */