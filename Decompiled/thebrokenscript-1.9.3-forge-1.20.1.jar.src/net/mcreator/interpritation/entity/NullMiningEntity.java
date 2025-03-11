/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.procedures.NullMiningOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.interpritation.procedures.NullMiningOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.EquipmentSlot;
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
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NullMiningEntity
/*     */   extends Monster
/*     */ {
/*     */   public NullMiningEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  49 */     this((EntityType<NullMiningEntity>)ThebrokenscriptModEntities.NULL_MINING.get(), world);
/*     */   }
/*     */   
/*     */   public NullMiningEntity(EntityType<NullMiningEntity> type, Level world) {
/*  53 */     super(type, world);
/*  54 */     m_274367_(0.6F);
/*  55 */     this.f_21364_ = 0;
/*  56 */     m_21557_(false);
/*  57 */     m_21530_();
/*  58 */     m_8061_(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)Items.f_42385_));
/*  59 */     m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42468_));
/*  60 */     m_8061_(EquipmentSlot.CHEST, new ItemStack((ItemLike)Items.f_42469_));
/*  61 */     m_8061_(EquipmentSlot.LEGS, new ItemStack((ItemLike)Items.f_42470_));
/*  62 */     m_8061_(EquipmentSlot.FEET, new ItemStack((ItemLike)Items.f_42471_));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  67 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  72 */     super.m_8099_();
/*  73 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  76 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  79 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  80 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  81 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  82 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  87 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  92 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/*  97 */     return -0.35D;
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
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/* 112 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/* 113 */       return false; 
/* 114 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 115 */       return false; 
/* 116 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/* 117 */       return false; 
/* 118 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 119 */       return false; 
/* 120 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/* 121 */       return false; 
/* 122 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/* 123 */       return false; 
/* 124 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/* 125 */       return false; 
/* 126 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 127 */       return false; 
/* 128 */     if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_))
/* 129 */       return false; 
/* 130 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 131 */       return false; 
/* 132 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 133 */       return false; 
/* 134 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 135 */       return false; 
/* 136 */     if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_))
/* 137 */       return false; 
/* 138 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6128_() {
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_5825_() {
/* 148 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 153 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 154 */     NullMiningOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 155 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 160 */     super.m_6075_();
/* 161 */     NullMiningOnEntityTickUpdateProcedure.execute((LevelAccessor)m_9236_(), m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6040_() {
/* 166 */     double x = m_20185_();
/* 167 */     double y = m_20186_();
/* 168 */     double z = m_20189_();
/* 169 */     Level world = m_9236_();
/* 170 */     NullMiningEntity nullMiningEntity = this;
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6063_() {
/* 176 */     double x = m_20185_();
/* 177 */     double y = m_20186_();
/* 178 */     double z = m_20189_();
/* 179 */     Level world = m_9236_();
/* 180 */     NullMiningEntity nullMiningEntity = this;
/* 181 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 188 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 189 */     builder = builder.m_22268_(Attributes.f_22279_, 0.2D);
/* 190 */     builder = builder.m_22268_(Attributes.f_22276_, 100.0D);
/* 191 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 192 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 193 */     builder = builder.m_22268_(Attributes.f_22277_, 916.0D);
/* 194 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\NullMiningEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */