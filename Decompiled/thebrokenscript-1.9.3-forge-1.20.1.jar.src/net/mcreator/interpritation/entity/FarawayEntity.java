/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.FarawayOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.interpritation.procedures.FarawayPriObnovlieniiTikaSushchnostiProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
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
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.levelgen.Heightmap;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class FarawayEntity
/*     */   extends Monster
/*     */ {
/*     */   public FarawayEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  49 */     this((EntityType<FarawayEntity>)ThebrokenscriptModEntities.FARAWAY.get(), world);
/*     */   }
/*     */   
/*     */   public FarawayEntity(EntityType<FarawayEntity> type, Level world) {
/*  53 */     super(type, world);
/*  54 */     m_274367_(0.6F);
/*  55 */     this.f_21364_ = 0;
/*  56 */     m_21557_(false);
/*  57 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  62 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  67 */     super.m_8099_();
/*  68 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  71 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  74 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  75 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  76 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  77 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
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
/* 107 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 108 */       return false; 
/* 109 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 110 */       return false; 
/* 111 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/* 112 */       return false; 
/* 113 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 114 */       return false; 
/* 115 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 116 */       return false; 
/* 117 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 118 */       return false; 
/* 119 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 120 */       return false; 
/* 121 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 122 */       return false; 
/* 123 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 124 */       return false; 
/* 125 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 126 */       return false; 
/* 127 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 128 */       return false; 
/* 129 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 130 */       return false; 
/* 131 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 132 */       return false; 
/* 133 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 138 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 148 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 149 */     FarawayOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 150 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 155 */     super.m_6075_();
/* 156 */     FarawayPriObnovlieniiTikaSushchnostiProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6063_() {
/* 161 */     double x = m_20185_();
/* 162 */     double y = m_20186_();
/* 163 */     double z = m_20189_();
/* 164 */     Level world = m_9236_();
/* 165 */     FarawayEntity farawayEntity = this;
/* 166 */     return false;
/*     */   }
/*     */   
/*     */   public static void init() {
/* 170 */     SpawnPlacements.m_21754_((EntityType)ThebrokenscriptModEntities.FARAWAY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 171 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 175 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 176 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 177 */     builder = builder.m_22268_(Attributes.f_22276_, 510.0D);
/* 178 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 179 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 180 */     builder = builder.m_22268_(Attributes.f_22277_, 616.0D);
/* 181 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\FarawayEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */