/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.IntOnTickUpdateProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class IntBlock
/*    */   extends Block {
/*    */   public IntBlock() {
/* 18 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_279557_).m_60913_(-1.0F, 3600000.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 23 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 28 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 33 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 34 */     world.m_186460_(pos, this, 20);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 39 */     super.m_213897_(blockstate, world, pos, random);
/* 40 */     int x = pos.m_123341_();
/* 41 */     int y = pos.m_123342_();
/* 42 */     int z = pos.m_123343_();
/* 43 */     IntOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 44 */     world.m_186460_(pos, this, 20);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\IntBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */