/*    */ package net.mcreator.interpritation.procedures;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class ItBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (Math.random() < 0.7D && 
/* 20 */       entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity; if (!_player.m_9236_().m_5776_()) {
/* 21 */         ResourceKey<Level> destinationType = Level.f_46428_;
/* 22 */         if (_player.m_9236_().m_46472_() == destinationType)
/*    */           return; 
/* 24 */         ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/* 25 */         if (nextLevel != null) {
/* 26 */           _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/* 27 */           _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/* 28 */           _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/* 29 */           for (MobEffectInstance _effectinstance : _player.m_21220_())
/* 30 */             _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/* 31 */           _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ItBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */