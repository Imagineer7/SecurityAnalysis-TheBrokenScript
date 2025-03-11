/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.TheBrokenEndOverhaulStalkEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ public class TheBrokenEndOverhaulStalkModel
/*    */   extends GeoModel<TheBrokenEndOverhaulStalkEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(TheBrokenEndOverhaulStalkEntity entity) {
/* 12 */     return new ResourceLocation("thebrokenscript", "animations/brokenendoverhaul.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(TheBrokenEndOverhaulStalkEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "geo/brokenendoverhaul.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(TheBrokenEndOverhaulStalkEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\TheBrokenEndOverhaulStalkModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */