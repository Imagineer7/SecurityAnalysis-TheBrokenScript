/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import io.netty.buffer.Unpooled;
/*    */ import net.mcreator.interpritation.world.inventory.ConfigMenu;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.MenuProvider;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   implements MenuProvider
/*    */ {
/*    */   public Component m_5446_() {
/* 29 */     return (Component)Component.m_237113_("Config");
/*    */   }
/*    */ 
/*    */   
/*    */   public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 34 */     return (AbstractContainerMenu)new ConfigMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ConfigcommandopenProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */