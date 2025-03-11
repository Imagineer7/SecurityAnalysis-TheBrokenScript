/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.TheBrokenEndStalkkEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ public class TheBrokenEndStalkkModel
/*    */   extends GeoModel<TheBrokenEndStalkkEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(TheBrokenEndStalkkEntity entity) {
/* 12 */     return new ResourceLocation("thebrokenscript", "animations/thebrokenend.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(TheBrokenEndStalkkEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "geo/thebrokenend.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(TheBrokenEndStalkkEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\TheBrokenEndStalkkModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */