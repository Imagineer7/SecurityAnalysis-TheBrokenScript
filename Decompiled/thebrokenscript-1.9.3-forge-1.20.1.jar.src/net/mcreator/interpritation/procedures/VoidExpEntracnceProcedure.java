/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class VoidExpEntracnceProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 32 */     if (event.phase == TickEvent.Phase.END) {
/* 33 */       execute((Event)event, event.player.m_20186_(), (Entity)event.player);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(double y, Entity entity) {
/* 38 */     execute(null, y, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, double y, Entity entity) {
/* 42 */     if (entity == null)
/*    */       return; 
/* 44 */     if (y == -80.0D) {
/* 45 */       if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.m_9236_().m_5776_())
/* 46 */           _player.m_5661_((Component)Component.m_237113_("ERR.INTEGRITY"), true);  }
/* 47 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 48 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19591_, 40, 1, false, false));  }
/* 49 */        if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity; if (!_player.m_9236_().m_5776_()) {
/* 50 */           ResourceKey<Level> destinationType = ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:day_b"));
/* 51 */           if (_player.m_9236_().m_46472_() == destinationType)
/*    */             return; 
/* 53 */           ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/* 54 */           if (nextLevel != null) {
/* 55 */             _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/* 56 */             _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/* 57 */             _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/* 58 */             for (MobEffectInstance _effectinstance : _player.m_21220_())
/* 59 */               _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/* 60 */             _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*    */           } 
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\VoidExpEntracnceProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */