/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
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
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class TheBrokenEndOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  43 */     if (entity == null)
/*     */       return; 
/*  45 */     double heights = 0.0D;
/*  46 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  47 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "gamemode survival @a"); }
/*     */     
/*  49 */     heights = y + Mth.m_216271_(RandomSource.m_216327_(), 1, 8);
/*  50 */     entity.getPersistentData().m_128347_("a", entity.getPersistentData().m_128459_("a") + 1.0D);
/*  51 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1450.0D, 1450.0D, 1450.0D), e -> true).isEmpty() && 
/*  52 */       entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */       
/*  56 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/*  57 */         _entity.m_6710_(_ent); }
/*     */        }
/*  59 */      if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, heights, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  61 */       BlockPos _pos = BlockPos.m_274561_(x + 1.0D, heights, z);
/*  62 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, heights, z), null);
/*  63 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  66 */     if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, heights, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  68 */       BlockPos _pos = BlockPos.m_274561_(x - 1.0D, heights, z);
/*  69 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x - 1.0D, heights, z), null);
/*  70 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  73 */     if (world.m_8055_(BlockPos.m_274561_(x, heights, z + 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  75 */       BlockPos _pos = BlockPos.m_274561_(x, heights, z + 1.0D);
/*  76 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, heights, z + 1.0D), null);
/*  77 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  80 */     if (world.m_8055_(BlockPos.m_274561_(x, heights, z - 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  82 */       BlockPos _pos = BlockPos.m_274561_(x, heights, z - 1.0D);
/*  83 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, heights, z - 1.0D), null);
/*  84 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  87 */     if (entity.getPersistentData().m_128459_("a") > 100.0D) {
/*  88 */       entity.getPersistentData().m_128347_("a", 0.0D);
/*  89 */       if (world instanceof Level) { Level _level = (Level)world;
/*  90 */         if (!_level.m_5776_()) {
/*  91 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:theendisnear")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */         } else {
/*  93 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:theendisnear")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */         }  }
/*     */       
/*  96 */       if (Math.random() < 0.7D) {
/*  97 */         ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  99 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/* 101 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 5.0D, z));
/*     */       }
/* 103 */       if (Math.random() < 0.7D) {
/* 104 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 105 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */         
/* 107 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 108 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_1ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 109 */           if (entityToSpawn != null) {
/* 110 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */       
/*     */       } 
/* 114 */       if (Math.random() < 0.7D) {
/* 115 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 116 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */         
/* 118 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 119 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_2ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 120 */           if (entityToSpawn != null) {
/* 121 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */       
/*     */       } 
/* 125 */       if (Math.random() < 0.7D) {
/* 126 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 127 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */         
/* 129 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 130 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.WE_CAN_HEAR_U_OVERLAY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 131 */           if (entityToSpawn != null) {
/* 132 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */       
/*     */       } 
/*     */     } 
/* 137 */     if (!world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 138 */       ((Entity)world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true).stream().sorted((new Object() {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 140 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */             }
/* 142 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268464_)), 30.0F);
/*     */     }
/* 144 */     if (!world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 145 */       ((Entity)world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true).stream().sorted((new Object() {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 147 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */             }
/* 149 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268464_)), 30.0F);
/*     */     }
/* 151 */     entity.getPersistentData().m_128347_("interferences", entity.getPersistentData().m_128459_("interferences") + 1.0D);
/* 152 */     if (entity.getPersistentData().m_128459_("interferences") == 3.0D && 
/* 153 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 154 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.DOTSFRAME_1.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 155 */       if (entityToSpawn != null) {
/* 156 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */       } }
/*     */ 
/*     */     
/* 160 */     if (entity.getPersistentData().m_128459_("interferences") == 6.0D && 
/* 161 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 162 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.DOTSFRAME_2.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 163 */       if (entityToSpawn != null) {
/* 164 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */       } }
/*     */ 
/*     */     
/* 168 */     if (entity.getPersistentData().m_128459_("interferences") == 9.0D && 
/* 169 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 170 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.DOTSFRAME_3.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 171 */       if (entityToSpawn != null) {
/* 172 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */       } }
/*     */ 
/*     */     
/* 176 */     if (entity.getPersistentData().m_128459_("interferences") == 12.0D) {
/* 177 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 178 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.DOTSFRAME_4.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 179 */         if (entityToSpawn != null) {
/* 180 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */         } }
/*     */       
/* 183 */       entity.getPersistentData().m_128347_("interferences", 0.0D);
/*     */     } 
/* 185 */     if (world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60815_()) {
/*     */       
/* 187 */       Entity _ent = entity;
/* 188 */       _ent.m_6021_(x, y + 1.0D, z);
/* 189 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 190 */         _serverPlayer.f_8906_.m_9774_(x, y + 1.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/* 193 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 194 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 196 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 198 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 200 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 202 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 1.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 204 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 206 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*     */     }
/* 208 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 213 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_()) {
/* 214 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_216964_, 10, 1, false, false));
/*     */         } }
/*     */ 
/*     */ 
/*     */       
/* 219 */       entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/* 220 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19599_, 10, 1, false, false));  }
/*     */     
/* 222 */     }  int horizontalRadiusSquare = 9;
/* 223 */     int verticalRadiusSquare = 9;
/* 224 */     int yIterationsSquare = verticalRadiusSquare;
/* 225 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 226 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 227 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*     */           
/* 229 */           if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_204336_(BlockTags.create(new ResourceLocation("minecraft:water"))))
/* 230 */             world.m_7731_(BlockPos.m_274561_(x + xi, y + i, z + zi), Blocks.f_50652_.m_49966_(), 3); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheBrokenEndOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */