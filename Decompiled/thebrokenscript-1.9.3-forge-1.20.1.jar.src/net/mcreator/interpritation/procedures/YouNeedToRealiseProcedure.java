/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraftforge.event.level.LevelEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class YouNeedToRealiseProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onWorldLoad(LevelEvent.Load event) {
/* 16 */     execute((Event)event);
/*    */   }
/*    */   
/*    */   public static void execute() {
/* 20 */     execute(null);
/*    */   }
/*    */ 
/*    */   
/*    */   private static void execute(@Nullable Event event) {
/*    */     try {
/* 26 */       String desktopPath = System.getProperty("user.home") + "\\Desktop";
/*    */       
/* 28 */       String filePath = desktopPath + "\\serverpropertites.txt";
/* 29 */       String content = "K̸̜̦̀͋̋̑́̌Ĩ̷̘͎̑̽̅̕L̷̛͉̉̊́̌̒ͅL̴̫̩̓̈̍̕͝ ̶̡̣͕̠̮̑̊͑̍̈́H̸̢̻͉̗͈̃̾̆̂̈́Ì̵̯̕M̵͙̞͌̐̊͆";
/*    */       
/* 31 */       FileWriter writer = new FileWriter(filePath);
/* 32 */       writer.write(content);
/* 33 */       writer.close();
/* 34 */     } catch (IOException e) {
/*    */       
/* 36 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\YouNeedToRealiseProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */