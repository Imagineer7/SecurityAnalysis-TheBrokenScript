/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({ServerLevel.class})
/*    */ public class ServerLevelMixin {
/*    */   @Inject(method = {"isOutsideBuildHeight"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void allowBuildingBelow(int y, CallbackInfoReturnable<Boolean> cir) {
/* 13 */     if (y < -64)
/* 14 */       cir.setReturnValue(Boolean.valueOf(false)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\ServerLevelMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */