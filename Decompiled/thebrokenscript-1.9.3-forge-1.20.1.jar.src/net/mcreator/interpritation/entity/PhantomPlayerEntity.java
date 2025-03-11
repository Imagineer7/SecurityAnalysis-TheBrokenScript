/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.PhantomPlayerOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.PhantomPlayerOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
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
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
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
/*     */ public class PhantomPlayerEntity
/*     */   extends Monster
/*     */ {
/*  43 */   public static final EntityDataAccessor<Integer> DATA_AngerMeter = SynchedEntityData.m_135353_(PhantomPlayerEntity.class, EntityDataSerializers.f_135028_);
/*     */   
/*     */   public PhantomPlayerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  46 */     this((EntityType<PhantomPlayerEntity>)ThebrokenscriptModEntities.PHANTOM_PLAYER.get(), world);
/*     */   }
/*     */   
/*     */   public PhantomPlayerEntity(EntityType<PhantomPlayerEntity> type, Level world) {
/*  50 */     super(type, world);
/*  51 */     m_274367_(0.6F);
/*  52 */     this.f_21364_ = 0;
/*  53 */     m_21557_(true);
/*  54 */     m_6593_((Component)Component.m_237113_("__blackout__"));
/*  55 */     m_20340_(true);
/*  56 */     m_21530_();
/*  57 */     this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  62 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8097_() {
/*  67 */     super.m_8097_();
/*  68 */     this.f_19804_.m_135372_(DATA_AngerMeter, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation m_6037_(Level world) {
/*  73 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  78 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  83 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/*  88 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  93 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  98 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_142535_(float l, float d, DamageSource source) {
/* 103 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 108 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 109 */     PhantomPlayerOnInitialEntitySpawnProcedure.execute(m_20185_(), m_20189_(), (Entity)this);
/* 110 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7380_(CompoundTag compound) {
/* 115 */     super.m_7380_(compound);
/* 116 */     compound.m_128405_("DataAngerMeter", ((Integer)this.f_19804_.m_135370_(DATA_AngerMeter)).intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7378_(CompoundTag compound) {
/* 121 */     super.m_7378_(compound);
/* 122 */     if (compound.m_128441_("DataAngerMeter")) {
/* 123 */       this.f_19804_.m_135381_(DATA_AngerMeter, Integer.valueOf(compound.m_128451_("DataAngerMeter")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void m_6075_() {
/* 128 */     super.m_6075_();
/* 129 */     PhantomPlayerOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6063_() {
/* 134 */     double x = m_20185_();
/* 135 */     double y = m_20186_();
/* 136 */     double z = m_20189_();
/* 137 */     Level world = m_9236_();
/* 138 */     PhantomPlayerEntity phantomPlayerEntity = this;
/* 139 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void m_20242_(boolean ignored) {
/* 148 */     super.m_20242_(true);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 152 */     super.m_8107_();
/* 153 */     m_20242_(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 160 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 161 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 162 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 163 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 164 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 165 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 166 */     builder = builder.m_22268_(Attributes.f_22280_, 0.3D);
/* 167 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\PhantomPlayerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */