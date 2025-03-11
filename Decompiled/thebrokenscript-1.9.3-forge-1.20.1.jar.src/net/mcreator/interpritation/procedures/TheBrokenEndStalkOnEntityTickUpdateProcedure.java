/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.animal.IronGolem;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.entity.vehicle.Boat;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class TheBrokenEndStalkOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 27 */     if (entity == null)
/*    */       return; 
/* 29 */     if (!world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 30 */       ((Entity)world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 32 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 34 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268464_)), 30.0F);
/*    */     }
/* 36 */     if (!world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 37 */       ((Entity)world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 39 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 41 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268464_)), 30.0F);
/*    */     }
/* 43 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).isEmpty())
/* 44 */       if (Math.random() < 0.7D)
/* 45 */       { if (!entity.m_9236_().m_5776_())
/* 46 */           entity.m_146870_(); 
/* 47 */         ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 49 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 51 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/* 52 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 53 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 54 */           if (entityToSpawn != null); }
/*    */         
/*    */          }
/*    */       
/* 58 */       else if (Math.random() < 0.7D)
/* 59 */       { if (!entity.m_9236_().m_5776_())
/* 60 */           entity.m_146870_(); 
/* 61 */         ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 63 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 65 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/* 66 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 67 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.STRIKE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 68 */           if (entityToSpawn != null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 75 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_())
/* 76 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 60, 1, false, false));  }
/*    */          }
/* 78 */       else { if (!entity.m_9236_().m_5776_()) {
/* 79 */           entity.m_146870_();
/*    */         }
/*    */ 
/*    */ 
/*    */         
/* 84 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_()) {
/* 85 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_216964_, 60, 1, false, false));
/*    */           } }
/*    */          }
/*    */        
/* 89 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty())
/* 90 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1200.0D, 1200.0D, 1200.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 92 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 94 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), y, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1200.0D, 1200.0D, 1200.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 96 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 98 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheBrokenEndStalkOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */