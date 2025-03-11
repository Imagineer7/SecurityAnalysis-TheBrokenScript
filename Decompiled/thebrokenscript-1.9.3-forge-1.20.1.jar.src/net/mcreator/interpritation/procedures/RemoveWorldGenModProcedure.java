/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.ModList;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class RemoveWorldGenModProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onWorldTick(TickEvent.LevelTickEvent event) {
/* 18 */     if (event.phase == TickEvent.Phase.END) {
/* 19 */       execute((Event)event, (LevelAccessor)event.level);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world) {
/* 24 */     execute(null, world);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world) {
/* 28 */     if (ModList.get().isLoaded("biomesoplenety") && 
/* 29 */       !world.m_5776_() && world.m_7654_() != null) {
/* 30 */       world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_("TBS ERROR: REMOVE WORLD GEN MODS!"), false);
/*    */     }
/* 32 */     if (ModList.get().isLoaded("terralith") && 
/* 33 */       !world.m_5776_() && world.m_7654_() != null)
/* 34 */       world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_("TBS ERROR: REMOVE WORLD GEN MODS!"), false); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\RemoveWorldGenModProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */