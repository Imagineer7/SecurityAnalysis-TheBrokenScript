/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraftforge.event.level.BlockEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class HerobrineShrineProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
/* 22 */     execute((Event)event, event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 26 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 30 */     if (world.m_8055_(BlockPos.m_274561_(x, y - 1.0D, z)).m_60734_() == Blocks.f_50134_ && 
/* 31 */       world.m_8055_(BlockPos.m_274561_(x, y - 2.0D, z)).m_60734_() == Blocks.f_50079_ && 
/* 32 */       world.m_8055_(BlockPos.m_274561_(x + 1.0D, y - 2.0D, z)).m_60734_() == Blocks.f_50074_ && 
/* 33 */       world.m_8055_(BlockPos.m_274561_(x - 1.0D, y - 2.0D, z)).m_60734_() == Blocks.f_50074_ && 
/* 34 */       world.m_8055_(BlockPos.m_274561_(x, y - 2.0D, z + 1.0D)).m_60734_() == Blocks.f_50074_ && 
/* 35 */       world.m_8055_(BlockPos.m_274561_(x, y - 2.0D, z - 1.0D)).m_60734_() == Blocks.f_50074_ && 
/* 36 */       world instanceof Level) { Level _level = (Level)world;
/* 37 */       if (!_level.m_5776_()) {
/* 38 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:curved_spawn")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       } else {
/* 40 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:curved_spawn")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\HerobrineShrineProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */