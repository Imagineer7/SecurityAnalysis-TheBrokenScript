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
/*    */ public class FarawayPriObnovlieniiTikaSushchnostiProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 26 */     if (entity == null)
/*    */       return; 
/* 28 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).isEmpty()) {
/* 29 */       if (!entity.m_9236_().m_5776_())
/* 30 */         entity.m_146870_(); 
/* 31 */       ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 33 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 35 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 36 */       if (world instanceof Level) { Level _level = (Level)world;
/* 37 */         if (!_level.m_5776_()) {
/* 38 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */         } else {
/* 40 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */         }  }
/*    */       
/* 43 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 44 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JUMPOSCROOOO.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 45 */         if (entityToSpawn != null) {
/* 46 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */         } }
/*    */       
/* 49 */       if (Math.random() < 0.5D)
/* 50 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 51 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 555, 2.0D, 2.0D, 2.0D, 0.0D); }
/*    */          }
/* 53 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 54 */         _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.EYES.get(), x, y, z, 555, 2.0D, 2.0D, 2.0D, 0.0D); }
/*    */     
/*    */     } 
/* 57 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty())
/* 58 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 60 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 62 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 64 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 66 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 1.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 68 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 70 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\FarawayPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */