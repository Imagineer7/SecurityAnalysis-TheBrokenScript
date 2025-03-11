/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class AlreadyThereProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 23 */     execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), (Entity)event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 27 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 31 */     if (entity == null)
/*    */       return; 
/* 33 */     if (entity.m_5446_().getString().equals("xXram2dieXx") && 
/* 34 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p Player is already playing on this server."); }
/*    */ 
/*    */     
/* 38 */     if (entity.m_5446_().getString().equals("DyeXD412") && 
/* 39 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 40 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p Player is already playing on this server."); }
/*    */ 
/*    */     
/* 43 */     if (entity.m_5446_().getString().equals("null") && 
/* 44 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 45 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p Player is already playing on this server."); }
/*    */ 
/*    */     
/* 48 */     if (entity.m_5446_().getString().equals("Null") && 
/* 49 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 50 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p Player is already playing on this server."); }
/*    */ 
/*    */     
/* 53 */     if (entity.m_5446_().getString().equals("Integrity") && 
/* 54 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 55 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p I am watching you."); }
/*    */ 
/*    */     
/* 58 */     if (entity.m_5446_().getString().equals("Modrome") && 
/* 59 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 60 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p I am right behind you <o>"); }
/*    */ 
/*    */     
/* 63 */     if (entity.m_5446_().getString().equals("modrome") && 
/* 64 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 65 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p I am right behind you <o>"); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\AlreadyThereProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */