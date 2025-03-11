/*    */ package net.mcreator.interpritation.configuration;
/*    */ 
/*    */ import net.minecraftforge.common.ForgeConfigSpec;
/*    */ 
/*    */ public class EventEngineOftenConfiguration {
/*  6 */   public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
/*    */   
/*    */   public static final ForgeConfigSpec SPEC;
/*    */   
/* 10 */   public static final ForgeConfigSpec.ConfigValue<Double> EVENT_FREQUENCY_PER_TICK = BUILDER.comment("MAXIMUM 0.001").define("event frequency", Double.valueOf(3.0E-4D));
/*    */   static {
/* 12 */     SPEC = BUILDER.build();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\configuration\EventEngineOftenConfiguration.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */