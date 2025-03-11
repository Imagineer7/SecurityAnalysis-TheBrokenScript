/*     */ package net.mcreator.interpritation.entity;
/*     */ 
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends RandomStrollGoal
/*     */ {
/*     */   null(PathfinderMob p_25737_, double p_25738_, int p_25739_) {
/* 117 */     super(p_25737_, p_25738_, p_25739_);
/*     */   }
/*     */   protected Vec3 m_7037_() {
/* 120 */     RandomSource random = TheObliterationEntity.this.m_217043_();
/* 121 */     double dir_x = TheObliterationEntity.this.m_20185_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 122 */     double dir_y = TheObliterationEntity.this.m_20186_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 123 */     double dir_z = TheObliterationEntity.this.m_20189_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 124 */     return new Vec3(dir_x, dir_y, dir_z);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\TheObliterationEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */