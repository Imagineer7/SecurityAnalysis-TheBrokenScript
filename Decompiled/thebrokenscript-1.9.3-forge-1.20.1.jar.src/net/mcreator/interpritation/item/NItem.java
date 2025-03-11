/*    */ package net.mcreator.interpritation.item;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.NRightclickedProcedure;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class NItem
/*    */   extends Item {
/*    */   public NItem() {
/* 16 */     super((new Item.Properties()).m_41487_(64).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 21 */     InteractionResultHolder<ItemStack> ar = super.m_7203_(world, entity, hand);
/* 22 */     NRightclickedProcedure.execute((Entity)entity);
/* 23 */     return ar;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\item\NItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */