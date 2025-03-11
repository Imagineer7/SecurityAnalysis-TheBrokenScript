/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
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
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class PlayerJoinsProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 26 */     execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), (Entity)event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 30 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 34 */     if (entity == null)
/*    */       return; 
/* 36 */     if (world.m_6907_().size() == 1 && 
/* 37 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 38 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a [\"\",{\"selector\":\"@p\",\"color\":\"yellow\"},{\"text\":\" joined the game\",\"color\":\"yellow\"}]"); }
/*    */ 
/*    */     
/* 41 */     if (world.m_5776_() && entity instanceof net.minecraft.world.entity.player.Player)
/* 42 */       (Minecraft.m_91087_()).f_91063_.m_109128_(new ResourceLocation("thebrokenscript:consciousness/shaders.json")); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\PlayerJoinsProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */