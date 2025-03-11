/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class SafemodeprocedureProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 21 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).cancorrupted == true) {
/* 22 */       (ThebrokenscriptModVariables.MapVariables.get(world)).cancorrupted = false;
/* 23 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 24 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 25 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"Safe mode enabled\""); }
/*    */       
/* 27 */       if (world instanceof Level) { Level _level = (Level)world;
/* 28 */         if (!_level.m_5776_()) {
/* 29 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 1.0F, 0.0F);
/*    */         } else {
/* 31 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 1.0F, 0.0F, false);
/*    */         }  }
/*    */     
/*    */     } else {
/* 35 */       (ThebrokenscriptModVariables.MapVariables.get(world)).cancorrupted = true;
/* 36 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 37 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 38 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"Safe mode disabled\""); }
/*    */       
/* 40 */       if (world instanceof Level) { Level _level = (Level)world;
/* 41 */         if (!_level.m_5776_()) {
/* 42 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 1.0F, 0.0F);
/*    */         } else {
/* 44 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 1.0F, 0.0F, false);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SafemodeprocedureProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */