/*     */ package net.mcreator.interpritation.network;
/*     */ 
/*     */ import java.util.Objects;
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WorldVariables
/*     */   extends SavedData
/*     */ {
/*     */   public static final String DATA_NAME = "thebrokenscript_worldvars";
/*     */   
/*     */   public static WorldVariables load(CompoundTag tag) {
/* 110 */     WorldVariables data = new WorldVariables();
/* 111 */     data.read(tag);
/* 112 */     return data;
/*     */   }
/*     */ 
/*     */   
/*     */   public void read(CompoundTag nbt) {}
/*     */ 
/*     */   
/*     */   public CompoundTag m_7176_(CompoundTag nbt) {
/* 120 */     return nbt;
/*     */   }
/*     */   
/*     */   public void syncData(LevelAccessor world) {
/* 124 */     m_77762_();
/* 125 */     if (world instanceof Level) { Level level = (Level)world; if (!level.m_5776_()) {
/* 126 */         Objects.requireNonNull(level); ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::m_46472_), new ThebrokenscriptModVariables.SavedDataSyncMessage(1, this));
/*     */       }  }
/*     */   
/* 129 */   } static WorldVariables clientSide = new WorldVariables();
/*     */   
/*     */   public static WorldVariables get(LevelAccessor world) {
/* 132 */     if (world instanceof ServerLevel) { ServerLevel level = (ServerLevel)world;
/* 133 */       return (WorldVariables)level.m_8895_().m_164861_(e -> load(e), WorldVariables::new, "thebrokenscript_worldvars"); }
/*     */     
/* 135 */     return clientSide;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\network\ThebrokenscriptModVariables$WorldVariables.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */