/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class DeepslateReplacerProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 22 */     if (event.phase == TickEvent.Phase.END) {
/* 23 */       execute((Event)event, (LevelAccessor)event.player.m_9236_(), event.player.m_20185_(), event.player.m_20186_(), event.player.m_20189_());
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 28 */     execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
/* 32 */     if (Math.random() < 0.1D && 
/* 33 */       y < 10.0D) {
/* 34 */       int horizontalRadiusSquare = 4;
/* 35 */       int verticalRadiusSquare = 4;
/* 36 */       int yIterationsSquare = verticalRadiusSquare;
/* 37 */       for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 38 */         for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 39 */           for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*    */             
/* 41 */             if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_60734_() == Blocks.f_152550_) {
/*    */               
/* 43 */               BlockPos _bp = BlockPos.m_274561_(x + xi, y + i, z + zi);
/* 44 */               BlockState _bs = Blocks.f_50069_.m_49966_();
/* 45 */               BlockState _bso = world.m_8055_(_bp);
/* 46 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 47 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 48 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*    */                   try {
/* 50 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 51 */                   } catch (Exception exception) {}
/*    */                 } }
/*    */               
/* 54 */               world.m_7731_(_bp, _bs, 3);
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\DeepslateReplacerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */