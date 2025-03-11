/*    */ package net.mcreator.interpritation.client.renderer;
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.mcreator.interpritation.entity.FollowEntity;
/*    */ import net.mcreator.interpritation.entity.layer.FollowLayer;
/*    */ import net.mcreator.interpritation.entity.model.FollowModel;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import software.bernie.geckolib.cache.object.BakedGeoModel;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ import software.bernie.geckolib.renderer.GeoEntityRenderer;
/*    */ import software.bernie.geckolib.renderer.GeoRenderer;
/*    */ import software.bernie.geckolib.renderer.layer.GeoRenderLayer;
/*    */ 
/*    */ public class FollowRenderer extends GeoEntityRenderer<FollowEntity> {
/*    */   public FollowRenderer(EntityRendererProvider.Context renderManager) {
/* 21 */     super(renderManager, (GeoModel)new FollowModel());
/* 22 */     this.f_114477_ = 0.5F;
/* 23 */     addRenderLayer((GeoRenderLayer)new FollowLayer((GeoRenderer)this));
/*    */   }
/*    */ 
/*    */   
/*    */   public RenderType getRenderType(FollowEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
/* 28 */     return RenderType.m_110473_(m_5478_((Entity)animatable));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void preRender(PoseStack poseStack, FollowEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 34 */     float scale = 1.0F;
/* 35 */     this.scaleHeight = scale;
/* 36 */     this.scaleWidth = scale;
/* 37 */     super.preRender(poseStack, (Entity)entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\renderer\FollowRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */