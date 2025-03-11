/*    */ package net.mcreator.interpritation.world.dimension;
/*    */ 
/*    */ import net.minecraft.client.renderer.DimensionSpecialEffects;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ import net.minecraftforge.client.event.RegisterDimensionSpecialEffectsEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
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
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class NullTortureSpecialEffectsHandler
/*    */ {
/*    */   @SubscribeEvent
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
/* 29 */     DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.END, false, false)
/*    */       {
/*    */         public Vec3 m_5927_(Vec3 color, float sunHeight) {
/* 32 */           return new Vec3(0.0D, 0.0D, 0.0D);
/*    */         }
/*    */ 
/*    */         
/*    */         public boolean m_5781_(int x, int y) {
/* 37 */           return true;
/*    */         }
/*    */       };
/* 40 */     event.register(new ResourceLocation("thebrokenscript:null_torture"), customEffect);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\world\dimension\NullTortureDimension$NullTortureSpecialEffectsHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */