/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Vec3i;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LightningBolt;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class NullInvadeBaseOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 26 */     if (entity == null)
/*    */       return; 
/* 28 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 450.0D, 450.0D, 450.0D), e -> true).isEmpty()) {
/* 29 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 31 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 33 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 35 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 37 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 39 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 41 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/* 42 */       if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).isEmpty())
/* 43 */         if (Math.random() < 0.7D) {
/* 44 */           if (!entity.m_9236_().m_5776_())
/* 45 */             entity.m_146870_(); 
/* 46 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 47 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.WE_CAN_HEAR_U_OVERLAY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 48 */             if (entityToSpawn != null) {
/* 49 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */             } }
/*    */           
/* 52 */           if (world instanceof Level) { Level _level = (Level)world;
/* 53 */             if (!_level.m_5776_()) {
/* 54 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */             } else {
/* 56 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */             }  }
/*    */           
/* 59 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 60 */             LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 61 */             entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x, y, z)));
/* 62 */             _level.m_7967_((Entity)entityToSpawn); }
/*    */         
/*    */         } else {
/* 65 */           if (!entity.m_9236_().m_5776_())
/* 66 */             entity.m_146870_(); 
/* 67 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 68 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULLL.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 69 */             if (entityToSpawn != null)
/* 70 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*    */         
/*    */         }  
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullInvadeBaseOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */