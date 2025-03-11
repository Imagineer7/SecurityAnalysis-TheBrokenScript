/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class RepsystemindevelopmentProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation == 0.0D && 
/* 16 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @p \"BAD\""); }
/*    */ 
/*    */     
/* 20 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation == 1.0D && 
/* 21 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 22 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @p \"NORMAL\""); }
/*    */ 
/*    */     
/* 25 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation == 2.0D && 
/* 26 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 27 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @p \"GOOD\""); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\RepsystemindevelopmentProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */