/*    */ package net.mcreator.interpritation.client.renderer;
/*    */ import net.mcreator.interpritation.entity.MazeShadowsEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class MazeShadowsRenderer extends HumanoidMobRenderer<MazeShadowsEntity, HumanoidModel<MazeShadowsEntity>> {
/*    */   public MazeShadowsRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, new HumanoidModel(context.m_174023_(ModelLayers.f_171162_)), 0.5F);
/* 16 */     m_115326_((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.m_174023_(ModelLayers.f_171164_)), new HumanoidModel(context.m_174023_(ModelLayers.f_171165_)), context.m_266367_()));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(MazeShadowsEntity entity) {
/* 21 */     return new ResourceLocation("thebrokenscript:textures/entities/null.png");
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean isShaking(MazeShadowsEntity entity) {
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\renderer\MazeShadowsRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */