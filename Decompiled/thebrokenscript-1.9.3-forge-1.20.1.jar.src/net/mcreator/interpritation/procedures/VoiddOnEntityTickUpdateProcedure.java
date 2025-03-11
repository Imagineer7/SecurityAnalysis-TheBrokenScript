/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class VoiddOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 31 */     if (entity == null)
/*    */       return; 
/* 33 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/* 34 */       if (Math.random() < 0.7D) {
/* 35 */         if (!entity.m_9236_().m_5776_())
/* 36 */           entity.m_146870_(); 
/* 37 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 38 */           Entity entityToSpawn = ((EntityType)ThebrokenscriptModEntities.NULLL.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 39 */           if (entityToSpawn != null) {
/* 40 */             entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
/*    */           } }
/*    */       
/*    */       } else {
/* 44 */         if (!entity.m_9236_().m_5776_())
/* 45 */           entity.m_146870_(); 
/* 46 */         if (world instanceof Level) { Level _level = (Level)world;
/* 47 */           if (!_level.m_5776_()) {
/* 48 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */           } else {
/* 50 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */           }  }
/*    */         
/* 53 */         if (Math.random() < 0.1D && 
/* 54 */           world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 55 */           StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("thebrokenscript", "giift"));
/* 56 */           if (template != null) {
/* 57 */             template.m_230328_((ServerLevelAccessor)_serverworld, BlockPos.m_274561_(x, y, z), BlockPos.m_274561_(x, y, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*    */           } }
/*    */       
/*    */       } 
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 65 */     Vec3 _center = new Vec3(x, y, z);
/* 66 */     List<Entity> _entfound = world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_(500.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
/* 67 */     for (Entity entityiterator : _entfound) {
/* 68 */       if (entityiterator.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("thebrokenscript:despawnable"))) && 
/* 69 */         !entityiterator.m_9236_().m_5776_()) {
/* 70 */         entityiterator.m_146870_();
/*    */       }
/*    */     } 
/*    */     
/* 74 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).isEmpty())
/* 75 */       entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2002.0D, 2002.0D, 2002.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 77 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 79 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20185_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2002.0D, 2002.0D, 2002.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 81 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 83 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20186_(), ((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 2002.0D, 2002.0D, 2002.0D), e -> true).stream().sorted((new Object() {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 85 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */                 }
/* 87 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_20189_())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\VoiddOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */