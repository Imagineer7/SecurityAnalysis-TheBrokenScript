/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.vehicle.Boat;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class CircuitOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  40 */     if (entity == null)
/*     */       return; 
/*  42 */     double heights = 0.0D;
/*  43 */     heights = Mth.m_216271_(RandomSource.m_216327_(), 1, 5);
/*  44 */     entity.getPersistentData().m_128347_("a", entity.getPersistentData().m_128459_("a") + 1.0D);
/*  45 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1450.0D, 1450.0D, 1450.0D), e -> true).isEmpty() && 
/*  46 */       entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */       
/*  50 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity1;
/*  51 */         _entity.m_6710_(_ent); }
/*     */        }
/*  53 */      if (world.m_8055_(BlockPos.m_274561_(x + 1.0D, heights, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  55 */       BlockPos _pos = BlockPos.m_274561_(x + 1.0D, heights, z);
/*  56 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x + 1.0D, heights, z), null);
/*  57 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  60 */     if (world.m_8055_(BlockPos.m_274561_(x - 1.0D, heights, z)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  62 */       BlockPos _pos = BlockPos.m_274561_(x - 1.0D, heights, z);
/*  63 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x - 1.0D, heights, z), null);
/*  64 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  67 */     if (world.m_8055_(BlockPos.m_274561_(x, heights, z + 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  69 */       BlockPos _pos = BlockPos.m_274561_(x, heights, z + 1.0D);
/*  70 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, heights, z + 1.0D), null);
/*  71 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  74 */     if (world.m_8055_(BlockPos.m_274561_(x, heights, z - 1.0D)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:circuitbreakable")))) {
/*     */       
/*  76 */       BlockPos _pos = BlockPos.m_274561_(x, heights, z - 1.0D);
/*  77 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, heights, z - 1.0D), null);
/*  78 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  81 */     if (entity.getPersistentData().m_128459_("a") > 45.0D) {
/*  82 */       entity.getPersistentData().m_128347_("a", 0.0D);
/*  83 */       (ThebrokenscriptModVariables.MapVariables.get(world)).nowayoutframe++;
/*  84 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*  85 */       if (world instanceof Level) { Level _level = (Level)world;
/*  86 */         if (!_level.m_5776_()) {
/*  87 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 0.5F);
/*     */         } else {
/*  89 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 0.5F, false);
/*     */         }  }
/*     */       
/*  92 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  93 */         Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.CIRCUIT_JUMPSCARE_FRAME_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/*  94 */         if (entityToSpawn != null) {
/*  95 */           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */         } }
/*     */       
/*  98 */       if (Math.random() < 0.7D) {
/*  99 */         ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 101 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/* 103 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 5.0D, z));
/*     */       }
/* 105 */       if (Math.random() < 0.7D) {
/* 106 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 107 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set midnight"); }
/*     */         
/* 109 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 110 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_1ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 111 */           if (entityToSpawn != null) {
/* 112 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */       
/*     */       } 
/* 116 */       if (Math.random() < 0.7D) {
/* 117 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 118 */           _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */         
/* 120 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 121 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.JFRAME_2ENTITY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 122 */           if (entityToSpawn != null) {
/* 123 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*     */           } }
/*     */       
/*     */       } 
/* 127 */       if (Math.random() < 0.7D && 
/* 128 */         world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 129 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "time set day"); }
/*     */     
/*     */     } 
/*     */     
/* 133 */     int horizontalRadiusSquare = 2;
/* 134 */     int verticalRadiusSquare = 2;
/* 135 */     int yIterationsSquare = verticalRadiusSquare;
/* 136 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 137 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 138 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*     */           
/* 140 */           if (world.m_8055_(BlockPos.m_274561_(x + xi, y + i, z + zi)).m_204336_(BlockTags.create(new ResourceLocation("thebrokenscript:wa")))) {
/*     */             
/* 142 */             BlockPos _bp = BlockPos.m_274561_(x + xi, y + i, z + zi);
/* 143 */             BlockState _bs = Blocks.f_50652_.m_49966_();
/* 144 */             BlockState _bso = world.m_8055_(_bp);
/* 145 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 146 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 147 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 149 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 150 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 153 */             world.m_7731_(_bp, _bs, 3);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 159 */     if (!world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 164 */       if (!((Entity)world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_())
/* 165 */         ((Entity)world.m_6443_(Boat.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 167 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/* 169 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/*     */     }
/* 171 */     if (Math.random() < 0.01D) {
/* 172 */       (ThebrokenscriptModVariables.MapVariables.get(world)).nowayoutframe++;
/* 173 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */     } 
/* 175 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).nowayoutframe > 6.0D) {
/* 176 */       (ThebrokenscriptModVariables.MapVariables.get(world)).nowayoutframe = 0.0D;
/* 177 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\CircuitOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */