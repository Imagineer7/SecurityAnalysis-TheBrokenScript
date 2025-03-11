/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.BsodOnInitialEntitySpawnProcedure;
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
/*     */ public class BsodEntity
/*     */   extends Monster
/*     */ {
/*     */   public BsodEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  44 */     this((EntityType<BsodEntity>)ThebrokenscriptModEntities.BSOD.get(), world);
/*     */   }
/*     */   
/*     */   public BsodEntity(EntityType<BsodEntity> type, Level world) {
/*  48 */     super(type, world);
/*  49 */     m_274367_(0.6F);
/*  50 */     this.f_21364_ = 0;
/*  51 */     m_21557_(false);
/*  52 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  57 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  62 */     super.m_8099_();
/*  63 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  66 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  69 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  70 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  71 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  72 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  77 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/*  87 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  92 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  97 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 102 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 103 */       return false; 
/* 104 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 105 */       return false; 
/* 106 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/* 107 */       return false; 
/* 108 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 109 */       return false; 
/* 110 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 111 */       return false; 
/* 112 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 113 */       return false; 
/* 114 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 115 */       return false; 
/* 116 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 117 */       return false; 
/* 118 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 119 */       return false; 
/* 120 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 121 */       return false; 
/* 122 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 123 */       return false; 
/* 124 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 125 */       return false; 
/* 126 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 127 */       return false; 
/* 128 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 133 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 138 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 143 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 144 */     BsodOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 145 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 152 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 153 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22276_, 810.0D);
/* 155 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 156 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 157 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 158 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\BsodEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */