/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.Difficulty;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class NoPeaceProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 23 */     if (event.phase == TickEvent.Phase.END) {
/* 24 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_());
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 29 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 33 */     if (world.m_46791_() == Difficulty.PEACEFUL && 
/* 34 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "difficulty easy"); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\NoPeaceProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */