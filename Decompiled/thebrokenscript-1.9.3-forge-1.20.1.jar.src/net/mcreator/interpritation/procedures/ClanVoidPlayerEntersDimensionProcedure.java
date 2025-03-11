/*    */ package net.mcreator.interpritation.procedures;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
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
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class ClanVoidPlayerEntersDimensionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double z, Entity entity) {
/* 22 */     if (entity == null)
/*    */       return; 
/* 24 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).clanbuilddimensiongenerated) {
/* 25 */       (ThebrokenscriptModVariables.MapVariables.get(world)).clanbuilddimensiongenerated = true;
/* 26 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 27 */       world.m_7731_(BlockPos.m_274561_(x, 200.0D, z), ((Block)ThebrokenscriptModBlocks.CLANBUILD_ANOMALY_GENERATOR.get()).m_49966_(), 3);
/*    */     } 
/* 29 */     ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */           if (entity instanceof ServerPlayer) {
/*    */             ServerPlayer _player = (ServerPlayer)entity; if (!_player.m_9236_().m_5776_()) {
/*    */               ResourceKey<Level> destinationType = Level.f_46428_; if (_player.m_9236_().m_46472_() == destinationType)
/*    */                 return;  ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/*    */               if (nextLevel != null) {
/*    */                 _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/*    */                 _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/*    */                 _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/*    */                 for (MobEffectInstance _effectinstance : _player.m_21220_())
/*    */                   _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/*    */                 _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*    */               } 
/*    */             } 
/*    */           } 
/*    */         });
/* 45 */     ThebrokenscriptMod.queueServerWork(20, () -> {
/*    */           Entity _ent = entity;
/*    */           _ent.m_6021_(x, 205.0D, z);
/*    */           if (_ent instanceof ServerPlayer) {
/*    */             ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*    */             _serverPlayer.f_8906_.m_9774_(x, 205.0D, z, _ent.m_146908_(), _ent.m_146909_());
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ClanVoidPlayerEntersDimensionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */