/*    */ package net.mcreator.interpritation.network;
/*    */ import java.util.HashMap;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.procedures.ConfigSaveProcedure;
/*    */ import net.mcreator.interpritation.world.inventory.ConfigMenu;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ConfigButtonMessage {
/*    */   private final int buttonID;
/*    */   private final int x;
/*    */   
/*    */   public ConfigButtonMessage(FriendlyByteBuf buffer) {
/* 26 */     this.buttonID = buffer.readInt();
/* 27 */     this.x = buffer.readInt();
/* 28 */     this.y = buffer.readInt();
/* 29 */     this.z = buffer.readInt();
/*    */   }
/*    */   private final int y; private final int z;
/*    */   public ConfigButtonMessage(int buttonID, int x, int y, int z) {
/* 33 */     this.buttonID = buttonID;
/* 34 */     this.x = x;
/* 35 */     this.y = y;
/* 36 */     this.z = z;
/*    */   }
/*    */   
/*    */   public static void buffer(ConfigButtonMessage message, FriendlyByteBuf buffer) {
/* 40 */     buffer.writeInt(message.buttonID);
/* 41 */     buffer.writeInt(message.x);
/* 42 */     buffer.writeInt(message.y);
/* 43 */     buffer.writeInt(message.z);
/*    */   }
/*    */   
/*    */   public static void handler(ConfigButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 47 */     NetworkEvent.Context context = contextSupplier.get();
/* 48 */     context.enqueueWork(() -> {
/*    */           ServerPlayer serverPlayer = context.getSender();
/*    */           int buttonID = message.buttonID;
/*    */           int x = message.x;
/*    */           int y = message.y;
/*    */           int z = message.z;
/*    */           handleButtonAction((Player)serverPlayer, buttonID, x, y, z);
/*    */         });
/* 56 */     context.setPacketHandled(true);
/*    */   }
/*    */   
/*    */   public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
/* 60 */     Level world = entity.m_9236_();
/* 61 */     HashMap guistate = ConfigMenu.guistate;
/*    */     
/* 63 */     if (!world.m_46805_(new BlockPos(x, y, z)))
/*    */       return; 
/* 65 */     if (buttonID == 0)
/*    */     {
/* 67 */       ConfigSaveProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, guistate);
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerMessage(FMLCommonSetupEvent event) {
/* 73 */     ThebrokenscriptMod.addNetworkMessage(ConfigButtonMessage.class, ConfigButtonMessage::buffer, ConfigButtonMessage::new, ConfigButtonMessage::handler);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\network\ConfigButtonMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */