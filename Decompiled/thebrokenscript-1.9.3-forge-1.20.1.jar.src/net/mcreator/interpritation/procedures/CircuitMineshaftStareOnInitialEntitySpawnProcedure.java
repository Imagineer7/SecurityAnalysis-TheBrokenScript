/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ public class CircuitMineshaftStareOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 23 */     if (entity == null)
/*    */       return; 
/* 25 */     boolean found = false;
/* 26 */     double sx = 0.0D;
/* 27 */     double sy = 0.0D;
/* 28 */     double sz = 0.0D;
/* 29 */     if (world.m_204166_(BlockPos.m_274561_(x, y, z)).m_203373_(new ResourceLocation("the_end")) || world.m_204166_(BlockPos.m_274561_(x, y, z)).m_203373_(new ResourceLocation("thebrokenscript:null_biome")) || world
/* 30 */       .m_204166_(BlockPos.m_274561_(x, y, z)).m_203373_(new ResourceLocation("end_midlands")) || world.m_204166_(BlockPos.m_274561_(x, y, z)).m_203373_(new ResourceLocation("end_highlands"))) {
/* 31 */       if (!entity.m_9236_().m_5776_()) {
/* 32 */         entity.m_146870_();
/*    */       }
/* 34 */     } else if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 35 */       if (!entity.m_9236_().m_5776_()) {
/* 36 */         entity.m_146870_();
/*    */       }
/* 38 */     } else if (y > 30.0D) {
/* 39 */       if (!entity.m_9236_().m_5776_()) {
/* 40 */         entity.m_146870_();
/*    */       }
/* 42 */     } else if (((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() {
/*    */           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 44 */             return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */           }
/* 46 */         }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() > 40.0D) {
/* 47 */       if (!entity.m_9236_().m_5776_()) {
/* 48 */         entity.m_146870_();
/*    */       }
/* 50 */     } else if ((ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned == true) {
/* 51 */       if (!entity.m_9236_().m_5776_())
/* 52 */         entity.m_146870_(); 
/*    */     } else {
/* 54 */       sx = -3.0D;
/* 55 */       found = false;
/* 56 */       for (int index0 = 0; index0 < 6; index0++) {
/* 57 */         sy = -3.0D;
/* 58 */         for (int index1 = 0; index1 < 6; index1++) {
/* 59 */           sz = -3.0D;
/* 60 */           for (int index2 = 0; index2 < 6; index2++) {
/* 61 */             if (world.m_8055_(BlockPos.m_274561_(x + sx, y + sy, z + sz)).m_60734_() == Blocks.f_50705_) {
/* 62 */               found = true;
/*    */             }
/* 64 */             sz++;
/*    */           } 
/* 66 */           sy++;
/*    */         } 
/* 68 */         sx++;
/*    */       } 
/* 70 */       if (found == true)
/* 71 */         if (Math.random() < 0.1D) {
/* 72 */           if (world instanceof Level) { Level _level = (Level)world;
/* 73 */             if (!_level.m_5776_()) {
/* 74 */               _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */             } else {
/* 76 */               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */             }  }
/*    */           
/* 79 */           (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = true;
/* 80 */           ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 81 */           ThebrokenscriptMod.queueServerWork(10000, () -> {
/*    */                 if (!entity.m_9236_().m_5776_()) {
/*    */                   entity.m_146870_();
/*    */                 }
/*    */               });
/* 86 */         } else if (!entity.m_9236_().m_5776_()) {
/* 87 */           entity.m_146870_();
/*    */         }  
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitMineshaftStareOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */