/*    */ package net.mcreator.interpritation.world.dimension;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.NullTorturePlayerEntersDimensionProcedure;
/*    */ import net.mcreator.interpritation.procedures.NullTorturePlayerLeavesDimensionProcedure;
/*    */ import net.minecraft.client.renderer.DimensionSpecialEffects;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ import net.minecraftforge.client.event.RegisterDimensionSpecialEffectsEvent;
/*    */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class NullTortureDimension {
/*    */   @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */   public static class NullTortureSpecialEffectsHandler
/*    */   {
/*    */     @SubscribeEvent
/*    */     @OnlyIn(Dist.CLIENT)
/* 29 */     public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) { DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.END, false, false)
/*    */         {
/*    */           public Vec3 m_5927_(Vec3 color, float sunHeight) {
/* 32 */             return new Vec3(0.0D, 0.0D, 0.0D);
/*    */           }
/*    */ 
/*    */           
/*    */           public boolean m_5781_(int x, int y) {
/* 37 */             return true;
/*    */           }
/*    */         };
/* 40 */       event.register(new ResourceLocation("thebrokenscript:null_torture"), customEffect); }
/*    */   
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
/* 46 */     Player player = event.getEntity();
/* 47 */     Level world = player.m_9236_();
/* 48 */     double x = player.m_20185_();
/* 49 */     double y = player.m_20186_();
/* 50 */     double z = player.m_20189_();
/* 51 */     if (event.getFrom() == ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:null_torture"))) {
/* 52 */       NullTorturePlayerLeavesDimensionProcedure.execute((LevelAccessor)world, (Entity)player);
/*    */     }
/* 54 */     if (event.getTo() == ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:null_torture")))
/* 55 */       NullTorturePlayerEntersDimensionProcedure.execute((LevelAccessor)world, x, y, z, (Entity)player); 
/*    */   }
/*    */   
/*    */   class null extends DimensionSpecialEffects {
/*    */     null(float p_108866_, boolean p_108867_, DimensionSpecialEffects.SkyType p_108868_, boolean p_108869_, boolean p_108870_) {
/*    */       super(p_108866_, p_108867_, p_108868_, p_108869_, p_108870_);
/*    */     }
/*    */     
/*    */     public Vec3 m_5927_(Vec3 color, float sunHeight) {
/*    */       return new Vec3(0.0D, 0.0D, 0.0D);
/*    */     }
/*    */     
/*    */     public boolean m_5781_(int x, int y) {
/*    */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\world\dimension\NullTortureDimension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */