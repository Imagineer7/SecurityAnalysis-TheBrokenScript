/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class OldOreSystemProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
/* 26 */     if (event.getHand() != event.getEntity().m_7655_())
/*    */       return; 
/* 28 */     execute((Event)event, (LevelAccessor)event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), (Entity)event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 32 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 36 */     if (entity == null)
/*    */       return; 
/* 38 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == Items.f_151053_ && 
/* 39 */       !world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60815_()) {
/* 40 */       LivingEntity livingEntity = (LivingEntity)entity; livingEntity = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41764_(((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41613_() - 1);
/* 41 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_49995_.m_49966_(), 3);
/* 42 */       if (world instanceof Level) { Level _level = (Level)world;
/* 43 */         if (!_level.m_5776_()) {
/* 44 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/* 46 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */     
/*    */     } 
/*    */     
/* 51 */     _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == Items.f_151050_ && 
/* 52 */       !world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60815_()) {
/* 53 */       LivingEntity livingEntity = (LivingEntity)entity; livingEntity = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41764_(((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41613_() - 1);
/* 54 */       world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_49996_.m_49966_(), 3);
/* 55 */       if (world instanceof Level) { Level _level = (Level)world;
/* 56 */         if (!_level.m_5776_()) {
/* 57 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/* 59 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\OldOreSystemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */