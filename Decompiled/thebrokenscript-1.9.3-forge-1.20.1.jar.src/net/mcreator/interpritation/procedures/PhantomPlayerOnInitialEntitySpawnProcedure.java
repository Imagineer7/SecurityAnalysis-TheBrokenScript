/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class PhantomPlayerOnInitialEntitySpawnProcedure {
/*    */   public static void execute(double x, double z, Entity entity) {
/*  8 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 11 */     Entity _ent = entity;
/* 12 */     _ent.m_6021_(x, 100.0D, z);
/* 13 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 14 */       _serverPlayer.f_8906_.m_9774_(x, 100.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\PhantomPlayerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */