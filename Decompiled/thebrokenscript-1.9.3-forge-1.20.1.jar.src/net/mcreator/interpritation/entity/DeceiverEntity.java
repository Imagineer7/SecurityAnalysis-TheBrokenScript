/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.DeceiverOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.DeceiverOnInitialEntitySpawnProcedure;
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
/*     */ public class DeceiverEntity
/*     */   extends Monster
/*     */ {
/*     */   public DeceiverEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  46 */     this((EntityType<DeceiverEntity>)ThebrokenscriptModEntities.DECEIVER.get(), world);
/*     */   }
/*     */   
/*     */   public DeceiverEntity(EntityType<DeceiverEntity> type, Level world) {
/*  50 */     super(type, world);
/*  51 */     m_274367_(0.6F);
/*  52 */     this.f_21364_ = 0;
/*  53 */     m_21557_(false);
/*  54 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  59 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  64 */     super.m_8099_();
/*  65 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false));
/*  66 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  69 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  72 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  73 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  74 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  75 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  80 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/*  90 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  95 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 100 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 105 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 106 */       return false; 
/* 107 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 108 */       return false; 
/* 109 */     if (damagesource.m_7640_() instanceof Player)
/* 110 */       return false; 
/* 111 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 112 */       return false; 
/* 113 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 114 */       return false; 
/* 115 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 116 */       return false; 
/* 117 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 118 */       return false; 
/* 119 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 120 */       return false; 
/* 121 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 122 */       return false; 
/* 123 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 124 */       return false; 
/* 125 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 126 */       return false; 
/* 127 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 128 */       return false; 
/* 129 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 130 */       return false; 
/* 131 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 141 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 146 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 147 */     DeceiverOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 148 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 153 */     super.m_6075_();
/* 154 */     DeceiverOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 161 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 162 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 163 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 164 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 165 */     builder = builder.m_22268_(Attributes.f_22281_, 13.0D);
/* 166 */     builder = builder.m_22268_(Attributes.f_22277_, 1816.0D);
/* 167 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\DeceiverEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */