/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class VhsswitchProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world) {
/*  9 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).showvhs == true) {
/* 10 */       (ThebrokenscriptModVariables.MapVariables.get(world)).showvhs = false;
/* 11 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */     } else {
/* 13 */       (ThebrokenscriptModVariables.MapVariables.get(world)).showvhs = true;
/* 14 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\VhsswitchProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */