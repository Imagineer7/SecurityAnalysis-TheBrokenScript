/*    */ package net.mcreator.interpritation.potion;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectCategory;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class WhyCantYouLeaveMobEffect
/*    */   extends MobEffect {
/*    */   public WhyCantYouLeaveMobEffect() {
/* 14 */     super(MobEffectCategory.NEUTRAL, -16777216);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getCurativeItems() {
/* 19 */     ArrayList<ItemStack> cures = new ArrayList<>();
/* 20 */     cures.add(new ItemStack((ItemLike)Items.f_42455_));
/* 21 */     return cures;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6584_(int duration, int amplifier) {
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\potion\WhyCantYouLeaveMobEffect.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */