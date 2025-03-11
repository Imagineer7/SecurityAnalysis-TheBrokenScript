/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class CircuitDeathTimeIsReachedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 14 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT_STALK.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 15 */       if (entityToSpawn != null) {
/* 16 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */       } }
/*    */     
/* 19 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 20 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT_STALK.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 21 */       if (entityToSpawn != null) {
/* 22 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */       } }
/*    */     
/* 25 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 26 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT_STALK.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 27 */       if (entityToSpawn != null)
/* 28 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitDeathTimeIsReachedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */