/*     */ package net.mcreator.interpritation.world.inventory;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModMenus;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.inventory.ContainerLevelAccess;
/*     */ import net.minecraft.world.inventory.MenuType;
/*     */ import net.minecraft.world.inventory.Slot;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraftforge.common.capabilities.ForgeCapabilities;
/*     */ import net.minecraftforge.items.IItemHandler;
/*     */ import net.minecraftforge.items.ItemStackHandler;
/*     */ 
/*     */ public class Nullinterface3Menu
/*     */   extends AbstractContainerMenu
/*     */   implements Supplier<Map<Integer, Slot>> {
/*  28 */   public static final HashMap<String, Object> guistate = new HashMap<>();
/*     */   
/*     */   public final Level world;
/*     */   public final Player entity;
/*  32 */   private ContainerLevelAccess access = ContainerLevelAccess.f_39287_; public int x; public int y; public int z;
/*     */   private IItemHandler internal;
/*  34 */   private final Map<Integer, Slot> customSlots = new HashMap<>();
/*     */   private boolean bound = false;
/*  36 */   private Supplier<Boolean> boundItemMatcher = null;
/*  37 */   private Entity boundEntity = null;
/*  38 */   private BlockEntity boundBlockEntity = null;
/*     */   
/*     */   public Nullinterface3Menu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  41 */     super((MenuType)ThebrokenscriptModMenus.NULLINTERFACE_3.get(), id);
/*  42 */     this.entity = inv.f_35978_;
/*  43 */     this.world = inv.f_35978_.m_9236_();
/*  44 */     this.internal = (IItemHandler)new ItemStackHandler(0);
/*  45 */     BlockPos pos = null;
/*  46 */     if (extraData != null) {
/*  47 */       pos = extraData.m_130135_();
/*  48 */       this.x = pos.m_123341_();
/*  49 */       this.y = pos.m_123342_();
/*  50 */       this.z = pos.m_123343_();
/*  51 */       this.access = ContainerLevelAccess.m_39289_(this.world, pos);
/*     */     } 
/*  53 */     if (pos != null)
/*  54 */       if (extraData.readableBytes() == 1) {
/*  55 */         byte hand = extraData.readByte();
/*  56 */         ItemStack itemstack = (hand == 0) ? this.entity.m_21205_() : this.entity.m_21206_();
/*  57 */         this.boundItemMatcher = (() -> Boolean.valueOf((itemstack == ((hand == 0) ? this.entity.m_21205_() : this.entity.m_21206_()))));
/*  58 */         itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
/*     */               this.internal = capability;
/*     */               this.bound = true;
/*     */             });
/*  62 */       } else if (extraData.readableBytes() > 1) {
/*  63 */         extraData.readByte();
/*  64 */         this.boundEntity = this.world.m_6815_(extraData.m_130242_());
/*  65 */         if (this.boundEntity != null)
/*  66 */           this.boundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
/*     */                 this.internal = capability;
/*     */                 this.bound = true;
/*     */               }); 
/*     */       } else {
/*  71 */         this.boundBlockEntity = this.world.m_7702_(pos);
/*  72 */         if (this.boundBlockEntity != null)
/*  73 */           this.boundBlockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
/*     */                 this.internal = capability;
/*     */                 this.bound = true;
/*     */               }); 
/*     */       }  
/*     */     int si;
/*  79 */     for (si = 0; si < 3; si++) {
/*  80 */       for (int sj = 0; sj < 9; sj++)
/*  81 */         m_38897_(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18)); 
/*  82 */     }  for (si = 0; si < 9; si++) {
/*  83 */       m_38897_(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean m_6875_(Player player) {
/*  88 */     if (this.bound) {
/*  89 */       if (this.boundItemMatcher != null)
/*  90 */         return ((Boolean)this.boundItemMatcher.get()).booleanValue(); 
/*  91 */       if (this.boundBlockEntity != null)
/*  92 */         return AbstractContainerMenu.m_38889_(this.access, player, this.boundBlockEntity.m_58900_().m_60734_()); 
/*  93 */       if (this.boundEntity != null)
/*  94 */         return this.boundEntity.m_6084_(); 
/*     */     } 
/*  96 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack m_7648_(Player playerIn, int index) {
/* 101 */     ItemStack itemstack = ItemStack.f_41583_;
/* 102 */     Slot slot = (Slot)this.f_38839_.get(index);
/* 103 */     if (slot != null && slot.m_6657_()) {
/* 104 */       ItemStack itemstack1 = slot.m_7993_();
/* 105 */       itemstack = itemstack1.m_41777_();
/* 106 */       if (index < 0) {
/* 107 */         if (!m_38903_(itemstack1, 0, this.f_38839_.size(), true))
/* 108 */           return ItemStack.f_41583_; 
/* 109 */         slot.m_40234_(itemstack1, itemstack);
/* 110 */       } else if (!m_38903_(itemstack1, 0, 0, false)) {
/* 111 */         if (index < 27) {
/* 112 */           if (!m_38903_(itemstack1, 27, this.f_38839_.size(), true)) {
/* 113 */             return ItemStack.f_41583_;
/*     */           }
/* 115 */         } else if (!m_38903_(itemstack1, 0, 27, false)) {
/* 116 */           return ItemStack.f_41583_;
/*     */         } 
/* 118 */         return ItemStack.f_41583_;
/*     */       } 
/* 120 */       if (itemstack1.m_41613_() == 0) {
/* 121 */         slot.m_5852_(ItemStack.f_41583_);
/*     */       } else {
/* 123 */         slot.m_6654_();
/* 124 */       }  if (itemstack1.m_41613_() == itemstack.m_41613_())
/* 125 */         return ItemStack.f_41583_; 
/* 126 */       slot.m_142406_(playerIn, itemstack1);
/*     */     } 
/* 128 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean m_38903_(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 133 */     boolean flag = false;
/* 134 */     int i = p_38905_;
/* 135 */     if (p_38907_) {
/* 136 */       i = p_38906_ - 1;
/*     */     }
/* 138 */     if (p_38904_.m_41753_()) {
/* 139 */       while (!p_38904_.m_41619_() && (
/* 140 */         p_38907_ ? (
/* 141 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 144 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 147 */         Slot slot = (Slot)this.f_38839_.get(i);
/* 148 */         ItemStack itemstack = slot.m_7993_();
/* 149 */         if (slot.m_5857_(itemstack) && !itemstack.m_41619_() && ItemStack.m_150942_(p_38904_, itemstack)) {
/* 150 */           int j = itemstack.m_41613_() + p_38904_.m_41613_();
/* 151 */           int maxSize = Math.min(slot.m_6641_(), p_38904_.m_41741_());
/* 152 */           if (j <= maxSize) {
/* 153 */             p_38904_.m_41764_(0);
/* 154 */             itemstack.m_41764_(j);
/* 155 */             slot.m_5852_(itemstack);
/* 156 */             flag = true;
/* 157 */           } else if (itemstack.m_41613_() < maxSize) {
/* 158 */             p_38904_.m_41774_(maxSize - itemstack.m_41613_());
/* 159 */             itemstack.m_41764_(maxSize);
/* 160 */             slot.m_5852_(itemstack);
/* 161 */             flag = true;
/*     */           } 
/*     */         } 
/* 164 */         if (p_38907_) {
/* 165 */           i--; continue;
/*     */         } 
/* 167 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 171 */     if (!p_38904_.m_41619_()) {
/* 172 */       if (p_38907_) {
/* 173 */         i = p_38906_ - 1;
/*     */       } else {
/* 175 */         i = p_38905_;
/*     */       } 
/*     */       
/* 178 */       while (p_38907_ ? (
/* 179 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 182 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 185 */         Slot slot1 = (Slot)this.f_38839_.get(i);
/* 186 */         ItemStack itemstack1 = slot1.m_7993_();
/* 187 */         if (itemstack1.m_41619_() && slot1.m_5857_(p_38904_)) {
/* 188 */           if (p_38904_.m_41613_() > slot1.m_6641_()) {
/* 189 */             slot1.m_269060_(p_38904_.m_41620_(slot1.m_6641_()));
/*     */           } else {
/* 191 */             slot1.m_269060_(p_38904_.m_41620_(p_38904_.m_41613_()));
/*     */           } 
/* 193 */           slot1.m_6654_();
/* 194 */           flag = true;
/*     */           break;
/*     */         } 
/* 197 */         if (p_38907_) {
/* 198 */           i--; continue;
/*     */         } 
/* 200 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 204 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6877_(Player playerIn) {
/* 209 */     super.m_6877_(playerIn);
/* 210 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 211 */       if (!serverPlayer.m_6084_() || serverPlayer.m_9232_()) {
/* 212 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 213 */           playerIn.m_36176_(this.internal.extractItem(j, this.internal.getStackInSlot(j).m_41613_(), false), false);
/*     */         }
/*     */       } else {
/* 216 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 217 */           playerIn.m_150109_().m_150079_(this.internal.extractItem(i, this.internal.getStackInSlot(i).m_41613_(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 224 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\world\inventory\Nullinterface3Menu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */