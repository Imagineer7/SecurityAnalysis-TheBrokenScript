/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class CaveNullFollowProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 22 */     if (event.phase == TickEvent.Phase.END) {
/* 23 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_());
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 28 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 32 */     if (y < 40.0D && 
/* 33 */       world.m_8055_(BlockPos.m_274561_(x, y + 2.0D, z)).m_60815_() && 
/* 34 */       world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60815_() && 
/* 35 */       Math.random() < 3.0E-5D && 
/* 36 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 37 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_MINING.get()).m_262496_(_level, BlockPos.m_274561_(x + 10.0D, y, z + 5.0D), MobSpawnType.MOB_SUMMONED);
/* 38 */       if (entityToSpawn != null)
/* 39 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CaveNullFollowProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */