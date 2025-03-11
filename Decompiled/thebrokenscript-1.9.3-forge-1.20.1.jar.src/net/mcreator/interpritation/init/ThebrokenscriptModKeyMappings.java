/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.network.TabpressMessage;
/*    */ import net.minecraft.client.KeyMapping;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ThebrokenscriptModKeyMappings
/*    */ {
/* 23 */   public static final KeyMapping TABPRESS = new KeyMapping("key.thebrokenscript.tabpress", 258, "key.categories.misc")
/*    */     {
/*    */       private boolean isDownOld = false;
/*    */       
/*    */       public void m_7249_(boolean isDown) {
/* 28 */         super.m_7249_(isDown);
/* 29 */         if (this.isDownOld != isDown && isDown) {
/* 30 */           ThebrokenscriptMod.PACKET_HANDLER.sendToServer(new TabpressMessage(0, 0));
/* 31 */           TabpressMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 0, 0);
/* 32 */           ThebrokenscriptModKeyMappings.TABPRESS_LASTPRESS = System.currentTimeMillis();
/* 33 */         } else if (this.isDownOld != isDown && !isDown) {
/* 34 */           int dt = (int)(System.currentTimeMillis() - ThebrokenscriptModKeyMappings.TABPRESS_LASTPRESS);
/* 35 */           ThebrokenscriptMod.PACKET_HANDLER.sendToServer(new TabpressMessage(1, dt));
/* 36 */           TabpressMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 1, dt);
/*    */         } 
/* 38 */         this.isDownOld = isDown;
/*    */       }
/*    */     };
/* 41 */   private static long TABPRESS_LASTPRESS = 0L;
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
/* 45 */     event.register(TABPRESS);
/*    */   }
/*    */   
/*    */   @EventBusSubscriber({Dist.CLIENT})
/*    */   public static class KeyEventListener {
/*    */     @SubscribeEvent
/*    */     public static void onClientTick(TickEvent.ClientTickEvent event) {
/* 52 */       if ((Minecraft.m_91087_()).f_91080_ == null)
/* 53 */         ThebrokenscriptModKeyMappings.TABPRESS.m_90859_(); 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModKeyMappings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */