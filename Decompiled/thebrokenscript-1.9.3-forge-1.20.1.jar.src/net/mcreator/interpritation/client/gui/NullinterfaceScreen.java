/*    */ package net.mcreator.interpritation.client.gui;
/*    */ 
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.HashMap;
/*    */ import net.mcreator.interpritation.world.inventory.NullinterfaceMenu;
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class NullinterfaceScreen
/*    */   extends AbstractContainerScreen<NullinterfaceMenu>
/*    */ {
/* 18 */   private static final HashMap<String, Object> guistate = NullinterfaceMenu.guistate;
/*    */   
/*    */   private final Level world;
/*    */   private final int x;
/*    */   
/*    */   public NullinterfaceScreen(NullinterfaceMenu container, Inventory inventory, Component text) {
/* 24 */     super((AbstractContainerMenu)container, inventory, text);
/* 25 */     this.world = container.world;
/* 26 */     this.x = container.x;
/* 27 */     this.y = container.y;
/* 28 */     this.z = container.z;
/* 29 */     this.entity = container.entity;
/* 30 */     this.f_97726_ = 176;
/* 31 */     this.f_97727_ = 166;
/*    */   }
/*    */   private final int y; private final int z; private final Player entity;
/* 34 */   private static final ResourceLocation texture = new ResourceLocation("thebrokenscript:textures/screens/nullinterface.png");
/*    */ 
/*    */   
/*    */   public void m_88315_(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/* 38 */     m_280273_(guiGraphics);
/* 39 */     super.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/* 40 */     m_280072_(guiGraphics, mouseX, mouseY);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7286_(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/* 45 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 46 */     RenderSystem.enableBlend();
/* 47 */     RenderSystem.defaultBlendFunc();
/* 48 */     guiGraphics.m_280163_(texture, this.f_97735_, this.f_97736_, 0.0F, 0.0F, this.f_97726_, this.f_97727_, this.f_97726_, this.f_97727_);
/* 49 */     RenderSystem.disableBlend();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7933_(int key, int b, int c) {
/* 54 */     if (key == 256) {
/* 55 */       this.f_96541_.f_91074_.m_6915_();
/* 56 */       return true;
/*    */     } 
/* 58 */     return super.m_7933_(key, b, c);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_280003_(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/* 63 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.nullinterface.label_behind_you"), 60, 70, -12829636, false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7856_() {
/* 68 */     super.m_7856_();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\gui\NullinterfaceScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */