/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import java.util.HashMap;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.minecraft.client.gui.components.Checkbox;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class ConfigSaveProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
/*  28 */     if (entity == null || guistate == null)
/*     */       return; 
/*  30 */     if (guistate.containsKey("checkbox:checkbox1") && ((Checkbox)guistate.get("checkbox:checkbox1")).m_93840_())
/*  31 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).config_noentitiesspawn = true;
/*  32 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  37 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/*  38 */           _player.m_5661_((Component)Component.m_237113_("No entities can spawn now"), false);  }
/*     */        }
/*  40 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).config_noentitiesspawn = false;
/*  41 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  46 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/*  47 */           _player.m_5661_((Component)Component.m_237113_("Entities can spawn now"), false);  }
/*     */        }
/*  49 */      if (guistate.containsKey("checkbox:checkbox2") && ((Checkbox)guistate.get("checkbox:checkbox2")).m_93840_())
/*  50 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).config_randomevents = true;
/*  51 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  56 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/*  57 */           _player.m_5661_((Component)Component.m_237113_("No random events can happen now"), false);  }
/*     */        }
/*  59 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).config_randomevents = false;
/*  60 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  65 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/*  66 */           _player.m_5661_((Component)Component.m_237113_("Random events can happen now"), false);  }
/*     */        }
/*  68 */      if (guistate.containsKey("checkbox:checkbox3") && ((Checkbox)guistate.get("checkbox:checkbox3")).m_93840_())
/*  69 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).config_nocrashes = true;
/*  70 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  75 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/*  76 */           _player.m_5661_((Component)Component.m_237113_("No game crashes can happen now"), false);  }
/*     */        }
/*  78 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).config_nocrashes = false;
/*  79 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  84 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/*  85 */           _player.m_5661_((Component)Component.m_237113_("Game crashes can happen now"), false);  }
/*     */        }
/*  87 */      if (guistate.containsKey("checkbox:checkbox4") && ((Checkbox)guistate.get("checkbox:checkbox4")).m_93840_())
/*  88 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).config_norandomjumpscare = true;
/*  89 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  94 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/*  95 */           _player.m_5661_((Component)Component.m_237113_("No random jumpscare events can happen now"), false);  }
/*     */        }
/*  97 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).config_norandomjumpscare = false;
/*  98 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 103 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 104 */           _player.m_5661_((Component)Component.m_237113_("Jumpscare events can happen now"), false);  }
/*     */        }
/* 106 */      if (guistate.containsKey("checkbox:checkbox5") && ((Checkbox)guistate.get("checkbox:checkbox5")).m_93840_())
/* 107 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).config_norandomstructures = true;
/* 108 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 113 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 114 */           _player.m_5661_((Component)Component.m_237113_("No random structures can spawn now"), false);  }
/*     */        }
/* 116 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).config_norandomstructures = false;
/* 117 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 122 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 123 */           _player.m_5661_((Component)Component.m_237113_("Random structures can spawn now"), false);  }
/*     */        }
/* 125 */      if (guistate.containsKey("checkbox:checkbox6") && ((Checkbox)guistate.get("checkbox:checkbox6")).m_93840_())
/* 126 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).showvhs = false;
/* 127 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 132 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 133 */           _player.m_5661_((Component)Component.m_237113_("Removed VHS effect"), false);  }
/*     */        }
/* 135 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).showvhs = true;
/* 136 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 141 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 142 */           _player.m_5661_((Component)Component.m_237113_("Enabled VHS effect"), false);  }
/*     */        }
/* 144 */      if (guistate.containsKey("checkbox:checkbox7") && ((Checkbox)guistate.get("checkbox:checkbox7")).m_93840_())
/* 145 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).cancorrupted = false;
/* 146 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 151 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 152 */           _player.m_5661_((Component)Component.m_237113_("Safe mode enabled"), false);  }
/*     */        }
/* 154 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).cancorrupted = true;
/* 155 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 160 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 161 */           _player.m_5661_((Component)Component.m_237113_("Safe mode disabled"), false);  }
/*     */        }
/* 163 */      if (guistate.containsKey("checkbox:checkbox8") && ((Checkbox)guistate.get("checkbox:checkbox8")).m_93840_())
/* 164 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).config_noblockbreaking = true;
/* 165 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 170 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 171 */           _player.m_5661_((Component)Component.m_237113_("Entities can't break blocks now"), false);  }
/*     */        }
/* 173 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).config_noblockbreaking = false;
/* 174 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 179 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 180 */           _player.m_5661_((Component)Component.m_237113_("Entities can break blocks now"), false);  }
/*     */        }
/* 182 */      if (guistate.containsKey("checkbox:checkbox9") && ((Checkbox)guistate.get("checkbox:checkbox9")).m_93840_())
/* 183 */     { (ThebrokenscriptModVariables.MapVariables.get(world)).config_nobaseexplode = true;
/* 184 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 189 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 190 */           _player.m_5661_((Component)Component.m_237113_("Removed null exploding player's base event"), false);  }
/*     */        }
/* 192 */     else { (ThebrokenscriptModVariables.MapVariables.get(world)).config_nobaseexplode = false;
/* 193 */       ThebrokenscriptModVariables.MapVariables.get(world).syncData(world);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 198 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _player = (Player)entity1; if (!_player.m_9236_().m_5776_())
/* 199 */           _player.m_5661_((Component)Component.m_237113_("Enabled null exploding player's base event"), false);  }
/*     */        }
/* 201 */      if (entity instanceof Player) { Player _player = (Player)entity;
/* 202 */       _player.m_6915_(); }
/* 203 */      if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 204 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @p \"Saved\""); }
/*     */     
/* 206 */     if (world instanceof Level) { Level _level = (Level)world;
/* 207 */       if (!_level.m_5776_()) {
/* 208 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */       } else {
/* 210 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */       }  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\ConfigSaveProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */