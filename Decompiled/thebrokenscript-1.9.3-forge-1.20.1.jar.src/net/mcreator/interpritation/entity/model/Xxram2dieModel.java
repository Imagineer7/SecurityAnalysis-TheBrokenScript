/*    */ package net.mcreator.interpritation.entity.model;
/*    */ 
/*    */ import net.mcreator.interpritation.entity.Xxram2dieEntity;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import software.bernie.geckolib.core.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ public class Xxram2dieModel
/*    */   extends GeoModel<Xxram2dieEntity>
/*    */ {
/*    */   public ResourceLocation getAnimationResource(Xxram2dieEntity entity) {
/* 12 */     return new ResourceLocation("thebrokenscript", "animations/ram2die.animation.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getModelResource(Xxram2dieEntity entity) {
/* 17 */     return new ResourceLocation("thebrokenscript", "geo/ram2die.geo.json");
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureResource(Xxram2dieEntity entity) {
/* 22 */     return new ResourceLocation("thebrokenscript", "textures/entities/" + entity.getTexture() + ".png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\entity\model\Xxram2dieModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */