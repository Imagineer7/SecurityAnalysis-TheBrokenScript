/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.ItOnTickUpdateProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class AllDeadBlock
/*    */   extends Block {
/*    */   public AllDeadBlock() {
/* 19 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56744_).m_60913_(-1.0F, 3600000.0F).m_60910_());
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 24 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6864_(BlockState state, BlockPlaceContext context) {
/* 29 */     return (context.m_43722_().m_41720_() != m_5456_());
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 34 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 35 */     world.m_186460_(pos, this, 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 40 */     super.m_213897_(blockstate, world, pos, random);
/* 41 */     int x = pos.m_123341_();
/* 42 */     int y = pos.m_123342_();
/* 43 */     int z = pos.m_123343_();
/* 44 */     ItOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 45 */     world.m_186460_(pos, this, 2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\AllDeadBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */