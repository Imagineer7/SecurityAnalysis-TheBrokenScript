/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.minecraft.client.gui.screens.MenuScreens;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ThebrokenscriptModScreens
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void clientLoad(FMLClientSetupEvent event) {
/* 27 */     event.enqueueWork(() -> {
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.NULLINTERFACE.get(), net.mcreator.interpritation.client.gui.NullinterfaceScreen::new);
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.NULL_INTERFACE_2.get(), net.mcreator.interpritation.client.gui.NullInterface2Screen::new);
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.NULLINTERFACE_3.get(), net.mcreator.interpritation.client.gui.Nullinterface3Screen::new);
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.NULLED_GUI.get(), net.mcreator.interpritation.client.gui.NulledGuiScreen::new);
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.TAB.get(), net.mcreator.interpritation.client.gui.TabScreen::new);
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.PC_GUI.get(), net.mcreator.interpritation.client.gui.PcGuiScreen::new);
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.CONFIG.get(), net.mcreator.interpritation.client.gui.ConfigScreen::new);
/*    */           MenuScreens.m_96206_((MenuType)ThebrokenscriptModMenus.DEV_PASS.get(), net.mcreator.interpritation.client.gui.DevPassScreen::new);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModScreens.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */