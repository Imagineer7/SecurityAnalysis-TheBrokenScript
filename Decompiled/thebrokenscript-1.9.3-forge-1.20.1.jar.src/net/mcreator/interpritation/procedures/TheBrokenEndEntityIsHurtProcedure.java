/*    */ package net.mcreator.interpritation.procedures;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TheBrokenEndEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, Entity sourceentity) {
/* 11 */     if (sourceentity == null)
/*    */       return; 
/* 13 */     sourceentity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268464_)), 10.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheBrokenEndEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */