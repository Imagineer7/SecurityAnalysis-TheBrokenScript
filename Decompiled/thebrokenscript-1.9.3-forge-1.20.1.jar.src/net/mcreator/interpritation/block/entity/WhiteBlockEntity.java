/*     */ package net.mcreator.interpritation.block.entity;
/*     */ 
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlockEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.NonNullList;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
/*     */ import net.minecraft.world.ContainerHelper;
/*     */ import net.minecraft.world.WorldlyContainer;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.inventory.ChestMenu;
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
/*     */ public class WhiteBlockEntity
/*     */   extends RandomizableContainerBlockEntity implements WorldlyContainer {
/*  31 */   private NonNullList<ItemStack> stacks = NonNullList.m_122780_(9, ItemStack.f_41583_);
/*  32 */   private final LazyOptional<? extends IItemHandler>[] handlers = (LazyOptional<? extends IItemHandler>[])SidedInvWrapper.create(this, Direction.values());
/*     */   
/*     */   public WhiteBlockEntity(BlockPos position, BlockState state) {
/*  35 */     super((BlockEntityType)ThebrokenscriptModBlockEntities.WHITE.get(), position, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_142466_(CompoundTag compound) {
/*  40 */     super.m_142466_(compound);
/*  41 */     if (!m_59631_(compound))
/*  42 */       this.stacks = NonNullList.m_122780_(m_6643_(), ItemStack.f_41583_); 
/*  43 */     ContainerHelper.m_18980_(compound, this.stacks);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_183515_(CompoundTag compound) {
/*  48 */     super.m_183515_(compound);
/*  49 */     if (!m_59634_(compound)) {
/*  50 */       ContainerHelper.m_18973_(compound, this.stacks);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ClientboundBlockEntityDataPacket getUpdatePacket() {
/*  56 */     return ClientboundBlockEntityDataPacket.m_195640_((BlockEntity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public CompoundTag m_5995_() {
/*  61 */     return m_187480_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6643_() {
/*  66 */     return this.stacks.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7983_() {
/*  71 */     for (ItemStack itemstack : this.stacks) {
/*  72 */       if (!itemstack.m_41619_())
/*  73 */         return false; 
/*  74 */     }  return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Component m_6820_() {
/*  79 */     return (Component)Component.m_237113_("white");
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6893_() {
/*  84 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractContainerMenu m_6555_(int id, Inventory inventory) {
/*  89 */     return (AbstractContainerMenu)ChestMenu.m_39255_(id, inventory);
/*     */   }
/*     */ 
/*     */   
/*     */   public Component m_5446_() {
/*  94 */     return (Component)Component.m_237113_("OUTSIDE");
/*     */   }
/*     */ 
/*     */   
/*     */   protected NonNullList<ItemStack> m_7086_() {
/*  99 */     return this.stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_6520_(NonNullList<ItemStack> stacks) {
/* 104 */     this.stacks = stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7013_(int index, ItemStack stack) {
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] m_7071_(Direction side) {
/* 114 */     return IntStream.range(0, m_6643_()).toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7155_(int index, ItemStack stack, @Nullable Direction direction) {
/* 119 */     return m_7013_(index, stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7157_(int index, ItemStack stack, Direction direction) {
/* 124 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
/* 129 */     if (!this.f_58859_ && facing != null && capability == ForgeCapabilities.ITEM_HANDLER)
/* 130 */       return this.handlers[facing.ordinal()].cast(); 
/* 131 */     return super.getCapability(capability, facing);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7651_() {
/* 136 */     super.m_7651_();
/* 137 */     for (LazyOptional<? extends IItemHandler> handler : this.handlers)
/* 138 */       handler.invalidate(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\block\entity\WhiteBlockEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */