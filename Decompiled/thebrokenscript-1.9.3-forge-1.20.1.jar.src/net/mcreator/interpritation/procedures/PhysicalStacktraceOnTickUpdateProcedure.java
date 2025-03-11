/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class PhysicalStacktraceOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 11 */     double dig = 0.0D;
/* 12 */     if (Math.random() < 0.8D) {
/* 13 */       if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, y, z)).m_60815_()) {
/* 14 */         world.m_7731_(BlockPos.m_274561_(x + 1.0D, y, z), ((Block)ThebrokenscriptModBlocks.PHYSICAL_STACKTRACE.get()).m_49966_(), 3);
/*    */       }
/* 16 */       if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, y, z)).m_60815_()) {
/* 17 */         world.m_7731_(BlockPos.m_274561_(x - 1.0D, y, z), ((Block)ThebrokenscriptModBlocks.PHYSICAL_STACKTRACE.get()).m_49966_(), 3);
/*    */       }
/* 19 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z + 1.0D)).m_60815_()) {
/* 20 */         world.m_7731_(BlockPos.m_274561_(x, y, z + 1.0D), ((Block)ThebrokenscriptModBlocks.PHYSICAL_STACKTRACE.get()).m_49966_(), 3);
/*    */       }
/* 22 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z - 1.0D)).m_60815_()) {
/* 23 */         world.m_7731_(BlockPos.m_274561_(x, y, z - 1.0D), ((Block)ThebrokenscriptModBlocks.PHYSICAL_STACKTRACE.get()).m_49966_(), 3);
/*    */       }
/* 25 */       dig = y;
/* 26 */       for (int index0 = 0; index0 < 300; index0++) {
/* 27 */         dig--;
/* 28 */         world.m_7731_(BlockPos.m_274561_(x, dig, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       } 
/* 30 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\PhysicalStacktraceOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */