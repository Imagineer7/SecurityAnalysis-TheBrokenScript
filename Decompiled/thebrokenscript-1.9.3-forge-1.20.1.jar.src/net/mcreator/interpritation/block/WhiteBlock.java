/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import net.mcreator.interpritation.block.entity.WhiteBlockEntity;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.Containers;
/*    */ import net.minecraft.world.MenuProvider;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.EntityBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.entity.BlockEntity;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class WhiteBlock
/*    */   extends Block implements EntityBlock {
/*    */   public WhiteBlock() {
/* 21 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56744_).m_60913_(50.0F, 1000.0F).m_60956_(0.5F).m_60967_(0.5F).m_60982_((bs, br, bp) -> true).m_60991_((bs, br, bp) -> true));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 26 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
/* 31 */     BlockEntity tileEntity = worldIn.m_7702_(pos);
/* 32 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
/* 37 */     return (BlockEntity)new WhiteBlockEntity(pos, state);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 42 */     super.m_8133_(state, world, pos, eventID, eventParam);
/* 43 */     BlockEntity blockEntity = world.m_7702_(pos);
/* 44 */     return (blockEntity == null) ? false : blockEntity.m_7531_(eventID, eventParam);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6810_(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 49 */     if (state.m_60734_() != newState.m_60734_()) {
/* 50 */       BlockEntity blockEntity = world.m_7702_(pos);
/* 51 */       if (blockEntity instanceof WhiteBlockEntity) { WhiteBlockEntity be = (WhiteBlockEntity)blockEntity;
/* 52 */         Containers.m_19002_(world, pos, (Container)be);
/* 53 */         world.m_46717_(pos, this); }
/*    */       
/* 55 */       super.m_6810_(state, world, pos, newState, isMoving);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7278_(BlockState state) {
/* 61 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_6782_(BlockState blockState, Level world, BlockPos pos) {
/* 66 */     BlockEntity tileentity = world.m_7702_(pos);
/* 67 */     if (tileentity instanceof WhiteBlockEntity) { WhiteBlockEntity be = (WhiteBlockEntity)tileentity;
/* 68 */       return AbstractContainerMenu.m_38938_((Container)be); }
/*    */     
/* 70 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\WhiteBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */