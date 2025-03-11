/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftStareEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitStalkEntity;
/*     */ import net.mcreator.interpritation.entity.NothingiswatchingEntity;
/*     */ import net.mcreator.interpritation.entity.NullFlyingEntity;
/*     */ import net.mcreator.interpritation.entity.NullWatchingEntity;
/*     */ import net.mcreator.interpritation.entity.SiluetStareEntity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndStalkkEntity;
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
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.Event;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class CheckForNullProcedure
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/*  47 */     if (event.phase == TickEvent.Phase.END) {
/*  48 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_(), (Entity)event.player);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  53 */     execute(null, world, x, y, z, entity);
/*     */   }
/*     */   
/*     */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/*  57 */     if (entity == null)
/*     */       return; 
/*  59 */     String found_entity_name = "";
/*  60 */     boolean entity_found = false;
/*  61 */     double raytrace_distance = 0.0D;
/*  62 */     double ray = 0.0D;
/*  63 */     if (!world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/*  64 */       ray = Mth.m_216271_(RandomSource.m_216327_(), 1, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  69 */       if (!world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/*  70 */         if (Math.random() < 0.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  75 */           if (!((Entity)world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/*  76 */             ((Entity)world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  78 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  80 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*  81 */           if (Math.random() < 0.7D && 
/*  82 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  83 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight");
/*     */              }
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */           
/*  91 */           if (!((Entity)world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/*  92 */             ((Entity)world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  94 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  96 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*  97 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  98 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULL_SCARE.get()).m_262496_(_level, BlockPos.m_274561_(x + 2.0D, y, z), MobSpawnType.MOB_SUMMONED);
/*  99 */             if (entityToSpawn != null); }
/*     */         
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 105 */     if (!world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 106 */       ray = Mth.m_216271_(RandomSource.m_216327_(), 1, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 111 */       if (!world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/* 112 */         if (Math.random() < 0.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 117 */           if (!((Entity)world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 118 */             ((Entity)world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 120 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 122 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 123 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 124 */               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 500, 1));  }
/* 125 */            if (world instanceof Level) { Level _level = (Level)world;
/* 126 */             if (!_level.m_5776_()) {
/* 127 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:integritywatching")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */             } else {
/* 129 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:integritywatching")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */             }  }
/*     */           
/* 132 */           if (Math.random() < 0.7D && 
/* 133 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 134 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight");
/*     */              }
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 142 */           if (!((Entity)world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 143 */             ((Entity)world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 145 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 147 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 148 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 149 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, new BlockPos(entity
/* 150 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 151 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 152 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 154 */             if (entityToSpawn != null); }
/*     */         
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 160 */     if (!world.m_6443_(TheBrokenEndStalkkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 161 */       ray = Mth.m_216271_(RandomSource.m_216327_(), 1, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 166 */       if (!world.m_6443_(TheBrokenEndStalkkEntity.class, AABB.m_165882_(new Vec3(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/* 167 */         if (Math.random() < 0.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 172 */           if (!((Entity)world.m_6443_(TheBrokenEndStalkkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 173 */             ((Entity)world.m_6443_(TheBrokenEndStalkkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 175 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 177 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 178 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 179 */               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 500, 1));  }
/* 180 */            if (world instanceof Level) { Level _level = (Level)world;
/* 181 */             if (!_level.m_5776_()) {
/* 182 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */             } else {
/* 184 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:heartbeat")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */             }  }
/*     */           
/* 187 */           if (Math.random() < 0.7D && 
/* 188 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 189 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight");
/*     */              }
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 197 */           if (!((Entity)world.m_6443_(TheBrokenEndStalkkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 198 */             ((Entity)world.m_6443_(TheBrokenEndStalkkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 200 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 202 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 203 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 204 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END.get()).m_262496_(_level, new BlockPos(entity
/* 205 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 206 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 207 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 209 */             if (entityToSpawn != null); }
/*     */         
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 215 */     if (!world.m_6443_(NothingiswatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 216 */       ray = Mth.m_216271_(RandomSource.m_216327_(), 1, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 221 */       if (!world.m_6443_(NothingiswatchingEntity.class, AABB.m_165882_(new Vec3(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/* 222 */         if (Math.random() < 0.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 227 */           if (!((Entity)world.m_6443_(NothingiswatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 228 */             ((Entity)world.m_6443_(NothingiswatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 230 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 232 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 233 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 234 */               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 500, 1));  }
/* 235 */            if (world instanceof Level) { Level _level = (Level)world;
/* 236 */             if (!_level.m_5776_()) {
/* 237 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:glithcsound1")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */             } else {
/* 239 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:glithcsound1")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */             }  }
/*     */           
/* 242 */           if (Math.random() < 0.7D && 
/* 243 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 244 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight");
/*     */              }
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 252 */           if (!((Entity)world.m_6443_(NothingiswatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 253 */             ((Entity)world.m_6443_(NothingiswatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 255 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 257 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 258 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 259 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NOTHINGISWATCHINGCHASE.get()).m_262496_(_level, new BlockPos(entity
/* 260 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 261 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 262 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 264 */             if (entityToSpawn != null); }
/*     */         
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 270 */     if (!world.m_6443_(SiluetStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 271 */       ray = Mth.m_216271_(RandomSource.m_216327_(), 1, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 276 */       if (!world.m_6443_(NothingiswatchingEntity.class, AABB.m_165882_(new Vec3(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/* 277 */         if (Math.random() < 0.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 282 */           if (!((Entity)world.m_6443_(SiluetStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 283 */             ((Entity)world.m_6443_(SiluetStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 285 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 287 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 288 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 289 */               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 500, 1));  }
/* 290 */            if (world instanceof Level) { Level _level = (Level)world;
/* 291 */             if (!_level.m_5776_()) {
/* 292 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullishereloop")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */             } else {
/* 294 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullishereloop")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */             }  }
/*     */           
/* 297 */           if (Math.random() < 0.7D && 
/* 298 */             world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 299 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight");
/*     */              }
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 307 */           if (!((Entity)world.m_6443_(SiluetStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 308 */             ((Entity)world.m_6443_(SiluetStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 310 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/* 312 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 313 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 314 */             Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.SILUET_CHASE.get()).m_262496_(_level, new BlockPos(entity
/* 315 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 316 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 317 */                   .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 319 */             if (entityToSpawn != null); }
/*     */         
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 325 */     if (!world.m_6443_(CircuitMineshaftStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 326 */       ray = Mth.m_216271_(RandomSource.m_216327_(), 1, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 331 */       if (!world.m_6443_(CircuitMineshaftStareEntity.class, AABB.m_165882_(new Vec3(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 336 */         if (!((Entity)world.m_6443_(CircuitMineshaftStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 337 */           ((Entity)world.m_6443_(CircuitMineshaftStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 339 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 341 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 342 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 343 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 10, 2));  }
/* 344 */          if (world instanceof Level) { Level _level = (Level)world;
/* 345 */           if (!_level.m_5776_()) {
/* 346 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */           } else {
/* 348 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */           }  }
/*     */         
/* 351 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 352 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, new BlockPos(entity
/*     */                 
/* 354 */                 .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 355 */                 .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 356 */                 .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), MobSpawnType.MOB_SUMMONED);
/*     */           
/* 358 */           if (entityToSpawn != null); }
/*     */       
/*     */       } 
/*     */     } 
/*     */     
/* 363 */     if (!world.m_6443_(NullFlyingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/* 364 */       ray = Mth.m_216271_(RandomSource.m_216327_(), 1, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 369 */       if (!world.m_6443_(NullFlyingEntity.class, AABB.m_165882_(new Vec3(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(ray)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 374 */         if (!((Entity)world.m_6443_(NullFlyingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 375 */           ((Entity)world.m_6443_(NullFlyingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 377 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/* 379 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 380 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 381 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 10, 2));  }
/* 382 */          if (world instanceof Level) { Level _level = (Level)world;
/* 383 */           if (!_level.m_5776_()) {
/* 384 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */           } else {
/* 386 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */           }  }
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CheckForNullProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */