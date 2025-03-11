/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.animal.IronGolem;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class FalseVillagerOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 22 */     if (entity == null)
/*    */       return; 
/* 24 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 25 */       if (Math.random() < 1.0E-4D) {
/* 26 */         if (!entity.m_9236_().m_5776_())
/* 27 */           entity.m_146870_(); 
/* 28 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 29 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 30 */           if (entityToSpawn != null) {
/* 31 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */       
/*    */       } 
/* 35 */       if (entity instanceof Mob) {
/*    */         try {
/* 37 */           ((Mob)entity).m_6710_(null);
/* 38 */         } catch (Exception e) {
/* 39 */           e.printStackTrace();
/*    */         }
/*    */       
/*    */       }
/* 43 */     } else if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 44 */       if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*    */ 
/*    */ 
/*    */         
/* 48 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/* 49 */           _entity.m_6710_(_ent); }  }
/* 50 */        if (!world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).isEmpty()) {
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 55 */         Entity entity1 = world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Mob) { Mob _entity = (Mob)entity1;
/*    */ 
/*    */ 
/*    */           
/* 59 */           entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/* 60 */             _entity.m_6710_(_ent); }
/*    */            }
/*    */       
/*    */       } 
/* 64 */     }  if (world instanceof Level) { Level _lvl11 = (Level)world; if (_lvl11.m_46461_() && 
/* 65 */         Math.random() < 1.0E-4D && 
/* 66 */         !entity.m_9236_().m_5776_())
/* 67 */         entity.m_146870_();  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\FalseVillagerOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */