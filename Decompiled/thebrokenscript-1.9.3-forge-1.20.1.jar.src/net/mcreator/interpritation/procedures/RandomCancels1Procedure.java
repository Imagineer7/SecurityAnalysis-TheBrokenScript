/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.event.entity.EntityJoinLevelEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class RandomCancels1Procedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onEntitySpawned(EntityJoinLevelEvent event) {
/* 21 */     execute((Event)event, event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 25 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/* 29 */     if (entity == null)
/*    */       return; 
/* 31 */     if (entity instanceof net.minecraft.world.entity.npc.Villager) {
/* 32 */       if (Math.random() < 0.5D) {
/* 33 */         entity.m_6593_((Component)Component.m_237113_("TESTIFICATE"));
/*    */       }
/*    */     }
/* 36 */     else if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:despawnable"))) && 
/* 37 */       Math.random() < 0.01D) {
/* 38 */       if (Math.random() < 0.7D) {
/* 39 */         entity.m_6593_((Component)Component.m_237113_("01001000 01100101 00100000 01110111 01101001 01101100 01101100 00100000 01100110 01101001 01101110 01100100 00100000 01111001 01101111 01110101"));
/*    */       } else {
/* 41 */         entity.m_6593_((Component)Component.m_237113_("01001000 01100101 01101100 01101100 01101111"));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\RandomCancels1Procedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */