/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class PlayerJoinsMoonGlitchProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 26 */     execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), (Entity)event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 30 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 34 */     if (entity == null)
/*    */       return; 
/* 36 */     ThebrokenscriptMod.queueServerWork(12000, () -> {
/*    */           if (world instanceof Level) {
/*    */             Level _level = (Level)world;
/*    */             if (!_level.m_5776_()) {
/*    */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:moonglitch")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */             } else {
/*    */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:moonglitch")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */             } 
/*    */           } 
/*    */           if (entity instanceof net.minecraft.world.entity.player.Player)
/*    */             (Minecraft.m_91087_()).f_91066_.m_231984_().m_231514_(Integer.valueOf(2)); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\PlayerJoinsMoonGlitchProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */