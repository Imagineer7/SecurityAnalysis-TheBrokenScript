/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.CommandEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class CommandExecutedByPlayerProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onCommand(CommandEvent event) {
/* 26 */     Entity entity = ((CommandSourceStack)event.getParseResults().getContext().getSource()).m_81373_();
/* 27 */     if (entity != null) {
/* 28 */       execute((Event)event, (LevelAccessor)entity.m_9236_(), entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), entity, event.getParseResults().getReader().getString());
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String command) {
/* 33 */     execute(null, world, x, y, z, entity, command);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String command) {
/* 37 */     if (entity == null || command == null)
/*    */       return; 
/* 39 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).devmodeenabled && 
/* 40 */       entity instanceof net.minecraft.world.entity.player.Player && 
/* 41 */       !command.equals("TBS_devmode") && !command.equals("TBS_config")) {
/* 42 */       if (event != null && event.isCancelable()) {
/* 43 */         event.setCanceled(true);
/* 44 */       } else if (event != null && event.hasResult()) {
/* 45 */         event.setResult(Event.Result.DENY);
/*    */       } 
/* 47 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 48 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @p {\"text\":\"You don't have permission to use this command.\",\"color\":\"red\"}"); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CommandExecutedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */