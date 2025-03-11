/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class NullWatchingEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
/* 15 */     if (damagesource == null || entity == null)
/*    */       return; 
/* 17 */     if (damagesource.m_276093_(DamageTypes.f_268739_)) {
/* 18 */       if (!entity.m_9236_().m_5776_())
/* 19 */         entity.m_146870_(); 
/* 20 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 21 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULLL.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 22 */         if (entityToSpawn != null)
/* 23 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullWatchingEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */