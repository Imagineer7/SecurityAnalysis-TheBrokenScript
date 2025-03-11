/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class NullFlyingOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 25 */     if (entity == null)
/*    */       return; 
/* 27 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/* 28 */       if (!entity.m_9236_().m_5776_())
/* 29 */         entity.m_146870_(); 
/* 30 */       if (Math.random() < 0.7D)
/* 31 */       { ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 33 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 35 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*    */       
/* 37 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 38 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_IS_HERE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 39 */         if (entityToSpawn != null) {
/* 40 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */         } }
/*    */     
/*    */     } 
/*    */     
/* 45 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 450.0D, 450.0D, 450.0D), e -> true).isEmpty()) {
/* 46 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 48 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 50 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 52 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 54 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 56 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 58 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*    */     }
/* 60 */     if (world instanceof Level) { Level _lvl15 = (Level)world; if (_lvl15.m_46461_() && 
/* 61 */         !entity.m_9236_().m_5776_())
/* 62 */         entity.m_146870_();  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullFlyingOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */