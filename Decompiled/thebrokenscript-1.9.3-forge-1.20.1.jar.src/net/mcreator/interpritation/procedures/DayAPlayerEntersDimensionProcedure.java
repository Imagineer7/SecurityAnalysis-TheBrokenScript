/*    */ package net.mcreator.interpritation.procedures;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
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
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class DayAPlayerEntersDimensionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 26 */     if (entity == null)
/*    */       return; 
/* 28 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).isfieldGenerated) {
/* 29 */       world.m_7731_(BlockPos.m_274561_(x, 100.0D, z), ((Block)ThebrokenscriptModBlocks.FIELD_GENERATOR.get()).m_49966_(), 3);
/* 30 */       (ThebrokenscriptModVariables.MapVariables.get(world)).isfieldGenerated = true;
/* 31 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */     } 
/*    */     
/* 34 */     Entity _ent = entity;
/* 35 */     _ent.m_6021_(x, 110.0D, z);
/* 36 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 37 */       _serverPlayer.f_8906_.m_9774_(x, 110.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */     
/* 39 */     ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */           if (world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_IS_HERE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */             if (entityToSpawn != null);
/*    */           } 
/*    */         });
/* 46 */     ThebrokenscriptMod.queueServerWork(20000, () -> {
/*    */           if (entity instanceof ServerPlayer) {
/*    */             ServerPlayer _player = (ServerPlayer)entity;
/*    */             if (!_player.m_9236_().m_5776_()) {
/*    */               ResourceKey<Level> destinationType = Level.f_46428_;
/*    */               if (_player.m_9236_().m_46472_() == destinationType)
/*    */                 return; 
/*    */               ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
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
/*    */           if (entity instanceof LivingEntity) {
/*    */             LivingEntity _entity = (LivingEntity)entity;
/*    */             if (!_entity.m_9236_().m_5776_())
/*    */               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19591_, 500, 1, false, false)); 
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\DayAPlayerEntersDimensionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */