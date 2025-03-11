/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class OldblockBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 16 */     ThebrokenscriptMod.queueServerWork(Mth.m_216271_(RandomSource.m_216327_(), 200, 500), () -> {
/*    */           if (world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JUMPOSCOROOO.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */             if (entityToSpawn != null)
/*    */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\OldblockBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */