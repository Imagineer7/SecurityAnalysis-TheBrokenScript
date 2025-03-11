/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ public class StareOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 22 */     Vec3 _center = new Vec3(x, y, z);
/* 23 */     List<Entity> _entfound = world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_(1000.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
/* 24 */     for (Entity entityiterator : _entfound) {
/* 25 */       if (entityiterator.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:lookable")))) {
/* 26 */         entityiterator.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 28 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/* 30 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 32 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/* 34 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 1.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 36 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/* 38 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/* 39 */         if (entityiterator instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entityiterator; if (!_entity.m_9236_().m_5776_())
/* 40 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 60, 55, false, false));  }
/*    */       
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\StareOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */