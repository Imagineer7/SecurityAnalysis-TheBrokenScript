/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.interpritation.entity.CircuitEntity;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.components.Button;
/*    */ import net.minecraft.client.gui.screens.PauseScreen;
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ @Mixin({PauseScreen.class})
/*    */ public class NoPauseMixin
/*    */ {
/*    */   @Shadow
/*    */   private Button f_252482_;
/*    */   
/*    */   @Inject(method = {"init"}, at = {@At("TAIL")})
/*    */   private void disableSaveAndQuitButton(CallbackInfo ci) {
/* 25 */     if (this.f_252482_ != null) {
/* 26 */       boolean entityNearby = isEntityNearby(1000.0D);
/* 27 */       this.f_252482_.f_93623_ = !entityNearby;
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean isEntityNearby(double range) {
/* 32 */     Minecraft minecraft = Minecraft.m_91087_();
/* 33 */     LocalPlayer localPlayer = minecraft.f_91074_;
/* 34 */     ClientLevel clientLevel = minecraft.f_91073_;
/*    */     
/* 36 */     if (localPlayer == null || clientLevel == null) {
/* 37 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 41 */     List<CircuitEntity> entities = clientLevel.m_45976_(CircuitEntity.class, localPlayer
/* 42 */         .m_20191_().m_82400_(range));
/*    */     
/* 44 */     return !entities.isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\NoPauseMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */