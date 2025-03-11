/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.NullFlyingOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullFlyingOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
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
/*     */ public class NullFlyingEntity
/*     */   extends Monster
/*     */ {
/*     */   public NullFlyingEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  51 */     this((EntityType<NullFlyingEntity>)ThebrokenscriptModEntities.NULL_FLYING.get(), world);
/*     */   }
/*     */   
/*     */   public NullFlyingEntity(EntityType<NullFlyingEntity> type, Level world) {
/*  55 */     super(type, world);
/*  56 */     m_274367_(0.6F);
/*  57 */     this.f_21364_ = 0;
/*  58 */     m_21557_(false);
/*  59 */     m_6593_((Component)Component.m_237113_("MobIsmissingID"));
/*  60 */     m_20340_(true);
/*  61 */     m_21530_();
/*  62 */     this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  67 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation m_6037_(Level world) {
/*  72 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  77 */     super.m_8099_();
/*  78 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  81 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  84 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  85 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
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
/*     */   public double m_6049_() {
/* 102 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 107 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 112 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_142535_(float l, float d, DamageSource source) {
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 122 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 123 */       return false; 
/* 124 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 125 */       return false; 
/* 126 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/* 127 */       return false; 
/* 128 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 129 */       return false; 
/* 130 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 131 */       return false; 
/* 132 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 133 */       return false; 
/* 134 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 135 */       return false; 
/* 136 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 137 */       return false; 
/* 138 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 139 */       return false; 
/* 140 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 141 */       return false; 
/* 142 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 143 */       return false; 
/* 144 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 145 */       return false; 
/* 146 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 147 */       return false; 
/* 148 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 153 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 158 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 163 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 164 */     NullFlyingOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_());
/* 165 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 170 */     super.m_6075_();
/* 171 */     NullFlyingOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void m_20242_(boolean ignored) {
/* 180 */     super.m_20242_(true);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 184 */     super.m_8107_();
/* 185 */     m_20242_(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 192 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 193 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 194 */     builder = builder.m_22268_(Attributes.f_22276_, 810.0D);
/* 195 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 196 */     builder = builder.m_22268_(Attributes.f_22281_, 53.0D);
/* 197 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 198 */     builder = builder.m_22268_(Attributes.f_22278_, 50.0D);
/* 199 */     builder = builder.m_22268_(Attributes.f_22282_, 50.0D);
/* 200 */     builder = builder.m_22268_(Attributes.f_22280_, 0.3D);
/* 201 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\NullFlyingEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */