/*    */ package net.mcreator.interpritation;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.chunk.LevelChunk;
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
/*    */ public class ChunkManipulationEngine
/*    */ {
/*    */   public static void clearChunk(Level world, double x, double y, double z) {
/* 32 */     int chunkX = (int)x >> 4;
/* 33 */     int chunkZ = (int)z >> 4;
/*    */     
/* 35 */     LevelChunk chunk = world.m_6325_(chunkX, chunkZ);
/*    */     
/* 37 */     int startX = chunkX * 16;
/* 38 */     int startZ = chunkZ * 16;
/*    */     
/* 40 */     for (int blockX = startX; blockX < startX + 16; blockX++) {
/* 41 */       for (int blockZ = startZ; blockZ < startZ + 16; blockZ++) {
/* 42 */         for (int blockY = world.m_141937_(); blockY < world.m_151558_(); blockY++) {
/* 43 */           BlockPos blockPos = new BlockPos(blockX, blockY, blockZ);
/* 44 */           world.m_7731_(blockPos, Blocks.f_50016_.m_49966_(), 3);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\ChunkManipulationEngine.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */