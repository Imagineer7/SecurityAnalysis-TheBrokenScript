/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
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
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class NulllPriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 25 */     if (entity == null)
/*    */       return; 
/* 27 */     if (world instanceof Level) { Level _level = (Level)world;
/* 28 */       if (!_level.m_5776_()) {
/* 29 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       } else {
/* 31 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */     
/* 34 */     if (world instanceof Level) { Level _level = (Level)world;
/* 35 */       if (!_level.m_5776_()) {
/* 36 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       } else {
/* 38 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */     
/* 41 */     ThebrokenscriptMod.queueServerWork(450, () -> {
/*    */           if (world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "stopsound @a");
/*    */           } 
/*    */           if (!entity.m_9236_().m_5776_())
/*    */             entity.m_146870_(); 
/*    */           if (Math.random() < 0.7D && world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_IS_HERE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */             if (entityToSpawn != null)
/*    */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*    */           } 
/*    */         });
/* 55 */     (ThebrokenscriptModVariables.MapVariables.get(world)).reputation--;
/* 56 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NulllPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */