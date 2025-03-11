/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.CircuitEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ public class CircuitModel
/*    */   extends GeoModel<CircuitEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(CircuitEntity entity) {
/* 12 */     return new ResourceLocation("thebrokenscript", "animations/circuit.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(CircuitEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "geo/circuit.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(CircuitEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\CircuitModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */