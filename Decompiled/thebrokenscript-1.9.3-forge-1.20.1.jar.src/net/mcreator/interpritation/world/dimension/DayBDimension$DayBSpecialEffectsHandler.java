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
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class DayBSpecialEffectsHandler
/*    */ {
/*    */   @SubscribeEvent
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
/* 28 */     DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.END, false, false)
/*    */       {
/*    */         public Vec3 m_5927_(Vec3 color, float sunHeight) {
/* 31 */           return new Vec3(1.0D, 1.0D, 1.0D);
/*    */         }
/*    */ 
/*    */         
/*    */         public boolean m_5781_(int x, int y) {
/* 36 */           return true;
/*    */         }
/*    */       };
/* 39 */     event.register(new ResourceLocation("thebrokenscript:day_b"), customEffect);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\world\dimension\DayBDimension$DayBSpecialEffectsHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */