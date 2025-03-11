/*    */ package net.mcreator.interpritation;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import net.minecraft.client.gui.components.AbstractWidget;
/*    */ import net.minecraft.client.resources.language.I18n;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.ScreenEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, value = {Dist.CLIENT})
/*    */ public class ExitDissable {
/*    */   @SubscribeEvent
/*    */   public static void onGuiInit(ScreenEvent.Init.Post event) {
/* 17 */     if (event.getScreen() instanceof net.minecraft.client.gui.screens.TitleScreen) {
/*    */       
/* 19 */       Objects.requireNonNull(AbstractWidget.class);
/* 20 */       Objects.requireNonNull(AbstractWidget.class);
/* 21 */       List<AbstractWidget> widgets = event.getScreen().m_6702_().stream().filter(AbstractWidget.class::isInstance).map(AbstractWidget.class::cast).toList();
/*    */       
/* 23 */       for (AbstractWidget button : widgets) {
/* 24 */         if (button.m_6035_().getString().equals(I18n.m_118938_("menu.quit", new Object[0])))
/* 25 */           button.f_93623_ = false; 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\ExitDissable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */