/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class DayBPlayerEntersDimensionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double z, Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).isfieldGenerated) {
/* 17 */       world.m_7731_(BlockPos.m_274561_(x, 100.0D, z), ((Block)ThebrokenscriptModBlocks.VOIDEXP_GENERATOR.get()).m_49966_(), 3);
/* 18 */       (ThebrokenscriptModVariables.MapVariables.get(world)).isfieldGenerated = true;
/* 19 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */     } 
/*    */     
/* 22 */     Entity _ent = entity;
/* 23 */     _ent.m_6021_(x, 103.0D, z);
/* 24 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 25 */       _serverPlayer.f_8906_.m_9774_(x, 103.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */     
/* 27 */     ThebrokenscriptMod.queueServerWork(30, () -> {
/*    */           Entity _ent = entity;
/*    */           _ent.m_6021_(x, 103.0D, z);
/*    */           if (_ent instanceof ServerPlayer) {
/*    */             ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*    */             _serverPlayer.f_8906_.m_9774_(x, 103.0D, z, _ent.m_146908_(), _ent.m_146909_());
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\DayBPlayerEntersDimensionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */