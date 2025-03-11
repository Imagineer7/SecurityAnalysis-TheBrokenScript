/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.NullWatchingEntity;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({Minecraft.class})
/*    */ public class SingleplayerDynamicPOSMixin
/*    */ {
/*    */   @Inject(method = {"pauseGame"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void preventPause(boolean bl, CallbackInfo info) {
/* 27 */     LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/* 28 */     if (localPlayer != null && isCustomEntityNearby((Player)localPlayer)) {
/* 29 */       info.cancel();
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean isCustomEntityNearby(Player player) {
/* 34 */     Level level = player.m_9236_();
/* 35 */     if (level == null) return false;
/*    */ 
/*    */ 
/*    */     
/* 39 */     AABB boundingBox = new AABB(player.m_20185_() - 1000.0D, player.m_20186_() - 1000.0D, player.m_20189_() - 1000.0D, player.m_20185_() + 1000.0D, player.m_20186_() + 1000.0D, player.m_20189_() + 1000.0D);
/*    */ 
/*    */     
/* 42 */     return 
/* 43 */       !level.m_45976_(NullWatchingEntity.class, boundingBox).isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\SingleplayerDynamicPOSMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */