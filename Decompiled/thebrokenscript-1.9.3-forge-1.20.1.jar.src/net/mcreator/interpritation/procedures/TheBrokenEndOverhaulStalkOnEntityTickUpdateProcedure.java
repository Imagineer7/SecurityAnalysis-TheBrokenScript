/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndOverhaulStalkEntity;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  26 */     if (entity == null)
/*     */       return; 
/*  28 */     entity.getPersistentData().m_128347_("distance", entity.getPersistentData().m_128459_("distance") + 2.0D);
/*  29 */     if (entity.getPersistentData().m_128459_("distance") > 700.0D) {
/*  30 */       entity.getPersistentData().m_128347_("distance", 0.0D);
/*     */     }
/*  32 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).isEmpty())
/*     */     {
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
/*  98 */       if (!world.m_6443_(TheBrokenEndOverhaulStalkEntity.class, AABB.m_165882_(new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(entity.getPersistentData().m_128459_("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123341_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(entity.getPersistentData().m_128459_("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123342_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(entity.getPersistentData().m_128459_("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 150.0D, 150.0D, 150.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123343_()), 3.0D, 3.0D, 3.0D), e -> true).isEmpty())
/*  99 */         if (Math.random() < 0.7D) {
/* 100 */           if (!entity.m_9236_().m_5776_())
/* 101 */             entity.m_146870_(); 
/* 102 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 103 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "stopsound @a"); }
/*     */           
/* 105 */           ThebrokenscriptMod.queueServerWork(500, () -> {
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel _level = (ServerLevel)world;
/*     */                   Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */                   if (entityToSpawn != null)
/*     */                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*     */                 } 
/*     */               });
/*     */         } else {
/* 114 */           if (!entity.m_9236_().m_5776_())
/* 115 */             entity.m_146870_(); 
/* 116 */           world.m_7731_(BlockPos.m_274561_(x, y - 1.0D, z), ((Block)ThebrokenscriptModBlocks.PHYSICAL_STACKTRACE.get()).m_49966_(), 3);
/*     */         }  
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */