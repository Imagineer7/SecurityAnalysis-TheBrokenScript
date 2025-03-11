/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class CurvedOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (world instanceof Level) { Level _level = (Level)world;
/* 16 */       if (!_level.m_5776_()) {
/* 17 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       } else {
/* 19 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       }  }
/*    */     
/* 22 */     int horizontalRadiusSquare = 2;
/* 23 */     int verticalRadiusSquare = 2;
/* 24 */     int yIterationsSquare = verticalRadiusSquare;
/* 25 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 26 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 27 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*    */           
/* 29 */           if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*    */             
/* 31 */             BlockPos _pos = BlockPos.m_274561_(x + xi, y + i, z + zi);
/* 32 */             Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y, z), null);
/* 33 */             world.m_46961_(_pos, false);
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CurvedOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */