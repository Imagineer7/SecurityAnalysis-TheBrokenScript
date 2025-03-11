/*     */ package net.mcreator.interpritation.client.gui;
/*     */ 
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.HashMap;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.network.ConfigButtonMessage;
/*     */ import net.mcreator.interpritation.world.inventory.ConfigMenu;
/*     */ import net.minecraft.client.gui.GuiGraphics;
/*     */ import net.minecraft.client.gui.components.Button;
/*     */ import net.minecraft.client.gui.components.Checkbox;
/*     */ import net.minecraft.client.gui.components.events.GuiEventListener;
/*     */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class ConfigScreen
/*     */   extends AbstractContainerScreen<ConfigMenu> {
/*  22 */   private static final HashMap<String, Object> guistate = ConfigMenu.guistate; private final Level world; private final int x;
/*     */   private final int y;
/*     */   private final int z;
/*     */   private final Player entity;
/*     */   Checkbox checkbox1;
/*     */   Checkbox checkbox2;
/*     */   Checkbox checkbox3;
/*     */   Checkbox checkbox4;
/*     */   Checkbox checkbox5;
/*     */   Checkbox checkbox6;
/*     */   Checkbox checkbox7;
/*     */   Checkbox checkbox8;
/*     */   Checkbox checkbox9;
/*     */   Button button_save;
/*     */   
/*     */   public ConfigScreen(ConfigMenu container, Inventory inventory, Component text) {
/*  38 */     super((AbstractContainerMenu)container, inventory, text);
/*  39 */     this.world = container.world;
/*  40 */     this.x = container.x;
/*  41 */     this.y = container.y;
/*  42 */     this.z = container.z;
/*  43 */     this.entity = container.entity;
/*  44 */     this.f_97726_ = 250;
/*  45 */     this.f_97727_ = 166;
/*     */   }
/*     */   
/*  48 */   private static final ResourceLocation texture = new ResourceLocation("thebrokenscript:textures/screens/config.png");
/*     */ 
/*     */   
/*     */   public void m_88315_(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/*  52 */     m_280273_(guiGraphics);
/*  53 */     super.m_88315_(guiGraphics, mouseX, mouseY, partialTicks);
/*  54 */     m_280072_(guiGraphics, mouseX, mouseY);
/*  55 */     if (mouseX > this.f_97735_ + 5 && mouseX < this.f_97735_ + 29 && mouseY > this.f_97736_ + 23 && mouseY < this.f_97736_ + 47)
/*  56 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_sets_tbs_entities_spawnrate_to_0"), mouseX, mouseY); 
/*  57 */     if (mouseX > this.f_97735_ + 5 && mouseX < this.f_97735_ + 29 && mouseY > this.f_97736_ + 50 && mouseY < this.f_97736_ + 74)
/*  58 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_disables_random_events"), mouseX, mouseY); 
/*  59 */     if (mouseX > this.f_97735_ + 5 && mouseX < this.f_97735_ + 29 && mouseY > this.f_97736_ + 77 && mouseY < this.f_97736_ + 101)
/*  60 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_disables_game_crashes"), mouseX, mouseY); 
/*  61 */     if (mouseX > this.f_97735_ + 5 && mouseX < this.f_97735_ + 29 && mouseY > this.f_97736_ + 104 && mouseY < this.f_97736_ + 128)
/*  62 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_disables_null_random_event_jumps"), mouseX, mouseY); 
/*  63 */     if (mouseX > this.f_97735_ + 5 && mouseX < this.f_97735_ + 29 && mouseY > this.f_97736_ + 131 && mouseY < this.f_97736_ + 155)
/*  64 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_disables_random_structures_from"), mouseX, mouseY); 
/*  65 */     if (mouseX > this.f_97735_ + 140 && mouseX < this.f_97735_ + 164 && mouseY > this.f_97736_ + 23 && mouseY < this.f_97736_ + 47)
/*  66 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_removevhs_but_in_config"), mouseX, mouseY); 
/*  67 */     if (mouseX > this.f_97735_ + 140 && mouseX < this.f_97735_ + 164 && mouseY > this.f_97736_ + 50 && mouseY < this.f_97736_ + 74)
/*  68 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_safemode_but_in_config"), mouseX, mouseY); 
/*  69 */     if (mouseX > this.f_97735_ + 140 && mouseX < this.f_97735_ + 164 && mouseY > this.f_97736_ + 77 && mouseY < this.f_97736_ + 101)
/*  70 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_stops_entities_from_breaking_blo"), mouseX, mouseY); 
/*  71 */     if (mouseX > this.f_97735_ + 140 && mouseX < this.f_97735_ + 164 && mouseY > this.f_97736_ + 104 && mouseY < this.f_97736_ + 128) {
/*  72 */       guiGraphics.m_280557_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.tooltip_removes_base_exploding_event"), mouseX, mouseY);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void m_7286_(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/*  77 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*  78 */     RenderSystem.enableBlend();
/*  79 */     RenderSystem.defaultBlendFunc();
/*  80 */     guiGraphics.m_280163_(texture, this.f_97735_, this.f_97736_, 0.0F, 0.0F, this.f_97726_, this.f_97727_, this.f_97726_, this.f_97727_);
/*     */     
/*  82 */     guiGraphics.m_280163_(new ResourceLocation("thebrokenscript:textures/screens/line2.png"), this.f_97735_ + -65, this.f_97736_ + 2, 0.0F, 0.0F, 64, 32, 64, 32);
/*     */     
/*  84 */     guiGraphics.m_280163_(new ResourceLocation("thebrokenscript:textures/screens/line1.png"), this.f_97735_ + -64, this.f_97736_ + 131, 0.0F, 0.0F, 64, 32, 64, 32);
/*     */     
/*  86 */     guiGraphics.m_280163_(new ResourceLocation("thebrokenscript:textures/screens/line1.png"), this.f_97735_ + 251, this.f_97736_ + 3, 0.0F, 0.0F, 64, 32, 64, 32);
/*     */     
/*  88 */     guiGraphics.m_280163_(new ResourceLocation("thebrokenscript:textures/screens/line1.png"), this.f_97735_ + 251, this.f_97736_ + 132, 0.0F, 0.0F, 64, 32, 64, 32);
/*     */     
/*  90 */     RenderSystem.disableBlend();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7933_(int key, int b, int c) {
/*  95 */     if (key == 256) {
/*  96 */       this.f_96541_.f_91074_.m_6915_();
/*  97 */       return true;
/*     */     } 
/*  99 */     return super.m_7933_(key, b, c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_280003_(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/* 104 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.label_the_broken_script"), 42, 3, -12829636, false);
/* 105 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.label_v_19"), 214, 151, -12829636, false);
/* 106 */     guiGraphics.m_280614_(this.f_96547_, (Component)Component.m_237115_("gui.thebrokenscript.config.label_only_for_this_world"), 62, 12, -3407872, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7856_() {
/* 111 */     super.m_7856_();
/* 112 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 117 */       .button_save = Button.m_253074_((Component)Component.m_237115_("gui.thebrokenscript.config.button_save"), e -> { ThebrokenscriptMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(0, this.x, this.y, this.z)); ConfigButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z); }).m_252987_(this.f_97735_ + 97, this.f_97736_ + 169, 46, 20).m_253136_();
/* 118 */     guistate.put("button:button_save", this.button_save);
/* 119 */     m_142416_((GuiEventListener)this.button_save);
/* 120 */     this.checkbox1 = new Checkbox(this.f_97735_ + 7, this.f_97736_ + 25, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox1"), false);
/* 121 */     guistate.put("checkbox:checkbox1", this.checkbox1);
/* 122 */     m_142416_((GuiEventListener)this.checkbox1);
/* 123 */     this.checkbox2 = new Checkbox(this.f_97735_ + 7, this.f_97736_ + 52, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox2"), false);
/* 124 */     guistate.put("checkbox:checkbox2", this.checkbox2);
/* 125 */     m_142416_((GuiEventListener)this.checkbox2);
/* 126 */     this.checkbox3 = new Checkbox(this.f_97735_ + 7, this.f_97736_ + 79, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox3"), false);
/* 127 */     guistate.put("checkbox:checkbox3", this.checkbox3);
/* 128 */     m_142416_((GuiEventListener)this.checkbox3);
/* 129 */     this.checkbox4 = new Checkbox(this.f_97735_ + 7, this.f_97736_ + 106, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox4"), false);
/* 130 */     guistate.put("checkbox:checkbox4", this.checkbox4);
/* 131 */     m_142416_((GuiEventListener)this.checkbox4);
/* 132 */     this.checkbox5 = new Checkbox(this.f_97735_ + 7, this.f_97736_ + 133, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox5"), false);
/* 133 */     guistate.put("checkbox:checkbox5", this.checkbox5);
/* 134 */     m_142416_((GuiEventListener)this.checkbox5);
/* 135 */     this.checkbox6 = new Checkbox(this.f_97735_ + 142, this.f_97736_ + 25, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox6"), false);
/* 136 */     guistate.put("checkbox:checkbox6", this.checkbox6);
/* 137 */     m_142416_((GuiEventListener)this.checkbox6);
/* 138 */     this.checkbox7 = new Checkbox(this.f_97735_ + 142, this.f_97736_ + 52, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox7"), false);
/* 139 */     guistate.put("checkbox:checkbox7", this.checkbox7);
/* 140 */     m_142416_((GuiEventListener)this.checkbox7);
/* 141 */     this.checkbox8 = new Checkbox(this.f_97735_ + 142, this.f_97736_ + 79, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox8"), false);
/* 142 */     guistate.put("checkbox:checkbox8", this.checkbox8);
/* 143 */     m_142416_((GuiEventListener)this.checkbox8);
/* 144 */     this.checkbox9 = new Checkbox(this.f_97735_ + 142, this.f_97736_ + 106, 20, 20, (Component)Component.m_237115_("gui.thebrokenscript.config.checkbox9"), false);
/* 145 */     guistate.put("checkbox:checkbox9", this.checkbox9);
/* 146 */     m_142416_((GuiEventListener)this.checkbox9);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\gui\ConfigScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */