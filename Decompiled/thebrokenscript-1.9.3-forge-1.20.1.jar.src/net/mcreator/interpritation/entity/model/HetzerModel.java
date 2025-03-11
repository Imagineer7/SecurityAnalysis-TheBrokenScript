/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.HetzerEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ public class HetzerModel
/*    */   extends GeoModel<HetzerEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(HetzerEntity entity) {
/* 12 */     return new ResourceLocation("thebrokenscript", "animations/hetzerfixed.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(HetzerEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "geo/hetzerfixed.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(HetzerEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\HetzerModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */