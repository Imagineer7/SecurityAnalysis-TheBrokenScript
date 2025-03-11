/*    */ package net.mcreator.interpritation.client.renderer;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.mcreator.interpritation.entity.HerobrineEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
/*    */ import net.minecraft.client.renderer.entity.LivingEntityRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class HerobrineRenderer extends HumanoidMobRenderer<HerobrineEntity, HumanoidModel<HerobrineEntity>> {
/*    */   public HerobrineRenderer(EntityRendererProvider.Context context) {
/* 22 */     super(context, new HumanoidModel(context.m_174023_(ModelLayers.f_171162_)), 0.5F);
/* 23 */     m_115326_((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.m_174023_(ModelLayers.f_171164_)), new HumanoidModel(context.m_174023_(ModelLayers.f_171165_)), context.m_266367_()));
/* 24 */     m_115326_(new RenderLayer<HerobrineEntity, HumanoidModel<HerobrineEntity>>((RenderLayerParent)this) {
/* 25 */           final ResourceLocation LAYER_TEXTURE = new ResourceLocation("thebrokenscript:textures/entities/herobrineeyes.png");
/*    */ 
/*    */           
/*    */           public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HerobrineEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
/* 29 */             VertexConsumer vertexConsumer = bufferSource.m_6299_(RenderType.m_110488_(this.LAYER_TEXTURE));
/* 30 */             ((HumanoidModel)m_117386_()).m_7695_(poseStack, vertexConsumer, light, LivingEntityRenderer.m_115338_((LivingEntity)entity, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(HerobrineEntity entity) {
/* 37 */     return new ResourceLocation("thebrokenscript:textures/entities/98cf58d9c891cb7a.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\renderer\HerobrineRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */