/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraftforge.event.ServerChatEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class MissilingWhileProjectileFlyingTickProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onChat(ServerChatEvent event) {
/* 14 */     execute((Event)event);
/*    */   }
/*    */   
/*    */   public static void execute() {
/* 18 */     execute(null);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event) {}
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\MissilingWhileProjectileFlyingTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */