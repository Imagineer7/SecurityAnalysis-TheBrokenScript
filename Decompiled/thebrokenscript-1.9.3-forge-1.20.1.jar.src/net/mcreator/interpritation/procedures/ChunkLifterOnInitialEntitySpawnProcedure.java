/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.entity.BlockEntity;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.chunk.LevelChunk;
/*    */ 
/*    */ public class ChunkLifterOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Level world, double x, double y, double z) {
/* 13 */     if (world instanceof ServerLevel) { ServerLevel serverLevel = (ServerLevel)world;
/*    */       
/* 15 */       int chunkX = (int)x >> 4;
/* 16 */       int chunkZ = (int)z >> 4;
/*    */       
/* 18 */       moveChunkUp(serverLevel, chunkX, chunkZ, 100); }
/*    */   
/*    */   }
/*    */   
/*    */   private static void moveChunkUp(ServerLevel world, int chunkX, int chunkZ, int offsetY) {
/* 23 */     LevelChunk chunk = world.m_6325_(chunkX, chunkZ);
/*    */     
/* 25 */     for (int x = 0; x < 16; x++) {
/* 26 */       for (int z = 0; z < 16; z++) {
/* 27 */         for (int y = world.m_141937_(); y < world.m_151558_(); y++) {
/* 28 */           BlockPos oldPos = new BlockPos(chunkX * 16 + x, y, chunkZ * 16 + z);
/* 29 */           BlockPos newPos = oldPos.m_6630_(offsetY);
/*    */           
/* 31 */           BlockState oldState = world.m_8055_(oldPos);
/* 32 */           BlockEntity oldTile = world.m_7702_(oldPos);
/*    */ 
/*    */           
/* 35 */           world.m_7731_(newPos, oldState, 3);
/*    */ 
/*    */           
/* 38 */           if (oldTile != null) {
/* 39 */             BlockEntity newTile = world.m_7702_(newPos);
/* 40 */             if (newTile != null) {
/* 41 */               newTile.m_142466_(oldTile.m_187480_());
/* 42 */               newTile.m_6596_();
/*    */             } 
/*    */           } 
/*    */ 
/*    */           
/* 47 */           world.m_7731_(oldPos, Blocks.f_50016_.m_49966_(), 3);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ChunkLifterOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */