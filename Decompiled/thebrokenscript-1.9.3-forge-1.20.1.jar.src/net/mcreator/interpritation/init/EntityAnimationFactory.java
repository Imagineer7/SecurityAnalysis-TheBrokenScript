/*     */ package net.mcreator.interpritation.init;
/*     */ 
/*     */ import net.mcreator.interpritation.entity.CircuitEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftFleeEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftStareEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitMineshaftWalkEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitStalkEntity;
/*     */ import net.mcreator.interpritation.entity.CircuitStareEntity;
/*     */ import net.mcreator.interpritation.entity.CurvedEntity;
/*     */ import net.mcreator.interpritation.entity.FollowEntity;
/*     */ import net.mcreator.interpritation.entity.HeEntity;
/*     */ import net.mcreator.interpritation.entity.HetzerEntity;
/*     */ import net.mcreator.interpritation.entity.IntegrityBossfightEntity;
/*     */ import net.mcreator.interpritation.entity.IntegrityEntity;
/*     */ import net.mcreator.interpritation.entity.MazeChaserEntity;
/*     */ import net.mcreator.interpritation.entity.MissileEntity;
/*     */ import net.mcreator.interpritation.entity.NothingiswatchingEntity;
/*     */ import net.mcreator.interpritation.entity.NothingiswatchingchaseEntity;
/*     */ import net.mcreator.interpritation.entity.SiluetChaseEntity;
/*     */ import net.mcreator.interpritation.entity.SiluetEntity;
/*     */ import net.mcreator.interpritation.entity.SiluetStareEntity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndEntity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndOverhaulStalkEntity;
/*     */ import net.mcreator.interpritation.entity.TheBrokenEndStalkkEntity;
/*     */ import net.mcreator.interpritation.entity.TheObliterationEntity;
/*     */ import net.mcreator.interpritation.entity.Xxram2dieEntity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraftforge.event.entity.living.LivingEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class EntityAnimationFactory {
/*     */   @SubscribeEvent
/*     */   public static void onEntityTick(LivingEvent.LivingTickEvent event) {
/*  36 */     if (event != null && event.getEntity() != null) {
/*  37 */       LivingEntity livingEntity = event.getEntity(); if (livingEntity instanceof SiluetEntity) { SiluetEntity syncable = (SiluetEntity)livingEntity;
/*  38 */         String animation = syncable.getSyncedAnimation();
/*  39 */         if (!animation.equals("undefined")) {
/*  40 */           syncable.setAnimation("undefined");
/*  41 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  44 */       livingEntity = event.getEntity(); if (livingEntity instanceof SiluetChaseEntity) { SiluetChaseEntity syncable = (SiluetChaseEntity)livingEntity;
/*  45 */         String animation = syncable.getSyncedAnimation();
/*  46 */         if (!animation.equals("undefined")) {
/*  47 */           syncable.setAnimation("undefined");
/*  48 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  51 */       livingEntity = event.getEntity(); if (livingEntity instanceof NothingiswatchingEntity) { NothingiswatchingEntity syncable = (NothingiswatchingEntity)livingEntity;
/*  52 */         String animation = syncable.getSyncedAnimation();
/*  53 */         if (!animation.equals("undefined")) {
/*  54 */           syncable.setAnimation("undefined");
/*  55 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  58 */       livingEntity = event.getEntity(); if (livingEntity instanceof NothingiswatchingchaseEntity) { NothingiswatchingchaseEntity syncable = (NothingiswatchingchaseEntity)livingEntity;
/*  59 */         String animation = syncable.getSyncedAnimation();
/*  60 */         if (!animation.equals("undefined")) {
/*  61 */           syncable.setAnimation("undefined");
/*  62 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  65 */       livingEntity = event.getEntity(); if (livingEntity instanceof FollowEntity) { FollowEntity syncable = (FollowEntity)livingEntity;
/*  66 */         String animation = syncable.getSyncedAnimation();
/*  67 */         if (!animation.equals("undefined")) {
/*  68 */           syncable.setAnimation("undefined");
/*  69 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  72 */       livingEntity = event.getEntity(); if (livingEntity instanceof SiluetStareEntity) { SiluetStareEntity syncable = (SiluetStareEntity)livingEntity;
/*  73 */         String animation = syncable.getSyncedAnimation();
/*  74 */         if (!animation.equals("undefined")) {
/*  75 */           syncable.setAnimation("undefined");
/*  76 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  79 */       livingEntity = event.getEntity(); if (livingEntity instanceof HeEntity) { HeEntity syncable = (HeEntity)livingEntity;
/*  80 */         String animation = syncable.getSyncedAnimation();
/*  81 */         if (!animation.equals("undefined")) {
/*  82 */           syncable.setAnimation("undefined");
/*  83 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  86 */       livingEntity = event.getEntity(); if (livingEntity instanceof MazeChaserEntity) { MazeChaserEntity syncable = (MazeChaserEntity)livingEntity;
/*  87 */         String animation = syncable.getSyncedAnimation();
/*  88 */         if (!animation.equals("undefined")) {
/*  89 */           syncable.setAnimation("undefined");
/*  90 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/*  93 */       livingEntity = event.getEntity(); if (livingEntity instanceof CircuitStalkEntity) { CircuitStalkEntity syncable = (CircuitStalkEntity)livingEntity;
/*  94 */         String animation = syncable.getSyncedAnimation();
/*  95 */         if (!animation.equals("undefined")) {
/*  96 */           syncable.setAnimation("undefined");
/*  97 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 100 */       livingEntity = event.getEntity(); if (livingEntity instanceof CircuitStareEntity) { CircuitStareEntity syncable = (CircuitStareEntity)livingEntity;
/* 101 */         String animation = syncable.getSyncedAnimation();
/* 102 */         if (!animation.equals("undefined")) {
/* 103 */           syncable.setAnimation("undefined");
/* 104 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 107 */       livingEntity = event.getEntity(); if (livingEntity instanceof TheBrokenEndEntity) { TheBrokenEndEntity syncable = (TheBrokenEndEntity)livingEntity;
/* 108 */         String animation = syncable.getSyncedAnimation();
/* 109 */         if (!animation.equals("undefined")) {
/* 110 */           syncable.setAnimation("undefined");
/* 111 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 114 */       livingEntity = event.getEntity(); if (livingEntity instanceof TheObliterationEntity) { TheObliterationEntity syncable = (TheObliterationEntity)livingEntity;
/* 115 */         String animation = syncable.getSyncedAnimation();
/* 116 */         if (!animation.equals("undefined")) {
/* 117 */           syncable.setAnimation("undefined");
/* 118 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 121 */       livingEntity = event.getEntity(); if (livingEntity instanceof TheBrokenEndStalkkEntity) { TheBrokenEndStalkkEntity syncable = (TheBrokenEndStalkkEntity)livingEntity;
/* 122 */         String animation = syncable.getSyncedAnimation();
/* 123 */         if (!animation.equals("undefined")) {
/* 124 */           syncable.setAnimation("undefined");
/* 125 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 128 */       livingEntity = event.getEntity(); if (livingEntity instanceof Xxram2dieEntity) { Xxram2dieEntity syncable = (Xxram2dieEntity)livingEntity;
/* 129 */         String animation = syncable.getSyncedAnimation();
/* 130 */         if (!animation.equals("undefined")) {
/* 131 */           syncable.setAnimation("undefined");
/* 132 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 135 */       livingEntity = event.getEntity(); if (livingEntity instanceof CircuitMineshaftStareEntity) { CircuitMineshaftStareEntity syncable = (CircuitMineshaftStareEntity)livingEntity;
/* 136 */         String animation = syncable.getSyncedAnimation();
/* 137 */         if (!animation.equals("undefined")) {
/* 138 */           syncable.setAnimation("undefined");
/* 139 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 142 */       livingEntity = event.getEntity(); if (livingEntity instanceof IntegrityEntity) { IntegrityEntity syncable = (IntegrityEntity)livingEntity;
/* 143 */         String animation = syncable.getSyncedAnimation();
/* 144 */         if (!animation.equals("undefined")) {
/* 145 */           syncable.setAnimation("undefined");
/* 146 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 149 */       livingEntity = event.getEntity(); if (livingEntity instanceof MissileEntity) { MissileEntity syncable = (MissileEntity)livingEntity;
/* 150 */         String animation = syncable.getSyncedAnimation();
/* 151 */         if (!animation.equals("undefined")) {
/* 152 */           syncable.setAnimation("undefined");
/* 153 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 156 */       livingEntity = event.getEntity(); if (livingEntity instanceof IntegrityBossfightEntity) { IntegrityBossfightEntity syncable = (IntegrityBossfightEntity)livingEntity;
/* 157 */         String animation = syncable.getSyncedAnimation();
/* 158 */         if (!animation.equals("undefined")) {
/* 159 */           syncable.setAnimation("undefined");
/* 160 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 163 */       livingEntity = event.getEntity(); if (livingEntity instanceof TheBrokenEndOverhaulStalkEntity) { TheBrokenEndOverhaulStalkEntity syncable = (TheBrokenEndOverhaulStalkEntity)livingEntity;
/* 164 */         String animation = syncable.getSyncedAnimation();
/* 165 */         if (!animation.equals("undefined")) {
/* 166 */           syncable.setAnimation("undefined");
/* 167 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 170 */       livingEntity = event.getEntity(); if (livingEntity instanceof CircuitMineshaftWalkEntity) { CircuitMineshaftWalkEntity syncable = (CircuitMineshaftWalkEntity)livingEntity;
/* 171 */         String animation = syncable.getSyncedAnimation();
/* 172 */         if (!animation.equals("undefined")) {
/* 173 */           syncable.setAnimation("undefined");
/* 174 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 177 */       livingEntity = event.getEntity(); if (livingEntity instanceof CircuitMineshaftFleeEntity) { CircuitMineshaftFleeEntity syncable = (CircuitMineshaftFleeEntity)livingEntity;
/* 178 */         String animation = syncable.getSyncedAnimation();
/* 179 */         if (!animation.equals("undefined")) {
/* 180 */           syncable.setAnimation("undefined");
/* 181 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 184 */       livingEntity = event.getEntity(); if (livingEntity instanceof HetzerEntity) { HetzerEntity syncable = (HetzerEntity)livingEntity;
/* 185 */         String animation = syncable.getSyncedAnimation();
/* 186 */         if (!animation.equals("undefined")) {
/* 187 */           syncable.setAnimation("undefined");
/* 188 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 191 */       livingEntity = event.getEntity(); if (livingEntity instanceof CurvedEntity) { CurvedEntity syncable = (CurvedEntity)livingEntity;
/* 192 */         String animation = syncable.getSyncedAnimation();
/* 193 */         if (!animation.equals("undefined")) {
/* 194 */           syncable.setAnimation("undefined");
/* 195 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */       
/* 198 */       livingEntity = event.getEntity(); if (livingEntity instanceof CircuitEntity) { CircuitEntity syncable = (CircuitEntity)livingEntity;
/* 199 */         String animation = syncable.getSyncedAnimation();
/* 200 */         if (!animation.equals("undefined")) {
/* 201 */           syncable.setAnimation("undefined");
/* 202 */           syncable.animationprocedure = animation;
/*     */         }  }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\EntityAnimationFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */