/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class PhantomPlayerOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty() && 
/* 19 */       Math.random() < 1.0E-4D) {
/* 20 */       if (!entity.m_9236_().m_5776_())
/* 21 */         entity.m_146870_(); 
/* 22 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 23 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.HETZER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 24 */         if (entityToSpawn != null)
/* 25 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\PhantomPlayerOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */