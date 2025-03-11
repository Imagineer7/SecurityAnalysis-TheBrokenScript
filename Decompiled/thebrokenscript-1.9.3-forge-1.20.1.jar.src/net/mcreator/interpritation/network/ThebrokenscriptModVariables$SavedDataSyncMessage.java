/*     */ package net.mcreator.interpritation.network;
/*     */ 
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
/*     */ import net.minecraftforge.network.NetworkEvent;
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
/*     */ public class SavedDataSyncMessage
/*     */ {
/*     */   private final int type;
/*     */   private SavedData data;
/*     */   
/*     */   public SavedDataSyncMessage(FriendlyByteBuf buffer) {
/* 308 */     this.type = buffer.readInt();
/* 309 */     CompoundTag nbt = buffer.m_130260_();
/* 310 */     if (nbt != null) {
/* 311 */       this.data = (this.type == 0) ? new ThebrokenscriptModVariables.MapVariables() : new ThebrokenscriptModVariables.WorldVariables();
/* 312 */       SavedData savedData = this.data; if (savedData instanceof ThebrokenscriptModVariables.MapVariables) { ThebrokenscriptModVariables.MapVariables mapVariables = (ThebrokenscriptModVariables.MapVariables)savedData;
/* 313 */         mapVariables.read(nbt); }
/* 314 */       else { savedData = this.data; if (savedData instanceof ThebrokenscriptModVariables.WorldVariables) { ThebrokenscriptModVariables.WorldVariables worldVariables = (ThebrokenscriptModVariables.WorldVariables)savedData;
/* 315 */           worldVariables.read(nbt); }
/*     */          }
/*     */     
/*     */     } 
/*     */   } public SavedDataSyncMessage(int type, SavedData data) {
/* 320 */     this.type = type;
/* 321 */     this.data = data;
/*     */   }
/*     */   
/*     */   public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
/* 325 */     buffer.writeInt(message.type);
/* 326 */     if (message.data != null)
/* 327 */       buffer.m_130079_(message.data.m_7176_(new CompoundTag())); 
/*     */   }
/*     */   
/*     */   public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 331 */     NetworkEvent.Context context = contextSupplier.get();
/* 332 */     context.enqueueWork(() -> {
/*     */           if (!context.getDirection().getReceptionSide().isServer() && message.data != null)
/*     */             if (message.type == 0) {
/*     */               ThebrokenscriptModVariables.MapVariables.clientSide = (ThebrokenscriptModVariables.MapVariables)message.data;
/*     */             } else {
/*     */               ThebrokenscriptModVariables.WorldVariables.clientSide = (ThebrokenscriptModVariables.WorldVariables)message.data;
/*     */             }  
/*     */         });
/* 340 */     context.setPacketHandled(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\network\ThebrokenscriptModVariables$SavedDataSyncMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */