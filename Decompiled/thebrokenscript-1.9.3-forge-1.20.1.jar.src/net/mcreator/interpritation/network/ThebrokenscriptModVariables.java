/*     */ package net.mcreator.interpritation.network;
/*     */ 
/*     */ import java.util.Objects;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.nbt.Tag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
/*     */ import net.minecraftforge.common.capabilities.Capability;
/*     */ import net.minecraftforge.common.capabilities.CapabilityManager;
/*     */ import net.minecraftforge.common.capabilities.CapabilityToken;
/*     */ import net.minecraftforge.common.capabilities.ICapabilityProvider;
/*     */ import net.minecraftforge.common.capabilities.ICapabilitySerializable;
/*     */ import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
/*     */ import net.minecraftforge.common.util.LazyOptional;
/*     */ import net.minecraftforge.event.AttachCapabilitiesEvent;
/*     */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*     */ import net.minecraftforge.network.NetworkEvent;
/*     */ import net.minecraftforge.network.PacketDistributor;
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*     */ public class ThebrokenscriptModVariables
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void init(FMLCommonSetupEvent event) {
/*  41 */     ThebrokenscriptMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
/*  42 */     ThebrokenscriptMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void init(RegisterCapabilitiesEvent event) {
/*  47 */     event.register(PlayerVariables.class);
/*     */   }
/*     */   
/*     */   @EventBusSubscriber
/*     */   public static class EventBusVariableHandlers {
/*     */     @SubscribeEvent
/*     */     public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
/*  54 */       if (!event.getEntity().m_9236_().m_5776_())
/*  55 */         ((ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables())).syncPlayerVariables((Entity)event.getEntity()); 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
/*  60 */       if (!event.getEntity().m_9236_().m_5776_())
/*  61 */         ((ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables())).syncPlayerVariables((Entity)event.getEntity()); 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
/*  66 */       if (!event.getEntity().m_9236_().m_5776_())
/*  67 */         ((ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables())).syncPlayerVariables((Entity)event.getEntity()); 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void clonePlayer(PlayerEvent.Clone event) {
/*  72 */       event.getOriginal().revive();
/*  73 */       ThebrokenscriptModVariables.PlayerVariables original = (ThebrokenscriptModVariables.PlayerVariables)event.getOriginal().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables());
/*  74 */       ThebrokenscriptModVariables.PlayerVariables clone = (ThebrokenscriptModVariables.PlayerVariables)event.getEntity().getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables());
/*  75 */       clone.showtab = original.showtab;
/*  76 */       clone.filecreated = original.filecreated;
/*  77 */       clone.corrupted = original.corrupted;
/*  78 */       clone.is_player_an_entity = original.is_player_an_entity;
/*  79 */       if (!event.isWasDeath()) {
/*  80 */         clone.screendamage = original.screendamage;
/*     */       }
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/*  86 */       if (!event.getEntity().m_9236_().m_5776_()) {
/*  87 */         SavedData mapdata = ThebrokenscriptModVariables.MapVariables.get((LevelAccessor)event.getEntity().m_9236_());
/*  88 */         SavedData worlddata = ThebrokenscriptModVariables.WorldVariables.get((LevelAccessor)event.getEntity().m_9236_());
/*  89 */         if (mapdata != null)
/*  90 */           ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), new ThebrokenscriptModVariables.SavedDataSyncMessage(0, mapdata)); 
/*  91 */         if (worlddata != null)
/*  92 */           ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), new ThebrokenscriptModVariables.SavedDataSyncMessage(1, worlddata)); 
/*     */       } 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
/*  98 */       if (!event.getEntity().m_9236_().m_5776_()) {
/*  99 */         SavedData worlddata = ThebrokenscriptModVariables.WorldVariables.get((LevelAccessor)event.getEntity().m_9236_());
/* 100 */         if (worlddata != null)
/* 101 */           ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), new ThebrokenscriptModVariables.SavedDataSyncMessage(1, worlddata)); 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class WorldVariables extends SavedData {
/*     */     public static final String DATA_NAME = "thebrokenscript_worldvars";
/*     */     
/*     */     public static WorldVariables load(CompoundTag tag) {
/* 110 */       WorldVariables data = new WorldVariables();
/* 111 */       data.read(tag);
/* 112 */       return data;
/*     */     }
/*     */ 
/*     */     
/*     */     public void read(CompoundTag nbt) {}
/*     */ 
/*     */     
/*     */     public CompoundTag m_7176_(CompoundTag nbt) {
/* 120 */       return nbt;
/*     */     }
/*     */     
/*     */     public void syncData(LevelAccessor world) {
/* 124 */       m_77762_();
/* 125 */       if (world instanceof Level) { Level level = (Level)world; if (!level.m_5776_()) {
/* 126 */           Objects.requireNonNull(level); ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::m_46472_), new ThebrokenscriptModVariables.SavedDataSyncMessage(1, this));
/*     */         }  }
/*     */     
/* 129 */     } static WorldVariables clientSide = new WorldVariables();
/*     */     
/*     */     public static WorldVariables get(LevelAccessor world) {
/* 132 */       if (world instanceof ServerLevel) { ServerLevel level = (ServerLevel)world;
/* 133 */         return (WorldVariables)level.m_8895_().m_164861_(e -> load(e), WorldVariables::new, "thebrokenscript_worldvars"); }
/*     */       
/* 135 */       return clientSide;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class MapVariables
/*     */     extends SavedData {
/*     */     public static final String DATA_NAME = "thebrokenscript_mapvars";
/* 142 */     public double baseX = 0.0D;
/* 143 */     public double baseY = 0.0D;
/* 144 */     public double baseZ = 0.0D;
/*     */     public boolean isnullspawned = false;
/*     */     public boolean isitspawned = false;
/*     */     public boolean issiluettspawned = false;
/*     */     public boolean firstjoin = true;
/*     */     public boolean iseeyoucodeactivated = false;
/*     */     public boolean silluetspawned = false;
/* 151 */     public double homeX = 0.0D;
/* 152 */     public double homeY = 0.0D;
/* 153 */     public double homeZ = 0.0D;
/*     */     public boolean isnulldimentiongenerated = false;
/* 155 */     public double dimentionspawnX = 0.0D;
/* 156 */     public double dimentionspawnY = 0.0D;
/* 157 */     public double dimentionspawnZ = 0.0D;
/*     */     public boolean showvhs = true;
/*     */     public boolean iscircuitspawned = false;
/*     */     public boolean isthebrokenendspawned = false;
/*     */     public boolean clanbuilddimensiongenerated = false;
/*     */     public boolean ram2dietriggered = false;
/*     */     public boolean ram2diejoined = false;
/*     */     public boolean disc13or11played = false;
/*     */     public boolean isvoidspawned = false;
/*     */     public boolean nullishere = false;
/*     */     public boolean cancorrupted = true;
/*     */     public boolean isfieldGenerated = false;
/*     */     public boolean isDeceiverSpawned = false;
/*     */     public boolean devmodeenabled = false;
/*     */     public boolean isentityspawned = false;
/*     */     public boolean isvoidexpgenerated = false;
/* 173 */     public double reputation = 1.0D;
/* 174 */     public double nowayoutframe = 0.0D;
/*     */     public boolean config_randomevents = false;
/*     */     public boolean config_noentitiesspawn = false;
/*     */     public boolean config_nocrashes = false;
/*     */     public boolean config_norandomstructures = false;
/*     */     public boolean config_noban = false;
/*     */     public boolean config_noblockbreaking = false;
/*     */     public boolean config_nobaseexplode = false;
/*     */     public boolean config_norandomjumpscare = false;
/* 183 */     public double moonphase = 0.0D;
/* 184 */     public double config_event_engine_chance = 1.0D;
/*     */     
/*     */     public static MapVariables load(CompoundTag tag) {
/* 187 */       MapVariables data = new MapVariables();
/* 188 */       data.read(tag);
/* 189 */       return data;
/*     */     }
/*     */     
/*     */     public void read(CompoundTag nbt) {
/* 193 */       this.baseX = nbt.m_128459_("baseX");
/* 194 */       this.baseY = nbt.m_128459_("baseY");
/* 195 */       this.baseZ = nbt.m_128459_("baseZ");
/* 196 */       this.isnullspawned = nbt.m_128471_("isnullspawned");
/* 197 */       this.isitspawned = nbt.m_128471_("isitspawned");
/* 198 */       this.issiluettspawned = nbt.m_128471_("issiluettspawned");
/* 199 */       this.firstjoin = nbt.m_128471_("firstjoin");
/* 200 */       this.iseeyoucodeactivated = nbt.m_128471_("iseeyoucodeactivated");
/* 201 */       this.silluetspawned = nbt.m_128471_("silluetspawned");
/* 202 */       this.homeX = nbt.m_128459_("homeX");
/* 203 */       this.homeY = nbt.m_128459_("homeY");
/* 204 */       this.homeZ = nbt.m_128459_("homeZ");
/* 205 */       this.isnulldimentiongenerated = nbt.m_128471_("isnulldimentiongenerated");
/* 206 */       this.dimentionspawnX = nbt.m_128459_("dimentionspawnX");
/* 207 */       this.dimentionspawnY = nbt.m_128459_("dimentionspawnY");
/* 208 */       this.dimentionspawnZ = nbt.m_128459_("dimentionspawnZ");
/* 209 */       this.showvhs = nbt.m_128471_("showvhs");
/* 210 */       this.iscircuitspawned = nbt.m_128471_("iscircuitspawned");
/* 211 */       this.isthebrokenendspawned = nbt.m_128471_("isthebrokenendspawned");
/* 212 */       this.clanbuilddimensiongenerated = nbt.m_128471_("clanbuilddimensiongenerated");
/* 213 */       this.ram2dietriggered = nbt.m_128471_("ram2dietriggered");
/* 214 */       this.ram2diejoined = nbt.m_128471_("ram2diejoined");
/* 215 */       this.disc13or11played = nbt.m_128471_("disc13or11played");
/* 216 */       this.isvoidspawned = nbt.m_128471_("isvoidspawned");
/* 217 */       this.nullishere = nbt.m_128471_("nullishere");
/* 218 */       this.cancorrupted = nbt.m_128471_("cancorrupted");
/* 219 */       this.isfieldGenerated = nbt.m_128471_("isfieldGenerated");
/* 220 */       this.isDeceiverSpawned = nbt.m_128471_("isDeceiverSpawned");
/* 221 */       this.devmodeenabled = nbt.m_128471_("devmodeenabled");
/* 222 */       this.isentityspawned = nbt.m_128471_("isentityspawned");
/* 223 */       this.isvoidexpgenerated = nbt.m_128471_("isvoidexpgenerated");
/* 224 */       this.reputation = nbt.m_128459_("reputation");
/* 225 */       this.nowayoutframe = nbt.m_128459_("nowayoutframe");
/* 226 */       this.config_randomevents = nbt.m_128471_("config_randomevents");
/* 227 */       this.config_noentitiesspawn = nbt.m_128471_("config_noentitiesspawn");
/* 228 */       this.config_nocrashes = nbt.m_128471_("config_nocrashes");
/* 229 */       this.config_norandomstructures = nbt.m_128471_("config_norandomstructures");
/* 230 */       this.config_noban = nbt.m_128471_("config_noban");
/* 231 */       this.config_noblockbreaking = nbt.m_128471_("config_noblockbreaking");
/* 232 */       this.config_nobaseexplode = nbt.m_128471_("config_nobaseexplode");
/* 233 */       this.config_norandomjumpscare = nbt.m_128471_("config_norandomjumpscare");
/* 234 */       this.moonphase = nbt.m_128459_("moonphase");
/* 235 */       this.config_event_engine_chance = nbt.m_128459_("config_event_engine_chance");
/*     */     }
/*     */ 
/*     */     
/*     */     public CompoundTag m_7176_(CompoundTag nbt) {
/* 240 */       nbt.m_128347_("baseX", this.baseX);
/* 241 */       nbt.m_128347_("baseY", this.baseY);
/* 242 */       nbt.m_128347_("baseZ", this.baseZ);
/* 243 */       nbt.m_128379_("isnullspawned", this.isnullspawned);
/* 244 */       nbt.m_128379_("isitspawned", this.isitspawned);
/* 245 */       nbt.m_128379_("issiluettspawned", this.issiluettspawned);
/* 246 */       nbt.m_128379_("firstjoin", this.firstjoin);
/* 247 */       nbt.m_128379_("iseeyoucodeactivated", this.iseeyoucodeactivated);
/* 248 */       nbt.m_128379_("silluetspawned", this.silluetspawned);
/* 249 */       nbt.m_128347_("homeX", this.homeX);
/* 250 */       nbt.m_128347_("homeY", this.homeY);
/* 251 */       nbt.m_128347_("homeZ", this.homeZ);
/* 252 */       nbt.m_128379_("isnulldimentiongenerated", this.isnulldimentiongenerated);
/* 253 */       nbt.m_128347_("dimentionspawnX", this.dimentionspawnX);
/* 254 */       nbt.m_128347_("dimentionspawnY", this.dimentionspawnY);
/* 255 */       nbt.m_128347_("dimentionspawnZ", this.dimentionspawnZ);
/* 256 */       nbt.m_128379_("showvhs", this.showvhs);
/* 257 */       nbt.m_128379_("iscircuitspawned", this.iscircuitspawned);
/* 258 */       nbt.m_128379_("isthebrokenendspawned", this.isthebrokenendspawned);
/* 259 */       nbt.m_128379_("clanbuilddimensiongenerated", this.clanbuilddimensiongenerated);
/* 260 */       nbt.m_128379_("ram2dietriggered", this.ram2dietriggered);
/* 261 */       nbt.m_128379_("ram2diejoined", this.ram2diejoined);
/* 262 */       nbt.m_128379_("disc13or11played", this.disc13or11played);
/* 263 */       nbt.m_128379_("isvoidspawned", this.isvoidspawned);
/* 264 */       nbt.m_128379_("nullishere", this.nullishere);
/* 265 */       nbt.m_128379_("cancorrupted", this.cancorrupted);
/* 266 */       nbt.m_128379_("isfieldGenerated", this.isfieldGenerated);
/* 267 */       nbt.m_128379_("isDeceiverSpawned", this.isDeceiverSpawned);
/* 268 */       nbt.m_128379_("devmodeenabled", this.devmodeenabled);
/* 269 */       nbt.m_128379_("isentityspawned", this.isentityspawned);
/* 270 */       nbt.m_128379_("isvoidexpgenerated", this.isvoidexpgenerated);
/* 271 */       nbt.m_128347_("reputation", this.reputation);
/* 272 */       nbt.m_128347_("nowayoutframe", this.nowayoutframe);
/* 273 */       nbt.m_128379_("config_randomevents", this.config_randomevents);
/* 274 */       nbt.m_128379_("config_noentitiesspawn", this.config_noentitiesspawn);
/* 275 */       nbt.m_128379_("config_nocrashes", this.config_nocrashes);
/* 276 */       nbt.m_128379_("config_norandomstructures", this.config_norandomstructures);
/* 277 */       nbt.m_128379_("config_noban", this.config_noban);
/* 278 */       nbt.m_128379_("config_noblockbreaking", this.config_noblockbreaking);
/* 279 */       nbt.m_128379_("config_nobaseexplode", this.config_nobaseexplode);
/* 280 */       nbt.m_128379_("config_norandomjumpscare", this.config_norandomjumpscare);
/* 281 */       nbt.m_128347_("moonphase", this.moonphase);
/* 282 */       nbt.m_128347_("config_event_engine_chance", this.config_event_engine_chance);
/* 283 */       return nbt;
/*     */     }
/*     */     
/*     */     public void syncData(LevelAccessor world) {
/* 287 */       m_77762_();
/* 288 */       if (world instanceof Level && !world.m_5776_())
/* 289 */         ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new ThebrokenscriptModVariables.SavedDataSyncMessage(0, this)); 
/*     */     }
/*     */     
/* 292 */     static MapVariables clientSide = new MapVariables();
/*     */     
/*     */     public static MapVariables get(LevelAccessor world) {
/* 295 */       if (world instanceof ServerLevelAccessor) { ServerLevelAccessor serverLevelAcc = (ServerLevelAccessor)world;
/* 296 */         return (MapVariables)serverLevelAcc.m_6018_().m_7654_().m_129880_(Level.f_46428_).m_8895_().m_164861_(e -> load(e), MapVariables::new, "thebrokenscript_mapvars"); }
/*     */       
/* 298 */       return clientSide;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SavedDataSyncMessage
/*     */   {
/*     */     private final int type;
/*     */     private SavedData data;
/*     */     
/*     */     public SavedDataSyncMessage(FriendlyByteBuf buffer) {
/* 308 */       this.type = buffer.readInt();
/* 309 */       CompoundTag nbt = buffer.m_130260_();
/* 310 */       if (nbt != null) {
/* 311 */         this.data = (this.type == 0) ? new ThebrokenscriptModVariables.MapVariables() : new ThebrokenscriptModVariables.WorldVariables();
/* 312 */         SavedData savedData = this.data; if (savedData instanceof ThebrokenscriptModVariables.MapVariables) { ThebrokenscriptModVariables.MapVariables mapVariables = (ThebrokenscriptModVariables.MapVariables)savedData;
/* 313 */           mapVariables.read(nbt); }
/* 314 */         else { savedData = this.data; if (savedData instanceof ThebrokenscriptModVariables.WorldVariables) { ThebrokenscriptModVariables.WorldVariables worldVariables = (ThebrokenscriptModVariables.WorldVariables)savedData;
/* 315 */             worldVariables.read(nbt); }
/*     */            }
/*     */       
/*     */       } 
/*     */     } public SavedDataSyncMessage(int type, SavedData data) {
/* 320 */       this.type = type;
/* 321 */       this.data = data;
/*     */     }
/*     */     
/*     */     public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
/* 325 */       buffer.writeInt(message.type);
/* 326 */       if (message.data != null)
/* 327 */         buffer.m_130079_(message.data.m_7176_(new CompoundTag())); 
/*     */     }
/*     */     
/*     */     public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 331 */       NetworkEvent.Context context = contextSupplier.get();
/* 332 */       context.enqueueWork(() -> {
/*     */             if (!context.getDirection().getReceptionSide().isServer() && message.data != null)
/*     */               if (message.type == 0) {
/*     */                 ThebrokenscriptModVariables.MapVariables.clientSide = (ThebrokenscriptModVariables.MapVariables)message.data;
/*     */               } else {
/*     */                 ThebrokenscriptModVariables.WorldVariables.clientSide = (ThebrokenscriptModVariables.WorldVariables)message.data;
/*     */               }  
/*     */           });
/* 340 */       context.setPacketHandled(true);
/*     */     }
/*     */   }
/*     */   
/* 344 */   public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {  }
/*     */     );
/*     */   
/*     */   @EventBusSubscriber
/*     */   private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
/*     */     @SubscribeEvent
/*     */     public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
/* 351 */       if (event.getObject() instanceof net.minecraft.world.entity.player.Player && !(event.getObject() instanceof net.minecraftforge.common.util.FakePlayer))
/* 352 */         event.addCapability(new ResourceLocation("thebrokenscript", "player_variables"), (ICapabilityProvider)new PlayerVariablesProvider()); 
/*     */     }
/*     */     
/* 355 */     private final ThebrokenscriptModVariables.PlayerVariables playerVariables = new ThebrokenscriptModVariables.PlayerVariables();
/* 356 */     private final LazyOptional<ThebrokenscriptModVariables.PlayerVariables> instance = LazyOptional.of(() -> this.playerVariables);
/*     */ 
/*     */     
/*     */     public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
/* 360 */       return (cap == ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY) ? this.instance.cast() : LazyOptional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Tag serializeNBT() {
/* 365 */       return this.playerVariables.writeNBT();
/*     */     }
/*     */ 
/*     */     
/*     */     public void deserializeNBT(Tag nbt) {
/* 370 */       this.playerVariables.readNBT(nbt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class PlayerVariables {
/*     */     public boolean showtab = false;
/*     */     public boolean filecreated = false;
/* 377 */     public double corrupted = 0.0D;
/*     */     public boolean screendamage = false;
/*     */     public boolean is_player_an_entity = false;
/*     */     
/*     */     public void syncPlayerVariables(Entity entity) {
/* 382 */       if (entity instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)entity;
/* 383 */         ThebrokenscriptMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new ThebrokenscriptModVariables.PlayerVariablesSyncMessage(this)); }
/*     */     
/*     */     }
/*     */     public Tag writeNBT() {
/* 387 */       CompoundTag nbt = new CompoundTag();
/* 388 */       nbt.m_128379_("showtab", this.showtab);
/* 389 */       nbt.m_128379_("filecreated", this.filecreated);
/* 390 */       nbt.m_128347_("corrupted", this.corrupted);
/* 391 */       nbt.m_128379_("screendamage", this.screendamage);
/* 392 */       nbt.m_128379_("is_player_an_entity", this.is_player_an_entity);
/* 393 */       return (Tag)nbt;
/*     */     }
/*     */     
/*     */     public void readNBT(Tag tag) {
/* 397 */       CompoundTag nbt = (CompoundTag)tag;
/* 398 */       this.showtab = nbt.m_128471_("showtab");
/* 399 */       this.filecreated = nbt.m_128471_("filecreated");
/* 400 */       this.corrupted = nbt.m_128459_("corrupted");
/* 401 */       this.screendamage = nbt.m_128471_("screendamage");
/* 402 */       this.is_player_an_entity = nbt.m_128471_("is_player_an_entity");
/*     */     }
/*     */   }
/*     */   
/*     */   public static class PlayerVariablesSyncMessage {
/*     */     private final ThebrokenscriptModVariables.PlayerVariables data;
/*     */     
/*     */     public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
/* 410 */       this.data = new ThebrokenscriptModVariables.PlayerVariables();
/* 411 */       this.data.readNBT((Tag)buffer.m_130260_());
/*     */     }
/*     */     
/*     */     public PlayerVariablesSyncMessage(ThebrokenscriptModVariables.PlayerVariables data) {
/* 415 */       this.data = data;
/*     */     }
/*     */     
/*     */     public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
/* 419 */       buffer.m_130079_((CompoundTag)message.data.writeNBT());
/*     */     }
/*     */     
/*     */     public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 423 */       NetworkEvent.Context context = contextSupplier.get();
/* 424 */       context.enqueueWork(() -> {
/*     */             if (!context.getDirection().getReceptionSide().isServer()) {
/*     */               ThebrokenscriptModVariables.PlayerVariables variables = (ThebrokenscriptModVariables.PlayerVariables)(Minecraft.m_91087_()).f_91074_.getCapability(ThebrokenscriptModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ThebrokenscriptModVariables.PlayerVariables());
/*     */               variables.showtab = message.data.showtab;
/*     */               variables.filecreated = message.data.filecreated;
/*     */               variables.corrupted = message.data.corrupted;
/*     */               variables.screendamage = message.data.screendamage;
/*     */               variables.is_player_an_entity = message.data.is_player_an_entity;
/*     */             } 
/*     */           });
/* 434 */       context.setPacketHandled(true);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\network\ThebrokenscriptModVariables.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */