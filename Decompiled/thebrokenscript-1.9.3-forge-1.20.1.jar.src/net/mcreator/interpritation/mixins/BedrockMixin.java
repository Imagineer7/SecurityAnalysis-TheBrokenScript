/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({Block.class})
/*    */ public abstract class BedrockMixin
/*    */ {
/*    */   @Inject(method = {"getDestroySpeed"}, at = {@At("HEAD")}, cancellable = true, remap = false)
/*    */   private void modifyBedrockHardness(BlockState state, CallbackInfoReturnable<Float> cir) {
/* 16 */     if (state.m_60713_(Blocks.f_50752_))
/* 17 */       cir.setReturnValue(Float.valueOf(3.0F)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\BedrockMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */