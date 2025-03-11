/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.entity.CircuitStalkEntity;
/*    */ import net.mcreator.interpritation.entity.CircuitStareEntity;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ public class CircuitTpBeaconOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 19 */     if (entity == null)
/*    */       return; 
/* 21 */     if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 22 */       if (!entity.m_9236_().m_5776_()) {
/* 23 */         entity.m_146870_();
/*    */       }
/* 25 */     } else if (y > 30.0D) {
/* 26 */       if (!entity.m_9236_().m_5776_()) {
/* 27 */         entity.m_146870_();
/*    */       }
/* 29 */     } else if (((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() {
/*    */           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 31 */             return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */           }
/* 33 */         }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() > 40.0D) {
/* 34 */       if (!entity.m_9236_().m_5776_()) {
/* 35 */         entity.m_146870_();
/*    */       }
/* 37 */     } else if ((ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned == true) {
/* 38 */       if (!entity.m_9236_().m_5776_())
/* 39 */         entity.m_146870_(); 
/* 40 */       if (!world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 46 */         Entity _ent = world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 47 */         _ent.m_6021_(x, y, z);
/* 48 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 49 */           _serverPlayer.f_8906_.m_9774_(x, y, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */       
/*    */       } 
/* 52 */       if (!world.m_6443_(CircuitStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 58 */         Entity _ent = world.m_6443_(CircuitStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 59 */         _ent.m_6021_(x, y, z);
/* 60 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 61 */           _serverPlayer.f_8906_.m_9774_(x, y, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */ 
/*    */       
/*    */       } 
/* 65 */     } else if (!entity.m_9236_().m_5776_()) {
/* 66 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitTpBeaconOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */