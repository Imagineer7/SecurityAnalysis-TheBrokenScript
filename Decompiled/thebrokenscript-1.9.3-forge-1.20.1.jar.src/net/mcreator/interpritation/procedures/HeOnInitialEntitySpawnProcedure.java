/*    */ package net.mcreator.interpritation.procedures;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Vec3i;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LightningBolt;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class HeOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 21 */     boolean found = false;
/* 22 */     double sx = 0.0D;
/* 23 */     double sy = 0.0D;
/* 24 */     double sz = 0.0D;
/* 25 */     if (world instanceof Level) { Level _level = (Level)world;
/* 26 */       if (!_level.m_5776_()) {
/* 27 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:himspawn")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       } else {
/* 29 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:himspawn")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       }  }
/*    */     
/* 32 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 33 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "weather rain"); }
/* 34 */      if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */       LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 36 */       entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x, y, z)));
/* 37 */       _level.m_7967_((Entity)entityToSpawn); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\HeOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */