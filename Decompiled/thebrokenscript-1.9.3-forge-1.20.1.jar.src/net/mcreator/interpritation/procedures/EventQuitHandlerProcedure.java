/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.event.ServerChatEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class EventQuitHandlerProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onChat(ServerChatEvent event) {
/* 18 */     execute((Event)event, (Entity)event.getPlayer());
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 22 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/* 26 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 29 */     boolean _setval = true;
/* 30 */     entity.getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.is_player_an_entity = _setval;
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\EventQuitHandlerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */