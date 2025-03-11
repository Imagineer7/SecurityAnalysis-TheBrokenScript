/*     */ package net.mcreator.interpritation.network;
/*     */ 
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
/*     */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.network.PacketDistributor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class EventBusVariableHandlers
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
/*  54 */     if (!event.getEntity().m_9236_().m_5776_())
/*  55 */       ((ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables())).syncPlayerVariables((Entity)event.getEntity()); 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
/*  60 */     if (!event.getEntity().m_9236_().m_5776_())
/*  61 */       ((ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables())).syncPlayerVariables((Entity)event.getEntity()); 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
/*  66 */     if (!event.getEntity().m_9236_().m_5776_())
/*  67 */       ((ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables())).syncPlayerVariables((Entity)event.getEntity()); 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void clonePlayer(PlayerEvent.Clone event) {
/*  72 */     event.getOriginal().revive();
/*  73 */     ThebrokenscriptModVariables.PlayerVariables original = (ThebrokenscriptModVariables.PlayerVariables)event.getOriginal().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables());
/*  74 */     ThebrokenscriptModVariables.PlayerVariables clone = (ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables());
/*  75 */     clone.showtab = original.showtab;
/*  76 */     clone.filecreated = original.filecreated;
/*  77 */     clone.corrupted = original.corrupted;
/*  78 */     clone.is_player_an_entity = original.is_player_an_entity;
/*  79 */     if (!event.isWasDeath()) {
/*  80 */       clone.screendamage = original.screendamage;
/*     */     }
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/*  86 */     if (!event.getEntity().m_9236_().m_5776_()) {
/*  87 */       SavedData mapdata = ThebrokenscriptModVariables.MapVariables.get((LevelAccessor)event.getEntity().m_9236_());
/*  88 */       SavedData worlddata = ThebrokenscriptModVariables.WorldVariables.get((LevelAccessor)event.getEntity().m_9236_());
/*  89 */       if (mapdata != null)
/*  90 */         ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), new ThebrokenscriptModVariables.SavedDataSyncMessage(0, mapdata)); 
/*  91 */       if (worlddata != null)
/*  92 */         ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), new ThebrokenscriptModVariables.SavedDataSyncMessage(1, worlddata)); 
/*     */     } 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
/*  98 */     if (!event.getEntity().m_9236_().m_5776_()) {
/*  99 */       SavedData worlddata = ThebrokenscriptModVariables.WorldVariables.get((LevelAccessor)event.getEntity().m_9236_());
/* 100 */       if (worlddata != null)
/* 101 */         ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), new ThebrokenscriptModVariables.SavedDataSyncMessage(1, worlddata)); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\network\ThebrokenscriptModVariables$EventBusVariableHandlers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */