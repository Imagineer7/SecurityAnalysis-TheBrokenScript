/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SubAnomaly1OnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  9 */     if (entity == null)
/*    */       return; 
/* 11 */     if (!world.m_46861_(BlockPos.m_274561_(x, y, z)) && 
/* 12 */       !entity.m_9236_().m_5776_())
/* 13 */       entity.m_146870_(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SubAnomaly1OnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */