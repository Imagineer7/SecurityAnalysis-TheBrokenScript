/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class ReturnPlayerNameProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 16 */     if (event.phase == TickEvent.Phase.END) {
/* 17 */       execute((Event)event, (Entity)event.player);
/*    */     }
/*    */   }
/*    */   
/*    */   public static String execute(Entity entity) {
/* 22 */     return execute(null, entity);
/*    */   }
/*    */   
/*    */   private static String execute(@Nullable Event event, Entity entity) {
/* 26 */     if (entity == null)
/* 27 */       return ""; 
/* 28 */     return entity.m_5446_().getString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ReturnPlayerNameProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */