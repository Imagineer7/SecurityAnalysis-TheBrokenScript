/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class CircuitOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (world instanceof Level) { Level _level = (Level)world;
/* 20 */       if (!_level.m_5776_()) {
/* 21 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:circuit_jumpscare")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       } else {
/* 23 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:circuit_jumpscare")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */     
/* 26 */     if (world instanceof Level) { Level _level = (Level)world;
/* 27 */       if (!_level.m_5776_()) {
/* 28 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       } else {
/* 30 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */     
/* 33 */     if (world instanceof Level) { Level _level = (Level)world;
/* 34 */       if (!_level.m_5776_()) {
/* 35 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/* 37 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */     
/* 40 */     ThebrokenscriptMod.queueServerWork(400, () -> {
/*    */           if (!entity.m_9236_().m_5776_())
/*    */             entity.m_146870_(); 
/*    */           (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = false;
/*    */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */           (ThebrokenscriptModVariables.MapVariables.get(world)).nowayoutframe = 0.0D;
/*    */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */