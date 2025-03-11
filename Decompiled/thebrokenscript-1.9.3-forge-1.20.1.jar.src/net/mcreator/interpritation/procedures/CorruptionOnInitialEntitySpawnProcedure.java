/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class CorruptionOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     double dig = 0.0D;
/* 13 */     if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 14 */       dig = y;
/* 15 */       for (int index0 = 0; index0 < 300; index0++) {
/* 16 */         dig--;
/* 17 */         world.m_7731_(BlockPos.m_274561_(x, dig, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       } 
/* 19 */       world.m_7731_(BlockPos.m_274561_(x + 1.0D, y, z), Blocks.f_50174_.m_49966_(), 3);
/* 20 */       world.m_7731_(BlockPos.m_274561_(x - 1.0D, y, z), Blocks.f_50174_.m_49966_(), 3);
/* 21 */       world.m_7731_(BlockPos.m_274561_(x, y, z + 1.0D), Blocks.f_50174_.m_49966_(), 3);
/* 22 */       world.m_7731_(BlockPos.m_274561_(x, y, z - 1.0D), Blocks.f_50174_.m_49966_(), 3);
/* 23 */       if (!entity.m_9236_().m_5776_()) {
/* 24 */         entity.m_146870_();
/*    */       }
/* 26 */     } else if (!entity.m_9236_().m_5776_()) {
/* 27 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CorruptionOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */