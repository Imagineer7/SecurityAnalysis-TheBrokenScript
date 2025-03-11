/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.ClipContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class OutOfCaveCheckOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 19 */     if (entity == null)
/*    */       return; 
/* 21 */     if (!entity.m_9236_().m_5776_())
/* 22 */       entity.m_146870_(); 
/* 23 */     if (!world.m_46861_(BlockPos.m_274561_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 25 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 27 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 29 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 31 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 33 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 35 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_())))
/* 36 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 37 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, 
/* 38 */             BlockPos.m_274561_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 40 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/* 42 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 44 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                       }
/* 46 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 48 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                       }
/* 50 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F).m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 52 */                           return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                         }
/* 54 */                       }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/* 55 */                   .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 57 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                       }
/* 59 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null))).m_82425_().m_123341_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 61 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/* 63 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 65 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/* 67 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_()
/* 68 */               .m_45547_(new ClipContext(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 70 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                       }
/* 72 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F), ((Entity)world
/* 73 */                   .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 75 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                       }
/* 77 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20299_(1.0F)
/* 78 */                   .m_82549_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 80 */                           return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                         }
/* 82 */                       }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20252_(1.0F).m_82490_(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/* 83 */                   .m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).stream().sorted((new Object() {
/*    */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 85 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                       }
/* 87 */                     }).compareDistOf(x, y, z)).findFirst().orElse(null)))
/* 88 */               .m_82425_().m_123343_()), MobSpawnType.MOB_SUMMONED);
/*    */         
/* 90 */         if (entityToSpawn != null)
/* 91 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*    */        
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\OutOfCaveCheckOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */