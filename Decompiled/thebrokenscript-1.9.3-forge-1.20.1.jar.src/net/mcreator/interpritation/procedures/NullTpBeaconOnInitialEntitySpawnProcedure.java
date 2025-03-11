/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.entity.NullWatchingEntity;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ public class NullTpBeaconOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (!world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty() && world.m_46861_(BlockPos.m_274561_(x, y, z)) && 
/* 20 */       world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 100.0D, 100.0D, 100.0D), e -> true).isEmpty()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 26 */       Entity _ent = world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 1200.0D, 1200.0D, 1200.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 27 */       _ent.m_6021_(x, y, z);
/* 28 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 29 */         _serverPlayer.f_8906_.m_9774_(x, y, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */     
/*    */     } 
/*    */     
/* 33 */     if (!entity.m_9236_().m_5776_())
/* 34 */       entity.m_146870_(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NullTpBeaconOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */