/*    */ package net.mcreator.interpritation.world.dimension;
/*    */ 
/*    */ import net.mcreator.interpritation.procedures.ClanVoidPlayerEntersDimensionProcedure;
/*    */ import net.minecraft.client.renderer.DimensionSpecialEffects;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ import net.minecraftforge.client.event.RegisterDimensionSpecialEffectsEvent;
/*    */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class ClanVoidDimension {
/*    */   @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */   public static class ClanVoidSpecialEffectsHandler
/*    */   {
/*    */     @SubscribeEvent
/*    */     @OnlyIn(Dist.CLIENT)
/* 28 */     public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) { DimensionSpecialEffects customEffect = new DimensionSpecialEffects(192.0F, true, DimensionSpecialEffects.SkyType.NONE, false, false)
/*    */         {
/*    */           public Vec3 m_5927_(Vec3 color, float sunHeight) {
/* 31 */             return new Vec3(1.0D, 1.0D, 1.0D);
/*    */           }
/*    */ 
/*    */           
/*    */           public boolean m_5781_(int x, int y) {
/* 36 */             return true;
/*    */           }
/*    */         };
/* 39 */       event.register(new ResourceLocation("thebrokenscript:clan_void"), customEffect); }
/*    */   
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
/* 45 */     Player player = event.getEntity();
/* 46 */     Level world = player.m_9236_();
/* 47 */     double x = player.m_20185_();
/* 48 */     double y = player.m_20186_();
/* 49 */     double z = player.m_20189_();
/* 50 */     if (event.getTo() == ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("thebrokenscript:clan_void")))
/* 51 */       ClanVoidPlayerEntersDimensionProcedure.execute((LevelAccessor)world, x, z, (Entity)player); 
/*    */   }
/*    */   
/*    */   class null extends DimensionSpecialEffects {
/*    */     null(float p_108866_, boolean p_108867_, DimensionSpecialEffects.SkyType p_108868_, boolean p_108869_, boolean p_108870_) {
/*    */       super(p_108866_, p_108867_, p_108868_, p_108869_, p_108870_);
/*    */     }
/*    */     
/*    */     public Vec3 m_5927_(Vec3 color, float sunHeight) {
/*    */       return new Vec3(1.0D, 1.0D, 1.0D);
/*    */     }
/*    */     
/*    */     public boolean m_5781_(int x, int y) {
/*    */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\world\dimension\ClanVoidDimension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */