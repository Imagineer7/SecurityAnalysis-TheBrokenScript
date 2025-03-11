/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ThebrokenscriptModParticleTypes
/*    */ {
/* 17 */   public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, "thebrokenscript");
/* 18 */   public static final RegistryObject<SimpleParticleType> NULL_PARTICLE = REGISTRY.register("null_particle", () -> new SimpleParticleType(true));
/* 19 */   public static final RegistryObject<SimpleParticleType> EYES = REGISTRY.register("eyes", () -> new SimpleParticleType(true));
/* 20 */   public static final RegistryObject<SimpleParticleType> WRETCHED_PARTICLE = REGISTRY.register("wretched_particle", () -> new SimpleParticleType(false));
/* 21 */   public static final RegistryObject<SimpleParticleType> PARTICLE_OF_CURVED = REGISTRY.register("particle_of_curved", () -> new SimpleParticleType(true));
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModParticleTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */