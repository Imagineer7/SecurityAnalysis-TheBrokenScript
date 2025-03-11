/*    */ package net.mcreator.interpritation.client.screens;
/*    */ 
/*    */ import com.mojang.blaze3d.platform.GlStateManager;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import net.mcreator.interpritation.procedures.CheckifnullishereProcedure;
/*    */ import net.mcreator.interpritation.procedures.ReturnPlayerNameProcedure;
/*    */ import net.mcreator.interpritation.procedures.TabshowProcedure;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import net.minecraft.client.renderer.GameRenderer;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
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
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ public class TabbOverlay
/*    */ {
/*    */   @SubscribeEvent(priority = EventPriority.HIGH)
/*    */   public static void eventHandler(RenderGuiEvent.Pre event) {
/* 30 */     int w = event.getWindow().m_85445_();
/* 31 */     int h = event.getWindow().m_85446_();
/* 32 */     Level world = null;
/* 33 */     double x = 0.0D;
/* 34 */     double y = 0.0D;
/* 35 */     double z = 0.0D;
/* 36 */     LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/* 37 */     if (localPlayer != null) {
/* 38 */       world = localPlayer.m_9236_();
/* 39 */       x = localPlayer.m_20185_();
/* 40 */       y = localPlayer.m_20186_();
/* 41 */       z = localPlayer.m_20189_();
/*    */     } 
/* 43 */     RenderSystem.disableDepthTest();
/* 44 */     RenderSystem.depthMask(false);
/* 45 */     RenderSystem.enableBlend();
/* 46 */     RenderSystem.setShader(GameRenderer::m_172817_);
/* 47 */     RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
/* 48 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 49 */     if (TabshowProcedure.execute((Entity)localPlayer)) {
/* 50 */       event.getGuiGraphics().m_280163_(new ResourceLocation("thebrokenscript:textures/screens/taboverhaul.png"), w / 2 + -45, h / 2 + -118, 0.0F, 0.0F, 100, 16, 100, 16);
/*    */       
/* 52 */       if (CheckifnullishereProcedure.execute((LevelAccessor)world)) {
/* 53 */         event.getGuiGraphics().m_280163_(new ResourceLocation("thebrokenscript:textures/screens/taboverhaul.png"), w / 2 + -45, h / 2 + -104, 0.0F, 0.0F, 100, 16, 100, 16);
/*    */       }
/* 55 */       event.getGuiGraphics().m_280056_((Minecraft.m_91087_()).f_91062_, 
/*    */           
/* 57 */           ReturnPlayerNameProcedure.execute((Entity)localPlayer), w / 2 + -42, h / 2 + -115, -1, false);
/* 58 */       if (CheckifnullishereProcedure.execute((LevelAccessor)world))
/* 59 */         event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.tabb.label_null"), w / 2 + -42, h / 2 + -102, -1, false); 
/*    */     } 
/* 61 */     RenderSystem.depthMask(true);
/* 62 */     RenderSystem.defaultBlendFunc();
/* 63 */     RenderSystem.enableDepthTest();
/* 64 */     RenderSystem.disableBlend();
/* 65 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\screens\TabbOverlay.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */