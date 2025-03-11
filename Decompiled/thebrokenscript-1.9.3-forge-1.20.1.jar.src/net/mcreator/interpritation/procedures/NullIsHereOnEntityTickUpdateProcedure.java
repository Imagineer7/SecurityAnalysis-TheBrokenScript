/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class NullIsHereOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  33 */     if (entity == null)
/*     */       return; 
/*  35 */     double randomtitle = 0.0D;
/*  36 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 999.0D, 999.0D, 999.0D), e -> true).isEmpty()) {
/*  37 */       if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */         
/*  41 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/*  42 */           _entity.m_6710_(_ent); }  }
/*  43 */        if (world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60815_()) {
/*     */         
/*  45 */         Entity _ent = entity;
/*  46 */         _ent.m_6021_(x, y + 1.0D, z);
/*  47 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  48 */           _serverPlayer.f_8906_.m_9774_(x, y + 1.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*     */       
/*     */       } 
/*  51 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  52 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "gamemode survival @a"); }
/*     */       
/*  54 */       entity.getPersistentData().m_128347_("timer", entity.getPersistentData().m_128459_("timer") + 1.0D);
/*  55 */       if (entity.getPersistentData().m_128459_("timer") == 15.0D) {
/*  56 */         entity.getPersistentData().m_128347_("timer", 0.0D);
/*     */         
/*  58 */         Entity _ent = entity;
/*  59 */         _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), y, entity
/*  60 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/*  61 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  62 */           _serverPlayer.f_8906_.m_9774_(entity
/*  63 */               .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), y, entity
/*  64 */               .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/*  65 */               .m_146908_(), _ent.m_146909_()); }
/*     */         
/*  67 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/*  68 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19609_, 10, 1, false, false));  }
/*     */       
/*  70 */       }  entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  72 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  74 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  76 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  78 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 1.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  80 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  82 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*  83 */       if (Math.random() < 0.1D) {
/*     */         
/*  85 */         Entity _ent = entity;
/*  86 */         _ent.m_6021_(x, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  88 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                 }
/*  90 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), z);
/*  91 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  92 */           _serverPlayer.f_8906_.m_9774_(x, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  94 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */                   }
/*  96 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), z, _ent.m_146908_(), _ent.m_146909_()); }
/*     */       
/*     */       } 
/*     */     } 
/* 100 */     if (Math.random() < 0.5D) {
/* 101 */       randomtitle = Mth.m_216271_(RandomSource.m_216327_(), 1, 16);
/* 102 */       if (randomtitle == 1.0D && 
/* 103 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 104 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"You know nothing\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 107 */       if (randomtitle == 2.0D && 
/* 108 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 109 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Worship me\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 112 */       if (randomtitle == 3.0D && 
/* 113 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 114 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Follow me\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 117 */       if (randomtitle == 4.0D && 
/* 118 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 119 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Join us\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 122 */       if (randomtitle == 5.0D && 
/* 123 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 124 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Corrupted\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 127 */       if (randomtitle == 6.0D && 
/* 128 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 129 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Go away\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 132 */       if (randomtitle == 7.0D && 
/* 133 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 134 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Null\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 137 */       if (randomtitle == 8.0D && 
/* 138 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 139 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"We can hear you\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 142 */       if (randomtitle == 9.0D && 
/* 143 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 144 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Can you see me?\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 147 */       if (randomtitle == 10.0D && 
/* 148 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 149 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"0\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 152 */       if (randomtitle == 11.0D && 
/* 153 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 154 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Behind you\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 157 */       if (randomtitle == 12.0D && 
/* 158 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 159 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Help me\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 162 */       if (randomtitle == 13.0D && 
/* 163 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 164 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Nothing can be changed\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 167 */       if (randomtitle == 14.0D && 
/* 168 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 169 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Nothing can be changed\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 172 */       if (randomtitle == 15.0D && 
/* 173 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 174 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"Close your eyes\",\"color\":\"white\"}"); }
/*     */ 
/*     */       
/* 177 */       if (randomtitle == 16.0D && 
/* 178 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 179 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "title @a title {\"text\":\"One of us\",\"color\":\"white\"}"); }
/*     */     
/*     */     } 
/*     */     
/* 183 */     if (world instanceof Level) { Level _level = (Level)world;
/* 184 */       if (!_level.m_5776_()) {
/* 185 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullishereloop")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */       } else {
/* 187 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nullishereloop")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       }  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullIsHereOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */