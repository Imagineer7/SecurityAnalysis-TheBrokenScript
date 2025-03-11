/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.entity.TheBrokenEndEntity;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class TheBrokenEndThisEntityKillsAnotherOneProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 27 */     if (world instanceof Level) { Level _level = (Level)world;
/* 28 */       if (!_level.m_5776_()) {
/* 29 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/* 31 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     if (!((Entity)world.m_6443_(TheBrokenEndEntity.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 39 */       ((Entity)world.m_6443_(TheBrokenEndEntity.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 41 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 43 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 44 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 45 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @p Here I am."); }
/*    */     
/* 47 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 48 */       Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.BAN.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 49 */       if (entityToSpawn != null)
/* 50 */         entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheBrokenEndThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */