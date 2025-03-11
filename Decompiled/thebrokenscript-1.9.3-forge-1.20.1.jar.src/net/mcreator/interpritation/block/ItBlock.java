/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.ItBlockDestroyedByPlayerProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.Shapes;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ 
/*    */ public class ItBlock
/*    */   extends Block {
/*    */   public ItBlock() {
/* 21 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56744_).m_60913_(-1.0F, 3600000.0F).m_60910_().m_60955_().m_60924_((bs, br, bp) -> false));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 26 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 31 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public VoxelShape m_5909_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 36 */     return Shapes.m_83040_();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 41 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 42 */     ItBlockDestroyedByPlayerProcedure.execute((Entity)entity);
/* 43 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ItBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */