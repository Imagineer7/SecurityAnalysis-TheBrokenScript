/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.entity.CircuitEntity;
/*    */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.animal.Bee;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ public class CircuitThisEntityKillsAnotherOneProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 28 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 29 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "stopsound @a"); }
/* 30 */      if (world instanceof Level) { Level _level = (Level)world;
/* 31 */       if (!_level.m_5776_()) {
/* 32 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       } else {
/* 34 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     if (!((Entity)world.m_6443_(CircuitEntity.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 42 */       ((Entity)world.m_6443_(CircuitEntity.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 44 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 46 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 47 */     (ThebrokenscriptModVariables.MapVariables.get(world)).nowayoutframe = 0.0D;
/* 48 */     ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/* 49 */     ThebrokenscriptMod.queueServerWork(20, () -> {
/*    */           if (Math.random() < 0.1D) {
/*    */             if (!((Entity)world.m_6443_(Bee.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), ()).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 53 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/*    */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/*    */               ((Entity)world.m_6443_(Bee.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), ()).stream().sorted((new Object() {
/*    */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 58 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                     }
/*    */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*    */           } else if (Math.random() < 0.5D) {
/*    */             if (world instanceof ServerLevel) {
/*    */               ServerLevel _level = (ServerLevel)world;
/*    */               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @a No more running.");
/*    */             } 
/*    */           } else if (world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "kick @a No more hiding.");
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */