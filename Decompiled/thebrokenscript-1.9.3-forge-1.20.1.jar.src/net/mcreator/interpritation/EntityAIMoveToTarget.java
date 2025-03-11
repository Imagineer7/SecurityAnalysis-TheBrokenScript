/*     */ package net.mcreator.interpritation;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
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
/*     */ public class EntityAIMoveToTarget
/*     */   extends Goal
/*     */ {
/*     */   private final Mob entity;
/*     */   private LivingEntity target;
/*     */   private final Level level;
/*  40 */   private int breakCooldown = 0;
/*  41 */   private int stuckTime = 0;
/*     */   private double lastX;
/*     */   
/*     */   public EntityAIMoveToTarget(Mob entity) {
/*  45 */     this.entity = entity;
/*  46 */     this.level = entity.m_9236_();
/*  47 */     m_7021_(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
/*     */   }
/*     */   private double lastZ;
/*     */   
/*     */   public boolean m_8036_() {
/*  52 */     this.target = this.entity.m_5448_();
/*  53 */     return (this.target != null && this.target.m_6084_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8056_() {
/*  58 */     this.lastX = this.entity.m_20185_();
/*  59 */     this.lastZ = this.entity.m_20189_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8037_() {
/*  64 */     if (this.target == null) {
/*     */       return;
/*     */     }
/*  67 */     faceTarget();
/*     */ 
/*     */     
/*  70 */     this.entity.m_21573_().m_5624_((Entity)this.target, 1.0D);
/*     */ 
/*     */     
/*  73 */     handleObstacles();
/*     */ 
/*     */     
/*  76 */     checkIfStuck();
/*     */   }
/*     */   
/*     */   private void faceTarget() {
/*  80 */     double dx = this.target.m_20185_() - this.entity.m_20185_();
/*  81 */     double dz = this.target.m_20189_() - this.entity.m_20189_();
/*  82 */     float targetYaw = (float)(Mth.m_14136_(dz, dx) * 57.29577951308232D) - 90.0F;
/*  83 */     this.entity.m_146922_(targetYaw);
/*  84 */     this.entity.f_20883_ = targetYaw;
/*     */   }
/*     */   
/*     */   private void handleObstacles() {
/*  88 */     BlockPos above = this.entity.m_20183_().m_7494_();
/*  89 */     BlockState block = this.level.m_8055_(above);
/*     */ 
/*     */     
/*  92 */     if (!block.m_60795_() && block.m_60800_((BlockGetter)this.level, above) >= 0.0F) {
/*  93 */       if (this.breakCooldown <= 0) {
/*  94 */         this.level.m_46961_(above, true);
/*  95 */         this.breakCooldown = 5;
/*     */       } else {
/*  97 */         this.breakCooldown--;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 102 */     BlockPos below = this.entity.m_20183_().m_7495_();
/* 103 */     BlockPos twoBelow = below.m_7495_();
/* 104 */     if (this.level.m_8055_(below).m_60795_() && !this.level.m_8055_(twoBelow).m_60795_()) {
/* 105 */       this.level.m_7731_(below, Blocks.f_50493_.m_49966_(), 3);
/*     */     }
/*     */   }
/*     */   
/*     */   private void checkIfStuck() {
/* 110 */     double deltaX = Math.abs(this.entity.m_20185_() - this.lastX);
/* 111 */     double deltaZ = Math.abs(this.entity.m_20189_() - this.lastZ);
/*     */ 
/*     */     
/* 114 */     if (deltaX < 0.05D && deltaZ < 0.05D) {
/* 115 */       this.stuckTime++;
/*     */     } else {
/* 117 */       this.stuckTime = 0;
/*     */     } 
/*     */     
/* 120 */     this.lastX = this.entity.m_20185_();
/* 121 */     this.lastZ = this.entity.m_20189_();
/*     */ 
/*     */     
/* 124 */     if (this.stuckTime > 15) {
/* 125 */       BlockPos front = this.entity.m_20183_().m_121945_(this.entity.m_6350_());
/* 126 */       BlockState frontBlock = this.level.m_8055_(front);
/* 127 */       if (!frontBlock.m_60795_() && frontBlock.m_60800_((BlockGetter)this.level, front) >= 0.0F) {
/* 128 */         this.level.m_46961_(front, true);
/*     */       }
/* 130 */       this.stuckTime = 0;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\EntityAIMoveToTarget.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */