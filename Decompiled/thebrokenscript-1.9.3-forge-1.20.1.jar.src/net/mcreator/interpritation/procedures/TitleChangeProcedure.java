/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.ServerChatEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class TitleChangeProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onChat(ServerChatEvent event) {
/* 17 */     execute((Event)event, (LevelAccessor)event.getPlayer().m_9236_());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world) {
/* 21 */     execute(null, world);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world) {
/* 25 */     if (world.m_5776_())
/* 26 */       Minecraft.m_91087_().m_91268_().m_85422_("Minecraft 1.12.2"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TitleChangeProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */