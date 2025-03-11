/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class SiluetChasePriNachalnomPrizyvieSushchnostiProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (world instanceof Level) { Level _level = (Level)world;
/* 19 */       if (!_level.m_5776_()) {
/* 20 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       } else {
/* 22 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */     
/* 25 */     ThebrokenscriptMod.queueServerWork(800, () -> {
/*    */           if (!entity.m_9236_().m_5776_())
/*    */             entity.m_146870_(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SiluetChasePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */