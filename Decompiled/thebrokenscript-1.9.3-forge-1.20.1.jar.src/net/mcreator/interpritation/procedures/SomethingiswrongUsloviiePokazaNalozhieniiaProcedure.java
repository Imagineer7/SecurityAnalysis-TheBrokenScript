/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.entity.NullScareEntity;
/*    */ import net.mcreator.interpritation.entity.WrongOverlayEntity;
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
/*    */ public class SomethingiswrongUsloviiePokazaNalozhieniiaProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 21 */     if (event.phase == TickEvent.Phase.END) {
/* 22 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_());
/*    */     }
/*    */   }
/*    */   
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/* 27 */     return execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static boolean execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 31 */     if (!world.m_6443_(NullScareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).isEmpty() || 
/* 32 */       !world.m_6443_(WrongOverlayEntity.class, AABB.m_165882_(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).isEmpty()) {
/* 33 */       return true;
/*    */     }
/* 35 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SomethingiswrongUsloviiePokazaNalozhieniiaProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */