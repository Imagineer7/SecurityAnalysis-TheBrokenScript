/*     */ package net.mcreator.interpritation.client.gui;
/*     */ 
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.HashMap;
/*     */ import net.mcreator.interpritation.world.inventory.NullInterface2Menu;
/*     */ import net.minecraft.client.gui.GuiGraphics;
/*     */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class NullInterface2Screen
/*     */   extends AbstractContainerScreen<NullInterface2Menu>
/*     */ {
/*  18 */   private static final HashMap<String, Object> guistate = NullInterface2Menu.guistate;
/*     */   
/*     */   private final Level world;
/*     */   private final int x;
/*     */   
/*     */   public NullInterface2Screen(NullInterface2Menu container, Inventory inventory, Component text) {
/*  24 */     super((AbstractContainerMenu)container, inventory, text);
/*  25 */     this.world = container.world;
/*  26 */     this.x = container.x;
/*  27 */     this.y = container.y;
/*  28 */     this.z = container.z;
/*  29 */     this.entity = container.entity;
/*  30 */     this.f_97726_ = 176;
/*  31 */     this.f_97727_ = 166;
/*     */   }
/*     */   private final int y; private final int z; private final Player entity;
/*  34 */   private static final ResourceLocation texture = new ResourceLocation("thebrokenscript:textures/screens/null_interface_2.png");
/*     */ 
/*     */   
/*     */   public void m_88315_(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/*  38 */     m_280273_(guiGraphics);
/*  39 */     super.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/*  40 */     m_280072_(guiGraphics, mouseX, mouseY);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7286_(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/*  45 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*  46 */     RenderSystem.enableBlend();
/*  47 */     RenderSystem.defaultBlendFunc();
/*  48 */     guiGraphics.m_280163_(texture, this.f_97735_, this.f_97736_, 0.0F, 0.0F, this.f_97726_, this.f_97727_, this.f_97726_, this.f_97727_);
/*  49 */     RenderSystem.disableBlend();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7933_(int key, int b, int c) {
/*  54 */     if (key == 256) {
/*  55 */       this.f_96541_.f_91074_.m_6915_();
/*  56 */       return true;
/*     */     } 
/*  58 */     return super.m_7933_(key, b, c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_280003_(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/*  63 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null"), 6, 7, -12829636, false);
/*  64 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null1"), 42, 7, -12829636, false);
/*  65 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null2"), 78, 7, -12829636, false);
/*  66 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null3"), 114, 7, -12829636, false);
/*  67 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null4"), 150, 7, -12829636, false);
/*  68 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null5"), 6, 25, -12829636, false);
/*  69 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null6"), 42, 25, -12829636, false);
/*  70 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null7"), 78, 25, -12829636, false);
/*  71 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null8"), 114, 25, -12829636, false);
/*  72 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null9"), 150, 25, -12829636, false);
/*  73 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null10"), 6, 43, -12829636, false);
/*  74 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null11"), 42, 43, -12829636, false);
/*  75 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null12"), 78, 43, -12829636, false);
/*  76 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null13"), 114, 43, -12829636, false);
/*  77 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null14"), 150, 43, -12829636, false);
/*  78 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null15"), 6, 61, -12829636, false);
/*  79 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null16"), 42, 61, -12829636, false);
/*  80 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null17"), 78, 61, -12829636, false);
/*  81 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null18"), 114, 61, -12829636, false);
/*  82 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null19"), 150, 61, -12829636, false);
/*  83 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null20"), 6, 79, -12829636, false);
/*  84 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null21"), 42, 79, -12829636, false);
/*  85 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null22"), 78, 79, -12829636, false);
/*  86 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null23"), 114, 79, -12829636, false);
/*  87 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null24"), 150, 79, -12829636, false);
/*  88 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null25"), 6, 97, -12829636, false);
/*  89 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null26"), 42, 97, -12829636, false);
/*  90 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null27"), 78, 97, -12829636, false);
/*  91 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null28"), 114, 97, -12829636, false);
/*  92 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null29"), 150, 97, -12829636, false);
/*  93 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null30"), 6, 115, -12829636, false);
/*  94 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null31"), 42, 115, -12829636, false);
/*  95 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null32"), 78, 115, -12829636, false);
/*  96 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null33"), 114, 115, -12829636, false);
/*  97 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null34"), 150, 115, -12829636, false);
/*  98 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null35"), 6, 133, -12829636, false);
/*  99 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null36"), 42, 133, -12829636, false);
/* 100 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null37"), 78, 133, -12829636, false);
/* 101 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null38"), 114, 133, -12829636, false);
/* 102 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null39"), 150, 133, -12829636, false);
/* 103 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null40"), 6, 151, -12829636, false);
/* 104 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null41"), 42, 151, -12829636, false);
/* 105 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null42"), 78, 151, -12829636, false);
/* 106 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null43"), 114, 151, -12829636, false);
/* 107 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.null_interface_2.label_null44"), 150, 151, -12829636, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7856_() {
/* 112 */     super.m_7856_();
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\gui\NullInterface2Screen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */