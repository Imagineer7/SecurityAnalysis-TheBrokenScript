/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.RandomSafeTeleport;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class NullBaseInvadeOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     int horizontalRadiusSquare = 3;
/* 15 */     int verticalRadiusSquare = 3;
/* 16 */     int yIterationsSquare = verticalRadiusSquare;
/* 17 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 18 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 19 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*    */           
/* 21 */           if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_60734_() == Blocks.f_49990_ || world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_60734_() == Blocks.f_49990_) {
/* 22 */             world.m_7731_(BlockPos.m_274561_(x + xi, y + i, z + zi), Blocks.f_50652_.m_49966_(), 3);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 27 */     if (entity.m_20184_().m_7096_() <= 0.0D) {
/* 28 */       if (entity.m_20184_().m_7098_() <= 0.0D) {
/* 29 */         if (entity.m_20184_().m_7094_() <= 0.0D) {
/* 30 */           entity.getPersistentData().m_128347_("timerstuck", entity.getPersistentData().m_128459_("timerstuck") + 1.0D);
/* 31 */           if (entity.getPersistentData().m_128459_("timerstuck") > 10.0D) {
/* 32 */             entity.getPersistentData().m_128347_("timerstuck", 0.0D);
/* 33 */             RandomSafeTeleport.teleport(entity);
/*    */           } 
/*    */         } else {
/* 36 */           entity.getPersistentData().m_128347_("timerstuck", 0.0D);
/*    */         } 
/*    */       } else {
/* 39 */         entity.getPersistentData().m_128347_("timerstuck", 0.0D);
/*    */       } 
/*    */     } else {
/* 42 */       entity.getPersistentData().m_128347_("timerstuck", 0.0D);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullBaseInvadeOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */