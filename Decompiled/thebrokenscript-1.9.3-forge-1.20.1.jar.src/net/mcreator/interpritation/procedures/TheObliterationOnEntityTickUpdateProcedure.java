/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.entity.HeEntity;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.animal.IronGolem;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.entity.vehicle.Boat;
/*    */ import net.minecraft.world.level.ClipContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class TheObliterationOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 30 */     if (entity == null)
/*    */       return; 
/* 32 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 100.0D, 100.0D, 100.0D), e -> true).isEmpty()) {
/* 33 */       if (!entity.m_9236_().m_5776_()) {
/* 34 */         entity.m_146870_();
/*    */       }
/*    */ 
/*    */ 
/*    */       
/* 39 */       if (!((Entity)world.m_6443_(HeEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 40 */         ((Entity)world.m_6443_(HeEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 42 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 44 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*    */     } 
/* 46 */     if (!world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/* 47 */       ((Entity)world.m_6443_(IronGolem.class, AABB.m_165882_(new Vec3(x, y, z), 210.0D, 210.0D, 210.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 49 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 51 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268464_)), 30.0F);
/*    */     }
/* 53 */     if (!world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/* 54 */       ((Entity)world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 210.0D, 210.0D, 210.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 56 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 58 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268464_)), 30.0F);
/*    */     }
/* 60 */     entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 62 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 64 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), y, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 66 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 68 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*    */     
/* 70 */     Entity _ent = entity;
/* 71 */     _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 72 */         .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 73 */         .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 74 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 75 */       _serverPlayer.f_8906_.m_9774_(entity
/* 76 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 77 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 78 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/* 79 */           .m_146908_(), _ent.m_146909_()); }
/*    */     
/* 81 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 82 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "gamemode survival @a"); }
/*    */     
/* 84 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 820.0D, 820.0D, 820.0D), e -> true).isEmpty() && 
/* 85 */       entity instanceof Mob) { Mob _entity = (Mob)entity;
/*    */ 
/*    */ 
/*    */       
/* 89 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity1;
/* 90 */         _entity.m_6710_(livingEntity); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheObliterationOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */