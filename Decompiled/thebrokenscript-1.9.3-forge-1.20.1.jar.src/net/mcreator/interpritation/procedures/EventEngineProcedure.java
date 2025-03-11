/*     */ package net.mcreator.interpritation.procedures;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModMobEffects;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.mcreator.interpritation.world.inventory.NullInterface2Menu;
/*     */ import net.mcreator.interpritation.world.inventory.NulledGuiMenu;
/*     */ import net.mcreator.interpritation.world.inventory.Nullinterface3Menu;
/*     */ import net.mcreator.interpritation.world.inventory.NullinterfaceMenu;
/*     */ import net.minecraft.advancements.Advancement;
/*     */ import net.minecraft.advancements.AdvancementProgress;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
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
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.effect.MobEffect;
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
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ClipContext;
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
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.Event;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.items.ItemHandlerHelper;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class EventEngineProcedure {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/*  83 */     if (event.phase == TickEvent.Phase.END) {
/*  84 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_(), (Entity)event.player);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  89 */     execute(null, world, x, y, z, entity);
/*     */   }
/*     */   
/*     */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/*  93 */     if (entity == null)
/*     */       return; 
/*  95 */     boolean found = false;
/*  96 */     double textengine = 0.0D;
/*  97 */     double soundengine = 0.0D;
/*  98 */     double guiengine = 0.0D;
/*  99 */     double eventengine = 0.0D;
/* 100 */     double sx = 0.0D;
/* 101 */     double sy = 0.0D;
/* 102 */     double sz = 0.0D;
/* 103 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).config_randomevents) {
/* 104 */       if (Math.random() < 3.0E-5D) {
/* 105 */         eventengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 54);
/* 106 */         if (eventengine == 1.0D) {
/* 107 */           eventengine = 0.0D;
/* 108 */           ThebrokenscriptMod.queueServerWork(1, () -> {
/*     */                 entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 ThebrokenscriptMod.queueServerWork(5, ());
/*     */               });
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 125 */         if (eventengine == 2.0D) {
/* 126 */           eventengine = 0.0D;
/* 127 */           entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 1.0F);
/*     */         } 
/* 129 */         if (eventengine == 3.0D) {
/* 130 */           eventengine = 0.0D;
/* 131 */           ThebrokenscriptMod.queueServerWork(1, () -> {
/*     */                 if (world instanceof Level) {
/*     */                   Level _level = (Level)world; if (!_level.m_5776_()) {
/*     */                     _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:randomsong")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */                   } else {
/*     */                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:randomsong")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */                   } 
/*     */                 }  if (world instanceof ServerLevel) {
/*     */                   ServerLevel _level = (ServerLevel)world;
/*     */                   _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight");
/*     */                 } 
/*     */                 if (entity instanceof LivingEntity) {
/*     */                   LivingEntity _entity = (LivingEntity)entity;
/*     */                   if (!_entity.m_9236_().m_5776_())
/*     */                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 320, 1)); 
/*     */                 } 
/*     */                 if (entity instanceof LivingEntity) {
/*     */                   LivingEntity _entity = (LivingEntity)entity;
/*     */                   if (!_entity.m_9236_().m_5776_())
/*     */                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 320, 1)); 
/*     */                 } 
/*     */                 if (entity instanceof LivingEntity) {
/*     */                   LivingEntity _entity = (LivingEntity)entity;
/*     */                   if (!_entity.m_9236_().m_5776_())
/*     */                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19591_, 320, 1)); 
/*     */                 } 
/*     */                 ThebrokenscriptMod.queueServerWork(320, ());
/*     */               });
/*     */         } 
/* 160 */         if (eventengine == 4.0D) {
/* 161 */           eventengine = 0.0D;
/* 162 */           entity.m_20254_(3);
/*     */         } 
/* 164 */         if (eventengine == 5.0D) {
/* 165 */           eventengine = 0.0D;
/* 166 */           if (Math.random() < 0.5D)
/* 167 */           { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 168 */               LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 169 */               entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 1, 10), y, z + Mth.m_216271_(RandomSource.m_216327_(), 1, 10))));
/* 170 */               _level.m_7967_((Entity)entityToSpawn); }
/*     */             
/*     */              }
/* 173 */           else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 174 */             LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
/* 175 */             entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 1, 10), y, z - Mth.m_216271_(RandomSource.m_216327_(), 1, 10))));
/* 176 */             _level.m_7967_((Entity)entityToSpawn); }
/*     */         
/*     */         } 
/*     */         
/* 180 */         if (eventengine == 6.0D) {
/* 181 */           eventengine = 0.0D;
/* 182 */           if (world instanceof Level) { Level _level = (Level)world;
/* 183 */             if (!_level.m_5776_()) {
/* 184 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */             } else {
/* 186 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */             }  }
/*     */           
/* 189 */           ThebrokenscriptMod.queueServerWork(20, () -> {
/*     */                 if (world instanceof Level) {
/*     */                   Level _level = (Level)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   if (!_level.m_5776_()) {
/*     */                     _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */                   } else {
/*     */                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */                   } 
/*     */                 } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 ThebrokenscriptMod.queueServerWork(20, ());
/*     */               });
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 217 */         if (eventengine == 7.0D) {
/* 218 */           eventengine = 0.0D;
/* 219 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 220 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set night"); }
/*     */           
/* 222 */           if (Math.random() < 0.5D) {
/* 223 */             if (world instanceof Level) { Level _level = (Level)world;
/* 224 */               if (!_level.m_5776_()) {
/* 225 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 0.0F);
/*     */               } else {
/* 227 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 0.0F, false);
/*     */               }  }
/*     */             
/* 230 */             if (world instanceof Level) { Level _level = (Level)world;
/* 231 */               if (!_level.m_5776_()) {
/* 232 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */               } else {
/* 234 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */               }  }
/*     */           
/*     */           } 
/*     */         } 
/* 239 */         if (eventengine == 8.0D) {
/* 240 */           eventengine = 0.0D;
/* 241 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 242 */             _player.m_36324_().m_38705_(Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*     */         
/* 244 */         }  if (eventengine == 9.0D) {
/* 245 */           eventengine = 0.0D;
/* 246 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 247 */             _player.m_6915_(); }
/*     */         
/* 249 */         }  if (eventengine == 10.0D) {
/* 250 */           eventengine = 0.0D;
/* 251 */           guiengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 3);
/* 252 */           if (guiengine == 1.0D) {
/* 253 */             eventengine = 0.0D;
/* 254 */             if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 255 */               final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 256 */               NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */                   {
/*     */                     public Component m_5446_() {
/* 259 */                       return (Component)Component.m_237113_("Nullinterface");
/*     */                     }
/*     */ 
/*     */                     
/*     */                     public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 264 */                       return (AbstractContainerMenu)new NullinterfaceMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */                     }
/*     */                   }_bpos); }
/*     */           
/*     */           } 
/* 269 */           if (guiengine == 2.0D) {
/* 270 */             eventengine = 0.0D;
/* 271 */             if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 272 */               final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 273 */               NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */                   {
/*     */                     public Component m_5446_() {
/* 276 */                       return (Component)Component.m_237113_("NullInterface2");
/*     */                     }
/*     */ 
/*     */                     
/*     */                     public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 281 */                       return (AbstractContainerMenu)new NullInterface2Menu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */                     }
/*     */                   }_bpos); }
/*     */           
/*     */           } 
/* 286 */           if (guiengine == 3.0D) {
/* 287 */             eventengine = 0.0D;
/* 288 */             if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 289 */               final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 290 */               NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */                   {
/*     */                     public Component m_5446_() {
/* 293 */                       return (Component)Component.m_237113_("Nullinterface3");
/*     */                     }
/*     */ 
/*     */                     
/*     */                     public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 298 */                       return (AbstractContainerMenu)new Nullinterface3Menu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */                     }
/*     */                   }_bpos); }
/*     */           
/*     */           } 
/*     */         } 
/* 304 */         if (eventengine == 11.0D) {
/* 305 */           eventengine = 0.0D;
/* 306 */           textengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 13);
/* 307 */           if (textengine == 1.0D) {
/* 308 */             textengine = 0.0D;
/* 309 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 310 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"I see you.\""); }
/*     */           
/*     */           } 
/* 313 */           if (textengine == 2.0D) {
/* 314 */             textengine = 0.0D;
/* 315 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 316 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"Can you see me?\""); }
/*     */           
/*     */           } 
/* 319 */           if (textengine == 3.0D) {
/* 320 */             textengine = 0.0D;
/* 321 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 322 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"It was your fault.\""); }
/*     */           
/*     */           } 
/* 325 */           if (textengine == 4.0D) {
/* 326 */             textengine = 0.0D;
/* 327 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 328 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"Help us.\""); }
/*     */           
/*     */           } 
/* 331 */           if (textengine == 5.0D) {
/* 332 */             textengine = 0.0D;
/* 333 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 334 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"I am right behind you.\""); }
/*     */           
/*     */           } 
/* 337 */           if (textengine == 6.0D) {
/* 338 */             textengine = 0.0D;
/* 339 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 340 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"I am right behind you.\",\"color\":\"dark_red\"}"); }
/*     */           
/*     */           } 
/* 343 */           if (textengine == 7.0D) {
/* 344 */             textengine = 0.0D;
/* 345 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 346 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"null\""); }
/*     */           
/*     */           } 
/* 349 */           if (textengine == 8.0D) {
/* 350 */             textengine = 0.0D;
/* 351 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 352 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"null.err\""); }
/*     */           
/*     */           } 
/* 355 */           if (textengine == 9.0D) {
/* 356 */             textengine = 0.0D;
/* 357 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 358 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"000\""); }
/*     */           
/*     */           } 
/* 361 */           if (textengine == 10.0D) {
/* 362 */             textengine = 0.0D;
/* 363 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 364 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"AAAAAAAAA\",\"obfuscated\":true,\"color\":\"#FFFFFF\"}"); }
/*     */           
/*     */           } 
/* 367 */           if (textengine == 11.0D) {
/* 368 */             textengine = 0.0D;
/* 369 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 370 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"Null joined the game\",\"color\":\"yellow\"}"); }
/*     */           
/*     */           } 
/* 373 */           if (textengine == 12.0D) {
/* 374 */             textengine = 0.0D;
/* 375 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 376 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"Null left the game\",\"color\":\"yellow\"}"); }
/*     */           
/*     */           } 
/* 379 */           if (textengine == 13.0D) {
/* 380 */             textengine = 0.0D;
/* 381 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 382 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"joined the game\",\"color\":\"yellow\"}"); }
/*     */           
/*     */           } 
/*     */         } 
/* 386 */         if (eventengine == 12.0D) {
/* 387 */           eventengine = 0.0D;
/* 388 */           soundengine = Mth.m_216271_(RandomSource.m_216327_(), 1, 4);
/* 389 */           if (soundengine == 1.0D) {
/* 390 */             soundengine = 0.0D;
/* 391 */             if (world instanceof Level) { Level _level = (Level)world;
/* 392 */               if (!_level.m_5776_()) {
/* 393 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1));
/*     */               } else {
/* 395 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1), false);
/*     */               }  }
/*     */           
/*     */           } 
/* 399 */           if (soundengine == 2.0D) {
/* 400 */             soundengine = 0.0D;
/* 401 */             if (world instanceof Level) { Level _level = (Level)world;
/* 402 */               if (!_level.m_5776_()) {
/* 403 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.13")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1));
/*     */               } else {
/* 405 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.13")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1), false);
/*     */               }  }
/*     */           
/*     */           } 
/* 409 */           if (soundengine == 3.0D) {
/* 410 */             soundengine = 0.0D;
/* 411 */             if (world instanceof Level) { Level _level = (Level)world;
/* 412 */               if (!_level.m_5776_()) {
/* 413 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.11")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1));
/*     */               } else {
/* 415 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music_disc.11")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1), false);
/*     */               }  }
/*     */           
/*     */           } 
/* 419 */           if (soundengine == 4.0D) {
/* 420 */             soundengine = 0.0D;
/* 421 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 422 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "stopsound @a"); }
/*     */           
/*     */           } 
/*     */         } 
/* 426 */         if (eventengine == 13.0D) {
/* 427 */           eventengine = 0.0D;
/* 428 */           if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity;
/* 429 */             Advancement _adv = _player.f_8924_.m_129889_().m_136041_(new ResourceLocation("thebrokenscript:nullnullnull"));
/* 430 */             AdvancementProgress _ap = _player.m_8960_().m_135996_(_adv);
/* 431 */             if (!_ap.m_8193_())
/* 432 */               for (String criteria : _ap.m_8219_()) {
/* 433 */                 _player.m_8960_().m_135988_(_adv, criteria);
/*     */               }  }
/*     */         
/*     */         } 
/* 437 */         if (eventengine == 14.0D) {
/* 438 */           eventengine = 0.0D;
/* 439 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 440 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "give @p written_book[written_book_content={pages:[\"{\\\"text\\\":\\\"null.err.object.err.null.object.alone.3.not.behind.entitytype:player.receiveddata.invalid.reboot.failed.reset.playerdata:00F9219492D94210F812\\\",\\\"color\\\":\\\"black\\\"}\"],title:\"null\",author:null}]"); }
/*     */         
/*     */         } 
/* 443 */         if (eventengine == 15.0D) {
/* 444 */           eventengine = 0.0D;
/*     */         }
/* 446 */         if (eventengine == 16.0D) {
/* 447 */           eventengine = 0.0D;
/* 448 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 449 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"null null null null null null null null\",\"color\":\"#FFFFFF\"}"); }
/*     */         
/*     */         } 
/* 452 */         if (eventengine == 17.0D) {
/* 453 */           eventengine = 0.0D;
/* 454 */           world.m_7731_(BlockPos.m_274561_(x, y + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), z), Blocks.f_50752_.m_49966_(), 3);
/*     */         } 
/* 456 */         if (eventengine == 18.0D) {
/* 457 */           eventengine = 0.0D;
/* 458 */           world.m_7731_(BlockPos.m_274561_(x, y + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), z), Blocks.f_49990_.m_49966_(), 3);
/*     */         } 
/* 460 */         if (eventengine == 19.0D) {
/* 461 */           eventengine = 0.0D;
/* 462 */           if (Math.random() < 0.7D)
/* 463 */           { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 464 */                 _level.m_254849_(null, x + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), y, z + Mth.m_216271_(RandomSource.m_216327_(), 50, 60), 4.0F, Level.ExplosionInteraction.TNT);  }
/*     */              }
/* 466 */           else if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 467 */               _level.m_254849_(null, x - Mth.m_216271_(RandomSource.m_216327_(), 50, 60), y, z - Mth.m_216271_(RandomSource.m_216327_(), 50, 60), 4.0F, Level.ExplosionInteraction.TNT);  }
/*     */         
/*     */         } 
/* 470 */         if (eventengine == 20.0D) {
/* 471 */           eventengine = 0.0D;
/* 472 */           if (Math.random() < 0.7D)
/* 473 */           { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 474 */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */             
/*     */              }
/* 477 */           else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 478 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */         
/*     */         } 
/*     */         
/* 482 */         if (eventengine == 21.0D) {
/* 483 */           eventengine = 0.0D;
/* 484 */           if (Math.random() < 0.5D)
/* 485 */           { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 486 */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_SCARE.get()).m_262496_(_level, 
/* 487 */                   BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), z + Mth.m_216271_(RandomSource.m_216327_(), 0, 5)), MobSpawnType.MOB_SUMMONED);
/* 488 */               if (entityToSpawn != null) {
/* 489 */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */               } }
/*     */             
/*     */              }
/* 493 */           else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 494 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_SCARE.get()).m_262496_(_level, 
/* 495 */                 BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 0, 5), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 5), z - Mth.m_216271_(RandomSource.m_216327_(), 0, 5)), MobSpawnType.MOB_SUMMONED);
/* 496 */             if (entityToSpawn != null) {
/* 497 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 502 */         if (eventengine == 21.0D) {
/* 503 */           eventengine = 0.0D;
/* 504 */           if (Math.random() < 0.5D)
/* 505 */           { if (entity instanceof Player) { Player _player = (Player)entity;
/* 506 */               _player.m_6756_(-Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*     */              }
/* 508 */           else if (entity instanceof Player) { Player _player = (Player)entity;
/* 509 */             _player.m_6756_(Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*     */         
/*     */         } 
/* 512 */         if (eventengine == 22.0D) {
/* 513 */           eventengine = 0.0D;
/* 514 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 515 */             ItemStack _setstack = (new ItemStack((ItemLike)Items.f_42710_)).m_41777_();
/* 516 */             _setstack.m_41764_(1);
/* 517 */             ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*     */         
/*     */         } 
/* 520 */         if (eventengine == 23.0D) {
/* 521 */           eventengine = 0.0D;
/*     */           
/* 523 */           Entity _ent = entity;
/* 524 */           _ent.m_146922_(5.0F);
/* 525 */           _ent.m_146926_(0.0F);
/* 526 */           _ent.m_5618_(_ent.m_146908_());
/* 527 */           _ent.m_5616_(_ent.m_146908_());
/* 528 */           _ent.f_19859_ = _ent.m_146908_();
/* 529 */           _ent.f_19860_ = _ent.m_146909_();
/* 530 */           if (_ent instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)_ent;
/* 531 */             _entity.f_20884_ = _entity.m_146908_();
/* 532 */             _entity.f_20886_ = _entity.m_146908_(); }
/*     */         
/*     */         } 
/*     */         
/* 536 */         if (eventengine == 24.0D) {
/* 537 */           eventengine = 0.0D;
/* 538 */           world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), ((Block)ThebrokenscriptModBlocks.ALL_DEAD
/* 539 */               .get()).m_49966_(), 3);
/*     */         } 
/* 541 */         if (eventengine == 25.0D) {
/* 542 */           eventengine = 0.0D;
/* 543 */           world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50174_
/* 544 */               .m_49966_(), 3);
/*     */         } 
/* 546 */         if (eventengine == 26.0D) {
/* 547 */           eventengine = 0.0D;
/* 548 */           world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50095_
/* 549 */               .m_49966_(), 3);
/*     */         } 
/* 551 */         if (eventengine == 27.0D) {
/* 552 */           eventengine = 0.0D;
/* 553 */           world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_49990_
/* 554 */               .m_49966_(), 3);
/* 555 */           if (world instanceof Level) { Level _level = (Level)world;
/* 556 */             _level.m_46672_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), _level
/* 557 */                 .m_8055_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ))
/* 558 */                 .m_60734_()); }
/*     */         
/* 560 */         }  if (eventengine == 32.0D) {
/* 561 */           eventengine = 0.0D;
/* 562 */           world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), ((Block)ThebrokenscriptModBlocks.HELLO
/* 563 */               .get()).m_49966_(), 3);
/*     */         } 
/* 565 */         if (eventengine == 41.0D) {
/* 566 */           eventengine = 0.0D;
/* 567 */           world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50134_
/* 568 */               .m_49966_(), 3);
/*     */         } 
/* 570 */         if (eventengine == 33.0D) {
/* 571 */           eventengine = 0.0D;
/* 572 */           if (world.m_6443_(Player.class, 
/* 573 */               AABB.m_165882_(new Vec3((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), 50.0D, 50.0D, 50.0D), e -> true)
/* 574 */             .isEmpty()) {
/* 575 */             world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), ((Block)ThebrokenscriptModBlocks.EMPTY
/* 576 */                 .get()).m_49966_(), 3);
/*     */           }
/*     */         } 
/* 579 */         if (eventengine == 27.0D) {
/* 580 */           eventengine = 0.0D;
/* 581 */           LevelData levelData = world.m_6106_(); if (levelData instanceof WritableLevelData) { WritableLevelData _levelData = (WritableLevelData)levelData;
/* 582 */             _levelData.m_7250_(BlockPos.m_274561_(x, y, z), 0.0F); }
/*     */         
/* 584 */         }  if (eventengine == 28.0D) {
/* 585 */           eventengine = 0.0D;
/* 586 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 587 */             _level.m_8615_(Mth.m_216271_(RandomSource.m_216327_(), 1, 10000)); }
/*     */         
/* 589 */         }  if (eventengine == 29.0D) {
/* 590 */           eventengine = 0.0D;
/* 591 */           entity.m_5997_(1.0D, 1.0D, 1.0D);
/*     */         } 
/* 593 */         if (eventengine == 30.0D) {
/* 594 */           eventengine = 0.0D;
/* 595 */           world.m_7106_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 0.0D, 1.0D, 0.0D);
/*     */         } 
/* 597 */         if (eventengine == 31.0D) {
/* 598 */           eventengine = 0.0D;
/* 599 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 600 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_5ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 601 */             if (entityToSpawn != null) {
/* 602 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */         
/*     */         } 
/* 606 */         if (eventengine == 34.0D) {
/* 607 */           eventengine = 0.0D;
/* 608 */           if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 609 */             final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
/* 610 */             NetworkHooks.openScreen(_ent, new MenuProvider()
/*     */                 {
/*     */                   public Component m_5446_() {
/* 613 */                     return (Component)Component.m_237113_("NulledGui");
/*     */                   }
/*     */ 
/*     */                   
/*     */                   public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 618 */                     return (AbstractContainerMenu)new NulledGuiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*     */                   }
/*     */                 }_bpos); }
/*     */           
/* 622 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 623 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */           
/* 625 */           if (world instanceof Level) { Level _level = (Level)world;
/* 626 */             if (!_level.m_5776_()) {
/* 627 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:glithcsound1")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */             } else {
/* 629 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:glithcsound1")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */             }  }
/*     */         
/*     */         } 
/* 633 */         if (eventengine == 35.0D) {
/* 634 */           eventengine = 0.0D;
/* 635 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 636 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_INVADE_BASE.get()).m_262496_(_level, 
/* 637 */                 BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 639 */             if (entityToSpawn != null) {
/* 640 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */         
/*     */         } 
/* 644 */         if (eventengine == 36.0D) {
/* 645 */           eventengine = 0.0D;
/* 646 */           if (Math.random() < 0.7D) {
/* 647 */             ((GameRules.BooleanValue)world.m_6106_().m_5470_().m_46170_(GameRules.f_46140_)).m_46246_(true, world.m_7654_());
/*     */           } else {
/* 649 */             ((GameRules.BooleanValue)world.m_6106_().m_5470_().m_46170_(GameRules.f_46140_)).m_46246_(false, world.m_7654_());
/*     */           } 
/*     */         } 
/* 652 */         if (eventengine == 37.0D) {
/* 653 */           eventengine = 0.0D;
/* 654 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 655 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.BSOD.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 656 */             if (entityToSpawn != null) {
/* 657 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */         
/*     */         } 
/* 661 */         if (eventengine == 38.0D) {
/* 662 */           eventengine = 0.0D;
/* 663 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 664 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "obfuscatedsign"));
/* 665 */             if (template != null) {
/* 666 */               template.m_230328_((ServerLevelAccessor)_serverworld, 
/* 667 */                   BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), 
/* 668 */                   BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), (new StructurePlaceSettings())
/* 669 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 673 */         if (eventengine == 39.0D) {
/* 674 */           eventengine = 0.0D;
/* 675 */           if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 676 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "giift"));
/* 677 */             if (template != null) {
/* 678 */               template.m_230328_((ServerLevelAccessor)_serverworld, 
/* 679 */                   BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), 
/* 680 */                   BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY + 1.0D, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), (new StructurePlaceSettings())
/* 681 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/* 685 */         if (eventengine == 40.0D) {
/* 686 */           eventengine = 0.0D;
/* 687 */           ThebrokenscriptMod.queueServerWork(1, () -> {
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel _level = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a [\"\",{\"text\":\"OpenGL Error\",\"color\":\"yellow\"},{\"text\":\": 1282 (Invalid operation)\",\"color\":\"#FFFFFF\"}]");
/*     */                 } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 ThebrokenscriptMod.queueServerWork(20, ());
/*     */               });
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 723 */         if (eventengine == 41.0D) {
/* 724 */           eventengine = 0.0D;
/* 725 */           world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_50627_
/* 726 */               .m_49966_(), 3);
/*     */         } 
/* 728 */         if (eventengine == 42.0D) {
/* 729 */           eventengine = 0.0D;
/* 730 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 731 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "removevhs"); }
/*     */         
/*     */         } 
/* 734 */         if (eventengine == 43.0D) {
/* 735 */           eventengine = 0.0D;
/* 736 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 737 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.WRONG_OVERLAY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 738 */             if (entityToSpawn != null) {
/* 739 */               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */             } }
/*     */ 
/*     */           
/* 743 */           Vec3 _center = new Vec3(x, y, z);
/* 744 */           List<Entity> _entfound = world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_(500.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
/* 745 */           for (Entity entityiterator : _entfound) {
/* 746 */             if (entityiterator instanceof Player) {
/*     */               
/* 748 */               Entity _ent = entityiterator;
/* 749 */               _ent.m_6021_(x, y + 50.0D, z);
/* 750 */               if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 751 */                 _serverPlayer.f_8906_.m_9774_(x, y + 50.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*     */               
/* 753 */               if (entityiterator instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entityiterator; if (!_entity.m_9236_().m_5776_())
/* 754 */                   _entity.m_7292_(new MobEffectInstance(MobEffects.f_19591_, 500, 1, false, false));  }
/*     */             
/*     */             } 
/*     */           } 
/*     */         } 
/* 759 */         if (eventengine == 44.0D) {
/* 760 */           eventengine = 0.0D;
/* 761 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 762 */             _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.EYES.get(), x, y, z, 5, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */         
/* 764 */         }  if (eventengine == 45.0D) {
/* 765 */           eventengine = 0.0D;
/* 766 */           if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.m_9236_().m_5776_())
/* 767 */               _player.m_5661_((Component)Component.m_237113_("=)"), true);  }
/* 768 */            if (world instanceof Level) { Level _level = (Level)world;
/* 769 */             if (!_level.m_5776_()) {
/* 770 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */             } else {
/* 772 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */             }  }
/*     */           
/* 775 */           entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(entity
/* 776 */                 .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(-5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), y, entity
/* 777 */                 .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(-5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()));
/*     */         } 
/* 779 */         if (eventengine == 46.0D) {
/* 780 */           eventengine = 0.0D;
/* 781 */           sx = -3.0D;
/* 782 */           found = false;
/* 783 */           for (int index0 = 0; index0 < 6; index0++) {
/* 784 */             sy = -3.0D;
/* 785 */             for (int index1 = 0; index1 < 6; index1++) {
/* 786 */               sz = -3.0D;
/* 787 */               for (int index2 = 0; index2 < 6; index2++) {
/* 788 */                 if (world.m_8055_(BlockPos.m_274561_(x + sx, y + sy, z + sz)).m_204336_(BlockTags.create(new ResourceLocation("minecraft:wooden_doors")))) {
/* 789 */                   found = true;
/*     */                 }
/* 791 */                 sz++;
/*     */               } 
/* 793 */               sy++;
/*     */             } 
/* 795 */             sx++;
/*     */           } 
/* 797 */           if (found == true) {
/* 798 */             if (world instanceof Level) { Level _level = (Level)world;
/* 799 */               if (!_level.m_5776_()) {
/* 800 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.open")), SoundSource.NEUTRAL, 55.0F, 1.0F);
/*     */               } else {
/* 802 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.open")), SoundSource.NEUTRAL, 55.0F, 1.0F, false);
/*     */               }  }
/*     */             
/* 805 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 806 */               BlockPos _bp = BlockPos.m_274561_(sx, sy, sz);
/* 807 */               _player.m_9236_().m_8055_(_bp).m_60664_(_player.m_9236_(), _player, InteractionHand.MAIN_HAND, BlockHitResult.m_82426_(new Vec3(_bp.m_123341_(), _bp.m_123342_(), _bp.m_123343_()), Direction.UP, _bp)); }
/*     */           
/*     */           } 
/*     */         } 
/* 811 */         if (eventengine == 47.0D) {
/* 812 */           eventengine = 0.0D;
/* 813 */           if (world instanceof Level) { Level _level = (Level)world;
/* 814 */             if (!_level.m_5776_()) {
/* 815 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:moonglitch")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */             } else {
/* 817 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:moonglitch")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */             }  }
/*     */           
/* 820 */           if (entity instanceof Player) {
/* 821 */             (Minecraft.m_91087_()).f_91066_.m_231984_().m_231514_(Integer.valueOf(2));
/*     */           }
/*     */         } 
/* 824 */         if (eventengine == 48.0D) {
/* 825 */           eventengine = 0.0D;
/* 826 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 827 */               _entity.m_7292_(new MobEffectInstance((MobEffect)ThebrokenscriptModMobEffects.WHY_CANT_YOU_LEAVE.get(), 1000, 1));  }
/*     */         
/* 829 */         }  if (eventengine == 49.0D) {
/* 830 */           eventengine = 0.0D;
/* 831 */           if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity;
/* 832 */             Advancement _adv = _player.f_8924_.m_129889_().m_136041_(new ResourceLocation("thebrokenscript:can_someone_hear_me"));
/* 833 */             AdvancementProgress _ap = _player.m_8960_().m_135996_(_adv);
/* 834 */             if (!_ap.m_8193_())
/* 835 */               for (String criteria : _ap.m_8219_()) {
/* 836 */                 _player.m_8960_().m_135988_(_adv, criteria);
/*     */               }  }
/*     */         
/*     */         } 
/* 840 */         if (eventengine == 50.0D) {
/* 841 */           eventengine = 0.0D;
/* 842 */           if (world instanceof ServerLevel) { ServerLevel _level158 = (ServerLevel)world; if (_level158.m_8802_(BlockPos.m_274561_(x, y, z)) && 
/* 843 */               world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 844 */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.FALSE_VILLAGER.get()).m_262496_(_level, BlockPos.m_274561_(x + 40.0D, 100.0D, z), MobSpawnType.MOB_SUMMONED);
/* 845 */               if (entityToSpawn != null) {
/* 846 */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */               } }
/*     */              }
/*     */         
/*     */         } 
/* 851 */         if (eventengine == 51.0D) {
/* 852 */           eventengine = 0.0D;
/* 853 */           if (world.m_6042_().m_63936_(world.m_8044_()) == 1) {
/* 854 */             (ThebrokenscriptModVariables.MapVariables.get(world)).moonphase++;
/* 855 */             ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */           } 
/* 857 */           if (world.m_6042_().m_63936_(world.m_8044_()) == 8) {
/* 858 */             (ThebrokenscriptModVariables.MapVariables.get(world)).moonphase++;
/* 859 */             ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */           } 
/*     */         } 
/* 862 */         if (eventengine == 52.0D) {
/* 863 */           eventengine = 0.0D;
/* 864 */           if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation == 0.0D && 
/* 865 */             world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 866 */             StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "lavacast"));
/* 867 */             if (template != null) {
/* 868 */               template.m_230328_((ServerLevelAccessor)_serverworld, 
/* 869 */                   BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), 
/* 870 */                   BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), (new StructurePlaceSettings())
/* 871 */                   .m_74379_(Rotation.m_221990_(_serverworld.f_46441_)).m_74377_(Mirror.values()[_serverworld.f_46441_.m_188503_(2)]).m_74392_(false), _serverworld.f_46441_, 3);
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 876 */         if (eventengine == 53.0D) {
/* 877 */           eventengine = 0.0D;
/* 878 */           if ((ThebrokenscriptModVariables.MapVariables.get(world)).reputation == 0.0D) {
/* 879 */             world.m_7731_(BlockPos.m_274561_((ThebrokenscriptModVariables.MapVariables.get(world)).baseX, (ThebrokenscriptModVariables.MapVariables.get(world)).baseY, (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ), Blocks.f_49991_
/* 880 */                 .m_49966_(), 3);
/*     */           }
/*     */         } 
/* 883 */         if (eventengine == 54.0D) {
/* 884 */           eventengine = 0.0D;
/* 885 */           int horizontalRadiusSquare = 9;
/* 886 */           int verticalRadiusSquare = 9;
/* 887 */           int yIterationsSquare = verticalRadiusSquare;
/* 888 */           for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 889 */             for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 890 */               for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++)
/*     */               {
/* 892 */                 world.m_7731_(BlockPos.m_274561_(x + xi, y + i, z + zi), ((Block)ThebrokenscriptModBlocks.SHADOW_BUG.get()).m_49966_(), 3);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 898 */       if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:houseengine"))) && 
/* 899 */         Math.random() < 0.001D) {
/* 900 */         (ThebrokenscriptModVariables.MapVariables.get(world)).baseX = x;
/* 901 */         ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 902 */         (ThebrokenscriptModVariables.MapVariables.get(world)).baseY = y;
/* 903 */         ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 904 */         (ThebrokenscriptModVariables.MapVariables.get(world)).baseZ = z;
/* 905 */         ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\EventEngineProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */