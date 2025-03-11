/*    */ package net.mcreator.interpritation.client.renderer;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.mcreator.interpritation.entity.CurvedEntity;
/*    */ import net.mcreator.interpritation.entity.model.CurvedModel;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import software.bernie.geckolib.cache.object.BakedGeoModel;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ import software.bernie.geckolib.renderer.GeoEntityRenderer;
/*    */ 
/*    */ public class CurvedRenderer
/*    */   extends GeoEntityRenderer<CurvedEntity> {
/*    */   public CurvedRenderer(EntityRendererProvider.Context renderManager) {
/* 20 */     super(renderManager, (GeoModel)new CurvedModel());
/* 21 */     this.f_114477_ = 0.5F;
/*    */   }
/*    */ 
/*    */   
/*    */   public RenderType getRenderType(CurvedEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
/* 26 */     return RenderType.m_110473_(m_5478_((Entity)animatable));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void preRender(PoseStack poseStack, CurvedEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 32 */     float scale = 1.0F;
/* 33 */     this.scaleHeight = scale;
/* 34 */     this.scaleWidth = scale;
/* 35 */     super.preRender(poseStack, (Entity)entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\renderer\CurvedRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */