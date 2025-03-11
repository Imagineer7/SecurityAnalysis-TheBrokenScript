/*    */ package net.mcreator.interpritation;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import org.lwjgl.glfw.GLFW;
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
/*    */ public class A
/*    */ {
/*    */   public static void init() {
/* 23 */     long window = Minecraft.m_91087_().m_91268_().m_85439_();
/*    */ 
/*    */     
/* 26 */     GLFW.glfwSetWindowCloseCallback(window, win -> {
/*    */           if ((Minecraft.m_91087_()).f_91074_ != null)
/*    */             (Minecraft.m_91087_()).f_91074_.m_213846_((Component)Component.m_237113_("Err.<o>")); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\A.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */