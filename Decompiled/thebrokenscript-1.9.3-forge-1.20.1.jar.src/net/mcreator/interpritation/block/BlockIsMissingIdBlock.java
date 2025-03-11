/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class BlockIsMissingIdBlock
/*    */   extends Block {
/*    */   public BlockIsMissingIdBlock() {
/* 13 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56743_).m_60913_(-1.0F, 3600000.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 18 */     return 15;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\BlockIsMissingIdBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */