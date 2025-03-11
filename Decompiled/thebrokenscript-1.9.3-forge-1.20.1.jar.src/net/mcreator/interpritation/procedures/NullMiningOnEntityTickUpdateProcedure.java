/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.ClipContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class NullMiningOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 22 */     if (entity == null)
/*    */       return; 
/* 24 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).isEmpty() && 
/* 25 */       entity instanceof Mob) { Mob _entity = (Mob)entity;
/*    */ 
/*    */ 
/*    */       
/* 29 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/* 30 */         _entity.m_6710_(_ent); }
/*    */        }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     BlockPos _pos = new BlockPos(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 37 */     Block.m_49892_(world.m_8055_(_pos), world, new BlockPos(entity
/* 38 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 39 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 40 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), null);
/*    */     
/* 42 */     world.m_46961_(_pos, false);
/*    */ 
/*    */     
/* 45 */     _pos = BlockPos.m_274561_(entity
/* 46 */         .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), (entity
/* 47 */         .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_() - 1), entity
/* 48 */         .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 49 */     Block.m_49892_(world.m_8055_(_pos), world, new BlockPos(entity
/* 50 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 51 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 52 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), null);
/*    */     
/* 54 */     world.m_46961_(_pos, false);
/*    */     
/* 56 */     if (y > ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*    */           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 58 */             return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */           }
/* 60 */         }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_()) {
/* 61 */       world.m_7731_(BlockPos.m_274561_(x, y - 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       
/* 63 */       Entity _ent = entity;
/* 64 */       _ent.m_6021_(x, y - 1.0D, z);
/* 65 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 66 */         _serverPlayer.f_8906_.m_9774_(x, y - 1.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */       
/* 68 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 69 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 21, 55, false, false));  }
/*    */     
/* 71 */     }  if (y < ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*    */           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 73 */             return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */           }
/* 75 */         }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() && 
/* 76 */       Math.random() < 0.01D) {
/* 77 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3);
/* 78 */       world.m_7731_(BlockPos.m_274561_(x, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       
/* 80 */       Entity _ent = entity;
/* 81 */       _ent.m_6021_(x, y + 1.0D, z);
/* 82 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 83 */         _serverPlayer.f_8906_.m_9774_(x, y + 1.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */       
/* 85 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.m_9236_().m_5776_())
/* 86 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 21, 55, false, false));  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullMiningOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */