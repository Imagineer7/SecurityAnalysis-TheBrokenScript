/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class NullWatchingPriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     boolean found = false;
/* 14 */     double angertype = 0.0D;
/* 15 */     double sx = 0.0D;
/* 16 */     double sy = 0.0D;
/* 17 */     double sz = 0.0D;
/* 18 */     if (world instanceof Level) { Level _level = (Level)world;
/* 19 */       if (!_level.m_5776_()) {
/* 20 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       } else {
/* 22 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullWatchingPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */