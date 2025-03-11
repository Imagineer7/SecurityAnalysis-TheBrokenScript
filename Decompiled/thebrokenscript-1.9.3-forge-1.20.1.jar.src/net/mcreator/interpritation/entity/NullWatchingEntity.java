/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.NullWatchingEntityIsHurtProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullWatchingPriNachalnomPrizyvieSushchnostiProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullWatchingPriObnovlieniiTikaSushchnostiProcedure;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
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
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NullWatchingEntity
/*     */   extends Monster
/*     */ {
/*     */   public NullWatchingEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  48 */     this((EntityType<NullWatchingEntity>)ThebrokenscriptModEntities.NULL_WATCHING.get(), world);
/*     */   }
/*     */   
/*     */   public NullWatchingEntity(EntityType<NullWatchingEntity> type, Level world) {
/*  52 */     super(type, world);
/*  53 */     m_274367_(0.6F);
/*  54 */     this.f_21364_ = 10;
/*  55 */     m_21557_(false);
/*  56 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  61 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  66 */     super.m_8099_();
/*  67 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false));
/*  68 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  71 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  74 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  75 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  76 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  77 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  82 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/*  92 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  97 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 102 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 107 */     double x = m_20185_();
/* 108 */     double y = m_20186_();
/* 109 */     double z = m_20189_();
/* 110 */     Level world = m_9236_();
/* 111 */     NullWatchingEntity nullWatchingEntity = this;
/* 112 */     Entity sourceentity = damagesource.m_7639_();
/* 113 */     Entity immediatesourceentity = damagesource.m_7640_();
/*     */     
/* 115 */     NullWatchingEntityIsHurtProcedure.execute((LevelAccessor)world, x, y, z, damagesource, (Entity)nullWatchingEntity);
/* 116 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 117 */       return false; 
/* 118 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 119 */       return false; 
/* 120 */     if (damagesource.m_7640_() instanceof Player)
/* 121 */       return false; 
/* 122 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 123 */       return false; 
/* 124 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 125 */       return false; 
/* 126 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 127 */       return false; 
/* 128 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 129 */       return false; 
/* 130 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 131 */       return false; 
/* 132 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 133 */       return false; 
/* 134 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 135 */       return false; 
/* 136 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 137 */       return false; 
/* 138 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 139 */       return false; 
/* 140 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 141 */       return false; 
/* 142 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 147 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 152 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 157 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 158 */     NullWatchingPriNachalnomPrizyvieSushchnostiProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_());
/* 159 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 164 */     super.m_6075_();
/* 165 */     NullWatchingPriObnovlieniiTikaSushchnostiProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6063_() {
/* 170 */     double x = m_20185_();
/* 171 */     double y = m_20186_();
/* 172 */     double z = m_20189_();
/* 173 */     Level world = m_9236_();
/* 174 */     NullWatchingEntity nullWatchingEntity = this;
/* 175 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 182 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 183 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 184 */     builder = builder.m_22268_(Attributes.f_22276_, 910.0D);
/* 185 */     builder = builder.m_22268_(Attributes.f_22284_, 10.0D);
/* 186 */     builder = builder.m_22268_(Attributes.f_22281_, 63.0D);
/* 187 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 188 */     builder = builder.m_22268_(Attributes.f_22278_, 10.0D);
/* 189 */     builder = builder.m_22268_(Attributes.f_22282_, 10.0D);
/* 190 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\NullWatchingEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */