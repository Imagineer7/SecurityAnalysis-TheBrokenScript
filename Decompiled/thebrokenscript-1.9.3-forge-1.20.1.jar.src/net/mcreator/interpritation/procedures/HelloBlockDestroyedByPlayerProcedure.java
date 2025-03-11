/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class HelloBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 20 */     if (world instanceof Level) { Level _level = (Level)world;
/* 21 */       if (!_level.m_5776_()) {
/* 22 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       } else {
/* 24 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */     
/* 27 */     if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 28 */       StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "magmacross"));
/* 29 */       if (template != null) {
/* 30 */         template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*    */       } }
/*    */     
/* 33 */     (ThebrokenscriptModVariables.MapVariables.get(world)).ram2dietriggered = true;
/* 34 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\HelloBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */