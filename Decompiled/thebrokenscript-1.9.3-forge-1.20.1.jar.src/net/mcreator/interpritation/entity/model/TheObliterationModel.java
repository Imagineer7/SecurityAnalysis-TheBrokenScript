/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.TheObliterationEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ public class TheObliterationModel
/*    */   extends GeoModel<TheObliterationEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(TheObliterationEntity entity) {
/* 12 */     return new ResourceLocation("thebrokenscript", "animations/triangle.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(TheObliterationEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "geo/triangle.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(TheObliterationEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\TheObliterationModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */