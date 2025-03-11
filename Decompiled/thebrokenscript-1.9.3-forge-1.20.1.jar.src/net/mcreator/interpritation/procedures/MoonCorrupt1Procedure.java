/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.ErrorPopup;
/*    */ import net.minecraftforge.event.ServerChatEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class MoonCorrupt1Procedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onChat(ServerChatEvent event) {
/* 16 */     execute((Event)event);
/*    */   }
/*    */   
/*    */   public static void execute() {
/* 20 */     execute(null);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event) {
/* 24 */     if (Math.random() < 0.01D)
/* 25 */       ErrorPopup.showMessage("Here I am.", "LWJGL Alert"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\MoonCorrupt1Procedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */