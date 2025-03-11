/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FalseVillagerOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 20 */     if (entity == null)
/*    */       return; 
/* 22 */     double NUMBER = 0.0D;
/* 23 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 24 */         _entity.m_7292_(new MobEffectInstance(MobEffects.f_19609_, 100, 1, false, false));  }
/*    */     
/* 26 */     Vec3 _center = new Vec3(x, y, z);
/* 27 */     List<Entity> _entfound = world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_(500.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
/* 28 */     for (Entity entityiterator : _entfound) {
/* 29 */       if (entityiterator instanceof net.mcreator.interpritation.entity.FalseVillagerEntity) {
/* 30 */         NUMBER++;
/*    */       }
/* 32 */       if (entityiterator instanceof net.mcreator.interpritation.entity.PigCircuitEntity) {
/* 33 */         NUMBER++;
/*    */       }
/*    */     } 
/*    */     
/* 37 */     if ((NUMBER == 2.0D || NUMBER > 2.0D) && 
/* 38 */       !entity.m_9236_().m_5776_()) {
/* 39 */       entity.m_146870_();
/*    */     }
/* 41 */     ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */           if (!entity.m_9236_().m_5776_())
/*    */             entity.m_146870_(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\FalseVillagerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */