/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class EventCamera1Procedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     ThebrokenscriptMod.queueServerWork(1, () -> {
/*    */           entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 1.0F);
/*    */           entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/*    */           ThebrokenscriptMod.queueServerWork(5, ());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\EventCamera1Procedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */