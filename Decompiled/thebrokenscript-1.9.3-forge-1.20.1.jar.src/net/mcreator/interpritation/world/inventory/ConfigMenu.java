/*    */ package net.mcreator.interpritation.world.inventory;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModMenus;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.inventory.ContainerLevelAccess;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.minecraft.world.inventory.Slot;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.entity.BlockEntity;
/*    */ import net.minecraftforge.items.IItemHandler;
/*    */ import net.minecraftforge.items.ItemStackHandler;
/*    */ 
/*    */ public class ConfigMenu
/*    */   extends AbstractContainerMenu
/*    */   implements Supplier<Map<Integer, Slot>>
/*    */ {
/* 26 */   public static final HashMap<String, Object> guistate = new HashMap<>();
/*    */   
/*    */   public final Level world;
/*    */   public final Player entity;
/* 30 */   private ContainerLevelAccess access = ContainerLevelAccess.f_39287_; public int x; public int y; public int z;
/*    */   private IItemHandler internal;
/* 32 */   private final Map<Integer, Slot> customSlots = new HashMap<>();
/*    */   private boolean bound = false;
/* 34 */   private Supplier<Boolean> boundItemMatcher = null;
/* 35 */   private Entity boundEntity = null;
/* 36 */   private BlockEntity boundBlockEntity = null;
/*    */   
/*    */   public ConfigMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/* 39 */     super((MenuType)ThebrokenscriptModMenus.CONFIG.get(), id);
/* 40 */     this.entity = inv.f_35978_;
/* 41 */     this.world = inv.f_35978_.m_9236_();
/* 42 */     this.internal = (IItemHandler)new ItemStackHandler(0);
/* 43 */     BlockPos pos = null;
/* 44 */     if (extraData != null) {
/* 45 */       pos = extraData.m_130135_();
/* 46 */       this.x = pos.m_123341_();
/* 47 */       this.y = pos.m_123342_();
/* 48 */       this.z = pos.m_123343_();
/* 49 */       this.access = ContainerLevelAccess.m_39289_(this.world, pos);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6875_(Player player) {
/* 55 */     if (this.bound) {
/* 56 */       if (this.boundItemMatcher != null)
/* 57 */         return ((Boolean)this.boundItemMatcher.get()).booleanValue(); 
/* 58 */       if (this.boundBlockEntity != null)
/* 59 */         return AbstractContainerMenu.m_38889_(this.access, player, this.boundBlockEntity.m_58900_().m_60734_()); 
/* 60 */       if (this.boundEntity != null)
/* 61 */         return this.boundEntity.m_6084_(); 
/*    */     } 
/* 63 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack m_7648_(Player playerIn, int index) {
/* 68 */     return ItemStack.f_41583_;
/*    */   }
/*    */   
/*    */   public Map<Integer, Slot> get() {
/* 72 */     return this.customSlots;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\world\inventory\ConfigMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */