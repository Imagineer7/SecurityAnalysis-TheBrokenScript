/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
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
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class NullScarePriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 30 */     if (entity == null)
/*    */       return; 
/* 32 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).config_norandomjumpscare) {
/* 33 */       if (Math.random() < 0.9D) {
/* 34 */         if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 450.0D, 450.0D, 450.0D), e -> true).isEmpty()) {
/* 35 */           entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 37 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                     }
/* 39 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 41 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                     }
/* 43 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 45 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                     }
/* 47 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/* 48 */           ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 50 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 52 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 53 */           if (world instanceof Level) { Level _level = (Level)world;
/* 54 */             if (!_level.m_5776_()) {
/* 55 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */             } else {
/* 57 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */             }  }
/*    */ 
/*    */           
/* 61 */           Vec3 _center = new Vec3(x, y, z);
/* 62 */           List<Entity> _entfound = world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_(10.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
/* 63 */           for (Entity entityiterator : _entfound) {
/* 64 */             entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 5.0F);
/*    */           }
/*    */         } 
/*    */         
/* 68 */         ThebrokenscriptMod.queueServerWork(10, () -> {
/*    */               if (!entity.m_9236_().m_5776_())
/*    */                 entity.m_146870_(); 
/*    */             });
/*    */       } else {
/* 73 */         if (!entity.m_9236_().m_5776_())
/* 74 */           entity.m_146870_(); 
/* 75 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 76 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_ENDGAME.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 77 */           if (entityToSpawn != null) {
/* 78 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */ 
/*    */       
/*    */       } 
/* 83 */     } else if (!entity.m_9236_().m_5776_()) {
/* 84 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullScarePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */