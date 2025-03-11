/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.FalseVillagerEntityDiesProcedure;
/*     */ import net.mcreator.interpritation.procedures.FalseVillagerOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.FalseVillagerOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.network.syncher.EntityDataAccessor;
/*     */ import net.minecraft.network.syncher.EntityDataSerializers;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
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
/*     */ import net.minecraft.world.entity.ai.goal.PanicGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class FalseVillagerEntity extends Monster {
/*  44 */   public static final EntityDataAccessor<Boolean> DATA_looked = SynchedEntityData.m_135353_(FalseVillagerEntity.class, EntityDataSerializers.f_135035_);
/*  45 */   public static final EntityDataAccessor<Integer> DATA_timer = SynchedEntityData.m_135353_(FalseVillagerEntity.class, EntityDataSerializers.f_135028_);
/*  46 */   public static final EntityDataAccessor<Boolean> DATA_isfollowing = SynchedEntityData.m_135353_(FalseVillagerEntity.class, EntityDataSerializers.f_135035_);
/*     */   
/*     */   public FalseVillagerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  49 */     this((EntityType<FalseVillagerEntity>)ThebrokenscriptModEntities.FALSE_VILLAGER.get(), world);
/*     */   }
/*     */   
/*     */   public FalseVillagerEntity(EntityType<FalseVillagerEntity> type, Level world) {
/*  53 */     super(type, world);
/*  54 */     m_274367_(0.6F);
/*  55 */     this.f_21364_ = 0;
/*  56 */     m_21557_(false);
/*  57 */     m_6593_((Component)Component.m_237113_("TESTIFICATE"));
/*  58 */     m_20340_(true);
/*  59 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  64 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8097_() {
/*  69 */     super.m_8097_();
/*  70 */     this.f_19804_.m_135372_(DATA_looked, Boolean.valueOf(false));
/*  71 */     this.f_19804_.m_135372_(DATA_timer, Integer.valueOf(0));
/*  72 */     this.f_19804_.m_135372_(DATA_isfollowing, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  77 */     super.m_8099_();
/*  78 */     this.f_21345_.m_25352_(1, (Goal)new PanicGoal((PathfinderMob)this, 1.2D));
/*  79 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  82 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  85 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  86 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  87 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  92 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  97 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 102 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 107 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 112 */     super.m_6667_(source);
/* 113 */     FalseVillagerEntityDiesProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 118 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 119 */     FalseVillagerOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 120 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7380_(CompoundTag compound) {
/* 125 */     super.m_7380_(compound);
/* 126 */     compound.m_128379_("Datalooked", ((Boolean)this.f_19804_.m_135370_(DATA_looked)).booleanValue());
/* 127 */     compound.m_128405_("Datatimer", ((Integer)this.f_19804_.m_135370_(DATA_timer)).intValue());
/* 128 */     compound.m_128379_("Dataisfollowing", ((Boolean)this.f_19804_.m_135370_(DATA_isfollowing)).booleanValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7378_(CompoundTag compound) {
/* 133 */     super.m_7378_(compound);
/* 134 */     if (compound.m_128441_("Datalooked"))
/* 135 */       this.f_19804_.m_135381_(DATA_looked, Boolean.valueOf(compound.m_128471_("Datalooked"))); 
/* 136 */     if (compound.m_128441_("Datatimer"))
/* 137 */       this.f_19804_.m_135381_(DATA_timer, Integer.valueOf(compound.m_128451_("Datatimer"))); 
/* 138 */     if (compound.m_128441_("Dataisfollowing")) {
/* 139 */       this.f_19804_.m_135381_(DATA_isfollowing, Boolean.valueOf(compound.m_128471_("Dataisfollowing")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void m_6075_() {
/* 144 */     super.m_6075_();
/* 145 */     FalseVillagerOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 152 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 153 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 155 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 156 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 157 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 158 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\FalseVillagerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */