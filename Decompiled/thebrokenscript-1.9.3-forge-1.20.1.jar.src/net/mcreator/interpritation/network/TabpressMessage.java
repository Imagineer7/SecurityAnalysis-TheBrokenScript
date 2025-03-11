/*    */ package net.mcreator.interpritation.network;
/*    */ 
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.procedures.TabpressOnKeyPressedProcedure;
/*    */ import net.mcreator.interpritation.procedures.TabpressOnKeyReleasedProcedure;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class TabpressMessage {
/*    */   int type;
/*    */   int pressedms;
/*    */   
/*    */   public TabpressMessage(int type, int pressedms) {
/* 24 */     this.type = type;
/* 25 */     this.pressedms = pressedms;
/*    */   }
/*    */   
/*    */   public TabpressMessage(FriendlyByteBuf buffer) {
/* 29 */     this.type = buffer.readInt();
/* 30 */     this.pressedms = buffer.readInt();
/*    */   }
/*    */   
/*    */   public static void buffer(TabpressMessage message, FriendlyByteBuf buffer) {
/* 34 */     buffer.writeInt(message.type);
/* 35 */     buffer.writeInt(message.pressedms);
/*    */   }
/*    */   
/*    */   public static void handler(TabpressMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 39 */     NetworkEvent.Context context = contextSupplier.get();
/* 40 */     context.enqueueWork(() -> pressAction((Player)context.getSender(), message.type, message.pressedms));
/*    */ 
/*    */     
/* 43 */     context.setPacketHandled(true);
/*    */   }
/*    */   
/*    */   public static void pressAction(Player entity, int type, int pressedms) {
/* 47 */     Level world = entity.m_9236_();
/* 48 */     double x = entity.m_20185_();
/* 49 */     double y = entity.m_20186_();
/* 50 */     double z = entity.m_20189_();
/*    */     
/* 52 */     if (!world.m_46805_(entity.m_20183_()))
/*    */       return; 
/* 54 */     if (type == 0)
/*    */     {
/* 56 */       TabpressOnKeyPressedProcedure.execute((Entity)entity);
/*    */     }
/* 58 */     if (type == 1)
/*    */     {
/* 60 */       TabpressOnKeyReleasedProcedure.execute((Entity)entity);
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerMessage(FMLCommonSetupEvent event) {
/* 66 */     ThebrokenscriptMod.addNetworkMessage(TabpressMessage.class, TabpressMessage::buffer, TabpressMessage::new, TabpressMessage::handler);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\network\TabpressMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */