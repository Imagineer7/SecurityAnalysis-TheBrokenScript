/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class CircuitStalkEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 19 */     if (entity == null)
/*    */       return; 
/* 21 */     if (Math.random() < 0.05D) {
/* 22 */       if (world instanceof Level) { Level _level = (Level)world;
/* 23 */         if (!_level.m_5776_()) {
/* 24 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youwillregretthat")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */         } else {
/* 26 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youwillregretthat")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */         }  }
/*    */       
/* 29 */       if (!entity.m_9236_().m_5776_())
/* 30 */         entity.m_146870_(); 
/* 31 */       ThebrokenscriptMod.queueServerWork(60, () -> {
/*    */             if (world instanceof ServerLevel) {
/*    */               ServerLevel _level = (ServerLevel)world;
/*    */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */               if (entityToSpawn != null)
/*    */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*    */             } 
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitStalkEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */