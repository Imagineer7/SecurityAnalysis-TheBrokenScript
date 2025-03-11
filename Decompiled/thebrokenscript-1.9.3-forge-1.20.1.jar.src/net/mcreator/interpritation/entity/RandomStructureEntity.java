/*     */ package net.mcreator.interpritation.entity;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.Difficulty;
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
/*     */ public class RandomStructureEntity extends Monster {
/*     */   public RandomStructureEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  43 */     this((EntityType<RandomStructureEntity>)ThebrokenscriptModEntities.RANDOM_STRUCTURE.get(), world);
/*     */   }
/*     */   
/*     */   public RandomStructureEntity(EntityType<RandomStructureEntity> type, Level world) {
/*  47 */     super(type, world);
/*  48 */     m_274367_(0.6F);
/*  49 */     this.f_21364_ = 0;
/*  50 */     m_21557_(false);
/*  51 */     m_6593_((Component)Component.m_237113_("CONSTRUCTION"));
/*  52 */     m_20340_(true);
/*  53 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  58 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  63 */     super.m_8099_();
/*  64 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  67 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  70 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  71 */     this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  72 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  73 */     this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this));
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
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 103 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 104 */     RandomStructurePriNachalnomPrizyvieSushchnostiProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 105 */     return retval;
/*     */   }
/*     */   
/*     */   public static void init() {
/* 109 */     SpawnPlacements.m_21754_((EntityType)ThebrokenscriptModEntities.RANDOM_STRUCTURE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 110 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 114 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 115 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 116 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 117 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 118 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 119 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 120 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\RandomStructureEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */