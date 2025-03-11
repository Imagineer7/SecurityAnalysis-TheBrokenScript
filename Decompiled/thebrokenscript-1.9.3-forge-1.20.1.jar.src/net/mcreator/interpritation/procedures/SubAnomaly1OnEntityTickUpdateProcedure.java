/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.mcreator.interpritation.entity.SubAnomaly1Entity;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class SubAnomaly1OnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 23 */     if (entity == null)
/*    */       return; 
/* 25 */     if (entity instanceof SubAnomaly1Entity) { SubAnomaly1Entity _datEntSetI = (SubAnomaly1Entity)entity;
/* 26 */       SubAnomaly1Entity subAnomaly1Entity1 = (SubAnomaly1Entity)entity; _datEntSetI.m_20088_().m_135381_(SubAnomaly1Entity.DATA_despawntimer, Integer.valueOf(((entity instanceof SubAnomaly1Entity) ? ((Integer)subAnomaly1Entity1.m_20088_().m_135370_(SubAnomaly1Entity.DATA_despawntimer)).intValue() : 0) + 1)); }
/* 27 */      SubAnomaly1Entity _datEntI = (SubAnomaly1Entity)entity; if (((entity instanceof SubAnomaly1Entity) ? ((Integer)_datEntI.m_20088_().m_135370_(SubAnomaly1Entity.DATA_despawntimer)).intValue() : Character.MIN_VALUE) > '⻠' && 
/* 28 */       !entity.m_9236_().m_5776_()) {
/* 29 */       entity.m_146870_();
/*    */     }
/* 31 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 32 */       _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.NULL_PARTICLE.get(), x, y, z, 2, 3.0D, 3.0D, 3.0D, 0.0D); }
/*    */     
/* 34 */     Vec3 _center = new Vec3(x, y, z);
/* 35 */     List<Entity> _entfound = world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_(5.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
/* 36 */     for (Entity entityiterator : _entfound) {
/* 37 */       if (!(entityiterator instanceof SubAnomaly1Entity)) {
/* 38 */         entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 2.0F);
/*    */       }
/*    */     } 
/*    */     
/* 42 */     int horizontalRadiusSquare = 2;
/* 43 */     int verticalRadiusSquare = 2;
/* 44 */     int yIterationsSquare = verticalRadiusSquare;
/* 45 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 46 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 47 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*    */           
/* 49 */           if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_60734_() == Blocks.f_49990_)
/* 50 */             world.m_7731_(BlockPos.m_274561_(x + xi, y + i, z + zi), Blocks.f_50652_.m_49966_(), 3); 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SubAnomaly1OnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */