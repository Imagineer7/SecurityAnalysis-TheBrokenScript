/*    */ package net.mcreator.interpritation.entity.layer;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.mcreator.interpritation.entity.CircuitStalkEntity;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.texture.OverlayTexture;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.cache.object.BakedGeoModel;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.renderer.GeoRenderer;
/*    */ import software.bernie.geckolib.renderer.layer.GeoRenderLayer;
/*    */ 
/*    */ public class CircuitStalkLayer
/*    */   extends GeoRenderLayer<CircuitStalkEntity>
/*    */ {
/* 18 */   private static final ResourceLocation LAYER = new ResourceLocation("thebrokenscript", "textures/entities/circuit.png");
/*    */   
/*    */   public CircuitStalkLayer(GeoRenderer<CircuitStalkEntity> entityRenderer) {
/* 21 */     super(entityRenderer);
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(PoseStack poseStack, CircuitStalkEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
/* 26 */     RenderType glowRenderType = RenderType.m_110488_(LAYER);
/* 27 */     getRenderer().reRender(getDefaultBakedModel((GeoAnimatable)animatable), poseStack, bufferSource, (GeoAnimatable)animatable, glowRenderType, bufferSource.m_6299_(glowRenderType), partialTick, packedLight, OverlayTexture.f_118083_, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\layer\CircuitStalkLayer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */