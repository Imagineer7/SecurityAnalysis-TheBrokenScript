/*     */ package net.mcreator.interpritation.init;
/*     */ 
/*     */ import java.util.function.BiFunction;
/*     */ import net.mcreator.interpritation.entity.BanEntity;
/*     */ import net.mcreator.interpritation.entity.BehindYouOverlayEntity;
/*     */ import net.mcreator.interpritation.entity.BsodEntity;
/*     */ import net.mcreator.interpritation.entity.CantYouSeeEntity;
/*     */ import net.mcreator.interpritation.entity.ChunkRemoverEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitDisguisedAsCreeperEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitJumpscareFrameEntityEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftFleeEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftStareEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftWalkEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitStalkEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitStareEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitTpBeaconEntity;
/*     */ import net.mcreator.interpritation.entity.CorruptionEntity;
/*     */ import net.mcreator.interpritation.entity.CurvedEntity;
/*     */ import net.mcreator.interpritation.entity.DeceiverEntity;
/*     */ import net.mcreator.interpritation.entity.Dotsframe1Entity;
/*     */ import net.mcreator.interpritation.entity.Dotsframe2Entity;
/*     */ import net.mcreator.interpritation.entity.Dotsframe3Entity;
/*     */ import net.mcreator.interpritation.entity.Dotsframe4Entity;
/*     */ import net.mcreator.interpritation.entity.EntitySpawnerEntity;
/*     */ import net.mcreator.interpritation.entity.FalseVillagerEntity;
/*     */ import net.mcreator.interpritation.entity.FarawayEntity;
/*     */ import net.mcreator.interpritation.entity.FollowEntity;
/*     */ import net.mcreator.interpritation.entity.HeEntity;
/*     */ import net.mcreator.interpritation.entity.HerobrineEntity;
/*     */ import net.mcreator.interpritation.entity.HetzerEntity;
/*     */ import net.mcreator.interpritation.entity.IntegrityBossfightEntity;
/*     */ import net.mcreator.interpritation.entity.IntegrityEntity;
/*     */ import net.mcreator.interpritation.entity.Jframe1entityEntity;
/*     */ import net.mcreator.interpritation.entity.Jframe2entityEntity;
/*     */ import net.mcreator.interpritation.entity.Jframe3entityEntity;
/*     */ import net.mcreator.interpritation.entity.Jframe4entityEntity;
/*     */ import net.mcreator.interpritation.entity.Jframe5entityEntity;
/*     */ import net.mcreator.interpritation.entity.JumposcoroooEntity;
/*     */ import net.mcreator.interpritation.entity.JumposcrooooEntity;
/*     */ import net.mcreator.interpritation.entity.MazeChaserEntity;
/*     */ import net.mcreator.interpritation.entity.MazeShadowsEntity;
/*     */ import net.mcreator.interpritation.entity.MissileEntity;
/*     */ import net.mcreator.interpritation.entity.NothingiswatchingEntity;
/*     */ import net.mcreator.interpritation.entity.NothingiswatchingchaseEntity;
/*     */ import net.mcreator.interpritation.entity.NullEndgameEntity;
/*     */ import net.mcreator.interpritation.entity.NullFlyingEntity;
/*     */ import net.mcreator.interpritation.entity.NullInvadeBaseEntity;
/*     */ import net.mcreator.interpritation.entity.NullIsHereEntity;
/*     */ import net.mcreator.interpritation.entity.NullMiningEntity;
/*     */ import net.mcreator.interpritation.entity.NullScareEntity;
/*     */ import net.mcreator.interpritation.entity.NullTpBeaconEntity;
/*     */ import net.mcreator.interpritation.entity.NullUnbeatableBossfightEntity;
/*     */ import net.mcreator.interpritation.entity.NullWatchingEntity;
/*     */ import net.mcreator.interpritation.entity.NulllEntity;
/*     */ import net.mcreator.interpritation.entity.OutOfCaveCheckEntity;
/*     */ import net.mcreator.interpritation.entity.PhantomPlayerEntity;
/*     */ import net.mcreator.interpritation.entity.PigCircuitEntity;
/*     */ import net.mcreator.interpritation.entity.RandomStructureEntity;
/*     */ import net.mcreator.interpritation.entity.SiluetChaseEntity;
/*     */ import net.mcreator.interpritation.entity.SiluetEntity;
/*     */ import net.mcreator.interpritation.entity.SiluetStareEntity;
/*     */ import net.mcreator.interpritation.entity.StareEntity;
/*     */ import net.mcreator.interpritation.entity.StrikeEntity;
/*     */ import net.mcreator.interpritation.entity.SubAnomaly1Entity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndEntity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndOverhaulStalkEntity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndStalkEntity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndStalkkEntity;
/*     */ import net.mcreator.interpritation.entity.TheObliterationEntity;
/*     */ import net.mcreator.interpritation.entity.WeCanHearUOverlayEntity;
/*     */ import net.mcreator.interpritation.entity.WrongOverlayEntity;
/*     */ import net.mcreator.interpritation.entity.Xxram2dieEntity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobCategory;
/*     */ import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*     */ import net.minecraftforge.registries.DeferredRegister;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*     */ public class ThebrokenscriptModEntities
/*     */ {
/*  93 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "thebrokenscript");
/*  94 */   public static final RegistryObject<EntityType<NulllEntity>> NULLL = register("nulll", 
/*  95 */       EntityType.Builder.m_20704_(NulllEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(464).setUpdateInterval(3).setCustomClientFactory(NulllEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/*  96 */   public static final RegistryObject<EntityType<SiluetEntity>> SILUET = register("siluet", 
/*  97 */       EntityType.Builder.m_20704_(SiluetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4864).setUpdateInterval(3).setCustomClientFactory(SiluetEntity::new).m_20719_().m_20699_(0.6F, 1.5F));
/*  98 */   public static final RegistryObject<EntityType<SiluetChaseEntity>> SILUET_CHASE = register("siluet_chase", EntityType.Builder.m_20704_(SiluetChaseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  99 */       .setTrackingRange(864).setUpdateInterval(3).setCustomClientFactory(SiluetChaseEntity::new).m_20719_().m_20699_(0.6F, 1.5F));
/* 100 */   public static final RegistryObject<EntityType<StrikeEntity>> STRIKE = register("strike", 
/* 101 */       EntityType.Builder.m_20704_(StrikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StrikeEntity::new)
/*     */       
/* 103 */       .m_20699_(0.6F, 1.8F));
/* 104 */   public static final RegistryObject<EntityType<NothingiswatchingEntity>> NOTHINGISWATCHING = register("nothingiswatching", EntityType.Builder.m_20704_(NothingiswatchingEntity::new, MobCategory.MONSTER)
/* 105 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(5964).setUpdateInterval(3).setCustomClientFactory(NothingiswatchingEntity::new).m_20719_().m_20699_(0.6F, 3.0F));
/* 106 */   public static final RegistryObject<EntityType<NothingiswatchingchaseEntity>> NOTHINGISWATCHINGCHASE = register("nothingiswatchingchase", EntityType.Builder.m_20704_(NothingiswatchingchaseEntity::new, MobCategory.MONSTER)
/* 107 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(4464).setUpdateInterval(3).setCustomClientFactory(NothingiswatchingchaseEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 108 */   public static final RegistryObject<EntityType<RandomStructureEntity>> RANDOM_STRUCTURE = register("random_structure", 
/* 109 */       EntityType.Builder.m_20704_(RandomStructureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RandomStructureEntity::new)
/*     */       
/* 111 */       .m_20699_(0.6F, 1.8F));
/* 112 */   public static final RegistryObject<EntityType<FarawayEntity>> FARAWAY = register("faraway", 
/* 113 */       EntityType.Builder.m_20704_(FarawayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(FarawayEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 114 */   public static final RegistryObject<EntityType<Jframe1entityEntity>> JFRAME_1ENTITY = register("jframe_1entity", 
/* 115 */       EntityType.Builder.m_20704_(Jframe1entityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Jframe1entityEntity::new)
/*     */       
/* 117 */       .m_20699_(0.6F, 1.8F));
/* 118 */   public static final RegistryObject<EntityType<Jframe2entityEntity>> JFRAME_2ENTITY = register("jframe_2entity", 
/* 119 */       EntityType.Builder.m_20704_(Jframe2entityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Jframe2entityEntity::new)
/*     */       
/* 121 */       .m_20699_(0.6F, 1.8F));
/* 122 */   public static final RegistryObject<EntityType<Jframe3entityEntity>> JFRAME_3ENTITY = register("jframe_3entity", 
/* 123 */       EntityType.Builder.m_20704_(Jframe3entityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Jframe3entityEntity::new)
/*     */       
/* 125 */       .m_20699_(0.6F, 1.8F));
/* 126 */   public static final RegistryObject<EntityType<Jframe4entityEntity>> JFRAME_4ENTITY = register("jframe_4entity", 
/* 127 */       EntityType.Builder.m_20704_(Jframe4entityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Jframe4entityEntity::new)
/*     */       
/* 129 */       .m_20699_(0.6F, 1.8F));
/* 130 */   public static final RegistryObject<EntityType<Jframe5entityEntity>> JFRAME_5ENTITY = register("jframe_5entity", 
/* 131 */       EntityType.Builder.m_20704_(Jframe5entityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Jframe5entityEntity::new)
/*     */       
/* 133 */       .m_20699_(0.6F, 1.8F));
/* 134 */   public static final RegistryObject<EntityType<JumposcoroooEntity>> JUMPOSCOROOO = register("jumposcorooo", 
/* 135 */       EntityType.Builder.m_20704_(JumposcoroooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JumposcoroooEntity::new)
/*     */       
/* 137 */       .m_20699_(0.6F, 1.8F));
/* 138 */   public static final RegistryObject<EntityType<NullScareEntity>> NULL_SCARE = register("null_scare", 
/* 139 */       EntityType.Builder.m_20704_(NullScareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NullScareEntity::new).m_20719_().m_20699_(0.6F, 4.0F));
/* 140 */   public static final RegistryObject<EntityType<WrongOverlayEntity>> WRONG_OVERLAY = register("wrong_overlay", 
/* 141 */       EntityType.Builder.m_20704_(WrongOverlayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WrongOverlayEntity::new)
/*     */       
/* 143 */       .m_20699_(0.6F, 1.8F));
/* 144 */   public static final RegistryObject<EntityType<FollowEntity>> FOLLOW = register("follow", 
/* 145 */       EntityType.Builder.m_20704_(FollowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5564).setUpdateInterval(3).setCustomClientFactory(FollowEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 146 */   public static final RegistryObject<EntityType<JumposcrooooEntity>> JUMPOSCROOOO = register("jumposcroooo", 
/* 147 */       EntityType.Builder.m_20704_(JumposcrooooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JumposcrooooEntity::new)
/*     */       
/* 149 */       .m_20699_(0.6F, 1.8F));
/* 150 */   public static final RegistryObject<EntityType<NullFlyingEntity>> NULL_FLYING = register("null_flying", EntityType.Builder.m_20704_(NullFlyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964)
/* 151 */       .setUpdateInterval(3).setCustomClientFactory(NullFlyingEntity::new).m_20719_().m_20699_(0.6F, 2.0F));
/* 152 */   public static final RegistryObject<EntityType<NullWatchingEntity>> NULL_WATCHING = register("null_watching", EntityType.Builder.m_20704_(NullWatchingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 153 */       .setTrackingRange(4964).setUpdateInterval(3).setCustomClientFactory(NullWatchingEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 154 */   public static final RegistryObject<EntityType<NullEndgameEntity>> NULL_ENDGAME = register("null_endgame", EntityType.Builder.m_20704_(NullEndgameEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 155 */       .setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(NullEndgameEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 156 */   public static final RegistryObject<EntityType<SiluetStareEntity>> SILUET_STARE = register("siluet_stare", EntityType.Builder.m_20704_(SiluetStareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 157 */       .setTrackingRange(864).setUpdateInterval(3).setCustomClientFactory(SiluetStareEntity::new).m_20719_().m_20699_(0.6F, 1.5F));
/* 158 */   public static final RegistryObject<EntityType<BehindYouOverlayEntity>> BEHIND_YOU_OVERLAY = register("behind_you_overlay", 
/* 159 */       EntityType.Builder.m_20704_(BehindYouOverlayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BehindYouOverlayEntity::new)
/*     */       
/* 161 */       .m_20699_(0.6F, 1.8F));
/* 162 */   public static final RegistryObject<EntityType<WeCanHearUOverlayEntity>> WE_CAN_HEAR_U_OVERLAY = register("we_can_hear_u_overlay", 
/* 163 */       EntityType.Builder.m_20704_(WeCanHearUOverlayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeCanHearUOverlayEntity::new)
/*     */       
/* 165 */       .m_20699_(0.6F, 1.8F));
/* 166 */   public static final RegistryObject<EntityType<CantYouSeeEntity>> CANT_YOU_SEE = register("cant_you_see", 
/* 167 */       EntityType.Builder.m_20704_(CantYouSeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CantYouSeeEntity::new)
/*     */       
/* 169 */       .m_20699_(0.6F, 1.8F));
/* 170 */   public static final RegistryObject<EntityType<NullInvadeBaseEntity>> NULL_INVADE_BASE = register("null_invade_base", EntityType.Builder.m_20704_(NullInvadeBaseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 171 */       .setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(NullInvadeBaseEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 172 */   public static final RegistryObject<EntityType<NullTpBeaconEntity>> NULL_TP_BEACON = register("null_tp_beacon", 
/* 173 */       EntityType.Builder.m_20704_(NullTpBeaconEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NullTpBeaconEntity::new)
/*     */       
/* 175 */       .m_20699_(0.6F, 1.8F));
/* 176 */   public static final RegistryObject<EntityType<HeEntity>> HE = register("he", 
/* 177 */       EntityType.Builder.m_20704_(HeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3).setCustomClientFactory(HeEntity::new).m_20719_().m_20699_(0.6F, 1.5F));
/* 178 */   public static final RegistryObject<EntityType<BsodEntity>> BSOD = register("bsod", 
/* 179 */       EntityType.Builder.m_20704_(BsodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(BsodEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 180 */   public static final RegistryObject<EntityType<MazeChaserEntity>> MAZE_CHASER = register("maze_chaser", EntityType.Builder.m_20704_(MazeChaserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(464)
/* 181 */       .setUpdateInterval(3).setCustomClientFactory(MazeChaserEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 182 */   public static final RegistryObject<EntityType<MazeShadowsEntity>> MAZE_SHADOWS = register("maze_shadows", 
/* 183 */       EntityType.Builder.m_20704_(MazeShadowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MazeShadowsEntity::new)
/*     */       
/* 185 */       .m_20699_(0.6F, 1.8F));
/* 186 */   public static final RegistryObject<EntityType<CircuitStalkEntity>> CIRCUIT_STALK = register("circuit_stalk", EntityType.Builder.m_20704_(CircuitStalkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 187 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CircuitStalkEntity::new).m_20719_().m_20699_(0.6F, 4.0F));
/* 188 */   public static final RegistryObject<EntityType<CircuitStareEntity>> CIRCUIT_STARE = register("circuit_stare", EntityType.Builder.m_20704_(CircuitStareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 189 */       .setTrackingRange(7164).setUpdateInterval(3).setCustomClientFactory(CircuitStareEntity::new).m_20719_().m_20699_(0.6F, 4.0F));
/* 190 */   public static final RegistryObject<EntityType<CircuitTpBeaconEntity>> CIRCUIT_TP_BEACON = register("circuit_tp_beacon", 
/* 191 */       EntityType.Builder.m_20704_(CircuitTpBeaconEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CircuitTpBeaconEntity::new)
/*     */       
/* 193 */       .m_20699_(0.6F, 5.0F));
/* 194 */   public static final RegistryObject<EntityType<TheBrokenEndEntity>> THE_BROKEN_END = register("the_broken_end", EntityType.Builder.m_20704_(TheBrokenEndEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 195 */       .setTrackingRange(9764).setUpdateInterval(3).setCustomClientFactory(TheBrokenEndEntity::new).m_20719_().m_20699_(0.6F, 8.0F));
/* 196 */   public static final RegistryObject<EntityType<TheBrokenEndStalkEntity>> THE_BROKEN_END_STALK = register("the_broken_end_stalk", 
/* 197 */       EntityType.Builder.m_20704_(TheBrokenEndStalkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheBrokenEndStalkEntity::new)
/*     */       
/* 199 */       .m_20699_(0.6F, 8.0F));
/* 200 */   public static final RegistryObject<EntityType<TheObliterationEntity>> THE_OBLITERATION = register("the_obliteration", EntityType.Builder.m_20704_(TheObliterationEntity::new, MobCategory.MONSTER)
/* 201 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(9764).setUpdateInterval(3).setCustomClientFactory(TheObliterationEntity::new).m_20719_().m_20699_(10.0F, 10.0F));
/* 202 */   public static final RegistryObject<EntityType<TheBrokenEndStalkkEntity>> THE_BROKEN_END_STALKK = register("the_broken_end_stalkk", EntityType.Builder.m_20704_(TheBrokenEndStalkkEntity::new, MobCategory.MONSTER)
/* 203 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(5964).setUpdateInterval(3).setCustomClientFactory(TheBrokenEndStalkkEntity::new).m_20719_().m_20699_(0.6F, 8.0F));
/* 204 */   public static final RegistryObject<EntityType<OutOfCaveCheckEntity>> OUT_OF_CAVE_CHECK = register("out_of_cave_check", EntityType.Builder.m_20704_(OutOfCaveCheckEntity::new, MobCategory.MONSTER)
/* 205 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OutOfCaveCheckEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 206 */   public static final RegistryObject<EntityType<Dotsframe1Entity>> DOTSFRAME_1 = register("dotsframe_1", 
/* 207 */       EntityType.Builder.m_20704_(Dotsframe1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Dotsframe1Entity::new)
/*     */       
/* 209 */       .m_20699_(0.6F, 1.8F));
/* 210 */   public static final RegistryObject<EntityType<Dotsframe2Entity>> DOTSFRAME_2 = register("dotsframe_2", 
/* 211 */       EntityType.Builder.m_20704_(Dotsframe2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Dotsframe2Entity::new)
/*     */       
/* 213 */       .m_20699_(0.6F, 1.8F));
/* 214 */   public static final RegistryObject<EntityType<Dotsframe3Entity>> DOTSFRAME_3 = register("dotsframe_3", 
/* 215 */       EntityType.Builder.m_20704_(Dotsframe3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Dotsframe3Entity::new)
/*     */       
/* 217 */       .m_20699_(0.6F, 1.8F));
/* 218 */   public static final RegistryObject<EntityType<Dotsframe4Entity>> DOTSFRAME_4 = register("dotsframe_4", 
/* 219 */       EntityType.Builder.m_20704_(Dotsframe4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Dotsframe4Entity::new)
/*     */       
/* 221 */       .m_20699_(0.6F, 1.8F));
/* 222 */   public static final RegistryObject<EntityType<Xxram2dieEntity>> XXRAM_2DIE = register("xxram_2die", EntityType.Builder.m_20704_(Xxram2dieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5664)
/* 223 */       .setUpdateInterval(3).setCustomClientFactory(Xxram2dieEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 224 */   public static final RegistryObject<EntityType<BanEntity>> BAN = register("ban", 
/* 225 */       EntityType.Builder.m_20704_(BanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanEntity::new)
/*     */       
/* 227 */       .m_20699_(0.6F, 0.2F));
/* 228 */   public static final RegistryObject<EntityType<NullIsHereEntity>> NULL_IS_HERE = register("null_is_here", EntityType.Builder.m_20704_(NullIsHereEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 229 */       .setTrackingRange(9664).setUpdateInterval(3).setCustomClientFactory(NullIsHereEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 230 */   public static final RegistryObject<EntityType<StareEntity>> STARE = register("stare", 
/* 231 */       EntityType.Builder.m_20704_(StareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StareEntity::new)
/*     */       
/* 233 */       .m_20699_(0.6F, 1.8F));
/* 234 */   public static final RegistryObject<EntityType<CircuitMineshaftStareEntity>> CIRCUIT_MINESHAFT_STARE = register("circuit_mineshaft_stare", EntityType.Builder.m_20704_(CircuitMineshaftStareEntity::new, MobCategory.MONSTER)
/* 235 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(CircuitMineshaftStareEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 236 */   public static final RegistryObject<EntityType<DeceiverEntity>> DECEIVER = register("deceiver", 
/* 237 */       EntityType.Builder.m_20704_(DeceiverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(3964).setUpdateInterval(3).setCustomClientFactory(DeceiverEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 238 */   public static final RegistryObject<EntityType<CorruptionEntity>> CORRUPTION = register("corruption", 
/* 239 */       EntityType.Builder.m_20704_(CorruptionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptionEntity::new)
/*     */       
/* 241 */       .m_20699_(0.6F, 0.8F));
/* 242 */   public static final RegistryObject<EntityType<NullMiningEntity>> NULL_MINING = register("null_mining", EntityType.Builder.m_20704_(NullMiningEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964)
/* 243 */       .setUpdateInterval(3).setCustomClientFactory(NullMiningEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 244 */   public static final RegistryObject<EntityType<EntitySpawnerEntity>> ENTITY_SPAWNER = register("entity_spawner", EntityType.Builder.m_20704_(EntitySpawnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 245 */       .setTrackingRange(764).setUpdateInterval(3).setCustomClientFactory(EntitySpawnerEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 246 */   public static final RegistryObject<EntityType<IntegrityEntity>> INTEGRITY = register("integrity", EntityType.Builder.m_20704_(IntegrityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2164)
/* 247 */       .setUpdateInterval(3).setCustomClientFactory(IntegrityEntity::new).m_20719_().m_20699_(0.6F, 8.0F));
/* 248 */   public static final RegistryObject<EntityType<MissileEntity>> MISSILE = register("missile", 
/* 249 */       EntityType.Builder.m_20704_(MissileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1964).setUpdateInterval(3).setCustomClientFactory(MissileEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 250 */   public static final RegistryObject<EntityType<IntegrityBossfightEntity>> INTEGRITY_BOSSFIGHT = register("integrity_bossfight", EntityType.Builder.m_20704_(IntegrityBossfightEntity::new, MobCategory.MONSTER)
/* 251 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3).setCustomClientFactory(IntegrityBossfightEntity::new).m_20719_().m_20699_(0.6F, 5.0F));
/* 252 */   public static final RegistryObject<EntityType<ChunkRemoverEntity>> CHUNK_REMOVER = register("chunk_remover", 
/* 253 */       EntityType.Builder.m_20704_(ChunkRemoverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChunkRemoverEntity::new)
/*     */       
/* 255 */       .m_20699_(0.6F, 1.8F));
/* 256 */   public static final RegistryObject<EntityType<TheBrokenEndOverhaulStalkEntity>> THE_BROKEN_END_OVERHAUL_STALK = register("the_broken_end_overhaul_stalk", 
/* 257 */       EntityType.Builder.m_20704_(TheBrokenEndOverhaulStalkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2000).setUpdateInterval(3)
/* 258 */       .setCustomClientFactory(TheBrokenEndOverhaulStalkEntity::new).m_20719_().m_20699_(0.6F, 24.0F));
/* 259 */   public static final RegistryObject<EntityType<HerobrineEntity>> HEROBRINE = register("herobrine", EntityType.Builder.m_20704_(HerobrineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2464)
/* 260 */       .setUpdateInterval(3).setCustomClientFactory(HerobrineEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 261 */   public static final RegistryObject<EntityType<CircuitMineshaftWalkEntity>> CIRCUIT_MINESHAFT_WALK = register("circuit_mineshaft_walk", EntityType.Builder.m_20704_(CircuitMineshaftWalkEntity::new, MobCategory.MONSTER)
/* 262 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(CircuitMineshaftWalkEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 263 */   public static final RegistryObject<EntityType<CircuitMineshaftFleeEntity>> CIRCUIT_MINESHAFT_FLEE = register("circuit_mineshaft_flee", 
/* 264 */       EntityType.Builder.m_20704_(CircuitMineshaftFleeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 265 */       .setCustomClientFactory(CircuitMineshaftFleeEntity::new)
/*     */       
/* 267 */       .m_20699_(0.6F, 1.8F));
/* 268 */   public static final RegistryObject<EntityType<CircuitDisguisedAsCreeperEntity>> CIRCUIT_DISGUISED_AS_CREEPER = register("circuit_disguised_as_creeper", 
/* 269 */       EntityType.Builder.m_20704_(CircuitDisguisedAsCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(966).setUpdateInterval(3)
/* 270 */       .setCustomClientFactory(CircuitDisguisedAsCreeperEntity::new).m_20719_().m_20699_(0.6F, 1.7F));
/* 271 */   public static final RegistryObject<EntityType<CircuitJumpscareFrameEntityEntity>> CIRCUIT_JUMPSCARE_FRAME_ENTITY = register("circuit_jumpscare_frame_entity", 
/* 272 */       EntityType.Builder.m_20704_(CircuitJumpscareFrameEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 273 */       .setCustomClientFactory(CircuitJumpscareFrameEntityEntity::new)
/*     */       
/* 275 */       .m_20699_(0.6F, 1.8F));
/* 276 */   public static final RegistryObject<EntityType<PhantomPlayerEntity>> PHANTOM_PLAYER = register("phantom_player", 
/* 277 */       EntityType.Builder.m_20704_(PhantomPlayerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomPlayerEntity::new)
/*     */       
/* 279 */       .m_20699_(0.1F, 0.1F));
/* 280 */   public static final RegistryObject<EntityType<HetzerEntity>> HETZER = register("hetzer", 
/* 281 */       EntityType.Builder.m_20704_(HetzerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9264).setUpdateInterval(3).setCustomClientFactory(HetzerEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 282 */   public static final RegistryObject<EntityType<CurvedEntity>> CURVED = register("curved", 
/* 283 */       EntityType.Builder.m_20704_(CurvedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(CurvedEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 284 */   public static final RegistryObject<EntityType<CircuitEntity>> CIRCUIT = register("circuit", 
/* 285 */       EntityType.Builder.m_20704_(CircuitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(CircuitEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 286 */   public static final RegistryObject<EntityType<FalseVillagerEntity>> FALSE_VILLAGER = register("false_villager", 
/* 287 */       EntityType.Builder.m_20704_(FalseVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(FalseVillagerEntity::new)
/*     */       
/* 289 */       .m_20699_(0.6F, 1.75F));
/* 290 */   public static final RegistryObject<EntityType<PigCircuitEntity>> PIG_CIRCUIT = register("pig_circuit", 
/* 291 */       EntityType.Builder.m_20704_(PigCircuitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PigCircuitEntity::new)
/*     */       
/* 293 */       .m_20699_(0.9F, 0.4F));
/* 294 */   public static final RegistryObject<EntityType<NullUnbeatableBossfightEntity>> NULL_UNBEATABLE_BOSSFIGHT = register("null_unbeatable_bossfight", 
/* 295 */       EntityType.Builder.m_20704_(NullUnbeatableBossfightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9664).setUpdateInterval(3)
/* 296 */       .setCustomClientFactory(NullUnbeatableBossfightEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 297 */   public static final RegistryObject<EntityType<SubAnomaly1Entity>> SUB_ANOMALY_1 = register("sub_anomaly_1", EntityType.Builder.m_20704_(SubAnomaly1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 298 */       .setTrackingRange(964).setUpdateInterval(3).setCustomClientFactory(SubAnomaly1Entity::new).m_20719_().m_20699_(0.6F, 0.8F));
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T extends net.minecraft.world.entity.Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 303 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void init(FMLCommonSetupEvent event) {
/* 308 */     event.enqueueWork(() -> {
/*     */           NulllEntity.init();
/*     */           SiluetEntity.init();
/*     */           SiluetChaseEntity.init();
/*     */           StrikeEntity.init();
/*     */           NothingiswatchingEntity.init();
/*     */           NothingiswatchingchaseEntity.init();
/*     */           RandomStructureEntity.init();
/*     */           FarawayEntity.init();
/*     */           Jframe1entityEntity.init();
/*     */           Jframe2entityEntity.init();
/*     */           Jframe3entityEntity.init();
/*     */           Jframe4entityEntity.init();
/*     */           Jframe5entityEntity.init();
/*     */           JumposcoroooEntity.init();
/*     */           NullScareEntity.init();
/*     */           WrongOverlayEntity.init();
/*     */           FollowEntity.init();
/*     */           JumposcrooooEntity.init();
/*     */           NullFlyingEntity.init();
/*     */           NullWatchingEntity.init();
/*     */           NullEndgameEntity.init();
/*     */           SiluetStareEntity.init();
/*     */           BehindYouOverlayEntity.init();
/*     */           WeCanHearUOverlayEntity.init();
/*     */           CantYouSeeEntity.init();
/*     */           NullInvadeBaseEntity.init();
/*     */           NullTpBeaconEntity.init();
/*     */           HeEntity.init();
/*     */           BsodEntity.init();
/*     */           MazeChaserEntity.init();
/*     */           MazeShadowsEntity.init();
/*     */           CircuitStalkEntity.init();
/*     */           CircuitStareEntity.init();
/*     */           CircuitTpBeaconEntity.init();
/*     */           TheBrokenEndEntity.init();
/*     */           TheBrokenEndStalkEntity.init();
/*     */           TheObliterationEntity.init();
/*     */           TheBrokenEndStalkkEntity.init();
/*     */           OutOfCaveCheckEntity.init();
/*     */           Dotsframe1Entity.init();
/*     */           Dotsframe2Entity.init();
/*     */           Dotsframe3Entity.init();
/*     */           Dotsframe4Entity.init();
/*     */           Xxram2dieEntity.init();
/*     */           BanEntity.init();
/*     */           NullIsHereEntity.init();
/*     */           StareEntity.init();
/*     */           CircuitMineshaftStareEntity.init();
/*     */           DeceiverEntity.init();
/*     */           CorruptionEntity.init();
/*     */           NullMiningEntity.init();
/*     */           EntitySpawnerEntity.init();
/*     */           IntegrityEntity.init();
/*     */           MissileEntity.init();
/*     */           IntegrityBossfightEntity.init();
/*     */           ChunkRemoverEntity.init();
/*     */           TheBrokenEndOverhaulStalkEntity.init();
/*     */           HerobrineEntity.init();
/*     */           CircuitMineshaftWalkEntity.init();
/*     */           CircuitMineshaftFleeEntity.init();
/*     */           CircuitDisguisedAsCreeperEntity.init();
/*     */           CircuitJumpscareFrameEntityEntity.init();
/*     */           PhantomPlayerEntity.init();
/*     */           HetzerEntity.init();
/*     */           CurvedEntity.init();
/*     */           CircuitEntity.init();
/*     */           FalseVillagerEntity.init();
/*     */           PigCircuitEntity.init();
/*     */           NullUnbeatableBossfightEntity.init();
/*     */           SubAnomaly1Entity.init();
/*     */         });
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void registerAttributes(EntityAttributeCreationEvent event) {
/* 384 */     event.put((EntityType)NULLL.get(), NulllEntity.createAttributes().m_22265_());
/* 385 */     event.put((EntityType)SILUET.get(), SiluetEntity.createAttributes().m_22265_());
/* 386 */     event.put((EntityType)SILUET_CHASE.get(), SiluetChaseEntity.createAttributes().m_22265_());
/* 387 */     event.put((EntityType)STRIKE.get(), StrikeEntity.createAttributes().m_22265_());
/* 388 */     event.put((EntityType)NOTHINGISWATCHING.get(), NothingiswatchingEntity.createAttributes().m_22265_());
/* 389 */     event.put((EntityType)NOTHINGISWATCHINGCHASE.get(), NothingiswatchingchaseEntity.createAttributes().m_22265_());
/* 390 */     event.put((EntityType)RANDOM_STRUCTURE.get(), RandomStructureEntity.createAttributes().m_22265_());
/* 391 */     event.put((EntityType)FARAWAY.get(), FarawayEntity.createAttributes().m_22265_());
/* 392 */     event.put((EntityType)JFRAME_1ENTITY.get(), Jframe1entityEntity.createAttributes().m_22265_());
/* 393 */     event.put((EntityType)JFRAME_2ENTITY.get(), Jframe2entityEntity.createAttributes().m_22265_());
/* 394 */     event.put((EntityType)JFRAME_3ENTITY.get(), Jframe3entityEntity.createAttributes().m_22265_());
/* 395 */     event.put((EntityType)JFRAME_4ENTITY.get(), Jframe4entityEntity.createAttributes().m_22265_());
/* 396 */     event.put((EntityType)JFRAME_5ENTITY.get(), Jframe5entityEntity.createAttributes().m_22265_());
/* 397 */     event.put((EntityType)JUMPOSCOROOO.get(), JumposcoroooEntity.createAttributes().m_22265_());
/* 398 */     event.put((EntityType)NULL_SCARE.get(), NullScareEntity.createAttributes().m_22265_());
/* 399 */     event.put((EntityType)WRONG_OVERLAY.get(), WrongOverlayEntity.createAttributes().m_22265_());
/* 400 */     event.put((EntityType)FOLLOW.get(), FollowEntity.createAttributes().m_22265_());
/* 401 */     event.put((EntityType)JUMPOSCROOOO.get(), JumposcrooooEntity.createAttributes().m_22265_());
/* 402 */     event.put((EntityType)NULL_FLYING.get(), NullFlyingEntity.createAttributes().m_22265_());
/* 403 */     event.put((EntityType)NULL_WATCHING.get(), NullWatchingEntity.createAttributes().m_22265_());
/* 404 */     event.put((EntityType)NULL_ENDGAME.get(), NullEndgameEntity.createAttributes().m_22265_());
/* 405 */     event.put((EntityType)SILUET_STARE.get(), SiluetStareEntity.createAttributes().m_22265_());
/* 406 */     event.put((EntityType)BEHIND_YOU_OVERLAY.get(), BehindYouOverlayEntity.createAttributes().m_22265_());
/* 407 */     event.put((EntityType)WE_CAN_HEAR_U_OVERLAY.get(), WeCanHearUOverlayEntity.createAttributes().m_22265_());
/* 408 */     event.put((EntityType)CANT_YOU_SEE.get(), CantYouSeeEntity.createAttributes().m_22265_());
/* 409 */     event.put((EntityType)NULL_INVADE_BASE.get(), NullInvadeBaseEntity.createAttributes().m_22265_());
/* 410 */     event.put((EntityType)NULL_TP_BEACON.get(), NullTpBeaconEntity.createAttributes().m_22265_());
/* 411 */     event.put((EntityType)HE.get(), HeEntity.createAttributes().m_22265_());
/* 412 */     event.put((EntityType)BSOD.get(), BsodEntity.createAttributes().m_22265_());
/* 413 */     event.put((EntityType)MAZE_CHASER.get(), MazeChaserEntity.createAttributes().m_22265_());
/* 414 */     event.put((EntityType)MAZE_SHADOWS.get(), MazeShadowsEntity.createAttributes().m_22265_());
/* 415 */     event.put((EntityType)CIRCUIT_STALK.get(), CircuitStalkEntity.createAttributes().m_22265_());
/* 416 */     event.put((EntityType)CIRCUIT_STARE.get(), CircuitStareEntity.createAttributes().m_22265_());
/* 417 */     event.put((EntityType)CIRCUIT_TP_BEACON.get(), CircuitTpBeaconEntity.createAttributes().m_22265_());
/* 418 */     event.put((EntityType)THE_BROKEN_END.get(), TheBrokenEndEntity.createAttributes().m_22265_());
/* 419 */     event.put((EntityType)THE_BROKEN_END_STALK.get(), TheBrokenEndStalkEntity.createAttributes().m_22265_());
/* 420 */     event.put((EntityType)THE_OBLITERATION.get(), TheObliterationEntity.createAttributes().m_22265_());
/* 421 */     event.put((EntityType)THE_BROKEN_END_STALKK.get(), TheBrokenEndStalkkEntity.createAttributes().m_22265_());
/* 422 */     event.put((EntityType)OUT_OF_CAVE_CHECK.get(), OutOfCaveCheckEntity.createAttributes().m_22265_());
/* 423 */     event.put((EntityType)DOTSFRAME_1.get(), Dotsframe1Entity.createAttributes().m_22265_());
/* 424 */     event.put((EntityType)DOTSFRAME_2.get(), Dotsframe2Entity.createAttributes().m_22265_());
/* 425 */     event.put((EntityType)DOTSFRAME_3.get(), Dotsframe3Entity.createAttributes().m_22265_());
/* 426 */     event.put((EntityType)DOTSFRAME_4.get(), Dotsframe4Entity.createAttributes().m_22265_());
/* 427 */     event.put((EntityType)XXRAM_2DIE.get(), Xxram2dieEntity.createAttributes().m_22265_());
/* 428 */     event.put((EntityType)BAN.get(), BanEntity.createAttributes().m_22265_());
/* 429 */     event.put((EntityType)NULL_IS_HERE.get(), NullIsHereEntity.createAttributes().m_22265_());
/* 430 */     event.put((EntityType)STARE.get(), StareEntity.createAttributes().m_22265_());
/* 431 */     event.put((EntityType)CIRCUIT_MINESHAFT_STARE.get(), CircuitMineshaftStareEntity.createAttributes().m_22265_());
/* 432 */     event.put((EntityType)DECEIVER.get(), DeceiverEntity.createAttributes().m_22265_());
/* 433 */     event.put((EntityType)CORRUPTION.get(), CorruptionEntity.createAttributes().m_22265_());
/* 434 */     event.put((EntityType)NULL_MINING.get(), NullMiningEntity.createAttributes().m_22265_());
/* 435 */     event.put((EntityType)ENTITY_SPAWNER.get(), EntitySpawnerEntity.createAttributes().m_22265_());
/* 436 */     event.put((EntityType)INTEGRITY.get(), IntegrityEntity.createAttributes().m_22265_());
/* 437 */     event.put((EntityType)MISSILE.get(), MissileEntity.createAttributes().m_22265_());
/* 438 */     event.put((EntityType)INTEGRITY_BOSSFIGHT.get(), IntegrityBossfightEntity.createAttributes().m_22265_());
/* 439 */     event.put((EntityType)CHUNK_REMOVER.get(), ChunkRemoverEntity.createAttributes().m_22265_());
/* 440 */     event.put((EntityType)THE_BROKEN_END_OVERHAUL_STALK.get(), TheBrokenEndOverhaulStalkEntity.createAttributes().m_22265_());
/* 441 */     event.put((EntityType)HEROBRINE.get(), HerobrineEntity.createAttributes().m_22265_());
/* 442 */     event.put((EntityType)CIRCUIT_MINESHAFT_WALK.get(), CircuitMineshaftWalkEntity.createAttributes().m_22265_());
/* 443 */     event.put((EntityType)CIRCUIT_MINESHAFT_FLEE.get(), CircuitMineshaftFleeEntity.createAttributes().m_22265_());
/* 444 */     event.put((EntityType)CIRCUIT_DISGUISED_AS_CREEPER.get(), CircuitDisguisedAsCreeperEntity.createAttributes().m_22265_());
/* 445 */     event.put((EntityType)CIRCUIT_JUMPSCARE_FRAME_ENTITY.get(), CircuitJumpscareFrameEntityEntity.createAttributes().m_22265_());
/* 446 */     event.put((EntityType)PHANTOM_PLAYER.get(), PhantomPlayerEntity.createAttributes().m_22265_());
/* 447 */     event.put((EntityType)HETZER.get(), HetzerEntity.createAttributes().m_22265_());
/* 448 */     event.put((EntityType)CURVED.get(), CurvedEntity.createAttributes().m_22265_());
/* 449 */     event.put((EntityType)CIRCUIT.get(), CircuitEntity.createAttributes().m_22265_());
/* 450 */     event.put((EntityType)FALSE_VILLAGER.get(), FalseVillagerEntity.createAttributes().m_22265_());
/* 451 */     event.put((EntityType)PIG_CIRCUIT.get(), PigCircuitEntity.createAttributes().m_22265_());
/* 452 */     event.put((EntityType)NULL_UNBEATABLE_BOSSFIGHT.get(), NullUnbeatableBossfightEntity.createAttributes().m_22265_());
/* 453 */     event.put((EntityType)SUB_ANOMALY_1.get(), SubAnomaly1Entity.createAttributes().m_22265_());
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */