/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class MoonDevoidsProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onWorldTick(TickEvent.LevelTickEvent event) {
/* 20 */     if (event.phase == TickEvent.Phase.END) {
/* 21 */       execute((Event)event, (LevelAccessor)event.level);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world) {
/* 26 */     execute(null, world);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world) {
/* 30 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).moonphase == 1.0D && 
/* 31 */       world.m_5776_()) {
/* 32 */       Minecraft.m_91087_().m_91097_().m_174784_(new ResourceLocation("thebrokenscript:textures/moonevent/moon_phases1"));
/* 33 */       Minecraft.m_91087_().m_91097_().m_118495_(new ResourceLocation("minecraft:textures/environment/moon_phases.png"), 
/* 34 */           Minecraft.m_91087_().m_91097_().m_118506_(new ResourceLocation("thebrokenscript:textures/moonevent/moon_phases1")));
/*    */     } 
/*    */     
/* 37 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).moonphase == 2.0D && 
/* 38 */       world.m_5776_()) {
/* 39 */       Minecraft.m_91087_().m_91097_().m_174784_(new ResourceLocation("thebrokenscript:textures/moonevent/moon_phases2"));
/* 40 */       Minecraft.m_91087_().m_91097_().m_118495_(new ResourceLocation("minecraft:textures/environment/moon_phases.png"), 
/* 41 */           Minecraft.m_91087_().m_91097_().m_118506_(new ResourceLocation("thebrokenscript:textures/moonevent/moon_phases2")));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\MoonDevoidsProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */