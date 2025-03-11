/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.potion.WhyCantYouLeaveMobEffect;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ThebrokenscriptModMobEffects
/*    */ {
/* 17 */   public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "thebrokenscript");
/* 18 */   public static final RegistryObject<MobEffect> WHY_CANT_YOU_LEAVE = REGISTRY.register("why_cant_you_leave", () -> new WhyCantYouLeaveMobEffect());
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModMobEffects.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */