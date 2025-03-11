/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.entity.CircuitMineshaftStareEntity;
/*    */ import net.mcreator.interpritation.entity.CircuitStalkEntity;
/*    */ import net.mcreator.interpritation.entity.CircuitStareEntity;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class IsdayProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 24 */     if (event.phase == TickEvent.Phase.END) {
/* 25 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_());
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 30 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 34 */     if (Math.random() < 0.7D && 
/* 35 */       world instanceof Level) { Level _lvl0 = (Level)world; if (_lvl0.m_46461_()) {
/* 36 */         if (world.m_6443_(CircuitStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() && world
/* 37 */           .m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() && world
/* 38 */           .m_6443_(CircuitMineshaftStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 39 */           (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = false;
/* 40 */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */         } else {
/* 42 */           (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = true;
/* 43 */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */         } 
/*    */       } }
/*    */     
/* 47 */     (ThebrokenscriptModVariables.MapVariables.get(world)).isentityspawned = false;
/* 48 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\IsdayProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */