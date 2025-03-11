/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.ClipContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class TicktestOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (world.m_8055_(new BlockPos(entity
/* 19 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 20 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 21 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()))
/* 22 */       .m_60734_() == ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable"))).getRandomElement(RandomSource.m_216327_()).orElseGet(() -> Blocks.f_50016_))
/* 23 */       world.m_46961_(new BlockPos(entity
/* 24 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), entity
/* 25 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123342_(), entity
/* 26 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_()), false); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TicktestOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */