/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.DoorBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.BlockSetType;
/*    */ 
/*    */ public class VoidDoorBlock
/*    */   extends DoorBlock {
/*    */   public VoidDoorBlock() {
/* 14 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56749_).m_60913_(-1.0F, 3600000.0F).m_60955_().m_60924_((bs, br, bp) -> false), BlockSetType.f_271479_);
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 19 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\VoidDoorBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */