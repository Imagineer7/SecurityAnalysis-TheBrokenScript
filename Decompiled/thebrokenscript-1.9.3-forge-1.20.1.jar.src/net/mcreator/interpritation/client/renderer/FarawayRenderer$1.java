/*    */ package net.mcreator.interpritation.client.renderer;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.mcreator.interpritation.entity.FarawayEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.client.renderer.texture.OverlayTexture;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends RenderLayer<FarawayEntity, HumanoidModel<FarawayEntity>>
/*    */ {
/*    */   final ResourceLocation LAYER_TEXTURE;
/*    */   
/*    */   null(RenderLayerParent<FarawayEntity, HumanoidModel<FarawayEntity>> p_117346_) {
/* 24 */     super(p_117346_);
/* 25 */     this.LAYER_TEXTURE = new ResourceLocation("thebrokenscript:textures/entities/away.png");
/*    */   }
/*    */   
/*    */   public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FarawayEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
/* 29 */     VertexConsumer vertexConsumer = bufferSource.m_6299_(RenderType.m_110488_(this.LAYER_TEXTURE));
/* 30 */     ((HumanoidModel)m_117386_()).m_7695_(poseStack, vertexConsumer, light, OverlayTexture.f_118083_, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\renderer\FarawayRenderer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */