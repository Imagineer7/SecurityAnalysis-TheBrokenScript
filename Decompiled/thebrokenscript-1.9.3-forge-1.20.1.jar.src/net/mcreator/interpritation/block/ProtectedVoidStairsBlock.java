/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.StairBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class ProtectedVoidStairsBlock
/*    */   extends StairBlock {
/*    */   public ProtectedVoidStairsBlock() {
/* 12 */     super(() -> Blocks.f_50016_.m_49966_(), BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56749_).m_60913_(-1.0F, 3600000.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_7325_() {
/* 17 */     return 10.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6724_(BlockState state) {
/* 22 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ProtectedVoidStairsBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */