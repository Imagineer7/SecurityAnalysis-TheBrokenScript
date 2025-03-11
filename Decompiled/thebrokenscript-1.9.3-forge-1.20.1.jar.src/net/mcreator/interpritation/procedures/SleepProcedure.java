/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class SleepProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerInBed(PlayerSleepInBedEvent event) {
/* 18 */     execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 22 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 26 */     (ThebrokenscriptModVariables.MapVariables.get(world)).homeX = x;
/* 27 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 28 */     (ThebrokenscriptModVariables.MapVariables.get(world)).homeY = y;
/* 29 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 30 */     (ThebrokenscriptModVariables.MapVariables.get(world)).homeZ = z;
/* 31 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 32 */     (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = false;
/* 33 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SleepProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */