/*    */ package net.mcreator.interpritation;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import net.minecraft.client.model.PlayerModel;
/*    */ import net.minecraft.client.player.AbstractClientPlayer;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.nbt.CompoundTag;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CustomPlayerLayer
/*    */   extends RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>>
/*    */ {
/*    */   public CustomPlayerLayer(RenderLayerParent<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> renderer) {
/* 28 */     super(renderer);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, AbstractClientPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
/* 34 */     CompoundTag persistentData = player.getPersistentData();
/* 35 */     if (!persistentData.m_128471_("useCustomTexture")) {
/*    */       return;
/*    */     }
/*    */ 
/*    */     
/* 40 */     ResourceLocation texture = new ResourceLocation("thebrokenscript", "textures/entity/notexture.png");
/*    */ 
/*    */     
/* 43 */     m_117376_(m_117386_(), texture, poseStack, buffer, packedLight, (LivingEntity)player, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\CustomPlayerLayer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */