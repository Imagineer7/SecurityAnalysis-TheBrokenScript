/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.interpritation.entity.CurvedEntity;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModParticleTypes;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.ClipContext;
/*    */ import net.minecraft.world.level.GameType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ public class CurvedOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 30 */     if (entity == null)
/*    */       return; 
/* 32 */     if (world instanceof Level) { Level _level = (Level)world;
/* 33 */       if (!_level.m_5776_()) {
/* 34 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:curved_spawn")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       } else {
/* 36 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:curved_spawn")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       }  }
/*    */     
/* 39 */     if (entity instanceof CurvedEntity) { CurvedEntity _datEntSetI = (CurvedEntity)entity;
/* 40 */       CurvedEntity curvedEntity1 = (CurvedEntity)entity; _datEntSetI.m_20088_().m_135381_(CurvedEntity.DATA_despawntimer, Integer.valueOf(((entity instanceof CurvedEntity) ? ((Integer)curvedEntity1.m_20088_().m_135370_(CurvedEntity.DATA_despawntimer)).intValue() : 0) + 1)); }
/* 41 */      int horizontalRadiusSquare = 2;
/* 42 */     int verticalRadiusSquare = 2;
/* 43 */     int yIterationsSquare = verticalRadiusSquare;
/* 44 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 45 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 46 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*    */           
/* 48 */           if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*    */             
/* 50 */             BlockPos _pos = BlockPos.m_274561_(x + xi, y + i, z + zi);
/* 51 */             Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + xi, y + i, z + zi), null);
/* 52 */             world.m_46961_(_pos, false);
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     CurvedEntity _datEntI = (CurvedEntity)entity; if (((entity instanceof CurvedEntity) ? ((Integer)_datEntI.m_20088_().m_135370_(CurvedEntity.DATA_despawntimer)).intValue() : Character.MIN_VALUE) > 'Ұ') {
/* 59 */       if (!entity.m_9236_().m_5776_())
/* 60 */         entity.m_146870_(); 
/* 61 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 62 */         _level.m_8767_((ParticleOptions)ThebrokenscriptModParticleTypes.PARTICLE_OF_CURVED.get(), x, y, z, 55, 3.0D, 3.0D, 3.0D, 0.0D); }
/*    */     
/* 64 */     }  if (Math.random() < 0.001D) {
/*    */       
/* 66 */       Entity _ent = entity;
/* 67 */       _ent.m_6021_(entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), y, entity
/* 68 */           .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_());
/* 69 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 70 */         _serverPlayer.f_8906_.m_9774_(entity
/* 71 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123341_(), y, entity
/* 72 */             .m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0F), entity.m_20299_(1.0F).m_82549_(entity.m_20252_(1.0F).m_82490_(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).m_82425_().m_123343_(), _ent
/* 73 */             .m_146908_(), _ent.m_146909_()); }
/*    */     
/*    */     } 
/* 76 */     if (world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60815_()) {
/*    */       
/* 78 */       Entity _ent = entity;
/* 79 */       _ent.m_6021_(x, y + 1.0D, z);
/* 80 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 81 */         _serverPlayer.f_8906_.m_9774_(x, y + 1.0D, z, _ent.m_146908_(), _ent.m_146909_()); }
/*    */     
/*    */     } 
/* 84 */     if ((new Object() {
/*    */         public boolean checkGamemode(Entity _ent) {
/* 86 */           if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 87 */             return (_serverPlayer.f_8941_.m_9290_() == GameType.CREATIVE); }
/* 88 */            if (_ent.m_9236_().m_5776_() && _ent instanceof Player) { Player _player = (Player)_ent;
/* 89 */             return (Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.CREATIVE); }
/*    */           
/* 91 */           return false;
/*    */         }
/* 93 */       }).checkGamemode(world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 95 */               return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */             }
/* 97 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)))
/* 98 */       if (!entity.m_9236_().m_5776_())
/* 99 */         entity.m_146870_();  
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CurvedOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */