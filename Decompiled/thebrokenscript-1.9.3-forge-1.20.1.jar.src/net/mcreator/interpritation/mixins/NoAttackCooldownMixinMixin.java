/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({Player.class})
/*    */ public abstract class NoAttackCooldownMixinMixin {
/*    */   @Inject(method = {"getAttackStrengthScale"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void removeCooldown(CallbackInfoReturnable<Float> ci) {
/* 13 */     ci.setReturnValue(Float.valueOf(1.0F));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\NoAttackCooldownMixinMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */