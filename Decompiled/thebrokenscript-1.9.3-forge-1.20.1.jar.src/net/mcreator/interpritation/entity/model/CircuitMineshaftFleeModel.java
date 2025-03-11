/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.CircuitMineshaftFleeEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ public class CircuitMineshaftFleeModel
/*    */   extends GeoModel<CircuitMineshaftFleeEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(CircuitMineshaftFleeEntity entity) {
/* 12 */     return new ResourceLocation("thebrokenscript", "animations/circuit.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(CircuitMineshaftFleeEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "geo/circuit.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(CircuitMineshaftFleeEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\CircuitMineshaftFleeModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */