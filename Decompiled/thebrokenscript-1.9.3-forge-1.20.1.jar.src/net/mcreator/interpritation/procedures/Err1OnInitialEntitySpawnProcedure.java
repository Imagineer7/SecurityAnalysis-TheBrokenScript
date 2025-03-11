/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class Err1OnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     if (!world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 14 */       if (!entity.m_9236_().m_5776_())
/* 15 */         entity.m_146870_(); 
/* 16 */       ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */             if (!entity.m_9236_().m_5776_())
/*    */               entity.m_146870_(); 
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\Err1OnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */