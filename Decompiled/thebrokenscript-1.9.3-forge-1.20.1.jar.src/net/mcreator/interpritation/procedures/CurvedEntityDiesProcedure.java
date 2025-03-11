/*     */ package net.mcreator.interpritation.procedures;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class CurvedEntityDiesProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  22 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  23 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "stopsound @a"); }
/*  24 */      for (int index0 = 0; index0 < Mth.m_216271_(RandomSource.m_216327_(), 1, 25); index0++) {
/*  25 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  26 */         ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.f_50652_));
/*  27 */         entityToSpawn.m_32010_(10);
/*  28 */         _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*     */     } 
/*  31 */     for (int index1 = 0; index1 < Mth.m_216271_(RandomSource.m_216327_(), 1, 25); index1++) {
/*  32 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  33 */         ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/*  34 */         entityToSpawn.m_32010_(10);
/*  35 */         _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*     */     } 
/*  38 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  39 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.f_42428_));
/*  40 */       entityToSpawn.m_32010_(10);
/*  41 */       _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*  43 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  44 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.f_42425_));
/*  45 */       entityToSpawn.m_32010_(10);
/*  46 */       _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*  48 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  49 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)ThebrokenscriptModItems.RECORD_16.get()));
/*  50 */       entityToSpawn.m_32010_(10);
/*  51 */       _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*  53 */     for (int index2 = 0; index2 < Mth.m_216271_(RandomSource.m_216327_(), 1, 25); index2++) {
/*  54 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  55 */         ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.f_50493_));
/*  56 */         entityToSpawn.m_32010_(10);
/*  57 */         _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*     */     } 
/*  60 */     for (int index3 = 0; index3 < Mth.m_216271_(RandomSource.m_216327_(), 1, 25); index3++) {
/*  61 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  62 */         ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.f_41978_));
/*  63 */         entityToSpawn.m_32010_(10);
/*  64 */         _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*     */     } 
/*  67 */     for (int index4 = 0; index4 < Mth.m_216271_(RandomSource.m_216327_(), 1, 25); index4++) {
/*  68 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  69 */         ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.f_50705_));
/*  70 */         entityToSpawn.m_32010_(10);
/*  71 */         _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*     */     } 
/*  74 */     for (int index5 = 0; index5 < Mth.m_216271_(RandomSource.m_216327_(), 1, 25); index5++) {
/*  75 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  76 */         ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.f_49999_));
/*  77 */         entityToSpawn.m_32010_(10);
/*  78 */         _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*     */     } 
/*  81 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  82 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.f_42583_));
/*  83 */       entityToSpawn.m_32010_(10);
/*  84 */       _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*  86 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  87 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.f_42401_));
/*  88 */       entityToSpawn.m_32010_(10);
/*  89 */       _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*  91 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  92 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.f_50746_));
/*  93 */       entityToSpawn.m_32010_(10);
/*  94 */       _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*  96 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  97 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.f_42415_));
/*  98 */       entityToSpawn.m_32010_(10);
/*  99 */       _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/* 101 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 102 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a [{\"text\":\"\"},{\"text\":\"DyeXD412 was slain by \",\"color\":\"white\"},{\"selector\":\"@p\",\"color\":\"white\"}]"); }
/*     */     
/* 104 */     ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */           if (world instanceof ServerLevel) {
/*     */             ServerLevel _level = (ServerLevel)world;
/*     */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"DyeXD412 left the game\",\"color\":\"yellow\"}");
/*     */           } 
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CurvedEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */