/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ 
/*    */ public class ProtectedVoidLightBlock
/*    */   extends Block
/*    */ {
/*    */   public ProtectedVoidLightBlock() {
/* 15 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56744_).m_60913_(-1.0F, 3600000.0F).m_60953_(s -> 15));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 20 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 25 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ProtectedVoidLightBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */