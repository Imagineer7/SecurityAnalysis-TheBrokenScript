/*     */ package net.mcreator.interpritation.procedures;
/*     */ import java.util.Comparator;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModItems;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*     */ import net.minecraft.resources.ResourceKey;
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
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.items.ItemHandlerHelper;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class FollowOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  39 */     if (entity == null)
/*     */       return; 
/*  41 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/*  42 */       if (Math.random() < 0.5D)
/*  43 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  44 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*  45 */          if (!entity.m_9236_().m_5776_())
/*  46 */           entity.m_146870_(); 
/*  47 */         if (world instanceof Level) { Level _level = (Level)world;
/*  48 */           if (!_level.m_5776_()) {
/*  49 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */           } else {
/*  51 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  58 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1; if (!_entity.m_9236_().m_5776_()) {
/*  59 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_216964_, 60, 1));
/*     */           } }
/*     */ 
/*     */ 
/*     */         
/*  64 */         entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity1;
/*  65 */           _entity.m_21153_(Mth.m_216271_(RandomSource.m_216327_(), 1, 10)); }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  70 */         entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity1; if (!_player.m_9236_().m_5776_()) {
/*  71 */             ResourceKey<Level> destinationType = ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:day_a"));
/*  72 */             if (_player.m_9236_().m_46472_() == destinationType)
/*     */               return; 
/*  74 */             ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
/*  75 */             if (nextLevel != null) {
/*  76 */               _player.f_8906_.m_9829_((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
/*  77 */               _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
/*  78 */               _player.f_8906_.m_9829_((Packet)new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
/*  79 */               for (MobEffectInstance _effectinstance : _player.m_21220_())
/*  80 */                 _player.f_8906_.m_9829_((Packet)new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance)); 
/*  81 */               _player.f_8906_.m_9829_((Packet)new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
/*     */             } 
/*     */           }  }
/*     */          }
/*  85 */       else { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  86 */           _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*  87 */          if (!entity.m_9236_().m_5776_()) {
/*  88 */           entity.m_146870_();
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*  93 */         Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1;
/*  94 */           ItemStack _setstack = (new ItemStack((ItemLike)ThebrokenscriptModItems.N.get())).m_41777_();
/*  95 */           _setstack.m_41764_(1);
/*  96 */           ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 103 */         Entity _ent = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 104 */         _ent.m_6021_(x, y, z);
/* 105 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 106 */           _serverPlayer.f_8906_.m_9774_(x, y, z, _ent.m_146908_(), _ent.m_146909_()); }
/*     */          }
/*     */     
/*     */     }
/* 110 */     entity.getPersistentData().m_128347_("timer", entity.getPersistentData().m_128459_("timer") + 1.0D);
/* 111 */     if (entity.getPersistentData().m_128459_("timer") == 20.0D) {
/* 112 */       entity.getPersistentData().m_128347_("timer", 0.0D);
/* 113 */       if (Math.random() < 0.5D) {
/* 114 */         world.m_7731_(BlockPos.m_274561_(x + Mth.m_216271_(RandomSource.m_216327_(), 0, 3), y + Mth.m_216271_(RandomSource.m_216327_(), 0, 3), z + Mth.m_216271_(RandomSource.m_216327_(), 0, 3)), ((Block)ThebrokenscriptModBlocks.DISRUPTION
/* 115 */             .get()).m_49966_(), 3);
/*     */       } else {
/* 117 */         world.m_7731_(BlockPos.m_274561_(x - Mth.m_216271_(RandomSource.m_216327_(), 0, 3), y - Mth.m_216271_(RandomSource.m_216327_(), 0, 3), z - Mth.m_216271_(RandomSource.m_216327_(), 0, 3)), ((Block)ThebrokenscriptModBlocks.DISRUPTION
/* 118 */             .get()).m_49966_(), 3);
/*     */       } 
/*     */     } 
/* 121 */     if (world instanceof Level) { Level _lvl29 = (Level)world; if (_lvl29.m_46461_() && 
/* 122 */         !entity.m_9236_().m_5776_())
/* 123 */         entity.m_146870_();  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\FollowOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */