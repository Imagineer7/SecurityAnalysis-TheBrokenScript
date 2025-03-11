/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class TheBrokenEndStalkOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 20 */     if (entity == null)
/*    */       return; 
/* 22 */     if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 23 */       if (world.m_6042_().m_63936_(world.m_8044_()) > 4 || world.m_6042_().m_63936_(world.m_8044_()) == 4) {
/* 24 */         if ((ThebrokenscriptModVariables.MapVariables.get(world)).isthebrokenendspawned == true) {
/* 25 */           if (!entity.m_9236_().m_5776_())
/* 26 */             entity.m_146870_(); 
/*    */         } else {
/* 28 */           if (world instanceof Level) { Level _level = (Level)world;
/* 29 */             if (!_level.m_5776_()) {
/* 30 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:trevoga")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */             } else {
/* 32 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:trevoga")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */             }  }
/*    */           
/* 35 */           (ThebrokenscriptModVariables.MapVariables.get(world)).isthebrokenendspawned = true;
/* 36 */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 37 */           ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */                 if (!entity.m_9236_().m_5776_()) {
/*    */                   entity.m_146870_();
/*    */                 }
/*    */                 if (world instanceof Level) {
/*    */                   Level _level = (Level)world;
/*    */                   if (!_level.m_5776_()) {
/*    */                     _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.resonate")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */                   } else {
/*    */                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.resonate")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */                   } 
/*    */                 } 
/*    */                 if (Math.random() < 0.1D && world instanceof ServerLevel) {
/*    */                   ServerLevel _level = (ServerLevel)world;
/*    */                   Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */                   if (entityToSpawn != null)
/*    */                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*    */                 } 
/*    */               });
/*    */         } 
/*    */       } else {
/* 58 */         if (!entity.m_9236_().m_5776_())
/* 59 */           entity.m_146870_(); 
/* 60 */         if (world instanceof Level) { Level _level = (Level)world;
/* 61 */           if (!_level.m_5776_()) {
/* 62 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */           } else {
/* 64 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */           }
/*    */            }
/*    */       
/*    */       } 
/* 69 */     } else if (!entity.m_9236_().m_5776_()) {
/* 70 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheBrokenEndStalkOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */