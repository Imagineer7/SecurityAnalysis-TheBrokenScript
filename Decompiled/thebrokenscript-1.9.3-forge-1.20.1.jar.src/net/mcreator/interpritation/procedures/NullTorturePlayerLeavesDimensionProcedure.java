/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class NullTorturePlayerLeavesDimensionProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 11 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 14 */     Entity _ent = entity;
/* 15 */     _ent.m_6021_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ);
/* 16 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 17 */       _serverPlayer.f_8906_.m_9774_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ, _ent.m_146908_(), _ent
/* 18 */           .m_146909_()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullTorturePlayerLeavesDimensionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */