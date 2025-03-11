/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import net.minecraft.client.gui.components.EditBox;
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
/*    */ public class PcguibuttonpressProcedure {
/*    */   public static void execute(double x, double z, Entity entity, HashMap guistate) {
/* 20 */     if (entity == null || guistate == null)
/*    */       return; 
/* 22 */     if ((guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).m_94155_() : "").equals("sv.exit")) {
/* 23 */       if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity; if (!_player.m_9236_().m_5776_()) {
/* 24 */           ResourceKey<Level> destinationType = Level.f_46428_;
/* 25 */           if (_player.m_9236_().m_46472_() == destinationType)
/*    */             return; 
/* 27 */           ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/* 28 */           if (nextLevel != null) {
/* 29 */             _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/* 30 */             _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/* 31 */             _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/* 32 */             for (MobEffectInstance _effectinstance : _player.m_21220_())
/* 33 */               _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/* 34 */             _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*    */           } 
/*    */         }  }
/*    */       
/* 38 */       Entity _ent = entity;
/* 39 */       _ent.m_6021_(x, 80.0D, z);
/* 40 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 41 */         _serverPlayer.f_8906_.m_9774_(x, 80.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */     
/*    */     } 
/* 44 */     if ((guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).m_94155_() : "").equals("null")) {
/* 45 */       Object object = guistate.get("text:pcline"); if (object instanceof EditBox) { EditBox _tf = (EditBox)object;
/* 46 */         _tf.m_94144_("Outside"); }
/*    */     
/* 48 */     }  if ((guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).m_94155_() : "").equals("xXram2dieXx")) {
/* 49 */       Object object = guistate.get("text:pcline"); if (object instanceof EditBox) { EditBox _tf = (EditBox)object;
/* 50 */         _tf.m_94144_("Error"); }
/*    */     
/* 52 */     }  if ((guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).m_94155_() : "").equals("Integrity")) {
/* 53 */       Object object = guistate.get("text:pcline"); if (object instanceof EditBox) { EditBox _tf = (EditBox)object;
/* 54 */         _tf.m_94144_("ERR.NEXTNIGHT"); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\PcguibuttonpressProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */