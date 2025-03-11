/*     */ package net.mcreator.interpritation.client.gui;
/*     */ 
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.HashMap;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.network.DevPassButtonMessage;
/*     */ import net.mcreator.interpritation.world.inventory.DevPassMenu;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.Font;
/*     */ import net.minecraft.client.gui.GuiGraphics;
/*     */ import net.minecraft.client.gui.components.Button;
/*     */ import net.minecraft.client.gui.components.EditBox;
/*     */ import net.minecraft.client.gui.components.events.GuiEventListener;
/*     */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class DevPassScreen extends AbstractContainerScreen<DevPassMenu> {
/*  23 */   private static final HashMap<String, Object> guistate = DevPassMenu.guistate; private final Level world; private final int x;
/*     */   private final int y;
/*     */   private final int z;
/*     */   private final Player entity;
/*     */   EditBox dev_code;
/*     */   Button button_execute;
/*     */   
/*     */   public DevPassScreen(DevPassMenu container, Inventory inventory, Component text) {
/*  31 */     super((AbstractContainerMenu)container, inventory, text);
/*  32 */     this.world = container.world;
/*  33 */     this.x = container.x;
/*  34 */     this.y = container.y;
/*  35 */     this.z = container.z;
/*  36 */     this.entity = container.entity;
/*  37 */     this.f_97726_ = 176;
/*  38 */     this.f_97727_ = 166;
/*     */   }
/*     */   
/*  41 */   private static final ResourceLocation texture = new ResourceLocation("thebrokenscript:textures/screens/dev_pass.png");
/*     */ 
/*     */   
/*     */   public void m_88315_(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/*  45 */     m_280273_(guiGraphics);
/*  46 */     super.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/*  47 */     this.dev_code.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/*  48 */     m_280072_(guiGraphics, mouseX, mouseY);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7286_(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/*  53 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*  54 */     RenderSystem.enableBlend();
/*  55 */     RenderSystem.defaultBlendFunc();
/*  56 */     guiGraphics.m_280163_(texture, this.f_97735_, this.f_97736_, 0.0F, 0.0F, this.f_97726_, this.f_97727_, this.f_97726_, this.f_97727_);
/*  57 */     RenderSystem.disableBlend();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7933_(int key, int b, int c) {
/*  62 */     if (key == 256) {
/*  63 */       this.f_96541_.f_91074_.m_6915_();
/*  64 */       return true;
/*     */     } 
/*  66 */     if (this.dev_code.m_93696_())
/*  67 */       return this.dev_code.m_7933_(key, b, c); 
/*  68 */     return super.m_7933_(key, b, c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_181908_() {
/*  73 */     super.m_181908_();
/*  74 */     this.dev_code.m_94120_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6574_(Minecraft minecraft, int width, int height) {
/*  79 */     String dev_codeValue = this.dev_code.m_94155_();
/*  80 */     super.m_6574_(minecraft, width, height);
/*  81 */     this.dev_code.m_94144_(dev_codeValue);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_280003_(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/*  86 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.dev_pass.label_o"), 78, 7, -12829636, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7856_() {
/*  91 */     super.m_7856_();
/*  92 */     this.dev_code = new EditBox(this.f_96547_, this.f_97735_ + 31, this.f_97736_ + 70, 118, 18, (Component)Component.m_237115_("gui.thebrokenscript.dev_pass.dev_code"))
/*     */       {
/*     */         public void m_94164_(String text) {
/*  95 */           super.m_94164_(text);
/*  96 */           if (m_94155_().isEmpty()) {
/*  97 */             m_94167_(Component.m_237115_("gui.thebrokenscript.dev_pass.dev_code").getString());
/*     */           } else {
/*  99 */             m_94167_(null);
/*     */           } 
/*     */         }
/*     */         
/*     */         public void m_94192_(int pos) {
/* 104 */           super.m_94192_(pos);
/* 105 */           if (m_94155_().isEmpty()) {
/* 106 */             m_94167_(Component.m_237115_("gui.thebrokenscript.dev_pass.dev_code").getString());
/*     */           } else {
/* 108 */             m_94167_(null);
/*     */           }  }
/*     */       };
/* 111 */     this.dev_code.m_94167_(Component.m_237115_("gui.thebrokenscript.dev_pass.dev_code").getString());
/* 112 */     this.dev_code.m_94199_(32767);
/* 113 */     guistate.put("text:dev_code", this.dev_code);
/* 114 */     m_7787_((GuiEventListener)this.dev_code);
/* 115 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 120 */       .button_execute = Button.m_253074_((Component)Component.m_237115_("gui.thebrokenscript.dev_pass.button_execute"), e -> { ThebrokenscriptMod.PACKET_HANDLER.sendToServer(new DevPassButtonMessage(0, this.x, this.y, this.z)); DevPassButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z); }).m_252987_(this.f_97735_ + 60, this.f_97736_ + 97, 61, 20).m_253136_();
/* 121 */     guistate.put("button:button_execute", this.button_execute);
/* 122 */     m_142416_((GuiEventListener)this.button_execute);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\gui\DevPassScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */