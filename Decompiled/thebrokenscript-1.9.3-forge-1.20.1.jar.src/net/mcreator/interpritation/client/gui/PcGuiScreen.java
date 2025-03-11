/*     */ package net.mcreator.interpritation.client.gui;
/*     */ 
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.HashMap;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.network.PcGuiButtonMessage;
/*     */ import net.mcreator.interpritation.world.inventory.PcGuiMenu;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.Font;
/*     */ import net.minecraft.client.gui.GuiGraphics;
/*     */ import net.minecraft.client.gui.components.Button;
/*     */ import net.minecraft.client.gui.components.Checkbox;
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
/*     */ public class PcGuiScreen extends AbstractContainerScreen<PcGuiMenu> {
/*  24 */   private static final HashMap<String, Object> guistate = PcGuiMenu.guistate; private final Level world; private final int x;
/*     */   private final int y;
/*     */   private final int z;
/*     */   private final Player entity;
/*     */   EditBox pcline;
/*     */   Checkbox box1;
/*     */   Checkbox box2;
/*     */   Checkbox box3;
/*     */   Checkbox box4;
/*     */   Button button_execute;
/*     */   
/*     */   public PcGuiScreen(PcGuiMenu container, Inventory inventory, Component text) {
/*  36 */     super((AbstractContainerMenu)container, inventory, text);
/*  37 */     this.world = container.world;
/*  38 */     this.x = container.x;
/*  39 */     this.y = container.y;
/*  40 */     this.z = container.z;
/*  41 */     this.entity = container.entity;
/*  42 */     this.f_97726_ = 300;
/*  43 */     this.f_97727_ = 166;
/*     */   }
/*     */   
/*  46 */   private static final ResourceLocation texture = new ResourceLocation("thebrokenscript:textures/screens/pc_gui.png");
/*     */ 
/*     */   
/*     */   public void m_88315_(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/*  50 */     m_280273_(guiGraphics);
/*  51 */     super.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/*  52 */     this.pcline.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/*  53 */     m_280072_(guiGraphics, mouseX, mouseY);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7286_(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/*  58 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*  59 */     RenderSystem.enableBlend();
/*  60 */     RenderSystem.defaultBlendFunc();
/*  61 */     guiGraphics.m_280163_(texture, this.f_97735_, this.f_97736_, 0.0F, 0.0F, this.f_97726_, this.f_97727_, this.f_97726_, this.f_97727_);
/*     */     
/*  63 */     guiGraphics.m_280163_(new ResourceLocation("thebrokenscript:textures/screens/warning.png"), this.f_97735_ + 5, this.f_97736_ + 7, 0.0F, 0.0F, 88, 83, 88, 83);
/*     */     
/*  65 */     guiGraphics.m_280163_(new ResourceLocation("thebrokenscript:textures/screens/line2.png"), this.f_97735_ + 14, this.f_97736_ + 16, 0.0F, 0.0F, 64, 32, 64, 32);
/*     */     
/*  67 */     RenderSystem.disableBlend();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7933_(int key, int b, int c) {
/*  72 */     if (key == 256) {
/*  73 */       this.f_96541_.f_91074_.m_6915_();
/*  74 */       return true;
/*     */     } 
/*  76 */     if (this.pcline.m_93696_())
/*  77 */       return this.pcline.m_7933_(key, b, c); 
/*  78 */     return super.m_7933_(key, b, c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_181908_() {
/*  83 */     super.m_181908_();
/*  84 */     this.pcline.m_94120_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6574_(Minecraft minecraft, int width, int height) {
/*  89 */     String pclineValue = this.pcline.m_94155_();
/*  90 */     super.m_6574_(minecraft, width, height);
/*  91 */     this.pcline.m_94144_(pclineValue);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_280003_(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/*  96 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.pc_gui.label_execute_to"), 14, 115, -16777216, false);
/*  97 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.pc_gui.label_execute_from"), 212, 88, -16777216, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7856_() {
/* 102 */     super.m_7856_();
/* 103 */     this.pcline = new EditBox(this.f_96547_, this.f_97735_ + 114, this.f_97736_ + 17, 118, 18, (Component)Component.m_237115_("gui.thebrokenscript.pc_gui.pcline"))
/*     */       {
/*     */         public void m_94164_(String text) {
/* 106 */           super.m_94164_(text);
/* 107 */           if (m_94155_().isEmpty()) {
/* 108 */             m_94167_(Component.m_237115_("gui.thebrokenscript.pc_gui.pcline").getString());
/*     */           } else {
/* 110 */             m_94167_(null);
/*     */           } 
/*     */         }
/*     */         
/*     */         public void m_94192_(int pos) {
/* 115 */           super.m_94192_(pos);
/* 116 */           if (m_94155_().isEmpty()) {
/* 117 */             m_94167_(Component.m_237115_("gui.thebrokenscript.pc_gui.pcline").getString());
/*     */           } else {
/* 119 */             m_94167_(null);
/*     */           }  }
/*     */       };
/* 122 */     this.pcline.m_94167_(Component.m_237115_("gui.thebrokenscript.pc_gui.pcline").getString());
/* 123 */     this.pcline.m_94199_(32767);
/* 124 */     guistate.put("text:pcline", this.pcline);
/* 125 */     m_7787_((GuiEventListener)this.pcline);
/* 126 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 131 */       .button_execute = Button.m_253074_((Component)Component.m_237115_("gui.thebrokenscript.pc_gui.button_execute"), e -> { ThebrokenscriptMod.PACKET_HANDLER.sendToServer(new PcGuiButtonMessage(0, this.x, this.y, this.z)); PcGuiButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z); }).m_252987_(this.f_97735_ + 140, this.f_97736_ + 43, 61, 20).m_253136_();
/* 132 */     guistate.put("button:button_execute", this.button_execute);
/* 133 */     m_142416_((GuiEventListener)this.button_execute);
/* 134 */     this.box1 = new Checkbox(this.f_97735_ + 14, this.f_97736_ + 133, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.pc_gui.box1"), false);
/* 135 */     guistate.put("checkbox:box1", this.box1);
/* 136 */     m_142416_((GuiEventListener)this.box1);
/* 137 */     this.box2 = new Checkbox(this.f_97735_ + 86, this.f_97736_ + 133, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.pc_gui.box2"), false);
/* 138 */     guistate.put("checkbox:box2", this.box2);
/* 139 */     m_142416_((GuiEventListener)this.box2);
/* 140 */     this.box3 = new Checkbox(this.f_97735_ + 212, this.f_97736_ + 106, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.pc_gui.box3"), false);
/* 141 */     guistate.put("checkbox:box3", this.box3);
/* 142 */     m_142416_((GuiEventListener)this.box3);
/* 143 */     this.box4 = new Checkbox(this.f_97735_ + 212, this.f_97736_ + 133, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.pc_gui.box4"), false);
/* 144 */     guistate.put("checkbox:box4", this.box4);
/* 145 */     m_142416_((GuiEventListener)this.box4);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\gui\PcGuiScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */