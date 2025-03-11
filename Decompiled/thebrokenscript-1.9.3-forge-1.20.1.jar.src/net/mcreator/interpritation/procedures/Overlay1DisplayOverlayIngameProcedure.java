/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class Overlay1DisplayOverlayIngameProcedure
/*    */ {
/*    */   public static boolean execute(LevelAccessor world) {
/*  9 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).showvhs == true) {
/* 10 */       return true;
/*    */     }
/* 12 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\Overlay1DisplayOverlayIngameProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */