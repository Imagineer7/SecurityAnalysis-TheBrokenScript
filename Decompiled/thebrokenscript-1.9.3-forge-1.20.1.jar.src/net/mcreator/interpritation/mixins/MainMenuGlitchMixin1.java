/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.client.gui.screens.TitleScreen;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({TitleScreen.class})
/*    */ public class MainMenuGlitchMixin1
/*    */ {
/* 16 */   private static final ResourceLocation MINECRAFT_LOGO = new ResourceLocation("textures/gui/title/minecraft.png");
/*    */ 
/*    */   
/*    */   @Inject(method = {"render"}, at = {@At("HEAD")})
/*    */   private void repositionMinecraftLogo(GuiGraphics graphics, int mouseX, int mouseY, float delta, CallbackInfo ci) {
/* 21 */     int logoX = 100;
/* 22 */     int logoY = 10;
/* 23 */     int width = 256;
/* 24 */     int height = 44;
/*    */ 
/*    */     
/* 27 */     graphics.m_280163_(MINECRAFT_LOGO, logoX, logoY, 50.0F, 10.0F, width, height, width, height);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\MainMenuGlitchMixin1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */