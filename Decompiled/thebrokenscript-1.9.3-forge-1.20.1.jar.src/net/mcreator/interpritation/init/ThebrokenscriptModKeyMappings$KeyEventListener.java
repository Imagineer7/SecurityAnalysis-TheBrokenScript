/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ public class KeyEventListener
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onClientTick(TickEvent.ClientTickEvent event) {
/* 52 */     if ((Minecraft.m_91087_()).f_91080_ == null)
/* 53 */       ThebrokenscriptModKeyMappings.TABPRESS.m_90859_(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModKeyMappings$KeyEventListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */