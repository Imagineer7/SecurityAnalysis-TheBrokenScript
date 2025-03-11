/*     */ package net.mcreator.interpritation.procedures;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.mcreator.interpritation.world.inventory.NullInterface2Menu;
/*     */ import net.mcreator.interpritation.world.inventory.NulledGuiMenu;
/*     */ import net.mcreator.interpritation.world.inventory.Nullinterface3Menu;
/*     */ import net.mcreator.interpritation.world.inventory.NullinterfaceMenu;
/*     */ import net.minecraft.advancements.Advancement;
/*     */ import net.minecraft.advancements.AdvancementProgress;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.Vec3i;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LightningBolt;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.GameRules;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*     */ import net.minecraft.world.level.storage.LevelData;
/*     */ import net.minecraft.world.level.storage.WritableLevelData;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.items.ItemHandlerHelper;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ForcerandomeventProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  65 */     if (entity == null)
/*     */       return; 
/*  67 */     double textengine = 0.0D;
/*  68 */     double soundengine = 0.0D;
/*  69 */     double guiengine = 0.0D;
/*  70 */     double eventengine = 0.0D;
/*  71 */     eventengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 45);
/*  72 */     if (eventengine == 1.0D) {
/*  73 */       eventengine = 0.0D;
/*  74 */       ThebrokenscriptMod.queueServerWork(1, () -> {
/*     */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             ThebrokenscriptMod.queueServerWork(5, ());
/*     */           });
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  91 */     if (eventengine == 2.0D) {
/*  92 */       eventengine = 0.0D;
/*  93 */       entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 1.0F);
/*     */     } 
/*  95 */     if (eventengine == 3.0D) {
/*  96 */       eventengine = 0.0D;
/*  97 */       ThebrokenscriptMod.queueServerWork(1, () -> {
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world; if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:randomsong")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:randomsong")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */               } 
/*     */             }  if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight");
/*     */             } 
/*     */             if (entity instanceof LivingEntity) {
/*     */               LivingEntity _entity = (LivingEntity)entity;
/*     */               if (!_entity.m_9236_().m_5776_())
/*     */                 _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 320, 1)); 
/*     */             } 
/*     */             if (entity instanceof LivingEntity) {
/*     */               LivingEntity _entity = (LivingEntity)entity;
/*     */               if (!_entity.m_9236_().m_5776_())
/*     */                 _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 320, 1)); 
/*     */             } 
/*     */             if (entity instanceof LivingEntity) {
/*     */               LivingEntity _entity = (LivingEntity)entity;
/*     */               if (!_entity.m_9236_().m_5776_())
/*     */                 _entity.m_7292_(new MobEffectInstance(MobEffects.f_19591_, 320, 1)); 
/*     */             } 
/*     */             ThebrokenscriptMod.queueServerWork(320, ());
/*     */           });
/*     */     } 
/* 126 */     if (eventengine == 4.0D) {
/* 127 */       eventengine = 0.0D;
/* 128 */       entity.m_20254_(3);
/*     */     } 
/* 130 */     if (eventengine == 5.0D) {
/* 131 */       eventengine = 0.0D;
/* 132 */       if (Math.random() < 0.5D)
/* 133 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 134 */           LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 135 */           entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 1, 10), y, z + Mth.m_216271_(RandomSource.m_216327_(), 1, 10))));
/* 136 */           _level.m_7967_((Entity)entityToSpawn); }
/*     */         
/*     */          }
/* 139 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 140 */         LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 141 */         entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 1, 10), y, z - Mth.m_216271_(RandomSource.m_216327_(), 1, 10))));
/* 142 */         _level.m_7967_((Entity)entityToSpawn); }
/*     */     
/*     */     } 
/*     */     
/* 146 */     if (eventengine == 6.0D) {
/* 147 */       eventengine = 0.0D;
/* 148 */       if (world instanceof Level) { Level _level = (Level)world;
/* 149 */         if (!_level.m_5776_()) {
/* 150 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */         } else {
/* 152 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */         }  }
/*     */       
/* 155 */       ThebrokenscriptMod.queueServerWork(20, () -> {
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */               } 
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             ThebrokenscriptMod.queueServerWork(20, ());
/*     */           });
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 183 */     if (eventengine == 7.0D) {
/* 184 */       eventengine = 0.0D;
/* 185 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 186 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set night"); }
/*     */       
/* 188 */       if (Math.random() < 0.5D) {
/* 189 */         if (world instanceof Level) { Level _level = (Level)world;
/* 190 */           if (!_level.m_5776_()) {
/* 191 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 0.0F);
/*     */           } else {
/* 193 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 0.0F, false);
/*     */           }  }
/*     */         
/* 196 */         if (world instanceof Level) { Level _level = (Level)world;
/* 197 */           if (!_level.m_5776_()) {
/* 198 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 200 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */       
/*     */       } 
/*     */     } 
/* 205 */     if (eventengine == 8.0D) {
/* 206 */       eventengine = 0.0D;
/* 207 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 208 */         _player.m_36324_().m_38705_(Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*     */     
/* 210 */     }  if (eventengine == 9.0D) {
/* 211 */       eventengine = 0.0D;
/* 212 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 213 */         _player.m_6915_(); }
/*     */     
/* 215 */     }  if (eventengine == 10.0D) {
/* 216 */       eventengine = 0.0D;
/* 217 */       guiengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 3);
/* 218 */       if (guiengine == 1.0D) {
/* 219 */         eventengine = 0.0D;
/* 220 */         if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 221 */           final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 222 */           NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */               {
/*     */                 public Component m_5446_() {
/* 225 */                   return (Component)Component.m_237113_("Nullinterface");
/*     */                 }
/*     */ 
/*     */                 
/*     */                 public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 230 */                   return (AbstractContainerMenu)new NullinterfaceMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */                 }
/*     */               }_bpos); }
/*     */       
/*     */       } 
/* 235 */       if (guiengine == 2.0D) {
/* 236 */         eventengine = 0.0D;
/* 237 */         if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 238 */           final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 239 */           NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */               {
/*     */                 public Component m_5446_() {
/* 242 */                   return (Component)Component.m_237113_("NullInterface2");
/*     */                 }
/*     */ 
/*     */                 
/*     */                 public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 247 */                   return (AbstractContainerMenu)new NullInterface2Menu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */                 }
/*     */               }_bpos); }
/*     */       
/*     */       } 
/* 252 */       if (guiengine == 3.0D) {
/* 253 */         eventengine = 0.0D;
/* 254 */         if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 255 */           final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 256 */           NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */               {
/*     */                 public Component m_5446_() {
/* 259 */                   return (Component)Component.m_237113_("Nullinterface3");
/*     */                 }
/*     */ 
/*     */                 
/*     */                 public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 264 */                   return (AbstractContainerMenu)new Nullinterface3Menu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */                 }
/*     */               }_bpos); }
/*     */       
/*     */       } 
/*     */     } 
/* 270 */     if (eventengine == 11.0D) {
/* 271 */       eventengine = 0.0D;
/* 272 */       textengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 13);
/* 273 */       if (textengine == 1.0D) {
/* 274 */         textengine = 0.0D;
/* 275 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 276 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"I see you.\""); }
/*     */       
/*     */       } 
/* 279 */       if (textengine == 2.0D) {
/* 280 */         textengine = 0.0D;
/* 281 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 282 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"Can you see me?\""); }
/*     */       
/*     */       } 
/* 285 */       if (textengine == 3.0D) {
/* 286 */         textengine = 0.0D;
/* 287 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 288 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"It was your fault.\""); }
/*     */       
/*     */       } 
/* 291 */       if (textengine == 4.0D) {
/* 292 */         textengine = 0.0D;
/* 293 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 294 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"Help us.\""); }
/*     */       
/*     */       } 
/* 297 */       if (textengine == 5.0D) {
/* 298 */         textengine = 0.0D;
/* 299 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 300 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"I am right behind you.\""); }
/*     */       
/*     */       } 
/* 303 */       if (textengine == 6.0D) {
/* 304 */         textengine = 0.0D;
/* 305 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 306 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"I am right behind you.\",\"color\":\"dark_red\"}"); }
/*     */       
/*     */       } 
/* 309 */       if (textengine == 7.0D) {
/* 310 */         textengine = 0.0D;
/* 311 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 312 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"null\""); }
/*     */       
/*     */       } 
/* 315 */       if (textengine == 8.0D) {
/* 316 */         textengine = 0.0D;
/* 317 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 318 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"null.err\""); }
/*     */       
/*     */       } 
/* 321 */       if (textengine == 9.0D) {
/* 322 */         textengine = 0.0D;
/* 323 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 324 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"000\""); }
/*     */       
/*     */       } 
/* 327 */       if (textengine == 10.0D) {
/* 328 */         textengine = 0.0D;
/* 329 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 330 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"AAAAAAAAA\",\"obfuscated\":true,\"color\":\"#FFFFFF\"}"); }
/*     */       
/*     */       } 
/* 333 */       if (textengine == 11.0D) {
/* 334 */         textengine = 0.0D;
/* 335 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 336 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"Null joined the game\",\"color\":\"yellow\"}"); }
/*     */       
/*     */       } 
/* 339 */       if (textengine == 12.0D) {
/* 340 */         textengine = 0.0D;
/* 341 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 342 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"Null left the game\",\"color\":\"yellow\"}"); }
/*     */       
/*     */       } 
/* 345 */       if (textengine == 13.0D) {
/* 346 */         textengine = 0.0D;
/* 347 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 348 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"joined the game\",\"color\":\"yellow\"}"); }
/*     */       
/*     */       } 
/*     */     } 
/* 352 */     if (eventengine == 12.0D) {
/* 353 */       eventengine = 0.0D;
/* 354 */       soundengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 4);
/* 355 */       if (soundengine == 1.0D) {
/* 356 */         soundengine = 0.0D;
/* 357 */         if (world instanceof Level) { Level _level = (Level)world;
/* 358 */           if (!_level.m_5776_()) {
/* 359 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1));
/*     */           } else {
/* 361 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1), false);
/*     */           }  }
/*     */       
/*     */       } 
/* 365 */       if (soundengine == 2.0D) {
/* 366 */         soundengine = 0.0D;
/* 367 */         if (world instanceof Level) { Level _level = (Level)world;
/* 368 */           if (!_level.m_5776_()) {
/* 369 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.13")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1));
/*     */           } else {
/* 371 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.13")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1), false);
/*     */           }  }
/*     */       
/*     */       } 
/* 375 */       if (soundengine == 3.0D) {
/* 376 */         soundengine = 0.0D;
/* 377 */         if (world instanceof Level) { Level _level = (Level)world;
/* 378 */           if (!_level.m_5776_()) {
/* 379 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.11")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1));
/*     */           } else {
/* 381 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.11")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1), false);
/*     */           }  }
/*     */       
/*     */       } 
/* 385 */       if (soundengine == 4.0D) {
/* 386 */         soundengine = 0.0D;
/* 387 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 388 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "stopsound @a"); }
/*     */       
/*     */       } 
/*     */     } 
/* 392 */     if (eventengine == 13.0D) {
/* 393 */       eventengine = 0.0D;
/* 394 */       if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity;
/* 395 */         Advancement _adv = _player.f_8924_.m_129889_().m_136041_(new ResourceLocation("thebrokenscript:nullnullnull"));
/* 396 */         AdvancementProgress _ap = _player.m_8960_().m_135996_(_adv);
/* 397 */         if (!_ap.m_8193_())
/* 398 */           for (String criteria : _ap.m_8219_()) {
/* 399 */             _player.m_8960_().m_135988_(_adv, criteria);
/*     */           }  }
/*     */     
/*     */     } 
/* 403 */     if (eventengine == 14.0D) {
/* 404 */       eventengine = 0.0D;
/* 405 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 406 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "give @p written_book[written_book_content={pages:[\"{\\\"text\\\":\\\"null.err.object.err.null.object.alone.3.not.behind.entitytype:player.receiveddata.invalid.reboot.failed.reset.playerdata:00F9219492D94210F812\\\",\\\"color\\\":\\\"black\\\"}\"],title:\"null\",author:null}]"); }
/*     */     
/*     */     } 
/* 409 */     if (eventengine == 15.0D) {
/* 410 */       eventengine = 0.0D;
/*     */     }
/* 412 */     if (eventengine == 16.0D) {
/* 413 */       eventengine = 0.0D;
/* 414 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 415 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"null null null null null null null null\",\"color\":\"#FFFFFF\"}"); }
/*     */     
/*     */     } 
/* 418 */     if (eventengine == 17.0D) {
/* 419 */       eventengine = 0.0D;
/* 420 */       world.m_7731_(BlockPos.m_274561_(x, y + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), z), Blocks.f_50752_.m_49966_(), 3);
/*     */     } 
/* 422 */     if (eventengine == 18.0D) {
/* 423 */       eventengine = 0.0D;
/* 424 */       world.m_7731_(BlockPos.m_274561_(x, y + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), z), Blocks.f_49990_.m_49966_(), 3);
/*     */     } 
/* 426 */     if (eventengine == 19.0D) {
/* 427 */       eventengine = 0.0D;
/* 428 */       if (Math.random() < 0.7D)
/* 429 */       { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 430 */             _level.m_254849_(null, x + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), y, z + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), 4.0F, Level.ExplosionInteraction.TNT);  }
/*     */          }
/* 432 */       else if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 433 */           _level.m_254849_(null, x - Mth.m_216271_(RandomSource.m_216327_(), 50, 60), y, z - Mth.m_216271_(RandomSource.m_216327_(), 50, 60), 4.0F, Level.ExplosionInteraction.TNT);  }
/*     */     
/*     */     } 
/* 436 */     if (eventengine == 20.0D) {
/* 437 */       eventengine = 0.0D;
/* 438 */       if (Math.random() < 0.7D)
/* 439 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 440 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */         
/*     */          }
/* 443 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 444 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */     
/*     */     } 
/*     */     
/* 448 */     if (eventengine == 21.0D) {
/* 449 */       eventengine = 0.0D;
/* 450 */       if (Math.random() < 0.5D)
/* 451 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 452 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_SCARE.get()).m_262496_(_level, 
/* 453 */               BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), z + Mth.m_216271_(RandomSource.m_216327_(), 0, 5)), MobSpawnType.MOB_SUMMONED);
/* 454 */           if (entityToSpawn != null) {
/* 455 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */         
/*     */          }
/* 459 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 460 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_SCARE.get()).m_262496_(_level, 
/* 461 */             BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 0, 5), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), z - Mth.m_216271_(RandomSource.m_216327_(), 0, 5)), MobSpawnType.MOB_SUMMONED);
/* 462 */         if (entityToSpawn != null) {
/* 463 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */         } }
/*     */     
/*     */     } 
/*     */     
/* 468 */     if (eventengine == 21.0D) {
/* 469 */       eventengine = 0.0D;
/* 470 */       if (Math.random() < 0.5D)
/* 471 */       { if (entity instanceof Player) { Player _player = (Player)entity;
/* 472 */           _player.m_6756_(-Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*     */          }
/* 474 */       else if (entity instanceof Player) { Player _player = (Player)entity;
/* 475 */         _player.m_6756_(Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*     */     
/*     */     } 
/* 478 */     if (eventengine == 22.0D) {
/* 479 */       eventengine = 0.0D;
/* 480 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 481 */         ItemStack _setstack = (new ItemStack((ItemLike)Items.f_42710_)).m_41777_();
/* 482 */         _setstack.m_41764_(1);
/* 483 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*     */     
/*     */     } 
/* 486 */     if (eventengine == 23.0D) {
/* 487 */       eventengine = 0.0D;
/*     */       
/* 489 */       Entity _ent = entity;
/* 490 */       _ent.m_146922_(5.0F);
/* 491 */       _ent.m_146926_(0.0F);
/* 492 */       _ent.m_5618_(_ent.m_146908_());
/* 493 */       _ent.m_5616_(_ent.m_146908_());
/* 494 */       _ent.f_19859_ = _ent.m_146908_();
/* 495 */       _ent.f_19860_ = _ent.m_146909_();
/* 496 */       if (_ent instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)_ent;
/* 497 */         _entity.f_20884_ = _entity.m_146908_();
/* 498 */         _entity.f_20886_ = _entity.m_146908_(); }
/*     */     
/*     */     } 
/*     */     
/* 502 */     if (eventengine == 24.0D) {
/* 503 */       eventengine = 0.0D;
/* 504 */       world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), ((Block)ThebrokenscriptModBlocks.ALL_DEAD
/* 505 */           .get()).m_49966_(), 3);
/*     */     } 
/* 507 */     if (eventengine == 25.0D) {
/* 508 */       eventengine = 0.0D;
/* 509 */       world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50174_
/* 510 */           .m_49966_(), 3);
/*     */     } 
/* 512 */     if (eventengine == 26.0D) {
/* 513 */       eventengine = 0.0D;
/* 514 */       world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50095_
/* 515 */           .m_49966_(), 3);
/*     */     } 
/* 517 */     if (eventengine == 27.0D) {
/* 518 */       eventengine = 0.0D;
/* 519 */       world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_49990_
/* 520 */           .m_49966_(), 3);
/* 521 */       if (world instanceof Level) { Level _level = (Level)world;
/* 522 */         _level.m_46672_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), _level
/* 523 */             .m_8055_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ)).m_60734_()); }
/*     */     
/* 525 */     }  if (eventengine == 32.0D) {
/* 526 */       eventengine = 0.0D;
/* 527 */       world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), ((Block)ThebrokenscriptModBlocks.HELLO
/* 528 */           .get()).m_49966_(), 3);
/*     */     } 
/* 530 */     if (eventengine == 41.0D) {
/* 531 */       eventengine = 0.0D;
/* 532 */       world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50134_
/* 533 */           .m_49966_(), 3);
/*     */     } 
/* 535 */     if (eventengine == 33.0D) {
/* 536 */       eventengine = 0.0D;
/* 537 */       if (world
/* 538 */         .m_6443_(Player.class, 
/* 539 */           AABB.m_165882_(new Vec3((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), 50.0D, 50.0D, 50.0D), e -> true)
/* 540 */         .isEmpty()) {
/* 541 */         world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), ((Block)ThebrokenscriptModBlocks.EMPTY
/* 542 */             .get()).m_49966_(), 3);
/*     */       }
/*     */     } 
/* 545 */     if (eventengine == 27.0D) {
/* 546 */       eventengine = 0.0D;
/* 547 */       LevelData levelData = world.m_6106_(); if (levelData instanceof WritableLevelData) { WritableLevelData _levelData = (WritableLevelData)levelData;
/* 548 */         _levelData.m_7250_(BlockPos.m_274561_(x, y, z), 0.0F); }
/*     */     
/* 550 */     }  if (eventengine == 28.0D) {
/* 551 */       eventengine = 0.0D;
/* 552 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 553 */         _level.m_8615_(Mth.m_216271_(RandomSource.m_216327_(), 1, 10000)); }
/*     */     
/* 555 */     }  if (eventengine == 29.0D) {
/* 556 */       eventengine = 0.0D;
/* 557 */       entity.m_5997_(1.0D, 1.0D, 1.0D);
/*     */     } 
/* 559 */     if (eventengine == 30.0D) {
/* 560 */       eventengine = 0.0D;
/* 561 */       world.m_7106_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 0.0D, 1.0D, 0.0D);
/*     */     } 
/* 563 */     if (eventengine == 31.0D) {
/* 564 */       eventengine = 0.0D;
/* 565 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 566 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_5ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 567 */         if (entityToSpawn != null) {
/* 568 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */         } }
/*     */     
/*     */     } 
/* 572 */     if (eventengine == 34.0D) {
/* 573 */       eventengine = 0.0D;
/* 574 */       if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 575 */         final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 576 */         NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */             {
/*     */               public Component m_5446_() {
/* 579 */                 return (Component)Component.m_237113_("NulledGui");
/*     */               }
/*     */ 
/*     */               
/*     */               public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 584 */                 return (AbstractContainerMenu)new NulledGuiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */               }
/*     */             }_bpos); }
/*     */       
/* 588 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 589 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */       
/* 591 */       if (world instanceof Level) { Level _level = (Level)world;
/* 592 */         if (!_level.m_5776_()) {
/* 593 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:glithcsound1")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */         } else {
/* 595 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:glithcsound1")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */         }  }
/*     */     
/*     */     } 
/* 599 */     if (eventengine == 35.0D) {
/* 600 */       eventengine = 0.0D;
/* 601 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 602 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_INVADE_BASE.get()).m_262496_(_level, 
/* 603 */             BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), MobSpawnType.MOB_SUMMONED);
/*     */         
/* 605 */         if (entityToSpawn != null) {
/* 606 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */         } }
/*     */     
/*     */     } 
/* 610 */     if (eventengine == 36.0D) {
/* 611 */       eventengine = 0.0D;
/* 612 */       if (Math.random() < 0.7D) {
/* 613 */         ((GameRules.BooleanValue)world.m_6106_().m_5470_().m_46170_(GameRules.f_46140_)).m_46246_(true, world.m_7654_());
/*     */       } else {
/* 615 */         ((GameRules.BooleanValue)world.m_6106_().m_5470_().m_46170_(GameRules.f_46140_)).m_46246_(false, world.m_7654_());
/*     */       } 
/*     */     } 
/* 618 */     if (eventengine == 37.0D) {
/* 619 */       eventengine = 0.0D;
/* 620 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 621 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.BSOD.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 622 */         if (entityToSpawn != null) {
/* 623 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */         } }
/*     */     
/*     */     } 
/* 627 */     if (eventengine == 38.0D) {
/* 628 */       eventengine = 0.0D;
/* 629 */       if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 630 */         StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "obfuscatedsign"));
/* 631 */         if (template != null) {
/* 632 */           template.m_230328_((ServerLevelAccessor)_serverworld, 
/* 633 */               BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), 
/* 634 */               BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), (new StructurePlaceSettings())
/* 635 */               .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */         } }
/*     */     
/*     */     } 
/* 639 */     if (eventengine == 39.0D) {
/* 640 */       eventengine = 0.0D;
/* 641 */       if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 642 */         StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "giift"));
/* 643 */         if (template != null) {
/* 644 */           template.m_230328_((ServerLevelAccessor)_serverworld, 
/* 645 */               BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), 
/* 646 */               BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), (new StructurePlaceSettings())
/* 647 */               .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */         } }
/*     */     
/*     */     } 
/* 651 */     if (eventengine == 40.0D) {
/* 652 */       eventengine = 0.0D;
/* 653 */       ThebrokenscriptMod.queueServerWork(1, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a [\"\",{\"text\":\"OpenGL Error\",\"color\":\"yellow\"},{\"text\":\": 1282 (Invalid operation)\",\"color\":\"#FFFFFF\"}]");
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             ThebrokenscriptMod.queueServerWork(20, ());
/*     */           });
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 687 */     if (eventengine == 41.0D) {
/* 688 */       eventengine = 0.0D;
/* 689 */       world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50627_
/* 690 */           .m_49966_(), 3);
/*     */     } 
/* 692 */     if (eventengine == 42.0D) {
/* 693 */       eventengine = 0.0D;
/*     */     }
/* 695 */     if (eventengine == 43.0D) {
/* 696 */       eventengine = 0.0D;
/*     */     }
/* 698 */     if (eventengine == 44.0D) {
/* 699 */       eventengine = 0.0D;
/* 700 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 701 */         _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.EYES.get(), x, y, z, 5, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */     
/* 703 */     }  if (eventengine == 45.0D)
/* 704 */       eventengine = 0.0D; 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ForcerandomeventProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */