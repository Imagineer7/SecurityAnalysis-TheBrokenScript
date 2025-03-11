/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ChunkManipulationEngine;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class ChunkRemoverOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (entity.m_9236_().m_46472_() == Level.f_46428_) {
/* 20 */       if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 21 */         if (Math.random() < 0.99D) {
/* 22 */           if (!entity.m_9236_().m_5776_())
/* 23 */             entity.m_146870_(); 
/*    */         } else {
/* 25 */           if (world instanceof Level) { Level _level = (Level)world;
/* 26 */             if (!_level.m_5776_()) {
/* 27 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */             } else {
/* 29 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */             }  }
/*    */           
/* 32 */           if (world instanceof ServerLevel) {
/* 33 */             ServerLevel level = (ServerLevel)world;
/* 34 */             BlockPos pos = BlockPos.m_274561_(x, y, z);
/* 35 */             ChunkManipulationEngine.clearChunk((Level)level, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*    */           } 
/* 37 */           if (!entity.m_9236_().m_5776_()) {
/* 38 */             entity.m_146870_();
/*    */           }
/*    */         } 
/* 41 */       } else if (!entity.m_9236_().m_5776_()) {
/* 42 */         entity.m_146870_();
/*    */       }
/*    */     
/* 45 */     } else if (!entity.m_9236_().m_5776_()) {
/* 46 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ChunkRemoverOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */