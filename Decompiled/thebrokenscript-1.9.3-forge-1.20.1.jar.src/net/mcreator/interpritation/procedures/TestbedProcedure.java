/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import com.mojang.blaze3d.platform.Window;
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.entity.CircuitEntity;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import org.lwjgl.glfw.GLFW;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class TestbedProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 25 */     if (event.phase == TickEvent.Phase.END) {
/* 26 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_());
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 31 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 35 */     if (!world.m_6443_(CircuitEntity.class, AABB.m_165882_(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty())
/* 36 */       if (Math.random() < 0.7D) {
/* 37 */         Window minecraftWindow = Minecraft.m_91087_().m_91268_();
/*    */         
/* 39 */         long windowHandle = minecraftWindow.m_85439_();
/*    */         
/* 41 */         int xCoord = 50;
/* 42 */         int yCoord = 40;
/* 43 */         GLFW.glfwSetWindowPos(windowHandle, xCoord, yCoord);
/*    */       } else {
/* 45 */         Window minecraftWindow = Minecraft.m_91087_().m_91268_();
/*    */         
/* 47 */         long windowHandle = minecraftWindow.m_85439_();
/*    */         
/* 49 */         int xCoord = -50;
/* 50 */         int yCoord = -40;
/* 51 */         GLFW.glfwSetWindowPos(windowHandle, xCoord, yCoord);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TestbedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */