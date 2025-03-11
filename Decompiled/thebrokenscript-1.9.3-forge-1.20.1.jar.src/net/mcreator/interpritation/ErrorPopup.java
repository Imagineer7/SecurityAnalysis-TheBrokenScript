/*    */ package net.mcreator.interpritation;
/*    */ 
/*    */ import com.sun.jna.Library;
/*    */ import com.sun.jna.Native;
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
/*    */ public class ErrorPopup
/*    */ {
/*    */   public static interface User32
/*    */     extends Library
/*    */   {
/* 22 */     public static final User32 INSTANCE = (User32)Native.load("user32", User32.class);
/*    */     
/*    */     int MessageBoxA(int param1Int1, String param1String1, String param1String2, int param1Int2); }
/*    */   
/*    */   public static void showMessage(String message, String title) {
/* 27 */     User32.INSTANCE.MessageBoxA(0, message, title, 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\ErrorPopup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */