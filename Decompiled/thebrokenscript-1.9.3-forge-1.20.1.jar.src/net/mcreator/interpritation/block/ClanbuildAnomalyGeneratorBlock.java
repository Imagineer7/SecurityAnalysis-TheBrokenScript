/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.ClanbuildAnomalyGeneratorOnTickUpdateProcedure;
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
/*    */ public class ClanbuildAnomalyGeneratorBlock
/*    */   extends Block {
/*    */   public ClanbuildAnomalyGeneratorBlock() {
/* 18 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56742_).m_60913_(-1.0F, 3600000.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 23 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 28 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 29 */     world.m_186460_(pos, this, 10);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 34 */     super.m_213897_(blockstate, world, pos, random);
/* 35 */     int x = pos.m_123341_();
/* 36 */     int y = pos.m_123342_();
/* 37 */     int z = pos.m_123343_();
/* 38 */     ClanbuildAnomalyGeneratorOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 39 */     world.m_186460_(pos, this, 10);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ClanbuildAnomalyGeneratorBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */