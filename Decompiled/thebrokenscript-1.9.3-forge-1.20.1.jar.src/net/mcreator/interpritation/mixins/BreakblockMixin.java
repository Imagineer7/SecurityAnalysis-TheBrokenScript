/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({Blocks.class})
/*    */ public abstract class BreakblockMixin
/*    */ {
/*    */   @Inject(method = {"properties"}, at = {@At("RETURN")}, cancellable = true)
/*    */   private static void modifyBedrockProperties(CallbackInfoReturnable<BlockBehaviour.Properties> cir) {
/* 15 */     if (cir.getReturnValue() != null)
/* 16 */       cir.setReturnValue(((BlockBehaviour.Properties)cir.getReturnValue()).m_60913_(3.0F, 9.0F)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\BreakblockMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */