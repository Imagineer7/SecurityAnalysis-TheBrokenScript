/*     */ package net.mcreator.interpritation.client.gui;
/*     */ 
/*     */ import net.minecraft.client.gui.Font;
/*     */ import net.minecraft.client.gui.components.EditBox;
/*     */ import net.minecraft.network.chat.Component;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends EditBox
/*     */ {
/*     */   null(Font p_94114_, int p_94115_, int p_94116_, int p_94117_, int p_94118_, Component p_94119_) {
/*  92 */     super(p_94114_, p_94115_, p_94116_, p_94117_, p_94118_, p_94119_);
/*     */   }
/*     */   public void m_94164_(String text) {
/*  95 */     super.m_94164_(text);
/*  96 */     if (m_94155_().isEmpty()) {
/*  97 */       m_94167_(Component.m_237115_("gui.thebrokenscript.dev_pass.dev_code").getString());
/*     */     } else {
/*  99 */       m_94167_(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void m_94192_(int pos) {
/* 104 */     super.m_94192_(pos);
/* 105 */     if (m_94155_().isEmpty()) {
/* 106 */       m_94167_(Component.m_237115_("gui.thebrokenscript.dev_pass.dev_code").getString());
/*     */     } else {
/* 108 */       m_94167_(null);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\gui\DevPassScreen$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */