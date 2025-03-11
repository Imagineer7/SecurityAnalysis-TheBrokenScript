/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ public class NullInvadeBaseOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 23 */     if (entity == null)
/*    */       return; 
/* 25 */     boolean found = false;
/* 26 */     double sx = 0.0D;
/* 27 */     double sy = 0.0D;
/* 28 */     double sz = 0.0D;
/* 29 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/* 30 */       if (Math.random() < 0.5D && 
/* 31 */         !entity.m_9236_().m_5776_()) {
/* 32 */         entity.m_146870_();
/*    */       }
/* 34 */       if (Math.random() < 0.5D) {
/* 35 */         if (Math.random() < 0.5D)
/* 36 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 37 */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"[{}]\""); }
/*    */           
/*    */            }
/* 40 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 41 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a \"{[> null]}\""); }
/*    */       
/*    */       }
/*    */     } 
/*    */     
/* 46 */     ThebrokenscriptMod.queueServerWork(5000, () -> {
/*    */           if (!entity.m_9236_().m_5776_())
/*    */             entity.m_146870_(); 
/*    */         });
/* 50 */     entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 52 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 54 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 56 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 58 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 60 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 62 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/* 63 */     if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*    */ 
/*    */ 
/*    */       
/* 67 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/* 68 */         _entity.m_6710_(_ent); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullInvadeBaseOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */