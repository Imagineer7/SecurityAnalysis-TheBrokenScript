/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import com.sun.jna.Native;
/*    */ import com.sun.jna.win32.StdCallLibrary;
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.entity.FollowEntity;
/*    */ import net.mcreator.interpritation.entity.NullFlyingEntity;
/*    */ import net.mcreator.interpritation.entity.NullWatchingEntity;
/*    */ import net.mcreator.interpritation.entity.SiluetEntity;
/*    */ import net.mcreator.interpritation.entity.SiluetStareEntity;
/*    */ import net.mcreator.interpritation.entity.TheBrokenEndStalkEntity;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class TriesToSleepProcedure
/*    */ {
/*    */   public static interface User32
/*    */     extends StdCallLibrary
/*    */   {
/* 36 */     public static final User32 INSTANCE = (User32)Native.load("user32", User32.class);
/*    */     
/*    */     int MessageBoxA(long param1Long, String param1String1, String param1String2, int param1Int);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onPlayerInBed(PlayerSleepInBedEvent event) {
/* 43 */     execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), (Entity)event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 47 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 51 */     if (entity == null)
/*    */       return; 
/* 53 */     if (!world.m_6443_(NullWatchingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 54 */       ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1F);
/*    */             User32.INSTANCE.MessageBoxA(0L, "err.null", "LWJGL Alert", 0);
/*    */           });
/* 58 */     } else if (!world.m_6443_(NullFlyingEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 59 */       ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1F);
/*    */             User32.INSTANCE.MessageBoxA(0L, "err.null", "LWJGL Alert", 0);
/*    */           });
/* 63 */     } else if (!world.m_6443_(FollowEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 64 */       ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1F);
/*    */             User32.INSTANCE.MessageBoxA(0L, "err.texture", "LWJGL Alert", 0);
/*    */           });
/* 68 */     } else if (!world.m_6443_(SiluetStareEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 69 */       ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1F);
/*    */             User32.INSTANCE.MessageBoxA(0L, "err.soul", "LWJGL Alert", 0);
/*    */           });
/* 73 */     } else if (!world.m_6443_(TheBrokenEndStalkEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 74 */       ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1F);
/*    */             User32.INSTANCE.MessageBoxA(0L, "err.endisnear", "LWJGL Alert", 0);
/*    */           });
/* 78 */     } else if (!world.m_6443_(SiluetEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 79 */       ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1F);
/*    */             User32.INSTANCE.MessageBoxA(0L, "err.soul", "LWJGL Alert", 0);
/*    */           });
/* 83 */     } else if (world.m_6042_().m_63936_(world.m_8044_()) == Mth.m_216271_(RandomSource.m_216327_(), 5, 8)) {
/* 84 */       ThebrokenscriptMod.queueServerWork(5, () -> {
/*    */             entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1F);
/*    */             User32.INSTANCE.MessageBoxA(0L, "err.themoon", "LWJGL Alert", 0);
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TriesToSleepProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */