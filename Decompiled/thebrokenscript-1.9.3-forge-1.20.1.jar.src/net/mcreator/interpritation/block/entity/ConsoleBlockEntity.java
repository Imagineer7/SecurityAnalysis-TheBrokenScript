/*     */ package net.mcreator.interpritation.block.entity;
/*     */ 
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlockEntities;
/*     */ import net.mcreator.interpritation.world.inventory.PcGuiMenu;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.NonNullList;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
/*     */ import net.minecraft.world.ContainerHelper;
/*     */ import net.minecraft.world.WorldlyContainer;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.entity.BlockEntityType;
/*     */ import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.common.capabilities.Capability;
/*     */ import net.minecraftforge.common.capabilities.ForgeCapabilities;
/*     */ import net.minecraftforge.common.util.LazyOptional;
/*     */ import net.minecraftforge.items.IItemHandler;
/*     */ import net.minecraftforge.items.wrapper.SidedInvWrapper;
/*     */ 
/*     */ public class ConsoleBlockEntity
/*     */   extends RandomizableContainerBlockEntity
/*     */   implements WorldlyContainer {
/*  34 */   private NonNullList<ItemStack> stacks = NonNullList.m_122780_(0, ItemStack.f_41583_);
/*  35 */   private final LazyOptional<? extends IItemHandler>[] handlers = (LazyOptional<? extends IItemHandler>[])SidedInvWrapper.create(this, Direction.values());
/*     */   
/*     */   public ConsoleBlockEntity(BlockPos position, BlockState state) {
/*  38 */     super((BlockEntityType)ThebrokenscriptModBlockEntities.CONSOLE.get(), position, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_142466_(CompoundTag compound) {
/*  43 */     super.m_142466_(compound);
/*  44 */     if (!m_59631_(compound))
/*  45 */       this.stacks = NonNullList.m_122780_(m_6643_(), ItemStack.f_41583_); 
/*  46 */     ContainerHelper.m_18980_(compound, this.stacks);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_183515_(CompoundTag compound) {
/*  51 */     super.m_183515_(compound);
/*  52 */     if (!m_59634_(compound)) {
/*  53 */       ContainerHelper.m_18973_(compound, this.stacks);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ClientboundBlockEntityDataPacket getUpdatePacket() {
/*  59 */     return ClientboundBlockEntityDataPacket.m_195640_((BlockEntity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public CompoundTag m_5995_() {
/*  64 */     return m_187480_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6643_() {
/*  69 */     return this.stacks.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7983_() {
/*  74 */     for (ItemStack itemstack : this.stacks) {
/*  75 */       if (!itemstack.m_41619_())
/*  76 */         return false; 
/*  77 */     }  return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Component m_6820_() {
/*  82 */     return (Component)Component.m_237113_("console");
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6893_() {
/*  87 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractContainerMenu m_6555_(int id, Inventory inventory) {
/*  92 */     return (AbstractContainerMenu)new PcGuiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(this.f_58858_));
/*     */   }
/*     */ 
/*     */   
/*     */   public Component m_5446_() {
/*  97 */     return (Component)Component.m_237113_("Alternate Console Block");
/*     */   }
/*     */ 
/*     */   
/*     */   protected NonNullList<ItemStack> m_7086_() {
/* 102 */     return this.stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_6520_(NonNullList<ItemStack> stacks) {
/* 107 */     this.stacks = stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7013_(int index, ItemStack stack) {
/* 112 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] m_7071_(Direction side) {
/* 117 */     return IntStream.range(0, m_6643_()).toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7155_(int index, ItemStack stack, @Nullable Direction direction) {
/* 122 */     return m_7013_(index, stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7157_(int index, ItemStack stack, Direction direction) {
/* 127 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
/* 132 */     if (!this.f_58859_ && facing != null && capability == ForgeCapabilities.ITEM_HANDLER)
/* 133 */       return this.handlers[facing.ordinal()].cast(); 
/* 134 */     return super.getCapability(capability, facing);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7651_() {
/* 139 */     super.m_7651_();
/* 140 */     for (LazyOptional<? extends IItemHandler> handler : this.handlers)
/* 141 */       handler.invalidate(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\entity\ConsoleBlockEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */