/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class ShadowBugOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty())
/* 13 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ShadowBugOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */