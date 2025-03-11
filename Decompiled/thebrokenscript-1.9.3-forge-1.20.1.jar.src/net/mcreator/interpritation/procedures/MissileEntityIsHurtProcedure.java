/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class MissileEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  9 */     if (entity == null)
/*    */       return; 
/* 11 */     if (!entity.m_9236_().m_5776_())
/* 12 */       entity.m_146870_(); 
/* 13 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 14 */         _level.m_254849_(null, x, y, z, 5.0F, Level.ExplosionInteraction.TNT);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\MissileEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */