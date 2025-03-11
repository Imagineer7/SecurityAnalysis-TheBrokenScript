/*    */ package net.mcreator.interpritation.procedures;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class FieldGeneratorOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 20 */     double doaction = 0.0D;
/* 21 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty()) {
/* 22 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 23 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 24 */       if (Math.random() < 0.7D)
/* 25 */       { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 26 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "fieldbase"));
/* 27 */           if (template != null) {
/* 28 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y - 5.0D, z), BlockPos.m_274561_(x, y - 5.0D, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*    */           } }
/*    */         
/*    */          }
/*    */       
/* 33 */       else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 34 */         StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "fieldtree"));
/* 35 */         if (template != null) {
/* 36 */           template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y - 5.0D, z), BlockPos.m_274561_(x, y - 5.0D, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*    */         } }
/*    */ 
/*    */ 
/*    */       
/* 41 */       if (world.m_8055_(BlockPos.m_274561_(x + 16.0D, y, z)).m_60734_() != Blocks.f_50752_) {
/* 42 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 43 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 44 */         world.m_7731_(BlockPos.m_274561_(x + 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.FIELD_GENERATOR.get()).m_49966_(), 3);
/*    */       } 
/* 46 */       if (world.m_8055_(BlockPos.m_274561_(x - 16.0D, y, z)).m_60734_() != Blocks.f_50752_) {
/* 47 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 48 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 49 */         world.m_7731_(BlockPos.m_274561_(x - 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.FIELD_GENERATOR.get()).m_49966_(), 3);
/*    */       } 
/* 51 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z + 16.0D)).m_60734_() != Blocks.f_50752_) {
/* 52 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 53 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 54 */         world.m_7731_(BlockPos.m_274561_(x, y, z + 16.0D), ((Block)ThebrokenscriptModBlocks.FIELD_GENERATOR.get()).m_49966_(), 3);
/*    */       } 
/* 56 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z - 16.0D)).m_60734_() != Blocks.f_50752_) {
/* 57 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 58 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 59 */         world.m_7731_(BlockPos.m_274561_(x, y, z - 16.0D), ((Block)ThebrokenscriptModBlocks.FIELD_GENERATOR.get()).m_49966_(), 3);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\FieldGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */