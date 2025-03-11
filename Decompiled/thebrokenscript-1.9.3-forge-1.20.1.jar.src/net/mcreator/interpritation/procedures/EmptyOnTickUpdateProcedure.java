/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class EmptyOnTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (x == 0.0D && 
/* 15 */       y == 0.0D && 
/* 16 */       z == 0.0D) {
/* 17 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/*    */ 
/*    */     
/* 21 */     world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 22 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 23 */       _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.EYES.get(), x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 24 */      if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 25 */         _level.m_254849_(null, x, y, z, 4.0F, Level.ExplosionInteraction.TNT);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\EmptyOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */