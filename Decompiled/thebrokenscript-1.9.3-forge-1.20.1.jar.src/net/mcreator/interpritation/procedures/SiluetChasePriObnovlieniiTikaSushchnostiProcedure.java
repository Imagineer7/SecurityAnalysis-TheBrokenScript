/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.tags.BlockTags;
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
/*     */ public class SiluetChasePriObnovlieniiTikaSushchnostiProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  28 */     if (entity == null)
/*     */       return; 
/*  30 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 820.0D, 820.0D, 820.0D), e -> true).isEmpty()) {
/*  31 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  33 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  35 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  37 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  39 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  41 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  43 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*  44 */       if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */         
/*  48 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/*  49 */           _entity.m_6710_(_ent); }  }
/*     */     
/*  51 */     }  if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60734_() == Blocks.f_49990_) {
/*     */       
/*  53 */       Entity _ent = entity;
/*  54 */       _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/*  55 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/*  56 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/*  57 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  58 */         _serverPlayer.f_8906_.m_9774_(entity
/*  59 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/*  60 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/*  61 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/*  62 */             .m_146908_(), _ent.m_146909_()); }
/*     */     
/*     */     } 
/*  65 */     if (Math.random() < 0.01D && 
/*  66 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  67 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */ 
/*     */     
/*  70 */     if (Math.random() < 0.01D && 
/*  71 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  72 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */     
/*  74 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  75 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "gamemode survival @a"); }
/*     */     
/*  77 */     if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, y, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  79 */       BlockPos _pos = BlockPos.m_274561_(x + 1.0D, y, z);
/*  80 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, y, z), null);
/*  81 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  84 */     if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, y, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  86 */       BlockPos _pos = BlockPos.m_274561_(x - 1.0D, y, z);
/*  87 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x - 1.0D, y, z), null);
/*  88 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  91 */     if (world.m_8055_(BlockPos.m_274561_(x, y, z + 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  93 */       BlockPos _pos = BlockPos.m_274561_(x, y, z + 1.0D);
/*  94 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y, z + 1.0D), null);
/*  95 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  98 */     if (world.m_8055_(BlockPos.m_274561_(x, y, z - 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 100 */       BlockPos _pos = BlockPos.m_274561_(x, y, z - 1.0D);
/* 101 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y, z - 1.0D), null);
/* 102 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 105 */     if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, y + 1.0D, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 107 */       BlockPos _pos = BlockPos.m_274561_(x + 1.0D, y + 1.0D, z);
/* 108 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, y + 1.0D, z), null);
/* 109 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 112 */     if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, y + 1.0D, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 114 */       BlockPos _pos = BlockPos.m_274561_(x + 1.0D, y + 1.0D, z);
/* 115 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, y + 1.0D, z), null);
/* 116 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 119 */     if (world.m_8055_(BlockPos.m_274561_(x, y + 1.0D, z + 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 121 */       BlockPos _pos = BlockPos.m_274561_(x, y + 1.0D, z + 1.0D);
/* 122 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y + 1.0D, z + 1.0D), null);
/* 123 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/* 126 */     if (world.m_8055_(BlockPos.m_274561_(x, y + 1.0D, z - 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/* 128 */       BlockPos _pos = BlockPos.m_274561_(x, y + 1.0D, z - 1.0D);
/* 129 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y + 1.0D, z - 1.0D), null);
/* 130 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SiluetChasePriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */