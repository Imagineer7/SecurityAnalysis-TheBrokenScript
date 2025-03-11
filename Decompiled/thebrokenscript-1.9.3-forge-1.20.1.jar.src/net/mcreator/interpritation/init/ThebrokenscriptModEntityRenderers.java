/*     */ package net.mcreator.interpritation.init;
/*     */ 
/*     */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */ public class ThebrokenscriptModEntityRenderers
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/*  87 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULLL.get(), net.mcreator.interpritation.client.renderer.NulllRenderer::new);
/*  88 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.SILUET.get(), net.mcreator.interpritation.client.renderer.SiluetRenderer::new);
/*  89 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.SILUET_CHASE.get(), net.mcreator.interpritation.client.renderer.SiluetChaseRenderer::new);
/*  90 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.STRIKE.get(), net.mcreator.interpritation.client.renderer.StrikeRenderer::new);
/*  91 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NOTHINGISWATCHING.get(), net.mcreator.interpritation.client.renderer.NothingiswatchingRenderer::new);
/*  92 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NOTHINGISWATCHINGCHASE.get(), net.mcreator.interpritation.client.renderer.NothingiswatchingchaseRenderer::new);
/*  93 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.RANDOM_STRUCTURE.get(), net.mcreator.interpritation.client.renderer.RandomStructureRenderer::new);
/*  94 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.FARAWAY.get(), net.mcreator.interpritation.client.renderer.FarawayRenderer::new);
/*  95 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.JFRAME_1ENTITY.get(), net.mcreator.interpritation.client.renderer.Jframe1entityRenderer::new);
/*  96 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.JFRAME_2ENTITY.get(), net.mcreator.interpritation.client.renderer.Jframe2entityRenderer::new);
/*  97 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.JFRAME_3ENTITY.get(), net.mcreator.interpritation.client.renderer.Jframe3entityRenderer::new);
/*  98 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.JFRAME_4ENTITY.get(), net.mcreator.interpritation.client.renderer.Jframe4entityRenderer::new);
/*  99 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.JFRAME_5ENTITY.get(), net.mcreator.interpritation.client.renderer.Jframe5entityRenderer::new);
/* 100 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.JUMPOSCOROOO.get(), net.mcreator.interpritation.client.renderer.JumposcoroooRenderer::new);
/* 101 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_SCARE.get(), net.mcreator.interpritation.client.renderer.NullScareRenderer::new);
/* 102 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.WRONG_OVERLAY.get(), net.mcreator.interpritation.client.renderer.WrongOverlayRenderer::new);
/* 103 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.FOLLOW.get(), net.mcreator.interpritation.client.renderer.FollowRenderer::new);
/* 104 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.JUMPOSCROOOO.get(), net.mcreator.interpritation.client.renderer.JumposcrooooRenderer::new);
/* 105 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_FLYING.get(), net.mcreator.interpritation.client.renderer.NullFlyingRenderer::new);
/* 106 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_WATCHING.get(), net.mcreator.interpritation.client.renderer.NullWatchingRenderer::new);
/* 107 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_ENDGAME.get(), net.mcreator.interpritation.client.renderer.NullEndgameRenderer::new);
/* 108 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.SILUET_STARE.get(), net.mcreator.interpritation.client.renderer.SiluetStareRenderer::new);
/* 109 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.BEHIND_YOU_OVERLAY.get(), net.mcreator.interpritation.client.renderer.BehindYouOverlayRenderer::new);
/* 110 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.WE_CAN_HEAR_U_OVERLAY.get(), net.mcreator.interpritation.client.renderer.WeCanHearUOverlayRenderer::new);
/* 111 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CANT_YOU_SEE.get(), net.mcreator.interpritation.client.renderer.CantYouSeeRenderer::new);
/* 112 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_INVADE_BASE.get(), net.mcreator.interpritation.client.renderer.NullInvadeBaseRenderer::new);
/* 113 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_TP_BEACON.get(), net.mcreator.interpritation.client.renderer.NullTpBeaconRenderer::new);
/* 114 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.HE.get(), net.mcreator.interpritation.client.renderer.HeRenderer::new);
/* 115 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.BSOD.get(), net.mcreator.interpritation.client.renderer.BsodRenderer::new);
/* 116 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.MAZE_CHASER.get(), net.mcreator.interpritation.client.renderer.MazeChaserRenderer::new);
/* 117 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.MAZE_SHADOWS.get(), net.mcreator.interpritation.client.renderer.MazeShadowsRenderer::new);
/* 118 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_STALK.get(), net.mcreator.interpritation.client.renderer.CircuitStalkRenderer::new);
/* 119 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_STARE.get(), net.mcreator.interpritation.client.renderer.CircuitStareRenderer::new);
/* 120 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_TP_BEACON.get(), net.mcreator.interpritation.client.renderer.CircuitTpBeaconRenderer::new);
/* 121 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END.get(), net.mcreator.interpritation.client.renderer.TheBrokenEndRenderer::new);
/* 122 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END_STALK.get(), net.mcreator.interpritation.client.renderer.TheBrokenEndStalkRenderer::new);
/* 123 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.THE_OBLITERATION.get(), net.mcreator.interpritation.client.renderer.TheObliterationRenderer::new);
/* 124 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END_STALKK.get(), net.mcreator.interpritation.client.renderer.TheBrokenEndStalkkRenderer::new);
/* 125 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.OUT_OF_CAVE_CHECK.get(), net.mcreator.interpritation.client.renderer.OutOfCaveCheckRenderer::new);
/* 126 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.DOTSFRAME_1.get(), net.mcreator.interpritation.client.renderer.Dotsframe1Renderer::new);
/* 127 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.DOTSFRAME_2.get(), net.mcreator.interpritation.client.renderer.Dotsframe2Renderer::new);
/* 128 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.DOTSFRAME_3.get(), net.mcreator.interpritation.client.renderer.Dotsframe3Renderer::new);
/* 129 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.DOTSFRAME_4.get(), net.mcreator.interpritation.client.renderer.Dotsframe4Renderer::new);
/* 130 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.XXRAM_2DIE.get(), net.mcreator.interpritation.client.renderer.Xxram2dieRenderer::new);
/* 131 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.BAN.get(), net.mcreator.interpritation.client.renderer.BanRenderer::new);
/* 132 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_IS_HERE.get(), net.mcreator.interpritation.client.renderer.NullIsHereRenderer::new);
/* 133 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.STARE.get(), net.mcreator.interpritation.client.renderer.StareRenderer::new);
/* 134 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_MINESHAFT_STARE.get(), net.mcreator.interpritation.client.renderer.CircuitMineshaftStareRenderer::new);
/* 135 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.DECEIVER.get(), net.mcreator.interpritation.client.renderer.DeceiverRenderer::new);
/* 136 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CORRUPTION.get(), net.mcreator.interpritation.client.renderer.CorruptionRenderer::new);
/* 137 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_MINING.get(), net.mcreator.interpritation.client.renderer.NullMiningRenderer::new);
/* 138 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.ENTITY_SPAWNER.get(), net.mcreator.interpritation.client.renderer.EntitySpawnerRenderer::new);
/* 139 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.INTEGRITY.get(), net.mcreator.interpritation.client.renderer.IntegrityRenderer::new);
/* 140 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.MISSILE.get(), net.mcreator.interpritation.client.renderer.MissileRenderer::new);
/* 141 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.INTEGRITY_BOSSFIGHT.get(), net.mcreator.interpritation.client.renderer.IntegrityBossfightRenderer::new);
/* 142 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CHUNK_REMOVER.get(), net.mcreator.interpritation.client.renderer.ChunkRemoverRenderer::new);
/* 143 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.THE_BROKEN_END_OVERHAUL_STALK.get(), net.mcreator.interpritation.client.renderer.TheBrokenEndOverhaulStalkRenderer::new);
/* 144 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.HEROBRINE.get(), net.mcreator.interpritation.client.renderer.HerobrineRenderer::new);
/* 145 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_MINESHAFT_WALK.get(), net.mcreator.interpritation.client.renderer.CircuitMineshaftWalkRenderer::new);
/* 146 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_MINESHAFT_FLEE.get(), net.mcreator.interpritation.client.renderer.CircuitMineshaftFleeRenderer::new);
/* 147 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_DISGUISED_AS_CREEPER.get(), net.mcreator.interpritation.client.renderer.CircuitDisguisedAsCreeperRenderer::new);
/* 148 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT_JUMPSCARE_FRAME_ENTITY.get(), net.mcreator.interpritation.client.renderer.CircuitJumpscareFrameEntityRenderer::new);
/* 149 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.PHANTOM_PLAYER.get(), net.mcreator.interpritation.client.renderer.PhantomPlayerRenderer::new);
/* 150 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.HETZER.get(), net.mcreator.interpritation.client.renderer.HetzerRenderer::new);
/* 151 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CURVED.get(), net.mcreator.interpritation.client.renderer.CurvedRenderer::new);
/* 152 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.CIRCUIT.get(), net.mcreator.interpritation.client.renderer.CircuitRenderer::new);
/* 153 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.FALSE_VILLAGER.get(), net.mcreator.interpritation.client.renderer.FalseVillagerRenderer::new);
/* 154 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.PIG_CIRCUIT.get(), net.mcreator.interpritation.client.renderer.PigCircuitRenderer::new);
/* 155 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.NULL_UNBEATABLE_BOSSFIGHT.get(), net.mcreator.interpritation.client.renderer.NullUnbeatableBossfightRenderer::new);
/* 156 */     event.registerEntityRenderer((EntityType)ThebrokenscriptModEntities.SUB_ANOMALY_1.get(), net.mcreator.interpritation.client.renderer.SubAnomaly1Renderer::new);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModEntityRenderers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */