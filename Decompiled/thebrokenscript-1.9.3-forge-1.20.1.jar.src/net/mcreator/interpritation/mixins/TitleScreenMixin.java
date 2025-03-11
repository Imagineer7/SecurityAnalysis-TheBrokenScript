/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.client.gui.components.Button;
/*    */ import net.minecraft.client.gui.components.Renderable;
/*    */ import net.minecraft.client.gui.screens.TitleScreen;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({TitleScreen.class})
/*    */ public class TitleScreenMixin
/*    */ {
/*    */   @Inject(method = {"init"}, at = {@At("TAIL")})
/*    */   private void repositionSingleplayerButton(CallbackInfo ci) {
/* 16 */     TitleScreen screen = (TitleScreen)this;
/*    */     
/* 18 */     for (Renderable renderable : screen.f_169369_) {
/* 19 */       if (renderable instanceof Button) { Button button = (Button)renderable;
/* 20 */         if (button.m_6035_().getString().equals("Singleplayer")) {
/* 21 */           button.m_252865_(10);
/* 22 */           button.m_253211_(90);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\TitleScreenMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */