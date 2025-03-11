/*    */ package net.mcreator.interpritation.client.screens;
/*    */ 
/*    */ import com.mojang.blaze3d.platform.GlStateManager;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import net.mcreator.interpritation.procedures.Dots2DisplayOverlayIngameProcedure;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import net.minecraft.client.renderer.GameRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.RenderGuiEvent;
/*    */ import net.minecraftforge.eventbus.api.EventPriority;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ public class Dots2Overlay
/*    */ {
/*    */   @SubscribeEvent(priority = EventPriority.HIGHEST)
/*    */   public static void eventHandler(RenderGuiEvent.Pre event) {
/* 27 */     int w = event.getWindow().m_85445_();
/* 28 */     int h = event.getWindow().m_85446_();
/* 29 */     Level world = null;
/* 30 */     double x = 0.0D;
/* 31 */     double y = 0.0D;
/* 32 */     double z = 0.0D;
/* 33 */     LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/* 34 */     if (localPlayer != null) {
/* 35 */       world = localPlayer.m_9236_();
/* 36 */       x = localPlayer.m_20185_();
/* 37 */       y = localPlayer.m_20186_();
/* 38 */       z = localPlayer.m_20189_();
/*    */     } 
/* 40 */     RenderSystem.disableDepthTest();
/* 41 */     RenderSystem.depthMask(false);
/* 42 */     RenderSystem.enableBlend();
/* 43 */     RenderSystem.setShader(GameRenderer::m_172817_);
/* 44 */     RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
/* 45 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 46 */     if (Dots2DisplayOverlayIngameProcedure.execute((LevelAccessor)world, x, y, z)) {
/* 47 */       event.getGuiGraphics().m_280163_(new ResourceLocation("thebrokenscript:textures/screens/dotscreenframe2.png"), 0, 0, 0.0F, 0.0F, w, h, w, h);
/*    */     }
/* 49 */     RenderSystem.depthMask(true);
/* 50 */     RenderSystem.defaultBlendFunc();
/* 51 */     RenderSystem.enableDepthTest();
/* 52 */     RenderSystem.disableBlend();
/* 53 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\screens\Dots2Overlay.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */