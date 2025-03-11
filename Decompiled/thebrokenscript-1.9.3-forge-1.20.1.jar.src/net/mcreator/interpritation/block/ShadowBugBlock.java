/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.ShadowBugOnTickUpdateProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.Shapes;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ 
/*    */ public class ShadowBugBlock
/*    */   extends Block {
/*    */   public ShadowBugBlock() {
/* 22 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_279557_).m_60913_(1.0F, 10.0F).m_60910_().m_60955_().m_60924_((bs, br, bp) -> false));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6104_(BlockState state, BlockState adjacentBlockState, Direction side) {
/* 27 */     return (adjacentBlockState.m_60734_() == this) ? true : super.m_6104_(state, adjacentBlockState, side);
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 32 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public VoxelShape m_5909_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 37 */     return Shapes.m_83040_();
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 42 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 43 */     world.m_186460_(pos, this, 60);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 48 */     super.m_213897_(blockstate, world, pos, random);
/* 49 */     int x = pos.m_123341_();
/* 50 */     int y = pos.m_123342_();
/* 51 */     int z = pos.m_123343_();
/* 52 */     ShadowBugOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 53 */     world.m_186460_(pos, this, 60);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ShadowBugBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */