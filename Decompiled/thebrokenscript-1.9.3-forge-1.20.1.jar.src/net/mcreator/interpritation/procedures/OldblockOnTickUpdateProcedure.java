/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class OldblockOnTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     BlockPos _bp = BlockPos.m_274561_(x, y - 1.0D, z);
/* 16 */     BlockState _bs = ((Block)ThebrokenscriptModBlocks.OLDBLOCK.get()).m_49966_();
/* 17 */     BlockState _bso = world.m_8055_(_bp);
/* 18 */     for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 19 */       Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 20 */       if (_property != null && _bs.m_61143_(_property) != null) {
/*    */         try {
/* 22 */           _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 23 */         } catch (Exception exception) {}
/*    */       } }
/*    */     
/* 26 */     world.m_7731_(_bp, _bs, 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\OldblockOnTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */