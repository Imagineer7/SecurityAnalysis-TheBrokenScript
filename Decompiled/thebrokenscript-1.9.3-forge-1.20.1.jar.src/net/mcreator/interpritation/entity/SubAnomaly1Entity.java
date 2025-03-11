/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.SubAnomaly1OnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.SubAnomaly1OnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.network.syncher.EntityDataAccessor;
/*     */ import net.minecraft.network.syncher.EntityDataSerializers;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.Difficulty;
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
/*     */ import net.minecraft.world.entity.SpawnPlacements;
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
/*     */ import net.minecraft.world.level.levelgen.Heightmap;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class SubAnomaly1Entity
/*     */   extends Monster
/*     */ {
/*  52 */   public static final EntityDataAccessor<Integer> DATA_despawntimer = SynchedEntityData.m_135353_(SubAnomaly1Entity.class, EntityDataSerializers.f_135028_);
/*     */   
/*     */   public SubAnomaly1Entity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<SubAnomaly1Entity>)ThebrokenscriptModEntities.SUB_ANOMALY_1.get(), world);
/*     */   }
/*     */   
/*     */   public SubAnomaly1Entity(EntityType<SubAnomaly1Entity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     m_274367_(10.6F);
/*  61 */     this.f_21364_ = 0;
/*  62 */     m_21557_(false);
/*  63 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  68 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8097_() {
/*  73 */     super.m_8097_();
/*  74 */     this.f_19804_.m_135372_(DATA_despawntimer, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  79 */     super.m_8099_();
/*  80 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false));
/*  81 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  84 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  87 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  88 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  89 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  90 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  95 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 100 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/* 105 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 110 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 115 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 120 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 121 */       return false; 
/* 122 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 123 */       return false; 
/* 124 */     if (damagesource.m_7640_() instanceof Player)
/* 125 */       return false; 
/* 126 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 127 */       return false; 
/* 128 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 129 */       return false; 
/* 130 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 131 */       return false; 
/* 132 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 133 */       return false; 
/* 134 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 135 */       return false; 
/* 136 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 137 */       return false; 
/* 138 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 139 */       return false; 
/* 140 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 141 */       return false; 
/* 142 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 143 */       return false; 
/* 144 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 145 */       return false; 
/* 146 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 151 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 161 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 162 */     SubAnomaly1OnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 163 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7380_(CompoundTag compound) {
/* 168 */     super.m_7380_(compound);
/* 169 */     compound.m_128405_("Datadespawntimer", ((Integer)this.f_19804_.m_135370_(DATA_despawntimer)).intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7378_(CompoundTag compound) {
/* 174 */     super.m_7378_(compound);
/* 175 */     if (compound.m_128441_("Datadespawntimer")) {
/* 176 */       this.f_19804_.m_135381_(DATA_despawntimer, Integer.valueOf(compound.m_128451_("Datadespawntimer")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void m_6075_() {
/* 181 */     super.m_6075_();
/* 182 */     SubAnomaly1OnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6094_() {
/* 187 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7324_(Entity entityIn) {}
/*     */ 
/*     */   
/*     */   protected void m_6138_() {}
/*     */ 
/*     */   
/*     */   public static void init() {
/* 199 */     SpawnPlacements.m_21754_((EntityType)ThebrokenscriptModEntities.SUB_ANOMALY_1.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 200 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 204 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 205 */     builder = builder.m_22268_(Attributes.f_22279_, 0.1D);
/* 206 */     builder = builder.m_22268_(Attributes.f_22276_, 910.0D);
/* 207 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 208 */     builder = builder.m_22268_(Attributes.f_22281_, 1.0D);
/* 209 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 210 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\SubAnomaly1Entity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */