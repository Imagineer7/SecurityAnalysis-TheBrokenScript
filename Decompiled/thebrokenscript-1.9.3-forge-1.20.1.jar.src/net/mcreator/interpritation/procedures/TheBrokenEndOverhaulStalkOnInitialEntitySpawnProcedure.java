/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.GameRules;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class TheBrokenEndOverhaulStalkOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     ((GameRules.BooleanValue)world.m_6106_().m_5470_().m_46170_(GameRules.f_46140_)).m_46246_(false, world.m_7654_());
/* 20 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 21 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "weather rain"); }
/* 22 */      ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */           if (!entity.m_9236_().m_5776_())
/*    */             entity.m_146870_(); 
/*    */           ((GameRules.BooleanValue)world.m_6106_().m_5470_().m_46170_(GameRules.f_46140_)).m_46246_(true, world.m_7654_());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheBrokenEndOverhaulStalkOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */