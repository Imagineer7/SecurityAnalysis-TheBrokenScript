/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.NullInvadeBaseOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullInvadeBaseOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NullInvadeBaseEntity
/*     */   extends Monster
/*     */ {
/*     */   public NullInvadeBaseEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  45 */     this((EntityType<NullInvadeBaseEntity>)ThebrokenscriptModEntities.NULL_INVADE_BASE.get(), world);
/*     */   }
/*     */   
/*     */   public NullInvadeBaseEntity(EntityType<NullInvadeBaseEntity> type, Level world) {
/*  49 */     super(type, world);
/*  50 */     m_274367_(0.6F);
/*  51 */     this.f_21364_ = 0;
/*  52 */     m_21557_(false);
/*  53 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  58 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  63 */     super.m_8099_();
/*  64 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  67 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  70 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  71 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  72 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  73 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  78 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  83 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/*  88 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  93 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  98 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 103 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 104 */       return false; 
/* 105 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 106 */       return false; 
/* 107 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/* 108 */       return false; 
/* 109 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 110 */       return false; 
/* 111 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 112 */       return false; 
/* 113 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 114 */       return false; 
/* 115 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 116 */       return false; 
/* 117 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 118 */       return false; 
/* 119 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 120 */       return false; 
/* 121 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 122 */       return false; 
/* 123 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 124 */       return false; 
/* 125 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 126 */       return false; 
/* 127 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 142 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 143 */     NullInvadeBaseOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 144 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 149 */     super.m_6075_();
/* 150 */     NullInvadeBaseOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 157 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 158 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 159 */     builder = builder.m_22268_(Attributes.f_22276_, 910.0D);
/* 160 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 161 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 162 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 163 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\NullInvadeBaseEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */