/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class TabshowProcedure
/*    */ {
/*    */   public static boolean execute(Entity entity) {
/*  9 */     if (entity == null)
/* 10 */       return false; 
/* 11 */     if (((ThebrokenscriptModVariables.PlayerVariables)entity.getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables())).showtab == true) {
/* 12 */       return true;
/*    */     }
/* 14 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TabshowProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */