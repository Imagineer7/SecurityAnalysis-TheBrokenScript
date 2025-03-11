/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*     */ 
/*     */ public class RandomStructurePriNachalnomPrizyvieSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  20 */     if (entity == null)
/*     */       return; 
/*  22 */     double structure = 0.0D;
/*  23 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).config_norandomstructures) {
/*  24 */       if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/*  25 */         structure = Mth.m_216271_(RandomSource.m_216327_(), 1, 44);
/*  26 */         if (!entity.m_9236_().m_5776_())
/*  27 */           entity.m_146870_(); 
/*  28 */         if (structure == 1.0D) {
/*  29 */           structure = 0.0D;
/*  30 */           if (Math.random() < 0.5D)
/*  31 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  32 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "thedoor"));
/*  33 */               if (template != null) {
/*  34 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/*  39 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  40 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "thedoor"));
/*  41 */             if (template != null) {
/*  42 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/*  43 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/*  48 */         if (structure == 2.0D) {
/*  49 */           structure = 0.0D;
/*  50 */           if (Math.random() < 0.5D)
/*  51 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  52 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "structure1"));
/*  53 */               if (template != null) {
/*  54 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/*  59 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  60 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "structure1"));
/*  61 */             if (template != null) {
/*  62 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/*  63 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/*  68 */         if (structure == 3.0D) {
/*  69 */           structure = 0.0D;
/*  70 */           if (Math.random() < 0.5D)
/*  71 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  72 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign5"));
/*  73 */               if (template != null) {
/*  74 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/*  79 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  80 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign5"));
/*  81 */             if (template != null) {
/*  82 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/*  83 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/*  88 */         if (structure == 4.0D) {
/*  89 */           structure = 0.0D;
/*  90 */           if (Math.random() < 0.5D)
/*  91 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  92 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign4"));
/*  93 */               if (template != null) {
/*  94 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/*  99 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 100 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign4"));
/* 101 */             if (template != null) {
/* 102 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 103 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 108 */         if (structure == 5.0D) {
/* 109 */           structure = 0.0D;
/* 110 */           if (Math.random() < 0.5D)
/* 111 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 112 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign3"));
/* 113 */               if (template != null) {
/* 114 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 119 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 120 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign3"));
/* 121 */             if (template != null) {
/* 122 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 123 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 128 */         if (structure == 5.0D) {
/* 129 */           structure = 0.0D;
/* 130 */           if (Math.random() < 0.5D)
/* 131 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 132 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign2"));
/* 133 */               if (template != null) {
/* 134 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 139 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 140 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign2"));
/* 141 */             if (template != null) {
/* 142 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 143 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 148 */         if (structure == 6.0D) {
/* 149 */           structure = 0.0D;
/* 150 */           if (Math.random() < 0.5D)
/* 151 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 152 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign1"));
/* 153 */               if (template != null) {
/* 154 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 159 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 160 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sign1"));
/* 161 */             if (template != null) {
/* 162 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 163 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 168 */         if (structure == 7.0D) {
/* 169 */           structure = 0.0D;
/* 170 */           if (Math.random() < 0.5D)
/* 171 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 172 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sandpillar"));
/* 173 */               if (template != null) {
/* 174 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 179 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 180 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sandpillar"));
/* 181 */             if (template != null) {
/* 182 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 183 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 188 */         if (structure == 8.0D) {
/* 189 */           structure = 0.0D;
/* 190 */           if (Math.random() < 0.5D)
/* 191 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 192 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "house3"));
/* 193 */               if (template != null) {
/* 194 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 199 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 200 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "house3"));
/* 201 */             if (template != null) {
/* 202 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 203 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 208 */         if (structure == 9.0D) {
/* 209 */           structure = 0.0D;
/* 210 */           if (Math.random() < 0.5D)
/* 211 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 212 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "house2"));
/* 213 */               if (template != null) {
/* 214 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 219 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 220 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "house2"));
/* 221 */             if (template != null) {
/* 222 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 223 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 228 */         if (structure == 10.0D) {
/* 229 */           structure = 0.0D;
/* 230 */           if (Math.random() < 0.5D)
/* 231 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 232 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "house1"));
/* 233 */               if (template != null) {
/* 234 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 239 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 240 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "house1"));
/* 241 */             if (template != null) {
/* 242 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 243 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 248 */         if (structure == 11.0D) {
/* 249 */           structure = 0.0D;
/* 250 */           if (Math.random() < 0.5D)
/* 251 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 252 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "generationbug1"));
/* 253 */               if (template != null) {
/* 254 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 259 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 260 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "generationbug1"));
/* 261 */             if (template != null) {
/* 262 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 263 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 268 */         if (structure == 12.0D) {
/* 269 */           structure = 0.0D;
/* 270 */           if (Math.random() < 0.5D)
/* 271 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 272 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "dirtpillar"));
/* 273 */               if (template != null) {
/* 274 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 279 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 280 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "dirtpillar"));
/* 281 */             if (template != null) {
/* 282 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 283 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 288 */         if (structure == 13.0D) {
/* 289 */           structure = 0.0D;
/* 290 */           if (Math.random() < 0.5D)
/* 291 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 292 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "cross"));
/* 293 */               if (template != null) {
/* 294 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 299 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 300 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "cross"));
/* 301 */             if (template != null) {
/* 302 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 303 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 308 */         if (structure == 14.0D) {
/* 309 */           structure = 0.0D;
/* 310 */           if (Math.random() < 0.5D)
/* 311 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 312 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "cobledpillar"));
/* 313 */               if (template != null) {
/* 314 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 319 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 320 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "cobledpillar"));
/* 321 */             if (template != null) {
/* 322 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 323 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 328 */         if (structure == 15.0D) {
/* 329 */           structure = 0.0D;
/* 330 */           if (Math.random() < 0.5D)
/* 331 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 332 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "2bedrocks"));
/* 333 */               if (template != null) {
/* 334 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/*     */           
/* 339 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 340 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "2bedrocks"));
/* 341 */             if (template != null) {
/* 342 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 343 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 348 */         if (structure == 16.0D) {
/* 349 */           structure = 0.0D;
/* 350 */           if (Math.random() < 0.5D) {
/* 351 */             world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50081_.m_49966_(), 3);
/*     */           } else {
/* 353 */             world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50174_.m_49966_(), 3);
/*     */           } 
/*     */         } 
/* 356 */         if (structure == 17.0D) {
/* 357 */           structure = 0.0D;
/* 358 */           if (Math.random() < 0.5D)
/* 359 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 360 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "gift"));
/* 361 */               if (template != null) {
/* 362 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 363 */                     .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/* 367 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 368 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "glasspillar"));
/* 369 */             if (template != null) {
/* 370 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 371 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 376 */         if (structure == 18.0D) {
/* 377 */           structure = 0.0D;
/* 378 */           if (Math.random() < 0.5D)
/* 379 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 380 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "stoneaslym"));
/* 381 */               if (template != null) {
/* 382 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 383 */                     .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/* 387 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 388 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "smallfractal"));
/* 389 */             if (template != null) {
/* 390 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 391 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 396 */         if (structure == 19.0D) {
/* 397 */           structure = 0.0D;
/* 398 */           if (Math.random() < 0.5D)
/* 399 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 400 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "redstoneconstruct"));
/* 401 */               if (template != null) {
/* 402 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 403 */                     .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/* 407 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 408 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "sandcube"));
/* 409 */             if (template != null) {
/* 410 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 411 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 416 */         if (structure == 20.0D) {
/* 417 */           structure = 0.0D;
/* 418 */           if (Math.random() < 0.5D)
/* 419 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 420 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "magmacross"));
/* 421 */               if (template != null) {
/* 422 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 423 */                     .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/* 427 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 428 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "treewithnoleaves"));
/* 429 */             if (template != null) {
/* 430 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 431 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 436 */         if (structure == 21.0D) {
/* 437 */           structure = 0.0D;
/* 438 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 439 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "treetop"));
/* 440 */             if (template != null) {
/* 441 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 442 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 446 */         if (structure == 22.0D) {
/* 447 */           structure = 0.0D;
/* 448 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 449 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "fractal3"));
/* 450 */             if (template != null) {
/* 451 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 452 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 456 */         if (structure == 23.0D) {
/* 457 */           structure = 0.0D;
/* 458 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 459 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "trap1"));
/* 460 */             if (template != null) {
/* 461 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 462 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 466 */         if (structure == 24.0D) {
/* 467 */           structure = 0.0D;
/* 468 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 469 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "trap2"));
/* 470 */             if (template != null) {
/* 471 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 472 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 476 */         if (structure == 25.0D) {
/* 477 */           structure = 0.0D;
/* 478 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 479 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "lavapool"));
/* 480 */             if (template != null) {
/* 481 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 482 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 486 */         if (structure == 26.0D) {
/* 487 */           structure = 0.0D;
/* 488 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 489 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "giift"));
/* 490 */             if (template != null) {
/* 491 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 492 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 496 */         if (structure == 27.0D) {
/* 497 */           structure = 0.0D;
/* 498 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 499 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "totem"));
/* 500 */             if (template != null) {
/* 501 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 502 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 506 */         if (structure == 28.0D) {
/* 507 */           structure = 0.0D;
/* 508 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 509 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "crossfly"));
/* 510 */             if (template != null) {
/* 511 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y + 50.0D, z), BlockPos.m_274561_(x, y + 50.0D, z), (new StructurePlaceSettings())
/* 512 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 516 */         if (structure == 29.0D) {
/* 517 */           structure = 0.0D;
/* 518 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 519 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "magmacross"));
/* 520 */             if (template != null) {
/* 521 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y + 50.0D, z), BlockPos.m_274561_(x, y + 50.0D, z), (new StructurePlaceSettings())
/* 522 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 526 */         if (structure == 30.0D) {
/* 527 */           structure = 0.0D;
/* 528 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 529 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "portal1"));
/* 530 */             if (template != null) {
/* 531 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 532 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 536 */         if (structure == 31.0D) {
/* 537 */           structure = 0.0D;
/* 538 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 539 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "carcas"));
/* 540 */             if (template != null) {
/* 541 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 542 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 546 */         if (structure == 32.0D) {
/* 547 */           structure = 0.0D;
/* 548 */           if (Math.random() < 0.5D)
/* 549 */           { if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 550 */               StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "clanbuildoverhaul"));
/* 551 */               if (template != null) {
/* 552 */                 template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 553 */                     .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */               } }
/*     */             
/*     */              }
/* 557 */           else if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 558 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "cavebase"));
/* 559 */             if (template != null) {
/* 560 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, -10.0D, z), BlockPos.m_274561_(x, -10.0D, z), (new StructurePlaceSettings())
/* 561 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 566 */         if (structure == 33.0D) {
/* 567 */           structure = 0.0D;
/* 568 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 569 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "baseruins"));
/* 570 */             if (template != null) {
/* 571 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 572 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 576 */         if (structure == 34.0D) {
/* 577 */           structure = 0.0D;
/* 578 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 579 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "crosses"));
/* 580 */             if (template != null) {
/* 581 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y + 35.0D, z), BlockPos.m_274561_(x, y + 35.0D, z), (new StructurePlaceSettings())
/* 582 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 586 */         if (structure == 35.0D) {
/* 587 */           structure = 0.0D;
/* 588 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 589 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "signabomination"));
/* 590 */             if (template != null) {
/* 591 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 592 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 596 */         if (structure == 36.0D) {
/* 597 */           structure = 0.0D;
/* 598 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 599 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "heavenportal"));
/* 600 */             if (template != null) {
/* 601 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 602 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 606 */         if (structure == 37.0D) {
/* 607 */           structure = 0.0D;
/* 608 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 609 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "doortrap"));
/* 610 */             if (template != null) {
/* 611 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 612 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 616 */         if (structure == 38.0D) {
/* 617 */           structure = 0.0D;
/* 618 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 619 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "carcas"));
/* 620 */             if (template != null) {
/* 621 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 622 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 626 */         if (structure == 39.0D) {
/* 627 */           structure = 0.0D;
/* 628 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 629 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "carcas"));
/* 630 */             if (template != null) {
/* 631 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 632 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 636 */         if (structure == 40.0D) {
/* 637 */           structure = 0.0D;
/* 638 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 639 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "randombrickstructure"));
/* 640 */             if (template != null) {
/* 641 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 642 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 646 */         if (structure == 41.0D) {
/* 647 */           structure = 0.0D;
/* 648 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 649 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "randomwoodstructure"));
/* 650 */             if (template != null) {
/* 651 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 652 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 656 */         if (structure == 42.0D) {
/* 657 */           structure = 0.0D;
/* 658 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 659 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "signnicehouses"));
/* 660 */             if (template != null) {
/* 661 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 662 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 666 */         if (structure == 43.0D) {
/* 667 */           structure = 0.0D;
/* 668 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 669 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "glassfractal"));
/* 670 */             if (template != null) {
/* 671 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 672 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 676 */         if (structure == 44.0D) {
/* 677 */           structure = 0.0D;
/* 678 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 679 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "burn_fractal"));
/* 680 */             if (template != null) {
/* 681 */               template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings())
/* 682 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 686 */         if (!entity.m_9236_().m_5776_()) {
/* 687 */           entity.m_146870_();
/*     */         }
/* 689 */       } else if (!entity.m_9236_().m_5776_()) {
/* 690 */         entity.m_146870_();
/*     */       }
/*     */     
/* 693 */     } else if (!entity.m_9236_().m_5776_()) {
/* 694 */       entity.m_146870_();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\RandomStructurePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */