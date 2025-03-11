/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.CircuitDisguisedAsCreeperEntityIsHurtProcedure;
/*     */ import net.mcreator.interpritation.procedures.CircuitDisguisedAsCreeperOnEntityTickUpdateProcedure;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
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
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CircuitDisguisedAsCreeperEntity
/*     */   extends Monster
/*     */ {
/*     */   public CircuitDisguisedAsCreeperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  39 */     this((EntityType<CircuitDisguisedAsCreeperEntity>)ThebrokenscriptModEntities.CIRCUIT_DISGUISED_AS_CREEPER.get(), world);
/*     */   }
/*     */   
/*     */   public CircuitDisguisedAsCreeperEntity(EntityType<CircuitDisguisedAsCreeperEntity> type, Level world) {
/*  43 */     super(type, world);
/*  44 */     m_274367_(1.0F);
/*  45 */     this.f_21364_ = 0;
/*  46 */     m_21557_(false);
/*  47 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  52 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  57 */     super.m_8099_();
/*  58 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  61 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  64 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  65 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  66 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  67 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  72 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  82 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  87 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/*  92 */     double x = m_20185_();
/*  93 */     double y = m_20186_();
/*  94 */     double z = m_20189_();
/*  95 */     Level world = m_9236_();
/*  96 */     CircuitDisguisedAsCreeperEntity circuitDisguisedAsCreeperEntity = this;
/*  97 */     Entity sourceentity = damagesource.m_7639_();
/*  98 */     Entity immediatesourceentity = damagesource.m_7640_();
/*     */     
/* 100 */     CircuitDisguisedAsCreeperEntityIsHurtProcedure.execute((Entity)circuitDisguisedAsCreeperEntity);
/* 101 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 102 */       return false; 
/* 103 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 104 */       return false; 
/* 105 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/* 106 */       return false; 
/* 107 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 108 */       return false; 
/* 109 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 110 */       return false; 
/* 111 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 112 */       return false; 
/* 113 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 114 */       return false; 
/* 115 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 116 */       return false; 
/* 117 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 118 */       return false; 
/* 119 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 120 */       return false; 
/* 121 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
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
/*     */   public void m_6075_() {
/* 142 */     super.m_6075_();
/* 143 */     CircuitDisguisedAsCreeperOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 150 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 151 */     builder = builder.m_22268_(Attributes.f_22279_, 0.1D);
/* 152 */     builder = builder.m_22268_(Attributes.f_22276_, 910.0D);
/* 153 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22281_, 13.0D);
/* 155 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 156 */     builder = builder.m_22268_(Attributes.f_22278_, 10.0D);
/* 157 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\CircuitDisguisedAsCreeperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */