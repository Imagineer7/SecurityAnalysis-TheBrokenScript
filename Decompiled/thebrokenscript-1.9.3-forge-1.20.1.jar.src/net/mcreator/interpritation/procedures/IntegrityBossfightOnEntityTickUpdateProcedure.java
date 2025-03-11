/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.vehicle.Boat;
/*     */ import net.minecraft.world.entity.vehicle.ChestBoat;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class IntegrityBossfightOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  38 */     if (entity == null)
/*     */       return; 
/*  40 */     boolean found = false;
/*  41 */     double attacktype = 0.0D;
/*  42 */     double sx = 0.0D;
/*  43 */     double sy = 0.0D;
/*  44 */     double sz = 0.0D;
/*  45 */     if (Math.random() < 0.5D) {
/*  46 */       world.m_7731_(BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), z + Mth.m_216271_(RandomSource.m_216327_(), 0, 5)), Blocks.f_50016_.m_49966_(), 3);
/*     */     } else {
/*  48 */       world.m_7731_(BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 0, 5), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), z - Mth.m_216271_(RandomSource.m_216327_(), 0, 5)), Blocks.f_50016_.m_49966_(), 3);
/*     */     } 
/*  50 */     if (world instanceof Level) { Level _level = (Level)world;
/*  51 */       if (!_level.m_5776_()) {
/*  52 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */       } else {
/*  54 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       }  }
/*     */     
/*  57 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  58 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "gamemode survival @a"); }
/*     */     
/*  60 */     entity.getPersistentData().m_128347_("attacktimer", entity.getPersistentData().m_128459_("attacktimer") + 1.0D);
/*  61 */     entity.getPersistentData().m_128347_("soundloop", entity.getPersistentData().m_128459_("soundloop") + 1.0D);
/*  62 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() && 
/*  63 */       entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */       
/*  67 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/*  68 */         _entity.m_6710_(_ent); }
/*     */        }
/*  70 */      if (!world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  75 */       if (!((Entity)world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/*  76 */         ((Entity)world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  78 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/*  80 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*     */     }
/*  82 */     if (!world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  87 */       if (!((Entity)world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/*  88 */         ((Entity)world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  90 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/*  92 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*     */     }
/*  94 */     if (!world.m_6443_(ChestBoat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  99 */       if (!((Entity)world.m_6443_(ChestBoat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 100 */         ((Entity)world.m_6443_(ChestBoat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 102 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/* 104 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*     */     }
/* 106 */     if (entity.getPersistentData().m_128459_("soundloop") > 660.0D) {
/* 107 */       entity.getPersistentData().m_128347_("soundloop", 0.0D);
/* 108 */       if (world instanceof Level) { Level _level = (Level)world;
/* 109 */         if (!_level.m_5776_()) {
/* 110 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:thebrokenend_chase")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */         } else {
/* 112 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:thebrokenend_chase")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */         }  }
/*     */     
/*     */     } 
/* 116 */     if (entity.getPersistentData().m_128459_("attacktimer") > 200.0D) {
/* 117 */       entity.getPersistentData().m_128347_("attacktimer", 0.0D);
/* 118 */       attacktype = Mth.m_216271_(RandomSource.m_216327_(), 1, 6);
/* 119 */       if (attacktype == 1.0D) {
/* 120 */         for (int index0 = 0; index0 < 15; index0++) {
/* 121 */           if (Math.random() < 0.5D)
/* 122 */           { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 123 */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.MISSILE.get()).m_262496_(_level, BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 0, 35), 200.0D, z + Mth.m_216271_(RandomSource.m_216327_(), 0, 35)), MobSpawnType.MOB_SUMMONED);
/*     */               
/* 125 */               if (entityToSpawn != null) {
/* 126 */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */               } }
/*     */             
/*     */              }
/* 130 */           else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 131 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.MISSILE.get()).m_262496_(_level, BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 0, 35), 200.0D, z - Mth.m_216271_(RandomSource.m_216327_(), 0, 35)), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 133 */             if (entityToSpawn != null) {
/* 134 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */         
/*     */         } 
/*     */       }
/*     */       
/* 140 */       if (attacktype == 2.0D) {
/* 141 */         if (world instanceof Level) { Level _level = (Level)world;
/* 142 */           if (!_level.m_5776_()) {
/* 143 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 55.0F, 1.0F);
/*     */           } else {
/* 145 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 55.0F, 1.0F, false);
/*     */           }  }
/*     */         
/* 148 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 149 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 200, 3, false, false));  }
/* 150 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 151 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 200, 1, false, false));  }
/* 152 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 153 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 200, 100, false, false));  }
/* 154 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 155 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 200, 1, false, false));  }
/* 156 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 157 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19609_, 200, 1, false, false));  }
/*     */       
/* 159 */       }  if (attacktype == 3.0D) {
/* 160 */         if (world instanceof Level) { Level _level = (Level)world;
/* 161 */           if (!_level.m_5776_()) {
/* 162 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 55.0F, 1.0F);
/*     */           } else {
/* 164 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 55.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 171 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_()) {
/* 172 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 200, 1, false, false));
/*     */           } }
/*     */ 
/*     */ 
/*     */         
/* 177 */         entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_()) {
/* 178 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 200, 1, false, false));
/*     */           } }
/*     */ 
/*     */ 
/*     */         
/* 183 */         entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/* 184 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 200, 1, false, false));  }
/*     */       
/* 186 */       }  if (attacktype == 4.0D) {
/* 187 */         if (world instanceof Level) { Level _level = (Level)world;
/* 188 */           if (!_level.m_5776_()) {
/* 189 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 55.0F, 1.0F);
/*     */           } else {
/* 191 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 55.0F, 1.0F, false);
/*     */           }  }
/*     */         
/* 194 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 195 */           _level.m_8615_(Mth.m_216271_(RandomSource.m_216327_(), 1, 18000)); }
/*     */       
/* 197 */       }  if (attacktype == 5.0D) {
/* 198 */         for (int index1 = 0; index1 < 45; index1++) {
/* 199 */           if (Math.random() < 0.5D) {
/* 200 */             world.m_7731_(BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 0, 35), y + Mth.m_216271_(RandomSource.m_216327_(), 1, 10), z + Mth.m_216271_(RandomSource.m_216327_(), 0, 35)), ((Block)ThebrokenscriptModBlocks.DISRUPTION
/* 201 */                 .get()).m_49966_(), 3);
/*     */           } else {
/* 203 */             world.m_7731_(BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 0, 35), y + Mth.m_216271_(RandomSource.m_216327_(), 1, 10), z - Mth.m_216271_(RandomSource.m_216327_(), 0, 35)), ((Block)ThebrokenscriptModBlocks.DISRUPTION
/* 204 */                 .get()).m_49966_(), 3);
/*     */           } 
/*     */         } 
/*     */       }
/* 208 */       if (attacktype == 6.0D)
/* 209 */         for (int index2 = 0; index2 < 200; index2++) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 214 */           Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1;
/* 215 */             _entity.m_21153_(Mth.m_216271_(RandomSource.m_216327_(), 1, 20)); }
/*     */         
/*     */         }  
/*     */     } 
/* 219 */     sx = -3.0D;
/* 220 */     found = false;
/* 221 */     for (int index3 = 0; index3 < 6; index3++) {
/* 222 */       sy = -3.0D;
/* 223 */       for (int index4 = 0; index4 < 6; index4++) {
/* 224 */         sz = -3.0D;
/* 225 */         for (int index5 = 0; index5 < 6; index5++) {
/* 226 */           if (world.m_8055_(BlockPos.m_274561_(x + sx, y + sy, z + sz)).m_60734_() == Blocks.f_49990_ || world.m_8055_(BlockPos.m_274561_(x + sx, y + sy, z + sz)).m_60734_() == Blocks.f_49990_) {
/* 227 */             found = true;
/*     */           }
/* 229 */           sz++;
/*     */         } 
/* 231 */         sy++;
/*     */       } 
/* 233 */       sx++;
/*     */     } 
/* 235 */     if (found == true)
/* 236 */       world.m_7731_(BlockPos.m_274561_(sx, sy, sz), Blocks.f_50440_.m_49966_(), 3); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\IntegrityBossfightOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */