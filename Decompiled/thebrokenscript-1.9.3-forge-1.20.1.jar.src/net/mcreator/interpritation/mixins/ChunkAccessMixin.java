/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.chunk.LevelChunk;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({LevelChunk.class})
/*    */ public class ChunkAccessMixin
/*    */ {
/*    */   @Inject(method = {"setBlockState"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void allowPlacingBelowBedrock(BlockPos pos, BlockState state, boolean isMoving, CallbackInfoReturnable<BlockState> cir) {
/* 20 */     if (pos.m_123342_() < -164)
/* 21 */       cir.setReturnValue(state); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\ChunkAccessMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */