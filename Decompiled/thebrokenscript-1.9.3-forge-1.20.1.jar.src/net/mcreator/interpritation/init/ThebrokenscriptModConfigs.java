/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.configuration.EventEngineOftenConfiguration;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.ModLoadingContext;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.config.IConfigSpec;
/*    */ import net.minecraftforge.fml.config.ModConfig;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
/*    */ 
/*    */ @EventBusSubscriber(modid = "thebrokenscript", bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ThebrokenscriptModConfigs {
/*    */   @SubscribeEvent
/*    */   public static void register(FMLConstructModEvent event) {
/* 16 */     event.enqueueWork(() -> ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, (IConfigSpec)EventEngineOftenConfiguration.SPEC, "EVENT CHANCE PER TICK.toml"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModConfigs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */