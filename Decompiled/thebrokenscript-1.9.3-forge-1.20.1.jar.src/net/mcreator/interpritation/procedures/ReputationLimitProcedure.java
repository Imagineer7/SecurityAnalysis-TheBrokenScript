/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class ReputationLimitProcedure
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
/* 28 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation < 0.0D) {
/* 29 */       (ThebrokenscriptModVariables.MapVariables.get(world)).reputation = 0.0D;
/* 30 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */     } 
/* 32 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation > 2.0D) {
/* 33 */       (ThebrokenscriptModVariables.MapVariables.get(world)).reputation = 2.0D;
/* 34 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ReputationLimitProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */