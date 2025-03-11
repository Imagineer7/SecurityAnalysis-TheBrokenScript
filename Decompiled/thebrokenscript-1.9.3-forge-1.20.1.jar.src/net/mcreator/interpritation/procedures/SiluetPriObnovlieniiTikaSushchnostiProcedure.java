/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class SiluetPriObnovlieniiTikaSushchnostiProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 26 */     if (entity == null)
/*    */       return; 
/* 28 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 29 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 31 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 33 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 35 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 37 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 39 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 41 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*    */     }
/* 43 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 44 */       if (Math.random() < 0.5D) {
/* 45 */         if (!entity.m_9236_().m_5776_())
/* 46 */           entity.m_146870_(); 
/* 47 */         ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 49 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 51 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 52 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 53 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.STRIKE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 54 */           if (entityToSpawn != null) {
/* 55 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */         
/* 58 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 59 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.SILUET_CHASE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 60 */           if (entityToSpawn != null) {
/* 61 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */       
/*    */       } else {
/* 65 */         if (!entity.m_9236_().m_5776_())
/* 66 */           entity.m_146870_(); 
/* 67 */         ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 69 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 71 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 72 */         if (world instanceof Level) { Level _level = (Level)world;
/* 73 */           if (!_level.m_5776_()) {
/* 74 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */           } else {
/* 76 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */           }  }
/*    */         
/* 79 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 80 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CANT_YOU_SEE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 81 */           if (entityToSpawn != null) {
/* 82 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */       
/*    */       } 
/*    */     }
/* 87 */     if (world instanceof Level) { Level _lvl19 = (Level)world; if (_lvl19.m_46461_()) {
/* 88 */         if (!entity.m_9236_().m_5776_())
/* 89 */           entity.m_146870_(); 
/* 90 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 91 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*    */       
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SiluetPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */