/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class DeceiverOnInitialEntitySpawnProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  23 */     if (entity == null)
/*     */       return; 
/*  25 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  26 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a [\"\",{\"selector\":\"@p\",\"color\":\"yellow\"},{\"text\":\" joined the game\",\"color\":\"yellow\"}]"); }
/*     */     
/*  28 */     entity.m_6593_((Component)Component.m_237113_(((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  30 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*     */               }
/*  32 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_5446_().getString()));
/*     */     
/*  34 */     Entity _entity = entity;
/*  35 */     if (_entity instanceof Player) { Player _player = (Player)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  40 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; (_player.m_150109_()).f_35975_.set(0, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.FEET) : ItemStack.f_41583_);
/*  41 */       _player.m_150109_().m_6596_(); }
/*  42 */     else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  47 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; _living.m_8061_(EquipmentSlot.FEET, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.FEET) : ItemStack.f_41583_); }
/*     */ 
/*     */ 
/*     */     
/*  51 */     _entity = entity;
/*  52 */     if (_entity instanceof Player) { Player _player = (Player)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  57 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; (_player.m_150109_()).f_35975_.set(1, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.LEGS) : ItemStack.f_41583_);
/*  58 */       _player.m_150109_().m_6596_(); }
/*  59 */     else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  64 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; _living.m_8061_(EquipmentSlot.LEGS, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.LEGS) : ItemStack.f_41583_); }
/*     */ 
/*     */ 
/*     */     
/*  68 */     _entity = entity;
/*  69 */     if (_entity instanceof Player) { Player _player = (Player)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  74 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; (_player.m_150109_()).f_35975_.set(2, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.CHEST) : ItemStack.f_41583_);
/*  75 */       _player.m_150109_().m_6596_(); }
/*  76 */     else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  81 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; _living.m_8061_(EquipmentSlot.CHEST, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.CHEST) : ItemStack.f_41583_); }
/*     */ 
/*     */ 
/*     */     
/*  85 */     _entity = entity;
/*  86 */     if (_entity instanceof Player) { Player _player = (Player)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  91 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; (_player.m_150109_()).f_35975_.set(3, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.HEAD) : ItemStack.f_41583_);
/*  92 */       _player.m_150109_().m_6596_(); }
/*  93 */     else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  98 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); LivingEntity _entGetArmor = (LivingEntity)entity1; _living.m_8061_(EquipmentSlot.HEAD, (entity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.HEAD) : ItemStack.f_41583_); }
/*     */ 
/*     */     
/* 101 */     if (Math.random() < 0.7D)
/* 102 */     { if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/* 103 */         ItemStack _setstack = (new ItemStack((ItemLike)Items.f_42385_)).m_41777_();
/* 104 */         _setstack.m_41764_(1);
/* 105 */         livingEntity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/* 106 */         if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/* 107 */           _player.m_150109_().m_6596_(); }
/*     */          }
/*     */        }
/* 110 */     else if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/* 111 */       ItemStack _setstack = (new ItemStack((ItemLike)Items.f_42386_)).m_41777_();
/* 112 */       _setstack.m_41764_(1);
/* 113 */       livingEntity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/* 114 */       if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/* 115 */         _player.m_150109_().m_6596_(); }
/*     */        }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\DeceiverOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */