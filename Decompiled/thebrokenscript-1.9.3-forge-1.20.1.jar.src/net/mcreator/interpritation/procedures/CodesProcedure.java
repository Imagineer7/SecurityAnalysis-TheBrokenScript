/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.event.ServerChatEvent;
/*     */ import net.minecraftforge.eventbus.api.Event;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class CodesProcedure
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onChat(ServerChatEvent event) {
/*  34 */     execute((Event)event, (LevelAccessor)event.getPlayer().m_9236_(), event.getPlayer().m_20185_(), event.getPlayer().m_20186_(), event.getPlayer().m_20189_(), event.getRawText());
/*     */   }
/*     */   
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, String text) {
/*  38 */     execute(null, world, x, y, z, text);
/*     */   }
/*     */   
/*     */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, String text) {
/*  42 */     if (text == null)
/*     */       return; 
/*  44 */     if (text.contains("Hello") || text.contains("Hi?"))
/*  45 */       ThebrokenscriptMod.queueServerWork(Mth.m_216271_(RandomSource.m_216327_(), 500, 800), () -> {
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world;
/*     */               if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */               } 
/*     */             } 
/*     */             if (!world.m_5776_() && world.m_7654_() != null)
/*     */               world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_("<Null> err.type=null.hello"), false); 
/*     */           }); 
/*  57 */     if (text.contains("Who are you?"))
/*  58 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (!world.m_5776_() && world.m_7654_() != null)
/*     */               world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_("<Null> err.type=null."), false); 
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world;
/*     */               if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */               } 
/*     */             } 
/*     */           }); 
/*  70 */     if (text.equals("What do you want?"))
/*  71 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (!world.m_5776_() && world.m_7654_() != null)
/*     */               world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_("<null> err.type=null.freedom"), false); 
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world;
/*     */               if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */               } 
/*     */             } 
/*     */           }); 
/*  83 */     if (text.equals("null")) {
/*  84 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> The end is nigh\"");
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world;
/*     */ 
/*     */ 
/*     */               
/*     */               if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */               } 
/*     */             } 
/*     */ 
/*     */ 
/*     */             
/*     */             ThebrokenscriptMod.queueServerWork(20, ());
/*     */           });
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 117 */     if (text.equals("Can you see me?")) {
/* 118 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<Null> Yes.\"");
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */               } 
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             ThebrokenscriptMod.queueServerWork(60, ());
/*     */           });
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 157 */     if (text.equals("Friend?"))
/* 158 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_SCARE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */               if (entityToSpawn != null) {
/*     */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */               }
/*     */             } 
/*     */           }); 
/* 167 */     if (text.equals("Fuck you"))
/* 168 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof Level) {
/*     */               Level _level = (Level)world;
/*     */               if (!_level.m_5776_()) {
/*     */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */               } else {
/*     */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */               } 
/*     */             } 
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NOTHINGISWATCHINGCHASE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */               if (entityToSpawn != null)
/*     */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*     */             } 
/*     */           }); 
/* 184 */     if (text.equals("How can I help you?"))
/* 185 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"[?][?][?]\"");
/*     */             } 
/*     */           }); 
/* 191 */     if (text.equals("Herobrine"))
/* 192 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> \"");
/*     */             } 
/*     */           }); 
/* 198 */     if (text.equals("Entity 303"))
/* 199 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> Ended his own life.\"");
/*     */             } 
/*     */           }); 
/* 205 */     if (text.equals("Integrity"))
/* 206 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> Deep down under the bedrock.\"");
/*     */             } 
/*     */           }); 
/* 212 */     if (text.equals("clan_build"))
/* 213 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> Home.\"");
/*     */             } 
/*     */           }); 
/* 219 */     if (text.equals("xXram2dieXx"))
/* 220 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> Rot in hell.\"");
/*     */             } 
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_IS_HERE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */               if (entityToSpawn != null)
/*     */                 entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F); 
/*     */             } 
/*     */           }); 
/* 232 */     if (text.equals("Revuxor"))
/* 233 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> Poor soul.\"");
/*     */             } 
/*     */           }); 
/* 239 */     if (text.equals("Follow"))
/* 240 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> Is behind you.\"");
/*     */             } 
/*     */           }); 
/* 246 */     if (text.equals("Nothingiswatching"))
/* 247 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> A broken promise.\"");
/*     */             } 
/*     */           }); 
/* 253 */     if (text.equals("Circuit"))
/* 254 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> It was all his fault.\"");
/*     */             } 
/*     */           }); 
/* 260 */     if (text.equals("Steve"))
/* 261 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<null> [0.1]\"");
/*     */             } 
/*     */           }); 
/* 267 */     if (text.equals("Void"))
/* 268 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"It's me.\"");
/*     */             } 
/*     */           }); 
/* 274 */     if (text.equals("The broken end"))
/* 275 */       ThebrokenscriptMod.queueServerWork(100, () -> {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel _level = (ServerLevel)world;
/*     */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"<Circuit> Administration.\"");
/*     */             } 
/*     */           }); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CodesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */