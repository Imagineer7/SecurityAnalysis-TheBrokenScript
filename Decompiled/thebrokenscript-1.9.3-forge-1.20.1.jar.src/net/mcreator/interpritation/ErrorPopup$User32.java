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
/*    */ 
/*    */ 
/*    */ public interface User32
/*    */   extends Library
/*    */ {
/* 22 */   public static final User32 INSTANCE = (User32)Native.load("user32", User32.class);
/*    */   
/*    */   int MessageBoxA(int paramInt1, String paramString1, String paramString2, int paramInt2);
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\ErrorPopup$User32.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */