/*    */ package net.mcreator.interpritation.client.screens;
/*    */ 
/*    */ import com.mojang.blaze3d.platform.GlStateManager;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import net.minecraft.client.renderer.GameRenderer;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.ScreenEvent;
/*    */ import net.minecraftforge.eventbus.api.EventPriority;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ public class MultiplayerWarningOverlay
/*    */ {
/*    */   @SubscribeEvent(priority = EventPriority.HIGHEST)
/*    */   public static void eventHandler(ScreenEvent.Render.Post event) {
/* 27 */     if (event.getScreen() instanceof net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen) {
/* 28 */       int w = (event.getScreen()).f_96543_;
/* 29 */       int h = (event.getScreen()).f_96544_;
/* 30 */       Level world = null;
/* 31 */       double x = 0.0D;
/* 32 */       double y = 0.0D;
/* 33 */       double z = 0.0D;
/* 34 */       LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/* 35 */       if (localPlayer != null) {
/* 36 */         world = localPlayer.m_9236_();
/* 37 */         x = localPlayer.m_20185_();
/* 38 */         y = localPlayer.m_20186_();
/* 39 */         z = localPlayer.m_20189_();
/*    */       } 
/* 41 */       RenderSystem.disableDepthTest();
/* 42 */       RenderSystem.depthMask(false);
/* 43 */       RenderSystem.enableBlend();
/* 44 */       RenderSystem.setShader(GameRenderer::m_172817_);
/* 45 */       RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
/* 46 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*    */       
/* 48 */       event.getGuiGraphics().m_280163_(new ResourceLocation("thebrokenscript:textures/screens/achtung.png"), w / 2 + 99, h / 2 + -76, 0.0F, 0.0F, 32, 32, 32, 32);
/*    */       
/* 50 */       event.getGuiGraphics().m_280163_(new ResourceLocation("thebrokenscript:textures/screens/achtung.png"), w / 2 + -108, h / 2 + -76, 0.0F, 0.0F, 32, 32, 32, 32);
/*    */       
/* 52 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_warning"), w / 2 + -18, h / 2 + -112, -52429, false);
/* 53 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_multiplayer_is_not_supported"), w / 2 + -72, h / 2 + -103, -1, false);
/* 54 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_you_will_encounter_bugs_and_non"), w / 2 + -126, h / 2 + -94, -1, false);
/* 55 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_possible_bugs"), w / 2 + -36, h / 2 + -76, -1, false);
/* 56 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_event_engine_breaking"), w / 2 + -63, h / 2 + -67, -1, false);
/* 57 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_random_world_corruptions"), w / 2 + -63, h / 2 + -58, -1, false);
/* 58 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_lots_of_lag"), w / 2 + -63, h / 2 + -49, -1, false);
/* 59 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_client_side_events_breaking"), w / 2 + -63, h / 2 + -40, -1, false);
/* 60 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_log4shell_events_breaking"), w / 2 + -63, h / 2 + -31, -1, false);
/* 61 */       event.getGuiGraphics().m_280614_((Minecraft.m_91087_()).f_91062_, (Component)Component.m_237115_("gui.thebrokenscript.multiplayer_warning.label_null_does_not_approve"), w / 2 + -63, h / 2 + -13, -16776961, false);
/*    */       
/* 63 */       RenderSystem.depthMask(true);
/* 64 */       RenderSystem.defaultBlendFunc();
/* 65 */       RenderSystem.enableDepthTest();
/* 66 */       RenderSystem.disableBlend();
/* 67 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\screens\MultiplayerWarningOverlay.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */