/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.FollowEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.constant.DataTickets;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
/*    */ import software.bernie.geckolib.core.animation.AnimationState;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ import software.bernie.geckolib.model.data.EntityModelData;
/*    */ 
/*    */ 
/*    */ public class FollowModel
/*    */   extends GeoModel<FollowEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(FollowEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "animations/notexture.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(FollowEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "geo/notexture.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(FollowEntity entity) {
/* 27 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCustomAnimations(FollowEntity animatable, long instanceId, AnimationState animationState) {
/* 32 */     CoreGeoBone head = getAnimationProcessor().getBone("Head");
/* 33 */     if (head != null) {
/* 34 */       EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
/* 35 */       head.setRotX(entityData.headPitch() * 0.017453292F);
/* 36 */       head.setRotY(entityData.netHeadYaw() * 0.017453292F);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\FollowModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */