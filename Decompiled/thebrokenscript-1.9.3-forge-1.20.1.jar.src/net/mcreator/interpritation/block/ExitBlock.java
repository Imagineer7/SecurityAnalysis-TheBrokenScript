/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.ExitOnTickUpdateProcedure;
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
/*    */ 
/*    */ public class ExitBlock
/*    */   extends Block
/*    */ {
/*    */   public ExitBlock() {
/* 24 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56744_).m_60913_(-1.0F, 3600000.0F).m_60953_(s -> 15).m_60910_().m_60955_().m_60982_((bs, br, bp) -> true).m_60991_((bs, br, bp) -> true)
/* 25 */         .m_60924_((bs, br, bp) -> false));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6104_(BlockState state, BlockState adjacentBlockState, Direction side) {
/* 30 */     return (adjacentBlockState.m_60734_() == this) ? true : super.m_6104_(state, adjacentBlockState, side);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 35 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 40 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public VoxelShape m_5909_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 45 */     return Shapes.m_83040_();
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 50 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 51 */     world.m_186460_(pos, this, 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 56 */     super.m_213897_(blockstate, world, pos, random);
/* 57 */     int x = pos.m_123341_();
/* 58 */     int y = pos.m_123342_();
/* 59 */     int z = pos.m_123343_();
/* 60 */     ExitOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 61 */     world.m_186460_(pos, this, 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ExitBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */