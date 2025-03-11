/*     */ package net.mcreator.interpritation.entity;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.BanOnEntityTickUpdateProcedure;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
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
/*     */ public class BanEntity extends Monster {
/*     */   public BanEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  32 */     this((EntityType<BanEntity>)ThebrokenscriptModEntities.BAN.get(), world);
/*     */   }
/*     */   
/*     */   public BanEntity(EntityType<BanEntity> type, Level world) {
/*  36 */     super(type, world);
/*  37 */     m_274367_(0.6F);
/*  38 */     this.f_21364_ = 0;
/*  39 */     m_21557_(false);
/*  40 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  45 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  50 */     super.m_8099_();
/*  51 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  54 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  57 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  58 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  59 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  60 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  65 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  70 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/*  75 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  80 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  85 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/*  90 */     super.m_6075_();
/*  91 */     BanOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/*  98 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/*  99 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 100 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 101 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 102 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 103 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 104 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\BanEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */