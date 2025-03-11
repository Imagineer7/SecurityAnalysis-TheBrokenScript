/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ 
/*     */ public class EntitySpawnerOnInitialEntitySpawnProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  16 */     if (entity == null)
/*     */       return; 
/*  18 */     double randomentity = 0.0D;
/*  19 */     if (world.m_6042_().m_63936_(world.m_8044_()) != 1 && 
/*  20 */       !(ThebrokenscriptModVariables.MapVariables.get(world)).config_noentitiesspawn)
/*  21 */       if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/*  22 */         if (Math.random() < 0.95D) {
/*  23 */           if (!entity.m_9236_().m_5776_()) {
/*  24 */             entity.m_146870_();
/*     */           }
/*  26 */         } else if (!(ThebrokenscriptModVariables.MapVariables.get(world)).isentityspawned) {
/*  27 */           (ThebrokenscriptModVariables.MapVariables.get(world)).isentityspawned = true;
/*  28 */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*  29 */           randomentity = Mth.m_216271_(RandomSource.m_216327_(), 1, 12);
/*  30 */           if (randomentity == 1.0D && 
/*  31 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  32 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_FLYING.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  33 */             if (entityToSpawn != null) {
/*  34 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  38 */           if (randomentity == 2.0D && 
/*  39 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  40 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_WATCHING.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  41 */             if (entityToSpawn != null) {
/*  42 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  46 */           if (randomentity == 2.0D && 
/*  47 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  48 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.SILUET.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  49 */             if (entityToSpawn != null) {
/*  50 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  54 */           if (randomentity == 3.0D && 
/*  55 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  56 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.SILUET_STARE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  57 */             if (entityToSpawn != null) {
/*  58 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  62 */           if (randomentity == 4.0D && 
/*  63 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  64 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.DECEIVER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  65 */             if (entityToSpawn != null) {
/*  66 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  70 */           if (randomentity == 5.0D && 
/*  71 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  72 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.FOLLOW.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  73 */             if (entityToSpawn != null) {
/*  74 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  78 */           if (randomentity == 6.0D && 
/*  79 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  80 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.HE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  81 */             if (entityToSpawn != null) {
/*  82 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  86 */           if (randomentity == 7.0D && 
/*  87 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  88 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.FARAWAY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  89 */             if (entityToSpawn != null) {
/*  90 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/*  94 */           if (randomentity == 8.0D && 
/*  95 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  96 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NOTHINGISWATCHING.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  97 */             if (entityToSpawn != null) {
/*  98 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/* 102 */           if (randomentity == 9.0D && 
/* 103 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 104 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT_DISGUISED_AS_CREEPER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 105 */             if (entityToSpawn != null) {
/* 106 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/* 110 */           if (randomentity == 10.0D && 
/* 111 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 112 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.PIG_CIRCUIT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 113 */             if (entityToSpawn != null) {
/* 114 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/* 118 */           if (randomentity == 11.0D && 
/* 119 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 120 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.HETZER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 121 */             if (entityToSpawn != null) {
/* 122 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/* 126 */           if (randomentity == 12.0D && 
/* 127 */             (ThebrokenscriptModVariables.MapVariables.get(world)).moonphase == 2.0D && 
/* 128 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 129 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END_OVERHAUL_STALK.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 130 */             if (entityToSpawn != null) {
/* 131 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */ 
/*     */           
/* 136 */           if (!entity.m_9236_().m_5776_()) {
/* 137 */             entity.m_146870_();
/*     */           }
/* 139 */         } else if (!entity.m_9236_().m_5776_()) {
/* 140 */           entity.m_146870_();
/*     */         }
/*     */       
/*     */       }
/* 144 */       else if (!entity.m_9236_().m_5776_()) {
/* 145 */         entity.m_146870_();
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\EntitySpawnerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */