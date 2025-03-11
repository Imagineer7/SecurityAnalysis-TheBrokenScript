/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class FirstJoinProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 30 */     execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 34 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 38 */     (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = false;
/* 39 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 40 */     (ThebrokenscriptModVariables.MapVariables.get(world)).issiluettspawned = false;
/* 41 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 42 */     (ThebrokenscriptModVariables.MapVariables.get(world)).isnullspawned = false;
/* 43 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 44 */     (ThebrokenscriptModVariables.MapVariables.get(world)).isvoidspawned = false;
/* 45 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 46 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).firstjoin == true) {
/* 47 */       (ThebrokenscriptModVariables.MapVariables.get(world)).homeX = x;
/* 48 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 49 */       (ThebrokenscriptModVariables.MapVariables.get(world)).homeY = y;
/* 50 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 51 */       (ThebrokenscriptModVariables.MapVariables.get(world)).homeZ = z;
/* 52 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 53 */       ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */             if (world instanceof ServerLevel) {
/*    */               ServerLevel _level = (ServerLevel)world; _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a {\"text\":\"Null joined the game\",\"color\":\"yellow\"}");
/*    */             }  if (world instanceof Level) {
/*    */               Level _level = (Level)world;
/*    */               if (!_level.m_5776_()) {
/*    */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */               } else {
/*    */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */               } 
/*    */             } 
/*    */             (ThebrokenscriptModVariables.MapVariables.get(world)).isnullspawned = true;
/*    */             ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */             (ThebrokenscriptModVariables.MapVariables.get(world)).firstjoin = false;
/*    */             ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */             (ThebrokenscriptModVariables.MapVariables.get(world)).nullishere = true;
/*    */             ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */           });
/*    */     } 
/* 72 */     ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */           (ThebrokenscriptModVariables.MapVariables.get(world)).isnullspawned = true;
/*    */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\FirstJoinProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */