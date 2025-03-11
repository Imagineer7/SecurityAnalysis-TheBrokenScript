/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftWalkEntity;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class CircuitStalkOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  32 */     if (entity == null)
/*     */       return; 
/*  34 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty())
/*  35 */       if (Math.random() < 0.5D)
/*  36 */       { if (!entity.m_9236_().m_5776_()) {
/*  37 */           entity.m_146870_();
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*  42 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/*  43 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 500, 1));  }
/*  44 */          if (world instanceof Level) { Level _level = (Level)world;
/*  45 */           if (!_level.m_5776_()) {
/*  46 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */           } else {
/*  48 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */           }  }
/*     */         
/*  51 */         if (world instanceof Level) { Level _level = (Level)world;
/*  52 */           if (!_level.m_5776_()) {
/*  53 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:circuitminigamespeechandcounting")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */           } else {
/*  55 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:circuitminigamespeechandcounting")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */           }  }
/*     */         
/*  58 */         ThebrokenscriptMod.queueServerWork(1800, () -> {
/*     */               if (world instanceof ServerLevel) {
/*     */                 ServerLevel _level = (ServerLevel)world;
/*     */                 Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.OUT_OF_CAVE_CHECK.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */                 if (entityToSpawn != null) {
/*     */                   entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */                 }
/*     */               } 
/*     */             }); }
/*  67 */       else if (Math.random() < 0.7D)
/*  68 */       { if (!entity.m_9236_().m_5776_())
/*  69 */           entity.m_146870_(); 
/*  70 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  71 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  72 */           if (entityToSpawn != null) {
/*  73 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  80 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/*  81 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_216964_, 60, 1));  }
/*     */          }
/*  83 */       else { if (!entity.m_9236_().m_5776_())
/*  84 */           entity.m_146870_(); 
/*  85 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  86 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CURVED.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  87 */           if (entityToSpawn != null) {
/*  88 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  95 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_()) {
/*  96 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_216964_, 60, 1));
/*     */           } }
/*     */          }
/*     */        
/* 100 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).isEmpty()) {
/* 101 */       if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */         
/* 105 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/* 106 */           _entity.m_6710_(_ent); }  }
/* 107 */        if (entity instanceof net.mcreator.interpritation.entity.CircuitStareEntity) {
/* 108 */         entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 110 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 112 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 114 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 116 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 118 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 120 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*     */       }
/* 122 */       if (entity instanceof CircuitMineshaftWalkEntity) {
/* 123 */         entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 125 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 127 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 129 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 131 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2100.0D, 2100.0D, 2100.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 133 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 135 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/* 136 */         entity.getPersistentData().m_128347_("distance", entity.getPersistentData().m_128459_("distance") + 1.0D);
/* 137 */         if (entity.getPersistentData().m_128459_("distance") > 145.0D) {
/* 138 */           entity.getPersistentData().m_128347_("distance", 0.0D);
/*     */         }
/* 140 */         if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).isEmpty())
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 206 */           if (!world.m_6443_(CircuitMineshaftWalkEntity.class, AABB.m_165882_(new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(entity.getPersistentData().m_128459_("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123341_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(entity.getPersistentData().m_128459_("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123342_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(entity.getPersistentData().m_128459_("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123343_()), 3.0D, 3.0D, 3.0D), e -> true).isEmpty()) {
/* 207 */             if (!entity.m_9236_().m_5776_())
/* 208 */               entity.m_146870_(); 
/* 209 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 210 */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT_MINESHAFT_FLEE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 211 */               if (entityToSpawn != null)
/* 212 */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*     */           
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitStalkOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */