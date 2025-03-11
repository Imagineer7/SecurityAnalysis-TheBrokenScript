/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class Xxram2dieOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  25 */     if (entity == null)
/*     */       return; 
/*  27 */     if (world instanceof Level) { Level _lvl0 = (Level)world; if (_lvl0.m_46461_() && 
/*  28 */         !entity.m_9236_().m_5776_())
/*  29 */         entity.m_146870_();  }
/*     */     
/*  31 */     if (world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60815_()) {
/*     */       
/*  33 */       Entity _ent = entity;
/*  34 */       _ent.m_6021_(x, y + 1.0D, z);
/*  35 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  36 */         _serverPlayer.f_8906_.m_9774_(x, y + 1.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/*  39 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/*  40 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  42 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  44 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  46 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  48 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 1.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  50 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  52 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*     */     }
/*  54 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*     */       
/*  56 */       Entity _ent = entity;
/*  57 */       _ent.m_6021_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  59 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/*  61 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  63 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  65 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  67 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  69 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  71 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/*  73 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*  74 */               .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  76 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  78 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123341_(), y, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  80 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/*  82 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  84 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  86 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  88 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  90 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  92 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/*  94 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*  95 */               .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  97 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  99 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123343_());
/* 100 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 101 */         _serverPlayer.f_8906_.m_9774_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 103 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 105 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 107 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/* 109 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 111 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/* 113 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 115 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                       }
/* 117 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/* 118 */                 .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 120 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/* 122 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123341_(), y, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 124 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 126 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 128 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/* 130 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 132 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/* 134 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 136 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                       }
/* 138 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/* 139 */                 .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 141 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/* 143 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123343_(), _ent
/* 144 */             .m_146908_(), _ent.m_146909_()); }
/*     */       
/* 146 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_()) {
/* 147 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19609_, 10, 3, false, false));
/*     */         } }
/*     */ 
/*     */ 
/*     */       
/* 152 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/* 153 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 10, 1, false, false));  }
/* 154 */        entity.getPersistentData().m_128347_("Anger", entity.getPersistentData().m_128459_("Anger") + 1.0D);
/* 155 */       if (entity.getPersistentData().m_128459_("Anger") != 3.0D)
/* 156 */         if (Math.random() < 0.7D) {
/* 157 */           if (!entity.m_9236_().m_5776_())
/* 158 */             entity.m_146870_(); 
/* 159 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 160 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULLL.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 161 */             if (entityToSpawn != null) {
/* 162 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */         
/*     */         } else {
/* 166 */           if (!entity.m_9236_().m_5776_())
/* 167 */             entity.m_146870_(); 
/* 168 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 169 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.BAN.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 170 */             if (entityToSpawn != null)
/* 171 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*     */         
/*     */         }  
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\Xxram2dieOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */