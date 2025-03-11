/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class StareOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     ThebrokenscriptMod.queueServerWork(3, () -> {
/*    */           if (!entity.m_9236_().m_5776_())
/*    */             entity.m_146870_(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\StareOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */