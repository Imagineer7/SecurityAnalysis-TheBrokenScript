/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class JumposcoroooPriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_1ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 18 */       if (entityToSpawn != null) {
/* 19 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */       } }
/*    */     
/* 22 */     ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */           if (world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_2ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */             if (entityToSpawn != null)
/*    */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*    */           } 
/*    */           ThebrokenscriptMod.queueServerWork(5, ());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\JumposcoroooPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */