/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.entity.CircuitStalkEntity;
/*    */ import net.mcreator.interpritation.entity.CircuitStareEntity;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.entity.EntityJoinLevelEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class EntityCircuitDespawnConditionProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onEntitySpawned(EntityJoinLevelEvent event) {
/* 25 */     execute((Event)event, (LevelAccessor)event.getLevel(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 29 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 33 */     if (entity == null)
/*    */       return; 
/* 35 */     if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:despawnable"))) && (
/* 36 */       !world.m_6443_(CircuitStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).isEmpty() || 
/* 37 */       !world.m_6443_(CircuitStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).isEmpty()) && 
/* 38 */       !entity.m_9236_().m_5776_())
/* 39 */       entity.m_146870_(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\EntityCircuitDespawnConditionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */