/*    */ package net.mcreator.interpritation;
/*    */ 
/*    */ import java.util.AbstractMap;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlockEntities;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModItems;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModMenus;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModMobEffects;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModSounds;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import net.minecraftforge.fml.util.thread.SidedThreadGroups;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import net.minecraftforge.network.NetworkRegistry;
/*    */ import net.minecraftforge.network.simple.SimpleChannel;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("thebrokenscript")
/*    */ public class ThebrokenscriptMod
/*    */ {
/* 40 */   public static final Logger LOGGER = LogManager.getLogger(ThebrokenscriptMod.class);
/*    */   
/*    */   public static final String MODID = "thebrokenscript";
/*    */   private static final String PROTOCOL_VERSION = "1";
/*    */   
/*    */   public ThebrokenscriptMod() {
/* 46 */     MinecraftForge.EVENT_BUS.register(this);
/* 47 */     IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
/* 48 */     ThebrokenscriptModSounds.REGISTRY.register(bus);
/* 49 */     ThebrokenscriptModBlocks.REGISTRY.register(bus);
/* 50 */     ThebrokenscriptModBlockEntities.REGISTRY.register(bus);
/* 51 */     ThebrokenscriptModItems.REGISTRY.register(bus);
/* 52 */     ThebrokenscriptModEntities.REGISTRY.register(bus);
/*    */     
/* 54 */     ThebrokenscriptModMobEffects.REGISTRY.register(bus);
/*    */     
/* 56 */     ThebrokenscriptModParticleTypes.REGISTRY.register(bus);
/*    */     
/* 58 */     ThebrokenscriptModMenus.REGISTRY.register(bus);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 67 */   public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("thebrokenscript", "thebrokenscript"), () -> "1", "1"::equals, "1"::equals);
/* 68 */   private static int messageID = 0;
/*    */   
/*    */   public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
/* 71 */     PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
/* 72 */     messageID++;
/*    */   }
/*    */   
/* 75 */   private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
/*    */   
/*    */   public static void queueServerWork(int tick, Runnable action) {
/* 78 */     if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
/* 79 */       workQueue.add(new AbstractMap.SimpleEntry<>(action, Integer.valueOf(tick))); 
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 84 */     if (event.phase == TickEvent.Phase.END) {
/* 85 */       List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
/* 86 */       workQueue.forEach(work -> {
/*    */             work.setValue(Integer.valueOf(((Integer)work.getValue()).intValue() - 1));
/*    */             if (((Integer)work.getValue()).intValue() == 0)
/*    */               actions.add(work); 
/*    */           });
/* 91 */       actions.forEach(e -> ((Runnable)e.getKey()).run());
/* 92 */       workQueue.removeAll(actions);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\ThebrokenscriptMod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */