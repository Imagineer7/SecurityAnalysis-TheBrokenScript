/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.entity.SiluetChaseEntity;
/*    */ import net.mcreator.interpritation.entity.SiluetStareEntity;
/*    */ import net.mcreator.interpritation.entity.TheBrokenEndEntity;
/*    */ import net.mcreator.interpritation.entity.TheBrokenEndStalkEntity;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.ServerChatEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class ChatcheckProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onChat(ServerChatEvent event) {
/* 27 */     execute((Event)event, (LevelAccessor)event.getPlayer().m_9236_(), event.getPlayer().m_20185_(), event.getPlayer().m_20186_(), event.getPlayer().m_20189_(), (Entity)event.getPlayer());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 31 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 35 */     if (entity == null)
/*    */       return; 
/* 37 */     if (!world.m_6443_(TheBrokenEndStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() || 
/* 38 */       !world.m_6443_(TheBrokenEndEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() || 
/* 39 */       !world.m_6443_(SiluetStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() || 
/* 40 */       !world.m_6443_(SiluetChaseEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 41 */       if (event != null && event.isCancelable()) {
/* 42 */         event.setCanceled(true);
/* 43 */       } else if (event != null && event.hasResult()) {
/* 44 */         event.setResult(Event.Result.DENY);
/*    */       } 
/* 46 */       if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.m_9236_().m_5776_())
/* 47 */           _player.m_5661_((Component)Component.m_237113_("IMPORT minecraft.chatengine"), true);  }
/* 48 */        ThebrokenscriptMod.queueServerWork(20, () -> {
/*    */             if (entity instanceof Player) {
/*    */               Player _player = (Player)entity;
/*    */               if (!_player.m_9236_().m_5776_())
/*    */                 _player.m_5661_((Component)Component.m_237113_("Unexpected_error.returnedvalue=-1"), true); 
/*    */             } 
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ChatcheckProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */