/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.entity.EntityJoinLevelEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class MooneventMobDespawnProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onEntitySpawned(EntityJoinLevelEvent event) {
/* 20 */     execute((Event)event, (LevelAccessor)event.getLevel(), event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 24 */     execute(null, world, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
/* 28 */     if (entity == null)
/*    */       return; 
/* 30 */     if (world.m_6042_().m_63936_(world.m_8044_()) == 5 && 
/* 31 */       entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:despawnable")))) {
/* 32 */       if (event != null && event.isCancelable()) {
/* 33 */         event.setCanceled(true);
/* 34 */       } else if (event != null && event.hasResult()) {
/* 35 */         event.setResult(Event.Result.DENY);
/*    */       } 
/*    */     }
/*    */     
/* 39 */     if (world.m_6042_().m_63936_(world.m_8044_()) == 6 && 
/* 40 */       entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:despawnable")))) {
/* 41 */       if (event != null && event.isCancelable()) {
/* 42 */         event.setCanceled(true);
/* 43 */       } else if (event != null && event.hasResult()) {
/* 44 */         event.setResult(Event.Result.DENY);
/*    */       } 
/*    */     }
/*    */     
/* 48 */     if (world.m_6042_().m_63936_(world.m_8044_()) == 7 && 
/* 49 */       entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:despawnable")))) {
/* 50 */       if (event != null && event.isCancelable()) {
/* 51 */         event.setCanceled(true);
/* 52 */       } else if (event != null && event.hasResult()) {
/* 53 */         event.setResult(Event.Result.DENY);
/*    */       } 
/*    */     }
/*    */     
/* 57 */     if (world.m_6042_().m_63936_(world.m_8044_()) == 8 && 
/* 58 */       entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:despawnable"))))
/* 59 */       if (event != null && event.isCancelable()) {
/* 60 */         event.setCanceled(true);
/* 61 */       } else if (event != null && event.hasResult()) {
/* 62 */         event.setResult(Event.Result.DENY);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\MooneventMobDespawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */