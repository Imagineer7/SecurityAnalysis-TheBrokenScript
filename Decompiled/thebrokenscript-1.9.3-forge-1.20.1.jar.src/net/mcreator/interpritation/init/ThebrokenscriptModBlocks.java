/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.block.AllDeadBlock;
/*    */ import net.mcreator.interpritation.block.BlockIsMissingIdBlock;
/*    */ import net.mcreator.interpritation.block.ClanbuildAnomalyGeneratorBlock;
/*    */ import net.mcreator.interpritation.block.ConsoleBlock;
/*    */ import net.mcreator.interpritation.block.DisruptionBlock;
/*    */ import net.mcreator.interpritation.block.EmptyBlock;
/*    */ import net.mcreator.interpritation.block.ExitBlock;
/*    */ import net.mcreator.interpritation.block.FieldGeneratorBlock;
/*    */ import net.mcreator.interpritation.block.HellishGeneratorBlock;
/*    */ import net.mcreator.interpritation.block.HelloBlock;
/*    */ import net.mcreator.interpritation.block.IntBlock;
/*    */ import net.mcreator.interpritation.block.ItBlock;
/*    */ import net.mcreator.interpritation.block.ObsidianBlock;
/*    */ import net.mcreator.interpritation.block.OldblockBlock;
/*    */ import net.mcreator.interpritation.block.PhysicalStacktraceBlock;
/*    */ import net.mcreator.interpritation.block.ProtectedVoidBlock;
/*    */ import net.mcreator.interpritation.block.ProtectedVoidLightBlock;
/*    */ import net.mcreator.interpritation.block.ProtectedVoidSlabBlock;
/*    */ import net.mcreator.interpritation.block.ProtectedVoidStairsBlock;
/*    */ import net.mcreator.interpritation.block.R3Block;
/*    */ import net.mcreator.interpritation.block.ShadowBugBlock;
/*    */ import net.mcreator.interpritation.block.VoidDoorBlock;
/*    */ import net.mcreator.interpritation.block.VoidexpGeneratorBlock;
/*    */ import net.mcreator.interpritation.block.WhiteBlock;
/*    */ import net.minecraft.world.level.block.Block;
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
/*    */ public class ThebrokenscriptModBlocks
/*    */ {
/* 40 */   public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "thebrokenscript");
/* 41 */   public static final RegistryObject<Block> ALL_DEAD = REGISTRY.register("all_dead", () -> new AllDeadBlock());
/* 42 */   public static final RegistryObject<Block> OLDBLOCK = REGISTRY.register("oldblock", () -> new OldblockBlock());
/* 43 */   public static final RegistryObject<Block> HELLO = REGISTRY.register("hello", () -> new HelloBlock());
/* 44 */   public static final RegistryObject<Block> EMPTY = REGISTRY.register("empty", () -> new EmptyBlock());
/* 45 */   public static final RegistryObject<Block> IT = REGISTRY.register("it", () -> new ItBlock());
/* 46 */   public static final RegistryObject<Block> HELLISH_GENERATOR = REGISTRY.register("hellish_generator", () -> new HellishGeneratorBlock());
/* 47 */   public static final RegistryObject<Block> EXIT = REGISTRY.register("exit", () -> new ExitBlock());
/* 48 */   public static final RegistryObject<Block> CLANBUILD_ANOMALY_GENERATOR = REGISTRY.register("clanbuild_anomaly_generator", () -> new ClanbuildAnomalyGeneratorBlock());
/* 49 */   public static final RegistryObject<Block> DISRUPTION = REGISTRY.register("disruption", () -> new DisruptionBlock());
/* 50 */   public static final RegistryObject<Block> PROTECTED_VOID = REGISTRY.register("protected_void", () -> new ProtectedVoidBlock());
/* 51 */   public static final RegistryObject<Block> PROTECTED_VOID_STAIRS = REGISTRY.register("protected_void_stairs", () -> new ProtectedVoidStairsBlock());
/* 52 */   public static final RegistryObject<Block> PROTECTED_VOID_SLAB = REGISTRY.register("protected_void_slab", () -> new ProtectedVoidSlabBlock());
/* 53 */   public static final RegistryObject<Block> VOID_DOOR = REGISTRY.register("void_door", () -> new VoidDoorBlock());
/* 54 */   public static final RegistryObject<Block> PROTECTED_VOID_LIGHT = REGISTRY.register("protected_void_light", () -> new ProtectedVoidLightBlock());
/* 55 */   public static final RegistryObject<Block> CONSOLE = REGISTRY.register("console", () -> new ConsoleBlock());
/* 56 */   public static final RegistryObject<Block> FIELD_GENERATOR = REGISTRY.register("field_generator", () -> new FieldGeneratorBlock());
/* 57 */   public static final RegistryObject<Block> PHYSICAL_STACKTRACE = REGISTRY.register("physical_stacktrace", () -> new PhysicalStacktraceBlock());
/* 58 */   public static final RegistryObject<Block> OBSIDIAN = REGISTRY.register("obsidian", () -> new ObsidianBlock());
/* 59 */   public static final RegistryObject<Block> WHITE = REGISTRY.register("white", () -> new WhiteBlock());
/* 60 */   public static final RegistryObject<Block> VOIDEXP_GENERATOR = REGISTRY.register("voidexp_generator", () -> new VoidexpGeneratorBlock());
/* 61 */   public static final RegistryObject<Block> BLOCK_IS_MISSING_ID = REGISTRY.register("block_is_missing_id", () -> new BlockIsMissingIdBlock());
/* 62 */   public static final RegistryObject<Block> R_3 = REGISTRY.register("r_3", () -> new R3Block());
/* 63 */   public static final RegistryObject<Block> INT = REGISTRY.register("int", () -> new IntBlock());
/* 64 */   public static final RegistryObject<Block> SHADOW_BUG = REGISTRY.register("shadow_bug", () -> new ShadowBugBlock());
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModBlocks.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */