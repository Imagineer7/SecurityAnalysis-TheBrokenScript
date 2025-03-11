/*    */ package net.mcreator.interpritation.mixins;
/*    */ 
/*    */ import net.minecraft.world.level.LevelHeightAccessor;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ 
/*    */ @Mixin({LevelHeightAccessor.class})
/*    */ public interface LevelHeightAccessorMixin {
/*    */   @Overwrite
/*    */   default int m_141937_() {
/* 11 */     return -64;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\mixins\LevelHeightAccessorMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */