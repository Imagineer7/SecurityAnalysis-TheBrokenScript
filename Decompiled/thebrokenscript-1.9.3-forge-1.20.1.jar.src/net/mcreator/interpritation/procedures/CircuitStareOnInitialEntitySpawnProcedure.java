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
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ public class CircuitStareOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 22 */     if (entity == null)
/*    */       return; 
/* 24 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned == true) {
/* 25 */       if (!entity.m_9236_().m_5776_()) {
/* 26 */         entity.m_146870_();
/*    */       }
/* 28 */     } else if (world.m_204166_(BlockPos.m_274561_(x, y, z)).m_203373_(new ResourceLocation("thebrokenscript:null_biome")) || world.m_204166_(BlockPos.m_274561_(x, y, z)).m_203373_(new ResourceLocation("deep_dark"))) {
/* 29 */       if (!entity.m_9236_().m_5776_()) {
/* 30 */         entity.m_146870_();
/*    */       }
/* 32 */     } else if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 33 */       if (!entity.m_9236_().m_5776_()) {
/* 34 */         entity.m_146870_();
/*    */       }
/* 36 */     } else if (y > 30.0D) {
/* 37 */       if (!entity.m_9236_().m_5776_()) {
/* 38 */         entity.m_146870_();
/*    */       }
/* 40 */     } else if (((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() {
/*    */           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 42 */             return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */           }
/* 44 */         }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() > 40.0D) {
/* 45 */       if (!entity.m_9236_().m_5776_()) {
/* 46 */         entity.m_146870_();
/*    */       }
/* 48 */     } else if (Math.random() < 0.01D) {
/* 49 */       if (Math.random() < 0.7D)
/* 50 */       { if (world instanceof Level) { Level _level = (Level)world;
/* 51 */           if (!_level.m_5776_()) {
/* 52 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:falsecalm2")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */           } else {
/* 54 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:falsecalm2")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */           }
/*    */            }
/*    */          }
/* 58 */       else if (world instanceof Level) { Level _level = (Level)world;
/* 59 */         if (!_level.m_5776_()) {
/* 60 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:integritywatching")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */         } else {
/* 62 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:integritywatching")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 66 */       (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = true;
/* 67 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 68 */       ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */             if (!entity.m_9236_().m_5776_()) {
/*    */               entity.m_146870_();
/*    */             }
/*    */             (ThebrokenscriptModVariables.MapVariables.get(world)).iscircuitspawned = false;
/*    */             ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */           });
/* 75 */     } else if (!entity.m_9236_().m_5776_()) {
/* 76 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitStareOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */