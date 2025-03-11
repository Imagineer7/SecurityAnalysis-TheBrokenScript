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
/*     */ public class VoidexpGeneratorOnTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  22 */     double doaction = 0.0D;
/*  23 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/*  24 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  25 */       world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  26 */       doaction = Mth.m_216271_(RandomSource.m_216327_(), 1, 8);
/*  27 */       if (doaction == 1.0D) {
/*  28 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  29 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  30 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp1"));
/*  31 */           if (template != null) {
/*  32 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  36 */       if (doaction == 2.0D) {
/*  37 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  38 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  39 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp2"));
/*  40 */           if (template != null) {
/*  41 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  45 */       if (doaction == 3.0D) {
/*  46 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  47 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  48 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp3"));
/*  49 */           if (template != null) {
/*  50 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  54 */       if (doaction == 4.0D) {
/*  55 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  56 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  57 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp6"));
/*  58 */           if (template != null) {
/*  59 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  63 */       if (doaction == 5.0D) {
/*  64 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  65 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  66 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp7"));
/*  67 */           if (template != null) {
/*  68 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  72 */       if (doaction == 6.0D) {
/*  73 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  74 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  75 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  76 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp8"));
/*  77 */           if (template != null) {
/*  78 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  82 */       if (doaction == 8.0D) {
/*  83 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  84 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  85 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  86 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp11"));
/*  87 */           if (template != null) {
/*  88 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/*  92 */       if (doaction == 7.0D) {
/*  93 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  94 */         world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)ThebrokenscriptModBlocks.PROTECTED_VOID.get()).m_49966_(), 3);
/*  95 */         if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  96 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "voidexp9"));
/*  97 */           if (template != null) {
/*  98 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */           } }
/*     */       
/*     */       } 
/* 102 */       if (world.m_8055_(BlockPos.m_274561_(x + 16.0D, y, z)).m_60734_() != ThebrokenscriptModBlocks.PROTECTED_VOID.get()) {
/* 103 */         world.m_7731_(BlockPos.m_274561_(x + 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.VOIDEXP_GENERATOR.get()).m_49966_(), 3);
/*     */       }
/* 105 */       if (world.m_8055_(BlockPos.m_274561_(x - 16.0D, y, z)).m_60734_() != ThebrokenscriptModBlocks.PROTECTED_VOID.get()) {
/* 106 */         world.m_7731_(BlockPos.m_274561_(x - 16.0D, y, z), ((Block)ThebrokenscriptModBlocks.VOIDEXP_GENERATOR.get()).m_49966_(), 3);
/*     */       }
/* 108 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z + 16.0D)).m_60734_() != ThebrokenscriptModBlocks.PROTECTED_VOID.get()) {
/* 109 */         world.m_7731_(BlockPos.m_274561_(x, y, z + 16.0D), ((Block)ThebrokenscriptModBlocks.VOIDEXP_GENERATOR.get()).m_49966_(), 3);
/*     */       }
/* 111 */       if (world.m_8055_(BlockPos.m_274561_(x, y, z - 16.0D)).m_60734_() != ThebrokenscriptModBlocks.PROTECTED_VOID.get())
/* 112 */         world.m_7731_(BlockPos.m_274561_(x, y, z - 16.0D), ((Block)ThebrokenscriptModBlocks.VOIDEXP_GENERATOR.get()).m_49966_(), 3); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\VoidexpGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */