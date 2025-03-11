/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.OldblockBlockDestroyedByPlayerProcedure;
/*    */ import net.mcreator.interpritation.procedures.OldblockOnTickUpdateProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ 
/*    */ public class OldblockBlock
/*    */   extends Block {
/*    */   public OldblockBlock() {
/* 21 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56736_).m_60913_(1.0F, 10.0F).m_60977_().m_60982_((bs, br, bp) -> true).m_60991_((bs, br, bp) -> true));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 26 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 31 */     super.m_213897_(blockstate, world, pos, random);
/* 32 */     int x = pos.m_123341_();
/* 33 */     int y = pos.m_123342_();
/* 34 */     int z = pos.m_123343_();
/* 35 */     OldblockOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 40 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 41 */     OldblockBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/* 42 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\OldblockBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */