/*    */ package net.mcreator.interpritation.command;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import net.mcreator.interpritation.procedures.SafemodeprocedureProcedure;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.common.util.FakePlayer;
/*    */ import net.minecraftforge.common.util.FakePlayerFactory;
/*    */ import net.minecraftforge.event.RegisterCommandsEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class SafemodeCommand {
/*    */   @SubscribeEvent
/*    */   public static void registerCommand(RegisterCommandsEvent event) {
/* 21 */     event.getDispatcher().register((LiteralArgumentBuilder)Commands.m_82127_("unused")
/*    */         
/* 23 */         .executes(arguments -> {
/*    */             FakePlayer fakePlayer;
/*    */             Level world = ((CommandSourceStack)arguments.getSource()).getUnsidedLevel();
/*    */             double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
/*    */             double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
/*    */             double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
/*    */             Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
/*    */             if (entity == null && world instanceof ServerLevel) {
/*    */               ServerLevel _servLevel = (ServerLevel)world;
/*    */               fakePlayer = FakePlayerFactory.getMinecraft(_servLevel);
/*    */             } 
/*    */             Direction direction = Direction.DOWN;
/*    */             if (fakePlayer != null)
/*    */               direction = fakePlayer.m_6350_(); 
/*    */             SafemodeprocedureProcedure.execute((LevelAccessor)world, x, y, z);
/*    */             return 0;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\command\SafemodeCommand.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */