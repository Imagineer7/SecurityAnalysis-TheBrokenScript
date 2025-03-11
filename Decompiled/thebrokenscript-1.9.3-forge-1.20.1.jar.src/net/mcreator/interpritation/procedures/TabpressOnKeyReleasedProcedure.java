/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class TabpressOnKeyReleasedProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/*  9 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 12 */     boolean _setval = false;
/* 13 */     entity.getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.showtab = _setval;
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TabpressOnKeyReleasedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */