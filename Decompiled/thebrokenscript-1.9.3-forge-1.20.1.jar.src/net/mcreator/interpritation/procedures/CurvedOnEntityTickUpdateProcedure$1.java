/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.GameType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */ {
/*    */   public boolean checkGamemode(Entity _ent) {
/* 86 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 87 */       return (_serverPlayer.f_8941_.m_9290_() == GameType.CREATIVE); }
/* 88 */      if (_ent.m_9236_().m_5776_() && _ent instanceof Player) { Player _player = (Player)_ent;
/* 89 */       return (Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.CREATIVE); }
/*    */     
/* 91 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CurvedOnEntityTickUpdateProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */