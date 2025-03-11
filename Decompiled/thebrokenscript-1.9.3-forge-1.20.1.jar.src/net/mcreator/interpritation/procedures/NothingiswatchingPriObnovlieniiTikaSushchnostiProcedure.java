/*    */ package net.mcreator.interpritation.procedures;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.Vec3i;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LightningBolt;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class NothingiswatchingPriObnovlieniiTikaSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 25 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 28 */     Vec3 _center = new Vec3(x, y, z);
/* 29 */     List<Entity> _entfound = world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_(5.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
/* 30 */     for (Entity entityiterator : _entfound) {
/* 31 */       if (entityiterator != entity) {
/* 32 */         entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 15.0F);
/*    */       }
/*    */     } 
/*    */     
/* 36 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 37 */       if (Math.random() < 0.7D) {
/* 38 */         if (!entity.m_9236_().m_5776_())
/* 39 */           entity.m_146870_(); 
/* 40 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 41 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NOTHINGISWATCHINGCHASE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 42 */           if (entityToSpawn != null) {
/* 43 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */       
/*    */       } else {
/* 47 */         if (!entity.m_9236_().m_5776_())
/* 48 */           entity.m_146870_(); 
/* 49 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 50 */           LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 51 */           entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x, y, z)));
/* 52 */           _level.m_7967_((Entity)entityToSpawn); }
/*    */       
/*    */       } 
/*    */     }
/* 56 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).isEmpty())
/* 57 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 59 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 61 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 63 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 65 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 1.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 67 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 69 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NothingiswatchingPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */