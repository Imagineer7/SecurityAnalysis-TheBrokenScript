/*    */ package net.mcreator.interpritation;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RandomSafeTeleport
/*    */ {
/*    */   public static void teleport(Entity entity) {
/* 34 */     Level world = entity.m_9236_();
/* 35 */     Random random = new Random();
/* 36 */     BlockPos originalPos = entity.m_20183_();
/*    */     
/* 38 */     for (int i = 0; i < 10; i++) {
/* 39 */       int x = originalPos.m_123341_() + random.nextInt(21) - 10;
/* 40 */       int z = originalPos.m_123343_() + random.nextInt(21) - 10;
/* 41 */       int y = world.m_141928_();
/*    */       
/* 43 */       BlockPos newPos = new BlockPos(x, y, z);
/*    */       
/* 45 */       if (isSafeLocation(world, newPos)) {
/* 46 */         entity.m_6021_(x + 0.5D, y, z + 0.5D);
/*    */         break;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private static boolean isSafeLocation(Level world, BlockPos pos) {
/* 53 */     return (world.m_8055_(pos.m_7495_()).m_280296_() && world
/* 54 */       .m_8055_(pos).m_60795_() && world
/* 55 */       .m_8055_(pos.m_7494_()).m_60795_() && world
/* 56 */       .m_8055_(pos.m_7495_()).m_60734_() != Blocks.f_49990_ && world
/* 57 */       .m_8055_(pos.m_7495_()).m_60734_() != Blocks.f_49991_);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\RandomSafeTeleport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */