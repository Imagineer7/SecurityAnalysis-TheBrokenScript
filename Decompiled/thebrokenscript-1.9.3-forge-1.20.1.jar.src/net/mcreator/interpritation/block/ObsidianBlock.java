/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class ObsidianBlock
/*    */   extends Block {
/*    */   public ObsidianBlock() {
/* 13 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56742_).m_60913_(50.0F, 10.0F).m_60999_());
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 18 */     return 15;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ObsidianBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */