/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.client.gui.components.EditBox;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DevCheckProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, HashMap guistate) {
/* 17 */     if (guistate == null)
/*    */       return; 
/* 19 */     if ((guistate.containsKey("text:dev_code") ? ((EditBox)guistate.get("text:dev_code")).m_94155_() : "").equals("2018")) {
/* 20 */       for (int index0 = 0; index0 < 1000; index0++) {
/* 21 */         if (!world.m_5776_() && world.m_7654_() != null)
/* 22 */           world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_("00000000000"), false); 
/* 23 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 24 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 25 */           if (entityToSpawn != null) {
/* 26 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */ 
/*    */       
/*    */       } 
/* 31 */     } else if (!world.m_5776_() && world.m_7654_() != null) {
/* 32 */       world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_("F A L S E"), false);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\DevCheckProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */