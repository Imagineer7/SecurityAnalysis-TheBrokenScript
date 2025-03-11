/*    */ package net.mcreator.interpritation.client.renderer;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import net.mcreator.interpritation.entity.FalseVillagerEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.VillagerModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class FalseVillagerRenderer extends MobRenderer<FalseVillagerEntity, VillagerModel<FalseVillagerEntity>> {
/*    */   public FalseVillagerRenderer(EntityRendererProvider.Context context) {
/* 16 */     super(context, (EntityModel)new VillagerModel(context.m_174023_(ModelLayers.f_171210_)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void scale(FalseVillagerEntity entity, PoseStack poseStack, float f) {
/* 21 */     poseStack.m_85841_(0.9375F, 0.9375F, 0.9375F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(FalseVillagerEntity entity) {
/* 26 */     return new ResourceLocation("thebrokenscript:textures/entities/villager-template-you-can-use-it-without-credit-on-planetminecraft-com_1.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\client\renderer\FalseVillagerRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */