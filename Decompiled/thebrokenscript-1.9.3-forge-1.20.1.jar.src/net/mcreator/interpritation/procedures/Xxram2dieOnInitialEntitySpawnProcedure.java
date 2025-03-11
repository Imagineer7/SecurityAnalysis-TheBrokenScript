/*     */ package net.mcreator.interpritation.procedures;
/*     */ 
/*     */ import net.mcreator.interpritation.ThebrokenscriptMod;
/*     */ import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class Xxram2dieOnInitialEntitySpawnProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  23 */     if (entity == null)
/*     */       return; 
/*  25 */     if ((ThebrokenscriptModVariables.MapVariables.get(world)).ram2dietriggered == true) {
/*  26 */       if (!(ThebrokenscriptModVariables.MapVariables.get(world)).ram2diejoined) {
/*  27 */         if (world.m_46861_(BlockPos.m_274561_(x, y, z))) {
/*  28 */           ThebrokenscriptMod.queueServerWork(1, () -> {
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel _level = (ServerLevel)world;
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
/*     */                   _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "tellraw @a [{\"text\":\"\"},{\"text\":\"Local game hosted on port [\"},{\"text\":\"00000\",\"color\":\"green\"},{\"text\":\"]\",\"color\":\"white\"}]");
/*     */                 } 
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
/*     */                 ThebrokenscriptMod.queueServerWork(500, ());
/*     */               });
/* 122 */         } else if (!entity.m_9236_().m_5776_()) {
/* 123 */           entity.m_146870_();
/*     */         }
/*     */       
/* 126 */       } else if (!entity.m_9236_().m_5776_()) {
/* 127 */         entity.m_146870_();
/*     */       }
/*     */     
/* 130 */     } else if (!entity.m_9236_().m_5776_()) {
/* 131 */       entity.m_146870_();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\Xxram2dieOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */