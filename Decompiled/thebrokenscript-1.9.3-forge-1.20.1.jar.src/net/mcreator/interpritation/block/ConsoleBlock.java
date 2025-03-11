/*    */ package net.mcreator.interpritation.block;
/*    */ 
/*    */ import io.netty.buffer.Unpooled;
/*    */ import java.util.List;
/*    */ import net.mcreator.interpritation.block.entity.ConsoleBlockEntity;
/*    */ import net.mcreator.interpritation.world.inventory.PcGuiMenu;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.MenuProvider;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.EntityBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.entity.BlockEntity;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.phys.BlockHitResult;
/*    */ import net.minecraftforge.network.NetworkHooks;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConsoleBlock
/*    */   extends Block
/*    */   implements EntityBlock
/*    */ {
/*    */   public ConsoleBlock() {
/* 37 */     super(BlockBehaviour.Properties.m_284310_().m_60918_(SoundType.f_56744_).m_60913_(-1.0F, 3600000.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5871_(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
/* 42 */     super.m_5871_(itemstack, level, list, flag);
/* 43 */     list.add(Component.m_237115_("block.thebrokenscript.console.description_0"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 48 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult m_6227_(BlockState blockstate, Level world, final BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 53 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/* 54 */     if (entity instanceof ServerPlayer) { ServerPlayer player = (ServerPlayer)entity;
/* 55 */       NetworkHooks.openScreen(player, new MenuProvider()
/*    */           {
/*    */             public Component m_5446_() {
/* 58 */               return (Component)Component.m_237113_("Alternate Console Block");
/*    */             }
/*    */ 
/*    */             
/*    */             public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 63 */               return (AbstractContainerMenu)new PcGuiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(pos));
/*    */             }
/*    */           }pos); }
/*    */     
/* 67 */     return InteractionResult.SUCCESS;
/*    */   }
/*    */ 
/*    */   
/*    */   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
/* 72 */     BlockEntity tileEntity = worldIn.m_7702_(pos);
/* 73 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
/* 78 */     return (BlockEntity)new ConsoleBlockEntity(pos, state);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 83 */     super.m_8133_(state, world, pos, eventID, eventParam);
/* 84 */     BlockEntity blockEntity = world.m_7702_(pos);
/* 85 */     return (blockEntity == null) ? false : blockEntity.m_7531_(eventID, eventParam);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\ConsoleBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */