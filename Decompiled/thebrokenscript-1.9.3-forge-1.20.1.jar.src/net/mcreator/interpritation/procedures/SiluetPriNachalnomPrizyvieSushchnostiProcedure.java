/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.advancements.Advancement;
/*    */ import net.minecraft.advancements.AdvancementProgress;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
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
/*    */ public class SiluetPriNachalnomPrizyvieSushchnostiProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 27 */     if (entity == null)
/*    */       return; 
/* 29 */     if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 30 */       if (Math.random() < 0.7D) {
/* 31 */         if (!entity.m_9236_().m_5776_())
/* 32 */           entity.m_146870_(); 
/*    */       } else {
/* 34 */         if (world instanceof Level) { Level _level = (Level)world;
/* 35 */           if (!_level.m_5776_()) {
/* 36 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */           } else {
/* 38 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */           }  }
/*    */         
/* 41 */         if (Math.random() < 0.9D) {
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 46 */           Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity1;
/* 47 */             Advancement _adv = _player.f_8924_.m_129889_().m_136041_(new ResourceLocation("thebrokenscript:can_you_see_me"));
/* 48 */             AdvancementProgress _ap = _player.m_8960_().m_135996_(_adv);
/* 49 */             if (!_ap.m_8193_())
/* 50 */               for (String criteria : _ap.m_8219_()) {
/* 51 */                 _player.m_8960_().m_135988_(_adv, criteria);
/*    */               }  }
/*    */         
/*    */         } 
/* 55 */         ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */               if (!entity.m_9236_().m_5776_()) {
/*    */                 entity.m_146870_();
/*    */               }
/*    */               
/*    */               if (Math.random() < 0.01D && world instanceof ServerLevel) {
/*    */                 ServerLevel _level = (ServerLevel)world;
/*    */                 Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.SILUET_CHASE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */                 if (entityToSpawn != null) {
/*    */                   entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */                 }
/*    */               } 
/*    */             });
/*    */       } 
/* 69 */     } else if (!entity.m_9236_().m_5776_()) {
/* 70 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SiluetPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */