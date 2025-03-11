/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ public class VoiddOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 29 */     if (entity == null)
/*    */       return; 
/* 31 */     if (!(ThebrokenscriptModVariables.MapVariables.get(world)).isvoidspawned) {
/* 32 */       if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 33 */         if (!entity.m_9236_().m_5776_()) {
/* 34 */           entity.m_146870_();
/*    */         }
/* 36 */       } else if (world.m_204166_(BlockPos.m_274561_(x, y, z)).m_203373_(new ResourceLocation("thebrokenscript:null_biome"))) {
/* 37 */         if (!entity.m_9236_().m_5776_()) {
/* 38 */           entity.m_146870_();
/*    */         }
/* 40 */       } else if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/* 41 */         if (!entity.m_9236_().m_5776_()) {
/* 42 */           entity.m_146870_();
/*    */         }
/* 44 */       } else if (y > 30.0D) {
/* 45 */         if (!entity.m_9236_().m_5776_()) {
/* 46 */           entity.m_146870_();
/*    */         }
/* 48 */       } else if (((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 50 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 52 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_() > 40.0D) {
/* 53 */         if (!entity.m_9236_().m_5776_()) {
/* 54 */           entity.m_146870_();
/*    */         }
/* 56 */       } else if ((ThebrokenscriptModVariables.MapVariables.get(world)).isvoidspawned == true) {
/* 57 */         if (!entity.m_9236_().m_5776_()) {
/* 58 */           entity.m_146870_();
/*    */         }
/* 60 */       } else if (Math.random() < 0.05D) {
/* 61 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 62 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", 
/* 63 */                 (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "stopsound @a"); }
/* 64 */          if (world instanceof Level) { Level _level = (Level)world;
/* 65 */           if (!_level.m_5776_()) {
/* 66 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:falsecalm2")), SoundSource.NEUTRAL, 555.0F, 
/* 67 */                 Mth.m_216271_(RandomSource.m_216327_(), 0, 1));
/*    */           } else {
/* 69 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:falsecalm2")), SoundSource.NEUTRAL, 555.0F, Mth.m_216271_(RandomSource.m_216327_(), 0, 1), false);
/*    */           }  }
/*    */         
/* 72 */         (ThebrokenscriptModVariables.MapVariables.get(world)).isvoidspawned = true;
/* 73 */         ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 74 */         ThebrokenscriptMod.queueServerWork(18000, () -> {
/*    */               if (!entity.m_9236_().m_5776_()) {
/*    */                 entity.m_146870_();
/*    */               }
/*    */               (ThebrokenscriptModVariables.MapVariables.get(world)).isvoidspawned = false;
/*    */               ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*    */             });
/* 81 */       } else if (!entity.m_9236_().m_5776_()) {
/* 82 */         entity.m_146870_();
/*    */ 
/*    */ 
/*    */       
/*    */       }
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 91 */     else if (!entity.m_9236_().m_5776_()) {
/* 92 */       entity.m_146870_();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\VoiddOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */