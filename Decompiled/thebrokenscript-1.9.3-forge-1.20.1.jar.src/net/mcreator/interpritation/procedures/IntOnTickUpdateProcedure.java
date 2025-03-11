/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class IntOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 11 */     if (world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60734_() != Blocks.f_50016_) {
/* 12 */       int horizontalRadiusSquare = 1;
/* 13 */       int verticalRadiusSquare = 1;
/* 14 */       int yIterationsSquare = verticalRadiusSquare;
/* 15 */       for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 16 */         for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 17 */           for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++)
/*    */           {
/* 19 */             world.m_7731_(BlockPos.m_274561_(x + xi, y + i, z + zi), ((Block)ThebrokenscriptModBlocks.DISRUPTION.get()).m_49966_(), 3);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 24 */     world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\IntOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */