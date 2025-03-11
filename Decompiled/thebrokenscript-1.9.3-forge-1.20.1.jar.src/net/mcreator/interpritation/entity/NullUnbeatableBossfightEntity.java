/*     */ package net.mcreator.interpritation.entity;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.NullIsHereOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullIsHereOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullIsHereThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.BossEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class NullUnbeatableBossfightEntity extends Monster {
/*  51 */   private final ServerBossEvent bossInfo = new ServerBossEvent(m_5446_(), BossEvent.BossBarColor.WHITE, BossEvent.BossBarOverlay.PROGRESS);
/*     */   
/*     */   public NullUnbeatableBossfightEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  54 */     this((EntityType<NullUnbeatableBossfightEntity>)ThebrokenscriptModEntities.NULL_UNBEATABLE_BOSSFIGHT.get(), world);
/*     */   }
/*     */   
/*     */   public NullUnbeatableBossfightEntity(EntityType<NullUnbeatableBossfightEntity> type, Level world) {
/*  58 */     super(type, world);
/*  59 */     m_274367_(0.6F);
/*  60 */     this.f_21364_ = 0;
/*  61 */     m_21557_(false);
/*  62 */     m_21530_();
/*  63 */     this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  68 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation m_6037_(Level world) {
/*  73 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  78 */     super.m_8099_();
/*  79 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  82 */             return 16.0D;
/*     */           }
/*     */         });
/*  85 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  88 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  91 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  92 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  93 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  94 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  99 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 104 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/* 109 */     return -0.35D;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 113 */     super.m_7472_(source, looting, recentlyHitIn);
/* 114 */     m_19983_(new ItemStack((ItemLike)ThebrokenscriptModBlocks.FIELD_GENERATOR.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 119 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 124 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_142535_(float l, float d, DamageSource source) {
/* 129 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 134 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 135 */       return false; 
/* 136 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 137 */       return false; 
/* 138 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 139 */       return false; 
/* 140 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 141 */       return false; 
/* 142 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 143 */       return false; 
/* 144 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 145 */       return false; 
/* 146 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 147 */       return false; 
/* 148 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 149 */       return false; 
/* 150 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 151 */       return false; 
/* 152 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 153 */       return false; 
/* 154 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 164 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 169 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 170 */     NullIsHereOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, (Entity)this);
/* 171 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 176 */     super.m_5993_(entity, score, damageSource);
/* 177 */     NullIsHereThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 182 */     super.m_6075_();
/* 183 */     NullIsHereOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6094_() {
/* 188 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7324_(Entity entityIn) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_6138_() {}
/*     */ 
/*     */   
/*     */   public boolean m_6072_() {
/* 201 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6457_(ServerPlayer player) {
/* 206 */     super.m_6457_(player);
/* 207 */     this.bossInfo.m_6543_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6452_(ServerPlayer player) {
/* 212 */     super.m_6452_(player);
/* 213 */     this.bossInfo.m_6539_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8024_() {
/* 218 */     super.m_8024_();
/* 219 */     this.bossInfo.m_142711_(m_21223_() / m_21233_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void m_20242_(boolean ignored) {
/* 228 */     super.m_20242_(true);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 232 */     super.m_8107_();
/* 233 */     m_20242_(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 240 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 241 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 242 */     builder = builder.m_22268_(Attributes.f_22276_, 910.0D);
/* 243 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 244 */     builder = builder.m_22268_(Attributes.f_22281_, 313.0D);
/* 245 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 246 */     builder = builder.m_22268_(Attributes.f_22280_, 0.0D);
/* 247 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\NullUnbeatableBossfightEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */