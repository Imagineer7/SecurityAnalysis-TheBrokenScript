/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.Registries;
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
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.allay.Allay;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class NothingiswatchingchasePriObnovlieniiTikaSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  38 */     if (entity == null)
/*     */       return; 
/*  40 */     double breakblockYcoord = 0.0D;
/*  41 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true).isEmpty()) {
/*  42 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  44 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  46 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  48 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  50 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  52 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  54 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*  55 */       ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  57 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */             }
/*  59 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/*  60 */       if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */         
/*  64 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/*  65 */           _entity.m_6710_(_ent); }  }
/*     */     
/*  67 */     }  if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/*  68 */       ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  70 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */             }
/*  72 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 500.0F);
/*  73 */       if (!entity.m_9236_().m_5776_())
/*  74 */         entity.m_146870_(); 
/*  75 */       if (world instanceof Level) { Level _level = (Level)world;
/*  76 */         if (!_level.m_5776_()) {
/*  77 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */         } else {
/*  79 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */         }  }
/*     */       
/*  82 */       ThebrokenscriptMod.queueServerWork(20, () -> {
/*     */             if (!((Entity)world.m_6443_(Allay.class, AABB.m_165882_(new Vec3(x, y, z), 31.0D, 31.0D, 31.0D), ()).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  85 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*     */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/*     */               ((Entity)world.m_6443_(Allay.class, AABB.m_165882_(new Vec3(x, y, z), 31.0D, 31.0D, 31.0D), ()).stream().sorted((new Object() {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  90 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                     }
/*     */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*     */           });
/*     */     } 
/*  95 */     if (Math.random() < 1.0E-4D) {
/*     */       
/*  97 */       Entity _ent = entity;
/*  98 */       _ent.m_6021_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 100 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/* 102 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_() + Mth.m_216271_(RandomSource.m_216327_(), 2, 3), ((Entity)world
/* 103 */           .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 105 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/* 107 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 5.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 109 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/* 111 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_());
/* 112 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 113 */         _serverPlayer.f_8906_.m_9774_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 115 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 117 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_() + Mth.m_216271_(RandomSource.m_216327_(), 2, 3), ((Entity)world
/* 118 */             .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 120 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 122 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 5.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 124 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 126 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_(), _ent.m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/* 129 */     if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60734_() == Blocks.f_49990_) {
/*     */       
/* 131 */       Entity _ent = entity;
/* 132 */       _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 133 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 134 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 135 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 136 */         _serverPlayer.f_8906_.m_9774_(entity
/* 137 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 138 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 139 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/* 140 */             .m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/* 143 */     if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60734_() == Blocks.f_49990_) {
/*     */       
/* 145 */       Entity _ent = entity;
/* 146 */       _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 147 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 148 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 149 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 150 */         _serverPlayer.f_8906_.m_9774_(entity
/* 151 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 152 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 153 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/* 154 */             .m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/* 157 */     if (Math.random() < 0.1D) {
/* 158 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 159 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JUMPOSCOROOO.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 160 */         if (entityToSpawn != null); }
/*     */ 
/*     */       
/* 163 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 164 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.WRONG_OVERLAY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 165 */         if (entityToSpawn != null); }
/*     */     
/*     */     } 
/*     */     
/* 169 */     breakblockYcoord = Mth.m_216271_(RandomSource.m_216327_(), 1, 5) + y;
/* 170 */     if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, breakblockYcoord, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 172 */       BlockPos _pos = BlockPos.m_274561_(x + 1.0D, breakblockYcoord, z);
/* 173 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, breakblockYcoord, z), null);
/* 174 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 177 */     if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, breakblockYcoord, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 179 */       BlockPos _pos = BlockPos.m_274561_(x - 1.0D, breakblockYcoord, z);
/* 180 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x - 1.0D, breakblockYcoord, z), null);
/* 181 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 184 */     if (world.m_8055_(BlockPos.m_274561_(x, breakblockYcoord, z + 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 186 */       BlockPos _pos = BlockPos.m_274561_(x, breakblockYcoord, z + 1.0D);
/* 187 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, breakblockYcoord, z + 1.0D), null);
/* 188 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 191 */     if (world.m_8055_(BlockPos.m_274561_(x, breakblockYcoord, z - 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 193 */       BlockPos _pos = BlockPos.m_274561_(x, breakblockYcoord, z - 1.0D);
/* 194 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, breakblockYcoord, z - 1.0D), null);
/* 195 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 198 */     if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 200 */       BlockPos _pos = BlockPos.m_274561_(x, y - 1.0D, z);
/* 201 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y - 1.0D, z), null);
/* 202 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NothingiswatchingchasePriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */