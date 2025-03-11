/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.CantYouSeeEntity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class CantYouSeeOverlayDisplayOverlayIngameProcedure
/*    */ {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/* 11 */     if (!world.m_6443_(CantYouSeeEntity.class, AABB.m_165882_(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty()) {
/* 12 */       return true;
/*    */     }
/* 14 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CantYouSeeOverlayDisplayOverlayIngameProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */