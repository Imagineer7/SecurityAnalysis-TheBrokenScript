/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class MazeShadowsNaturalEntitySpawningConditionProcedure {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     boolean found = false;
/* 10 */     double sx = 0.0D;
/* 11 */     double sy = 0.0D;
/* 12 */     double sz = 0.0D;
/* 13 */     sx = -3.0D;
/* 14 */     found = false;
/* 15 */     for (int index0 = 0; index0 < 6; index0++) {
/* 16 */       sy = -3.0D;
/* 17 */       for (int index1 = 0; index1 < 6; index1++) {
/* 18 */         sz = -3.0D;
/* 19 */         for (int index2 = 0; index2 < 6; index2++) {
/* 20 */           if (world.m_8055_(BlockPos.m_274561_(x + sx, y + sy, z + sz)).m_60734_() == Blocks.f_50752_) {
/* 21 */             found = true;
/*    */           }
/* 23 */           sz++;
/*    */         } 
/* 25 */         sy++;
/*    */       } 
/* 27 */       sx++;
/*    */     } 
/* 29 */     if (found == true) {
/* 30 */       return true;
/*    */     }
/* 32 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\MazeShadowsNaturalEntitySpawningConditionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */