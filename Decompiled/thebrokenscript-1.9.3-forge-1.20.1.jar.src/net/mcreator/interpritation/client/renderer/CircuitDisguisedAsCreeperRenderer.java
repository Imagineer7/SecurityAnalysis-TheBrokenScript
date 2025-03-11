/*    */ package net.mcreator.interpritation.client.renderer;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.CircuitDisguisedAsCreeperEntity;
/*    */ import net.minecraft.client.model.CreeperModel;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class CircuitDisguisedAsCreeperRenderer extends MobRenderer<CircuitDisguisedAsCreeperEntity, CreeperModel<CircuitDisguisedAsCreeperEntity>> {
/*    */   public CircuitDisguisedAsCreeperRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new CreeperModel(context.m_174023_(ModelLayers.f_171285_)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(CircuitDisguisedAsCreeperEntity entity) {
/* 19 */     return new ResourceLocation("thebrokenscript:textures/entities/circuitdisguisedascreeper.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\renderer\CircuitDisguisedAsCreeperRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */