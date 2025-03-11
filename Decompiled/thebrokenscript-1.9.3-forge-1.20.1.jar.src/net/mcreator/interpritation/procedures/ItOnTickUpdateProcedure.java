/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.Registries;
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
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class ItOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 25 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2.0D, 2.0D, 2.0D), e -> true).isEmpty())
/* 26 */       if (Math.random() < 0.7D) {
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 31 */         Entity entity = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity; if (!_player.m_9236_().m_5776_()) {
/* 32 */             ResourceKey<Level> destinationType = ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:clan_void"));
/* 33 */             if (_player.m_9236_().m_46472_() == destinationType)
/*    */               return; 
/* 35 */             ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/* 36 */             if (nextLevel != null) {
/* 37 */               _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/* 38 */               _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/* 39 */               _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/* 40 */               for (MobEffectInstance _effectinstance : _player.m_21220_())
/* 41 */                 _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/* 42 */               _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*    */             }
/*    */           
/*    */           }
/*    */            }
/*    */       
/*    */       } else {
/*    */         
/* 50 */         Entity entity = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity; if (!_player.m_9236_().m_5776_()) {
/* 51 */             ResourceKey<Level> destinationType = ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:null_torture"));
/* 52 */             if (_player.m_9236_().m_46472_() == destinationType)
/*    */               return; 
/* 54 */             ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/* 55 */             if (nextLevel != null) {
/* 56 */               _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/* 57 */               _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/* 58 */               _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/* 59 */               for (MobEffectInstance _effectinstance : _player.m_21220_())
/* 60 */                 _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/* 61 */               _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*    */             } 
/*    */           }  }
/*    */       
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ItOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */