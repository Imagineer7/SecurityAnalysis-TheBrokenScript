/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import com.sun.jna.Native;
/*    */ import com.sun.jna.win32.StdCallLibrary;
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
/*    */ 
/*    */ 
/*    */ public interface User32
/*    */   extends StdCallLibrary
/*    */ {
/* 36 */   public static final User32 INSTANCE = (User32)Native.load("user32", User32.class);
/*    */   
/*    */   int MessageBoxA(long paramLong, String paramString1, String paramString2, int paramInt);
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TriesToSleepProcedure$User32.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */