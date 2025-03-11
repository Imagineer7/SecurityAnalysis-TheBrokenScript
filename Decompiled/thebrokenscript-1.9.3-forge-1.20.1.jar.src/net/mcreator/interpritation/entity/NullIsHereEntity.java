/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.NullIsHereOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullIsHereOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullIsHereThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
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
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NullIsHereEntity
/*     */   extends Monster
/*     */ {
/*     */   public NullIsHereEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  52 */     this((EntityType<NullIsHereEntity>)ThebrokenscriptModEntities.NULL_IS_HERE.get(), world);
/*     */   }
/*     */   
/*     */   public NullIsHereEntity(EntityType<NullIsHereEntity> type, Level world) {
/*  56 */     super(type, world);
/*  57 */     m_274367_(0.6F);
/*  58 */     this.f_21364_ = 0;
/*  59 */     m_21557_(false);
/*  60 */     m_21530_();
/*  61 */     this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  66 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation m_6037_(Level world) {
/*  71 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  76 */     super.m_8099_();
/*  77 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  80 */             return 16.0D;
/*     */           }
/*     */         });
/*  83 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  86 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  89 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  90 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  91 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  92 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  97 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/* 107 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 112 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 117 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_142535_(float l, float d, DamageSource source) {
/* 122 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 127 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 128 */       return false; 
/* 129 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 130 */       return false; 
/* 131 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/* 132 */       return false; 
/* 133 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 134 */       return false; 
/* 135 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 136 */       return false; 
/* 137 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 138 */       return false; 
/* 139 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 140 */       return false; 
/* 141 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 142 */       return false; 
/* 143 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 144 */       return false; 
/* 145 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 146 */       return false; 
/* 147 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 148 */       return false; 
/* 149 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 150 */       return false; 
/* 151 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 152 */       return false; 
/* 153 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 158 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 163 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 168 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 169 */     NullIsHereOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, (Entity)this);
/* 170 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 175 */     super.m_5993_(entity, score, damageSource);
/* 176 */     NullIsHereThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 181 */     super.m_6075_();
/* 182 */     NullIsHereOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
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
/*     */   
/*     */   protected void m_6138_() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void m_20242_(boolean ignored) {
/* 204 */     super.m_20242_(true);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 208 */     super.m_8107_();
/* 209 */     m_20242_(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 216 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 217 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 218 */     builder = builder.m_22268_(Attributes.f_22276_, 910.0D);
/* 219 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 220 */     builder = builder.m_22268_(Attributes.f_22281_, 313.0D);
/* 221 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 222 */     builder = builder.m_22268_(Attributes.f_22280_, 0.0D);
/* 223 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\NullIsHereEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */