/*    */ package net.mcreator.interpritation.client.gui;
/*    */ 
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.HashMap;
/*    */ import net.mcreator.interpritation.procedures.ReturnPlayerNameProcedure;
/*    */ import net.mcreator.interpritation.world.inventory.TabMenu;
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class TabScreen
/*    */   extends AbstractContainerScreen<TabMenu> {
/* 19 */   private static final HashMap<String, Object> guistate = TabMenu.guistate;
/*    */   
/*    */   private final Level world;
/*    */   private final int x;
/*    */   
/*    */   public TabScreen(TabMenu container, Inventory inventory, Component text) {
/* 25 */     super((AbstractContainerMenu)container, inventory, text);
/* 26 */     this.world = container.world;
/* 27 */     this.x = container.x;
/* 28 */     this.y = container.y;
/* 29 */     this.z = container.z;
/* 30 */     this.entity = container.entity;
/* 31 */     this.f_97726_ = 176;
/* 32 */     this.f_97727_ = 166;
/*    */   }
/*    */   private final int y; private final int z; private final Player entity;
/*    */   
/*    */   public void m_88315_(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/* 37 */     m_280273_(guiGraphics);
/* 38 */     super.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/* 39 */     m_280072_(guiGraphics, mouseX, mouseY);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7286_(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/* 44 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 45 */     RenderSystem.enableBlend();
/* 46 */     RenderSystem.defaultBlendFunc();
/*    */     
/* 48 */     guiGraphics.m_280163_(new ResourceLocation("thebrokenscript:textures/screens/tab.png"), this.f_97735_ + 58, this.f_97736_ + -32, 0.0F, 0.0F, 64, 16, 64, 16);
/*    */     
/* 50 */     RenderSystem.disableBlend();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7933_(int key, int b, int c) {
/* 55 */     if (key == 256) {
/* 56 */       this.f_96541_.f_91074_.m_6915_();
/* 57 */       return true;
/*    */     } 
/* 59 */     return super.m_7933_(key, b, c);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_280003_(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/* 64 */     guiGraphics.m_280056_(this.f_96547_, 
/*    */         
/* 66 */         ReturnPlayerNameProcedure.execute((Entity)this.entity), 61, -29, -12829636, false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7856_() {
/* 71 */     super.m_7856_();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\gui\TabScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */