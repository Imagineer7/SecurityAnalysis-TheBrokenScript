/*     */ package net.mcreator.interpritation.procedures;
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.Vec3i;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*     */ import net.minecraft.resources.ResourceKey;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LightningBolt;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class NullWatchingPriObnovlieniiTikaSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  44 */     if (entity == null)
/*     */       return; 
/*  46 */     double angertype = 0.0D;
/*  47 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty()) {
/*  48 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  50 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  52 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  54 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  56 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  58 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  60 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*     */     }
/*  62 */     if (!world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty()) {
/*  63 */       ((Entity)world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  65 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */             }
/*  67 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 55.0F);
/*     */     }
/*  69 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/*  70 */       angertype = Mth.m_216271_(RandomSource.m_216327_(), 1, 10);
/*  71 */       if (angertype == 1.0D) {
/*  72 */         if (!entity.m_9236_().m_5776_()) {
/*  73 */           entity.m_146870_();
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*  78 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 24.0D, 24.0D, 24.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/*  79 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 80, 1, false, false));  }
/*  80 */          if (world instanceof Level) { Level _level = (Level)world;
/*  81 */           if (!_level.m_5776_()) {
/*  82 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullflee")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */           } else {
/*  84 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullflee")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */           }  }
/*     */       
/*     */       } 
/*  88 */       if (angertype == 2.0D && 
/*  89 */         (ThebrokenscriptModVariables.MapVariables.get(world)).reputation != 2.0D) {
/*  90 */         if (!entity.m_9236_().m_5776_())
/*  91 */           entity.m_146870_(); 
/*  92 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  93 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULLL.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  94 */           if (entityToSpawn != null) {
/*  95 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 102 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 24.0D, 24.0D, 24.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/* 103 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_216964_, 50, 1, false, false));  }
/*     */       
/*     */       } 
/* 106 */       if (angertype == 3.0D)
/* 107 */         if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation == 0.0D) {
/* 108 */           if (!entity.m_9236_().m_5776_())
/* 109 */             entity.m_146870_(); 
/* 110 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 111 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_UNBEATABLE_BOSSFIGHT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 112 */             if (entityToSpawn != null) {
/* 113 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */         
/*     */         } else {
/* 117 */           if (!entity.m_9236_().m_5776_())
/* 118 */             entity.m_146870_(); 
/* 119 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 120 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULLL.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 121 */             if (entityToSpawn != null) {
/* 122 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 129 */           Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 24.0D, 24.0D, 24.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/* 130 */               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 50, 1, false, false));  }
/*     */         
/*     */         }  
/* 133 */       if (angertype == 4.0D) {
/* 134 */         if (!entity.m_9236_().m_5776_())
/* 135 */           entity.m_146870_(); 
/* 136 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 137 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */       
/* 139 */       }  if (angertype == 5.0D) {
/* 140 */         if (!entity.m_9236_().m_5776_())
/* 141 */           entity.m_146870_(); 
/* 142 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 143 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.EYES.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */       
/* 145 */       }  if (angertype == 6.0D) {
/* 146 */         if (!entity.m_9236_().m_5776_())
/* 147 */           entity.m_146870_(); 
/* 148 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 149 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 154 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity1; if (!_player.m_9236_().m_5776_()) {
/* 155 */             ResourceKey<Level> destinationType = ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:null_torture"));
/* 156 */             if (_player.m_9236_().m_46472_() == destinationType)
/*     */               return; 
/* 158 */             ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/* 159 */             if (nextLevel != null) {
/* 160 */               _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/* 161 */               _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/* 162 */               _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/* 163 */               for (MobEffectInstance _effectinstance : _player.m_21220_())
/* 164 */                 _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/* 165 */               _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*     */             } 
/*     */           }  }
/*     */       
/* 169 */       }  if (angertype == 7.0D) {
/* 170 */         if (!entity.m_9236_().m_5776_())
/* 171 */           entity.m_146870_(); 
/* 172 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 173 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 178 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity1; if (!_player.m_9236_().m_5776_()) {
/* 179 */             ResourceKey<Level> destinationType = ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:day_b"));
/* 180 */             if (_player.m_9236_().m_46472_() == destinationType)
/*     */               return; 
/* 182 */             ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/* 183 */             if (nextLevel != null) {
/* 184 */               _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/* 185 */               _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/* 186 */               _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/* 187 */               for (MobEffectInstance _effectinstance : _player.m_21220_())
/* 188 */                 _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/* 189 */               _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*     */             } 
/*     */           }  }
/*     */       
/* 193 */       }  if (angertype == 8.0D) {
/* 194 */         if (!entity.m_9236_().m_5776_())
/* 195 */           entity.m_146870_(); 
/* 196 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 197 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */         
/* 199 */         Entity _ent = entity;
/* 200 */         _ent.m_6021_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ);
/* 201 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 202 */           _serverPlayer.f_8906_.m_9774_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ, _ent
/* 203 */               .m_146908_(), _ent.m_146909_()); }
/*     */       
/*     */       } 
/* 206 */       if (angertype == 9.0D) {
/* 207 */         if (!entity.m_9236_().m_5776_())
/* 208 */           entity.m_146870_(); 
/* 209 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 210 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 216 */         Entity _ent = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 217 */         _ent.m_6021_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ);
/* 218 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 219 */           _serverPlayer.f_8906_.m_9774_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ, _ent
/* 220 */               .m_146908_(), _ent.m_146909_()); }
/*     */       
/*     */       } 
/* 223 */       if (angertype == 10.0D) {
/* 224 */         if (!entity.m_9236_().m_5776_())
/* 225 */           entity.m_146870_(); 
/* 226 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 227 */           LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 228 */           entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x, y, z)));
/* 229 */           _level.m_7967_((Entity)entityToSpawn); }
/*     */       
/*     */       } 
/*     */     } 
/* 233 */     if (world instanceof Level) { Level _lvl49 = (Level)world; if (_lvl49.m_46461_() && 
/* 234 */         !entity.m_9236_().m_5776_())
/* 235 */         entity.m_146870_();  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullWatchingPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */