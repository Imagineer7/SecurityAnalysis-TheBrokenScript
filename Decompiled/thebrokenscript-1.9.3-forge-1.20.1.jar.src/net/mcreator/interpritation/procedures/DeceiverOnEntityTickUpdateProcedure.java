/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class DeceiverOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 25 */     if (entity == null)
/*    */       return; 
/* 27 */     double heights = 0.0D;
/* 28 */     double randomtitle = 0.0D;
/* 29 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty()) {
/* 30 */       if (Math.random() < 0.7D) {
/* 31 */         if (!entity.m_9236_().m_5776_())
/* 32 */           entity.m_146870_(); 
/* 33 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 34 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "gamemode survival @a"); }
/*    */         
/* 36 */         ThebrokenscriptMod.queueServerWork(60, () -> {
/*    */               if (world instanceof ServerLevel) {
/*    */                 ServerLevel _level = (ServerLevel)world;
/*    */                 Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */                 if (entityToSpawn != null) {
/*    */                   entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */                 }
/*    */               } 
/*    */             });
/* 45 */       } else if (!entity.m_9236_().m_5776_()) {
/* 46 */         entity.m_146870_();
/*    */       } 
/*    */     }
/* 49 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).isEmpty()) {
/* 50 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 52 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 54 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 56 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 58 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() + 1.0D, ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 60 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 62 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_()));
/*    */     }
/* 64 */     if (world instanceof Level) { Level _lvl14 = (Level)world; if (_lvl14.m_46461_() && 
/* 65 */         !entity.m_9236_().m_5776_())
/* 66 */         entity.m_146870_();  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\DeceiverOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */