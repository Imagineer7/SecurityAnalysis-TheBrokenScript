/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NulllPriObnovlieniiTikaSushchnostiProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  37 */     if (entity == null)
/*     */       return; 
/*  39 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  40 */       _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 2, 2.0D, 3.0D, 2.0D, 0.0D); }
/*  41 */      if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/*  42 */       ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 210.0D, 210.0D, 210.0D), e -> true).stream().sorted((new Object() {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  44 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */             }
/*  46 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.2F);
/*  47 */       ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 210.0D, 210.0D, 210.0D), e -> true).stream().sorted((new Object() {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  49 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */             }
/*  51 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/*     */     } 
/*  53 */     if (world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty())
/*  54 */     { if (!entity.m_9236_().m_5776_()) {
/*  55 */         entity.m_146870_();
/*     */       } }
/*  57 */     else if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */       
/*  61 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/*  62 */         _entity.m_6710_(_ent); }
/*     */        }
/*  64 */      if (Math.random() < 0.01D && 
/*  65 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  66 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */ 
/*     */     
/*  69 */     if (Math.random() < 0.01D && 
/*  70 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  71 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */     
/*  73 */     if (Math.random() < 0.1D) {
/*  74 */       if (Math.random() < 0.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  80 */         Entity _ent = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  81 */         _ent.m_6021_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  83 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  85 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_() + Mth.m_216271_(RandomSource.m_216327_(), 0, 0), ((Entity)world
/*  86 */             .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  88 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  90 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + Mth.m_216271_(RandomSource.m_216327_(), 0, 0), ((Entity)world
/*  91 */             .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  93 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  95 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_() + Mth.m_216271_(RandomSource.m_216327_(), 0, 0));
/*  96 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  97 */           _serverPlayer.f_8906_.m_9774_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  99 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 101 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_() + Mth.m_216271_(RandomSource.m_216327_(), 0, 0), ((Entity)world
/* 102 */               .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 104 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 106 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + Mth.m_216271_(RandomSource.m_216327_(), 0, 0), ((Entity)world
/* 107 */               .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 109 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 111 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_() + Mth.m_216271_(RandomSource.m_216327_(), 0, 0), _ent.m_146908_(), _ent.m_146909_());
/*     */            }
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 119 */         Entity _ent = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 120 */         _ent.m_6021_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 122 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 124 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_() - Mth.m_216271_(RandomSource.m_216327_(), 0, 0), ((Entity)world
/* 125 */             .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 127 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 129 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 131 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 133 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_() - Mth.m_216271_(RandomSource.m_216327_(), 0, 0));
/* 134 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 135 */           _serverPlayer.f_8906_.m_9774_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 137 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 139 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_() - Mth.m_216271_(RandomSource.m_216327_(), 0, 0), ((Entity)world
/* 140 */               .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 142 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 144 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 146 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 148 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_() - Mth.m_216271_(RandomSource.m_216327_(), 0, 0), _ent.m_146908_(), _ent.m_146909_()); }
/*     */       
/*     */       } 
/*     */     }
/* 152 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).config_noblockbreaking) {
/* 153 */       if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, y, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 155 */         BlockPos _pos = BlockPos.m_274561_(x + 1.0D, y, z);
/* 156 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, y, z), null);
/* 157 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */       
/* 160 */       if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, y, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 162 */         BlockPos _pos = BlockPos.m_274561_(x - 1.0D, y, z);
/* 163 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x - 1.0D, y, z), null);
/* 164 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */       
/* 167 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z + 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 169 */         BlockPos _pos = BlockPos.m_274561_(x, y, z + 1.0D);
/* 170 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y, z + 1.0D), null);
/* 171 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */       
/* 174 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z - 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 176 */         BlockPos _pos = BlockPos.m_274561_(x, y, z - 1.0D);
/* 177 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y, z - 1.0D), null);
/* 178 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */       
/* 181 */       if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, y + 1.0D, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 183 */         BlockPos _pos = BlockPos.m_274561_(x + 1.0D, y + 1.0D, z);
/* 184 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, y + 1.0D, z), null);
/* 185 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */       
/* 188 */       if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, y + 1.0D, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 190 */         BlockPos _pos = BlockPos.m_274561_(x + 1.0D, y + 1.0D, z);
/* 191 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, y + 1.0D, z), null);
/* 192 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */       
/* 195 */       if (world.m_8055_(BlockPos.m_274561_(x, y + 1.0D, z + 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 197 */         BlockPos _pos = BlockPos.m_274561_(x, y + 1.0D, z + 1.0D);
/* 198 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y + 1.0D, z + 1.0D), null);
/* 199 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */       
/* 202 */       if (world.m_8055_(BlockPos.m_274561_(x, y + 1.0D, z - 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:nullbreakablefixed")))) {
/*     */         
/* 204 */         BlockPos _pos = BlockPos.m_274561_(x, y + 1.0D, z - 1.0D);
/* 205 */         Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y + 1.0D, z - 1.0D), null);
/* 206 */         world.m_46961_(_pos, false);
/*     */       } 
/*     */     } 
/*     */     
/* 210 */     if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60734_() == Blocks.f_49990_ || world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60734_() == Blocks.f_49990_) {
/*     */       
/* 212 */       Entity _ent = entity;
/* 213 */       _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 214 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 215 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 216 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 217 */         _serverPlayer.f_8906_.m_9774_(entity
/* 218 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 219 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 220 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/* 221 */             .m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/* 224 */     if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60734_() == Blocks.f_49990_ || world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60734_() == Blocks.f_49990_) {
/*     */       
/* 226 */       Entity _ent = entity;
/* 227 */       _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 228 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 229 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 230 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 231 */         _serverPlayer.f_8906_.m_9774_(entity
/* 232 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 233 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 234 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/* 235 */             .m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/* 238 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).config_noblockbreaking && 
/* 239 */       Math.random() < 0.5D) {
/* 240 */       if (Math.random() < 0.5D) {
/* 241 */         world.m_7731_(BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 0, 2), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 3), z + Mth.m_216271_(RandomSource.m_216327_(), 0, 2)), Blocks.f_50016_.m_49966_(), 3);
/*     */       } else {
/* 243 */         world.m_7731_(BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 0, 2), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 3), z - Mth.m_216271_(RandomSource.m_216327_(), 0, 2)), Blocks.f_50016_.m_49966_(), 3);
/*     */       } 
/*     */     }
/*     */     
/* 247 */     int horizontalRadiusSquare = 2;
/* 248 */     int verticalRadiusSquare = 2;
/* 249 */     int yIterationsSquare = verticalRadiusSquare;
/* 250 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 251 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 252 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*     */           
/* 254 */           if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_60734_() == Blocks.f_49990_) {
/* 255 */             world.m_7731_(BlockPos.m_274561_(x + xi, y + i, z + zi), Blocks.f_50079_.m_49966_(), 3);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 260 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 261 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "gamemode survival @a"); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NulllPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */