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
/*     */ public class HellishGeneratorOnTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  22 */     double doaction = 0.0D;
/*  23 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/*  24 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  25 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*  26 */       if (Math.random() < 0.9D) {
/*  27 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  28 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway1"));
/*  29 */           if (template != null) {
/*  30 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } else {
/*  34 */         doaction = Mth.m_216271_(RandomSource.m_216327_(), 1, 10);
/*     */       } 
/*  36 */       if (doaction == 1.0D) {
/*  37 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  38 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway2"));
/*  39 */           if (template != null) {
/*  40 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/*  43 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  44 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/*  46 */       if (doaction == 2.0D) {
/*  47 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  48 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway3"));
/*  49 */           if (template != null) {
/*  50 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/*  53 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  54 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/*  56 */       if (doaction == 3.0D) {
/*  57 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  58 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway4"));
/*  59 */           if (template != null) {
/*  60 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/*  63 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  64 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/*  66 */       if (doaction == 4.0D) {
/*  67 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  68 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway5"));
/*  69 */           if (template != null) {
/*  70 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/*  73 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  74 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/*  76 */       if (doaction == 5.0D) {
/*  77 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  78 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway6"));
/*  79 */           if (template != null) {
/*  80 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/*  83 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  84 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/*  86 */       if (doaction == 6.0D) {
/*  87 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  88 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway7"));
/*  89 */           if (template != null) {
/*  90 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/*  93 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  94 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/*  96 */       if (doaction == 7.0D) {
/*  97 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  98 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway8"));
/*  99 */           if (template != null) {
/* 100 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/* 103 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 104 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/* 106 */       if (doaction == 8.0D) {
/* 107 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 108 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway9"));
/* 109 */           if (template != null) {
/* 110 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/* 113 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 114 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/* 116 */       if (doaction == 9.0D) {
/* 117 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 118 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallway10"));
/* 119 */           if (template != null) {
/* 120 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/* 123 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 124 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/* 126 */       if (doaction == 10.0D) {
/* 127 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 128 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "bedrockhallwayexit"));
/* 129 */           if (template != null) {
/* 130 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */         
/* 133 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 134 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/*     */       } 
/* 136 */       if (world.m_8055_(BlockPos.m_274561_(x + 16.0D, y, z)).m_60734_() != Blocks.f_50752_) {
/* 137 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 138 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 139 */         world.m_7731_(BlockPos.m_274561_(x + 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.HELLISH_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/* 141 */       if (world.m_8055_(BlockPos.m_274561_(x - 16.0D, y, z)).m_60734_() != Blocks.f_50752_) {
/* 142 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 143 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 144 */         world.m_7731_(BlockPos.m_274561_(x - 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.HELLISH_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/* 146 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z + 16.0D)).m_60734_() != Blocks.f_50752_) {
/* 147 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 148 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 149 */         world.m_7731_(BlockPos.m_274561_(x, y, z + 16.0D), ((Block)ThebrokenscriptModBlocks.HELLISH_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/* 151 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z - 16.0D)).m_60734_() != Blocks.f_50752_) {
/* 152 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 153 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50752_.m_49966_(), 3);
/* 154 */         world.m_7731_(BlockPos.m_274561_(x, y, z - 16.0D), ((Block)ThebrokenscriptModBlocks.HELLISH_GENERATOR.get()).m_49966_(), 3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\HellishGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */