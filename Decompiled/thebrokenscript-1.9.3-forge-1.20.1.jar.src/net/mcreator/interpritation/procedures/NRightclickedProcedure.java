/*    */ package net.mcreator.interpritation.procedures;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class NRightclickedProcedure {
/*    */   public static void execute(Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 14 */       ItemStack _stktoremove = new ItemStack((ItemLike)ThebrokenscriptModItems.N.get());
/* 15 */       _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_.m_39730_()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */