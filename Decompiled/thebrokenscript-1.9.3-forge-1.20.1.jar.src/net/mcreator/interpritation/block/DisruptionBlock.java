/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.DisruptionBlockAddedProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.pathfinder.BlockPathTypes;
/*    */ 
/*    */ public class DisruptionBlock
/*    */   extends Block {
/*    */   public DisruptionBlock() {
/* 18 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56742_).m_60913_(1.0F, 10.0F).m_60910_().m_60982_((bs, br, bp) -> true).m_60991_((bs, br, bp) -> true));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 23 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
/* 28 */     return BlockPathTypes.WALKABLE;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 33 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 34 */     DisruptionBlockAddedProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\DisruptionBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */