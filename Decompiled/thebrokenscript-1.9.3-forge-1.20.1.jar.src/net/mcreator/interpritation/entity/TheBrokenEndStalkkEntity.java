/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.TheBrokenEndStalkOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.TheBrokenEndStalkOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.network.syncher.EntityDataAccessor;
/*     */ import net.minecraft.network.syncher.EntityDataSerializers;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityDimensions;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.Pose;
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
/*     */ import software.bernie.geckolib.animatable.GeoEntity;
/*     */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*     */ import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
/*     */ import software.bernie.geckolib.core.animation.AnimatableManager;
/*     */ import software.bernie.geckolib.core.animation.AnimationController;
/*     */ import software.bernie.geckolib.core.animation.AnimationState;
/*     */ import software.bernie.geckolib.core.animation.RawAnimation;
/*     */ import software.bernie.geckolib.core.object.PlayState;
/*     */ import software.bernie.geckolib.util.GeckoLibUtil;
/*     */ 
/*     */ 
/*     */ public class TheBrokenEndStalkkEntity
/*     */   extends Monster
/*     */   implements GeoEntity
/*     */ {
/*  58 */   public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.m_135353_(TheBrokenEndStalkkEntity.class, EntityDataSerializers.f_135035_);
/*  59 */   public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.m_135353_(TheBrokenEndStalkkEntity.class, EntityDataSerializers.f_135030_);
/*  60 */   public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.m_135353_(TheBrokenEndStalkkEntity.class, EntityDataSerializers.f_135030_);
/*  61 */   private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache((GeoAnimatable)this);
/*     */   private boolean swinging;
/*     */   private boolean lastloop;
/*     */   private long lastSwing;
/*  65 */   public String animationprocedure = "empty"; String prevAnim;
/*     */   
/*     */   public TheBrokenEndStalkkEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  68 */     this((EntityType<TheBrokenEndStalkkEntity>)ThebrokenscriptModEntities.THE_BROKEN_END_STALKK.get(), world);
/*     */   }
/*     */   
/*     */   public TheBrokenEndStalkkEntity(EntityType<TheBrokenEndStalkkEntity> type, Level world) {
/*  72 */     super(type, world);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     this.prevAnim = "empty"; this.f_21364_ = 0; m_21557_(false); m_274367_(0.6F); m_21530_();
/*     */   } protected void m_8097_() { super.m_8097_(); this.f_19804_.m_135372_(SHOOT, Boolean.valueOf(false)); this.f_19804_.m_135372_(ANIMATION, "undefined"); this.f_19804_.m_135372_(TEXTURE, "thebrokenendcalm"); } public void setTexture(String texture) { this.f_19804_.m_135381_(TEXTURE, texture); } public String getTexture() { return (String)this.f_19804_.m_135370_(TEXTURE); } public Packet<ClientGamePacketListener> m_5654_() { return NetworkHooks.getEntitySpawningPacket((Entity)this); } protected void m_8099_() { super.m_8099_(); this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false) { protected double m_6639_(LivingEntity entity) { return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_()); } }
/*     */       ); this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D)); this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0])); this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this)); this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this)); } public MobType m_6336_() { return MobType.f_21640_; } public boolean m_6785_(double distanceToClosestPlayer) { return false; } public SoundEvent m_7975_(DamageSource ds) { return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt")); } public SoundEvent m_5592_() { return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death")); }
/* 223 */   private PlayState procedurePredicate(AnimationState event) { if ((!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED) || (!this.animationprocedure.equals(this.prevAnim) && !this.animationprocedure.equals("empty"))) {
/* 224 */       if (!this.animationprocedure.equals(this.prevAnim))
/* 225 */         event.getController().forceAnimationReset(); 
/* 226 */       event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
/* 227 */       if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
/* 228 */         this.animationprocedure = "empty";
/* 229 */         event.getController().forceAnimationReset();
/*     */       } 
/* 231 */     } else if (this.animationprocedure.equals("empty")) {
/* 232 */       this.prevAnim = "empty";
/* 233 */       return PlayState.STOP;
/*     */     } 
/* 235 */     this.prevAnim = this.animationprocedure;
/* 236 */     return PlayState.CONTINUE; }
/*     */   public boolean m_6469_(DamageSource source, float amount) { if (source.m_276093_(DamageTypes.f_268631_)) return false;  if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow) return false;  if (source.m_7640_() instanceof net.minecraft.world.entity.player.Player) return false;  if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud) return false;  if (source.m_276093_(DamageTypes.f_268671_)) return false;  if (source.m_276093_(DamageTypes.f_268585_)) return false;  if (source.m_276093_(DamageTypes.f_268722_)) return false;  if (source.m_276093_(DamageTypes.f_268450_)) return false;  if (source.m_276093_(DamageTypes.f_268565_)) return false;  if (source.m_276093_(DamageTypes.f_268714_)) return false;  if (source.m_276093_(DamageTypes.f_268526_)) return false;  if (source.m_276093_(DamageTypes.f_268482_)) return false;  if (source.m_276093_(DamageTypes.f_268493_)) return false;  if (source.m_276093_(DamageTypes.f_268641_)) return false;  return super.m_6469_(source, amount); }
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) { SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag); TheBrokenEndStalkOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this); return retval; }
/*     */   public void m_7380_(CompoundTag compound) { super.m_7380_(compound); compound.m_128359_("Texture", getTexture()); }
/*     */   public void m_7378_(CompoundTag compound) { super.m_7378_(compound); if (compound.m_128441_("Texture"))
/* 241 */       setTexture(compound.m_128461_("Texture"));  } protected void m_6153_() { this.f_20919_++;
/* 242 */     if (this.f_20919_ == 20)
/* 243 */     { m_142687_(Entity.RemovalReason.KILLED);
/* 244 */       m_21226_(); }  }
/*     */   public void m_6075_() { super.m_6075_(); TheBrokenEndStalkOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this); m_6210_(); }
/*     */   public EntityDimensions m_6972_(Pose p_33597_) { return super.m_6972_(p_33597_).m_20388_(1.0F); }
/*     */   public static void init() {}
/*     */   public static AttributeSupplier.Builder createAttributes() { AttributeSupplier.Builder builder = Mob.m_21552_(); builder = builder.m_22268_(Attributes.f_22279_, 0.0D); builder = builder.m_22268_(Attributes.f_22276_, 810.0D); builder = builder.m_22268_(Attributes.f_22284_, 0.0D); builder = builder.m_22268_(Attributes.f_22281_, 3.0D); builder = builder.m_22268_(Attributes.f_22277_, 916.0D); return builder; } private PlayState movementPredicate(AnimationState event) { if (this.animationprocedure.equals("empty"))
/* 249 */       return event.setAndContinue(RawAnimation.begin().thenLoop("idle"));  return PlayState.STOP; } public String getSyncedAnimation() { return (String)this.f_19804_.m_135370_(ANIMATION); }
/*     */ 
/*     */   
/*     */   public void setAnimation(String animation) {
/* 253 */     this.f_19804_.m_135381_(ANIMATION, animation);
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerControllers(AnimatableManager.ControllerRegistrar data) {
/* 258 */     data.add(new AnimationController[] { new AnimationController((GeoAnimatable)this, "movement", 4, this::movementPredicate) });
/* 259 */     data.add(new AnimationController[] { new AnimationController((GeoAnimatable)this, "procedure", 4, this::procedurePredicate) });
/*     */   }
/*     */ 
/*     */   
/*     */   public AnimatableInstanceCache getAnimatableInstanceCache() {
/* 264 */     return this.cache;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\TheBrokenEndStalkkEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */