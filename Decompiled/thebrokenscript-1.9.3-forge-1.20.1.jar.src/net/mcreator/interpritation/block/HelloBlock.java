/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.HelloBlockDestroyedByPlayerProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.Shapes;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ 
/*    */ public class HelloBlock
/*    */   extends Block {
/*    */   public HelloBlock() {
/* 22 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56744_).m_60913_(1.0F, 10.0F).m_60955_().m_60924_((bs, br, bp) -> false));
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
/*    */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 42 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 43 */     HelloBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/* 44 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\HelloBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */