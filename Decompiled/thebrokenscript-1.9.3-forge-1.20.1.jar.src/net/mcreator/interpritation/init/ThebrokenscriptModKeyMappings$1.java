/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.network.TabpressMessage;
/*    */ import net.minecraft.client.KeyMapping;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends KeyMapping
/*    */ {
/*    */   private boolean isDownOld;
/*    */   
/*    */   null(String p_90821_, int p_90822_, String p_90823_) {
/* 23 */     super(p_90821_, p_90822_, p_90823_);
/* 24 */     this.isDownOld = false;
/*    */   }
/*    */   
/*    */   public void m_7249_(boolean isDown) {
/* 28 */     super.m_7249_(isDown);
/* 29 */     if (this.isDownOld != isDown && isDown) {
/* 30 */       ThebrokenscriptMod.PACKET_HANDLER.sendToServer(new TabpressMessage(0, 0));
/* 31 */       TabpressMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 0, 0);
/* 32 */       ThebrokenscriptModKeyMappings.TABPRESS_LASTPRESS = System.currentTimeMillis();
/* 33 */     } else if (this.isDownOld != isDown && !isDown) {
/* 34 */       int dt = (int)(System.currentTimeMillis() - ThebrokenscriptModKeyMappings.TABPRESS_LASTPRESS);
/* 35 */       ThebrokenscriptMod.PACKET_HANDLER.sendToServer(new TabpressMessage(1, dt));
/* 36 */       TabpressMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 1, dt);
/*    */     } 
/* 38 */     this.isDownOld = isDown;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModKeyMappings$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */