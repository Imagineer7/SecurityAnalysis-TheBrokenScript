/*     */ package net.mcreator.interpritation.procedures;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class ClanbuildAnomalyGeneratorOnTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  22 */     double doaction = 0.0D;
/*  23 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/*  24 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  25 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  26 */       doaction = Mth.m_216271_(RandomSource.m_216327_(), 1, 8);
/*  27 */       if (doaction == 1.0D) {
/*  28 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  29 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  30 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  31 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew1"));
/*  32 */           if (template != null) {
/*  33 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  37 */       if (doaction == 2.0D) {
/*  38 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  39 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  40 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  41 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew2"));
/*  42 */           if (template != null) {
/*  43 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  47 */       if (doaction == 3.0D) {
/*  48 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  49 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  50 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  51 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew3"));
/*  52 */           if (template != null) {
/*  53 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  57 */       if (doaction == 4.0D) {
/*  58 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  59 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  60 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  61 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew4"));
/*  62 */           if (template != null) {
/*  63 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  67 */       if (doaction == 5.0D) {
/*  68 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  69 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  70 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  71 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew5"));
/*  72 */           if (template != null) {
/*  73 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  77 */       if (doaction == 6.0D) {
/*  78 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  79 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  80 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  81 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew6"));
/*  82 */           if (template != null) {
/*  83 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  87 */       if (doaction == 7.0D) {
/*  88 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  89 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/*  90 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  91 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew7"));
/*  92 */           if (template != null) {
/*  93 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  97 */       if (doaction == 8.0D) {
/*  98 */         if (Math.random() < 0.9D)
/*  99 */         { world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 100 */           world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/* 101 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 102 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew7"));
/* 103 */             if (template != null) {
/* 104 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */           
/*     */            }
/*     */         
/* 109 */         else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 110 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanvoidnew8"));
/* 111 */           if (template != null) {
/* 112 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       }
/*     */ 
/*     */       
/* 118 */       if (world.m_8055_(BlockPos.m_274561_(x + 16.0D, y, z)).m_60734_() != Blocks.f_50652_) {
/* 119 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 120 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/* 121 */         world.m_7731_(BlockPos.m_274561_(x + 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.CLANBUILD_ANOMALY_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/* 123 */       if (world.m_8055_(BlockPos.m_274561_(x - 16.0D, y, z)).m_60734_() != Blocks.f_50652_) {
/* 124 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 125 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/* 126 */         world.m_7731_(BlockPos.m_274561_(x - 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.CLANBUILD_ANOMALY_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/* 128 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z + 16.0D)).m_60734_() != Blocks.f_50652_) {
/* 129 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 130 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/* 131 */         world.m_7731_(BlockPos.m_274561_(x, y, z + 16.0D), ((Block)ThebrokenscriptModBlocks.CLANBUILD_ANOMALY_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/* 133 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z - 16.0D)).m_60734_() != Blocks.f_50652_) {
/* 134 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 135 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/* 136 */         world.m_7731_(BlockPos.m_274561_(x, y, z - 16.0D), ((Block)ThebrokenscriptModBlocks.CLANBUILD_ANOMALY_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ClanbuildAnomalyGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */