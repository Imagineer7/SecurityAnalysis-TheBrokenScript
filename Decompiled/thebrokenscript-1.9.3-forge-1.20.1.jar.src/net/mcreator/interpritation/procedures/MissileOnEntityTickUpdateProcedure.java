/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class MissileOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60734_() != Blocks.f_50016_) {
/* 14 */       if (!entity.m_9236_().m_5776_())
/* 15 */         entity.m_146870_(); 
/* 16 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 17 */           _level.m_254849_(null, x, y, z, 5.0F, Level.ExplosionInteraction.TNT);  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\MissileOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */