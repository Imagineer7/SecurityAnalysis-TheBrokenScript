/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.CircuitMineshaftFleeOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
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
/*     */ public class CircuitMineshaftFleeEntity extends Monster implements GeoEntity {
/*  54 */   public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.m_135353_(CircuitMineshaftFleeEntity.class, EntityDataSerializers.f_135035_);
/*  55 */   public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.m_135353_(CircuitMineshaftFleeEntity.class, EntityDataSerializers.f_135030_);
/*  56 */   public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.m_135353_(CircuitMineshaftFleeEntity.class, EntityDataSerializers.f_135030_);
/*  57 */   private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache((GeoAnimatable)this);
/*     */   private boolean swinging;
/*     */   private boolean lastloop;
/*     */   private long lastSwing;
/*  61 */   public String animationprocedure = "empty";
/*     */   String prevAnim;
/*     */   
/*  64 */   public CircuitMineshaftFleeEntity(PlayMessages.SpawnEntity packet, Level world) { this((EntityType<CircuitMineshaftFleeEntity>)ThebrokenscriptModEntities.CIRCUIT_MINESHAFT_FLEE.get(), world); }
/*     */   protected void m_8097_() { super.m_8097_(); this.f_19804_.m_135372_(SHOOT, Boolean.valueOf(false)); this.f_19804_.m_135372_(ANIMATION, "undefined"); this.f_19804_.m_135372_(TEXTURE, "circuit"); }
/*     */   public void setTexture(String texture) { this.f_19804_.m_135381_(TEXTURE, texture); }
/*     */   public String getTexture() { return (String)this.f_19804_.m_135370_(TEXTURE); }
/*  68 */   public Packet<ClientGamePacketListener> m_5654_() { return NetworkHooks.getEntitySpawningPacket((Entity)this); } public CircuitMineshaftFleeEntity(EntityType<CircuitMineshaftFleeEntity> type, Level world) { super(type, world);
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
/* 188 */     this.prevAnim = "empty"; this.f_21364_ = 0; m_21557_(false); m_274367_(0.6F); m_21530_(); }
/*     */   protected void m_8099_() { super.m_8099_(); this.f_21345_.m_25352_(1, (Goal)new AvoidEntityGoal((PathfinderMob)this, Player.class, 300.0F, 1.0D, 1.0D)); this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false) {
/*     */           protected double m_6639_(LivingEntity entity) { return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_()); }
/* 191 */         }); this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D)); this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0])); this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this)); this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this)); } public MobType m_6336_() { return MobType.f_21640_; } public boolean m_6785_(double distanceToClosestPlayer) { return false; } public SoundEvent m_7975_(DamageSource ds) { return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt")); } private PlayState procedurePredicate(AnimationState event) { if ((!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED) || (!this.animationprocedure.equals(this.prevAnim) && !this.animationprocedure.equals("empty"))) {
/* 192 */       if (!this.animationprocedure.equals(this.prevAnim))
/* 193 */         event.getController().forceAnimationReset(); 
/* 194 */       event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
/* 195 */       if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
/* 196 */         this.animationprocedure = "empty";
/* 197 */         event.getController().forceAnimationReset();
/*     */       } 
/* 199 */     } else if (this.animationprocedure.equals("empty")) {
/* 200 */       this.prevAnim = "empty";
/* 201 */       return PlayState.STOP;
/*     */     } 
/* 203 */     this.prevAnim = this.animationprocedure;
/* 204 */     return PlayState.CONTINUE; } public SoundEvent m_5592_() { return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death")); } public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) { SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag); CircuitMineshaftFleeOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this); return retval; } public void m_7380_(CompoundTag compound) { super.m_7380_(compound); compound.m_128359_("Texture", getTexture()); } public void m_7378_(CompoundTag compound) { super.m_7378_(compound); if (compound.m_128441_("Texture")) setTexture(compound.m_128461_("Texture"));  } public void m_6075_() { super.m_6075_(); m_6210_(); }
/*     */   public EntityDimensions m_6972_(Pose p_33597_) { return super.m_6972_(p_33597_).m_20388_(1.0F); }
/*     */   public static void init() {}
/*     */   public static AttributeSupplier.Builder createAttributes() { AttributeSupplier.Builder builder = Mob.m_21552_(); builder = builder.m_22268_(Attributes.f_22279_, 0.3D); builder = builder.m_22268_(Attributes.f_22276_, 10.0D); builder = builder.m_22268_(Attributes.f_22284_, 0.0D); builder = builder.m_22268_(Attributes.f_22281_, 3.0D); builder = builder.m_22268_(Attributes.f_22277_, 16.0D); return builder; }
/*     */   private PlayState movementPredicate(AnimationState event) { if (this.animationprocedure.equals("empty")) { if (event.isMoving() || event.getLimbSwingAmount() <= -0.15F || event.getLimbSwingAmount() >= 0.15F) return event.setAndContinue(RawAnimation.begin().thenLoop("crouchwalk2"));  return event.setAndContinue(RawAnimation.begin().thenLoop("crouchwalk")); }  return PlayState.STOP; }
/* 209 */   protected void m_6153_() { this.f_20919_++;
/* 210 */     if (this.f_20919_ == 20) {
/* 211 */       m_142687_(Entity.RemovalReason.KILLED);
/* 212 */       m_21226_();
/*     */     }  }
/*     */ 
/*     */   
/*     */   public String getSyncedAnimation() {
/* 217 */     return (String)this.f_19804_.m_135370_(ANIMATION);
/*     */   }
/*     */   
/*     */   public void setAnimation(String animation) {
/* 221 */     this.f_19804_.m_135381_(ANIMATION, animation);
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerControllers(AnimatableManager.ControllerRegistrar data) {
/* 226 */     data.add(new AnimationController[] { new AnimationController((GeoAnimatable)this, "movement", 4, this::movementPredicate) });
/* 227 */     data.add(new AnimationController[] { new AnimationController((GeoAnimatable)this, "procedure", 4, this::procedurePredicate) });
/*     */   }
/*     */ 
/*     */   
/*     */   public AnimatableInstanceCache getAnimatableInstanceCache() {
/* 232 */     return this.cache;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\CircuitMineshaftFleeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */