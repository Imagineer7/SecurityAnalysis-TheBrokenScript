/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraftforge.event.entity.EntityJoinLevelEvent;
/*     */ import net.minecraftforge.eventbus.api.Event;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class DespawnBatsProcedure
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onEntitySpawned(EntityJoinLevelEvent event) {
/*  36 */     execute((Event)event, event.getEntity());
/*     */   }
/*     */   
/*     */   public static void execute(Entity entity) {
/*  40 */     execute(null, entity);
/*     */   }
/*     */   
/*     */   private static void execute(@Nullable Event event, Entity entity) {
/*  44 */     if (entity == null)
/*     */       return; 
/*  46 */     if (entity instanceof net.minecraft.world.entity.ambient.Bat) {
/*  47 */       if (event != null && event.isCancelable()) {
/*  48 */         event.setCanceled(true);
/*  49 */       } else if (event != null && event.hasResult()) {
/*  50 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/*  53 */     if (entity instanceof net.minecraft.world.entity.monster.Drowned) {
/*  54 */       if (event != null && event.isCancelable()) {
/*  55 */         event.setCanceled(true);
/*  56 */       } else if (event != null && event.hasResult()) {
/*  57 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/*  60 */     if (entity instanceof net.minecraft.world.entity.GlowSquid) {
/*  61 */       if (event != null && event.isCancelable()) {
/*  62 */         event.setCanceled(true);
/*  63 */       } else if (event != null && event.hasResult()) {
/*  64 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/*  67 */     if (entity instanceof net.minecraft.world.entity.monster.Phantom) {
/*  68 */       if (event != null && event.isCancelable()) {
/*  69 */         event.setCanceled(true);
/*  70 */       } else if (event != null && event.hasResult()) {
/*  71 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/*  74 */     if (entity instanceof net.minecraft.world.entity.animal.Bee) {
/*  75 */       if (event != null && event.isCancelable()) {
/*  76 */         event.setCanceled(true);
/*  77 */       } else if (event != null && event.hasResult()) {
/*  78 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/*  81 */     if (entity instanceof net.minecraft.world.entity.animal.allay.Allay) {
/*  82 */       if (event != null && event.isCancelable()) {
/*  83 */         event.setCanceled(true);
/*  84 */       } else if (event != null && event.hasResult()) {
/*  85 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/*  88 */     if (entity instanceof net.minecraft.world.entity.animal.Fox) {
/*  89 */       if (event != null && event.isCancelable()) {
/*  90 */         event.setCanceled(true);
/*  91 */       } else if (event != null && event.hasResult()) {
/*  92 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/*  95 */     if (entity instanceof net.minecraft.world.entity.animal.Cat) {
/*  96 */       if (event != null && event.isCancelable()) {
/*  97 */         event.setCanceled(true);
/*  98 */       } else if (event != null && event.hasResult()) {
/*  99 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 102 */     if (entity instanceof net.minecraft.world.entity.animal.goat.Goat) {
/* 103 */       if (event != null && event.isCancelable()) {
/* 104 */         event.setCanceled(true);
/* 105 */       } else if (event != null && event.hasResult()) {
/* 106 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 109 */     if (entity instanceof net.minecraft.world.entity.animal.TropicalFish) {
/* 110 */       if (event != null && event.isCancelable()) {
/* 111 */         event.setCanceled(true);
/* 112 */       } else if (event != null && event.hasResult()) {
/* 113 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 116 */     if (entity instanceof net.minecraft.world.entity.animal.Panda) {
/* 117 */       if (event != null && event.isCancelable()) {
/* 118 */         event.setCanceled(true);
/* 119 */       } else if (event != null && event.hasResult()) {
/* 120 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 123 */     if (entity instanceof net.minecraft.world.entity.animal.Pufferfish) {
/* 124 */       if (event != null && event.isCancelable()) {
/* 125 */         event.setCanceled(true);
/* 126 */       } else if (event != null && event.hasResult()) {
/* 127 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 130 */     if (entity instanceof net.minecraft.world.entity.animal.Dolphin) {
/* 131 */       if (event != null && event.isCancelable()) {
/* 132 */         event.setCanceled(true);
/* 133 */       } else if (event != null && event.hasResult()) {
/* 134 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 137 */     if (entity instanceof net.minecraft.world.entity.animal.horse.TraderLlama) {
/* 138 */       if (event != null && event.isCancelable()) {
/* 139 */         event.setCanceled(true);
/* 140 */       } else if (event != null && event.hasResult()) {
/* 141 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 144 */     if (entity instanceof net.minecraft.world.entity.npc.WanderingTrader) {
/* 145 */       if (event != null && event.isCancelable()) {
/* 146 */         event.setCanceled(true);
/* 147 */       } else if (event != null && event.hasResult()) {
/* 148 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 151 */     if (entity instanceof net.minecraft.world.entity.animal.Turtle) {
/* 152 */       if (event != null && event.isCancelable()) {
/* 153 */         event.setCanceled(true);
/* 154 */       } else if (event != null && event.hasResult()) {
/* 155 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 158 */     if (entity instanceof net.minecraft.world.entity.monster.hoglin.Hoglin) {
/* 159 */       if (event != null && event.isCancelable()) {
/* 160 */         event.setCanceled(true);
/* 161 */       } else if (event != null && event.hasResult()) {
/* 162 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 165 */     if (entity instanceof net.minecraft.world.entity.monster.piglin.Piglin) {
/* 166 */       if (event != null && event.isCancelable()) {
/* 167 */         event.setCanceled(true);
/* 168 */       } else if (event != null && event.hasResult()) {
/* 169 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 172 */     if (entity instanceof net.minecraft.world.entity.monster.piglin.PiglinBrute) {
/* 173 */       if (event != null && event.isCancelable()) {
/* 174 */         event.setCanceled(true);
/* 175 */       } else if (event != null && event.hasResult()) {
/* 176 */         event.setResult(Event.Result.DENY);
/*     */       } 
/*     */     }
/* 179 */     if (entity instanceof net.minecraft.world.entity.animal.sniffer.Sniffer)
/* 180 */       if (event != null && event.isCancelable()) {
/* 181 */         event.setCanceled(true);
/* 182 */       } else if (event != null && event.hasResult()) {
/* 183 */         event.setResult(Event.Result.DENY);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\DespawnBatsProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */