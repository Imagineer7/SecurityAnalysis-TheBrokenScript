/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class IntegrityOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 24 */     if (entity == null)
/*    */       return; 
/* 26 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() && 
/* 27 */       entity instanceof Mob) { Mob _entity = (Mob)entity;
/*    */ 
/*    */ 
/*    */       
/* 31 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/* 32 */         _entity.m_6710_(_ent); }
/*    */        }
/* 34 */      if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "particle thebrokenscript:nullparticle ~ ~2 ~ 1 1 1 0 100"); }
/*    */     
/* 37 */     world.m_7731_(BlockPos.m_274561_(x, y + Mth.m_216271_(RandomSource.m_216327_(), 1, 9), z), Blocks.f_50016_.m_49966_(), 3);
/* 38 */     world.m_7731_(BlockPos.m_274561_(x + 1.0D, y + Mth.m_216271_(RandomSource.m_216327_(), 1, 9), z), Blocks.f_50016_.m_49966_(), 3);
/* 39 */     world.m_7731_(BlockPos.m_274561_(x - 1.0D, y + Mth.m_216271_(RandomSource.m_216327_(), 1, 9), z), Blocks.f_50016_.m_49966_(), 3);
/* 40 */     world.m_7731_(BlockPos.m_274561_(x, y + Mth.m_216271_(RandomSource.m_216327_(), 1, 9), z + 1.0D), Blocks.f_50016_.m_49966_(), 3);
/* 41 */     world.m_7731_(BlockPos.m_274561_(x, y + Mth.m_216271_(RandomSource.m_216327_(), 1, 9), z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/* 42 */     if (Math.random() < 0.1D && 
/* 43 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 44 */       _level.m_8615_(Mth.m_216271_(RandomSource.m_216327_(), 1, 18000)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\IntegrityOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */