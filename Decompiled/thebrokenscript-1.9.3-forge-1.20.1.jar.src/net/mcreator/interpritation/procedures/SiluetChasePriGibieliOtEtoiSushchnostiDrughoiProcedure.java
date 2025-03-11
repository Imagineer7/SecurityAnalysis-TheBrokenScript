/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*    */ import net.mcreator.interpritation.entity.SiluetChaseEntity;
/*    */ import net.mcreator.interpritation.entity.StrikeEntity;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SiluetChasePriGibieliOtEtoiSushchnostiDrughoiProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 20 */     if (!((Entity)world.m_6443_(SiluetChaseEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 21 */       ((Entity)world.m_6443_(SiluetChaseEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 23 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 25 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 26 */     ThebrokenscriptMod.queueServerWork(20, () -> {
/*    */           if (!((Entity)world.m_6443_(StrikeEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), ()).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 29 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/*    */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/*    */             ((Entity)world.m_6443_(StrikeEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), ()).stream().sorted((new Object() {
/*    */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 34 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                   }
/*    */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\SiluetChasePriGibieliOtEtoiSushchnostiDrughoiProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */