/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.item.GoreItem;
/*    */ import net.mcreator.interpritation.item.NItem;
/*    */ import net.mcreator.interpritation.item.Record14Item;
/*    */ import net.mcreator.interpritation.item.Record15Item;
/*    */ import net.mcreator.interpritation.item.Record16Item;
/*    */ import net.minecraft.world.item.BlockItem;
/*    */ import net.minecraft.world.item.DoubleHighBlockItem;
/*    */ import net.minecraft.world.item.Item;
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
/*    */ public class ThebrokenscriptModItems
/*    */ {
/* 24 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "thebrokenscript");
/* 25 */   public static final RegistryObject<Item> N = REGISTRY.register("n", () -> new NItem());
/* 26 */   public static final RegistryObject<Item> ALL_DEAD = block(ThebrokenscriptModBlocks.ALL_DEAD);
/* 27 */   public static final RegistryObject<Item> OLDBLOCK = block(ThebrokenscriptModBlocks.OLDBLOCK);
/* 28 */   public static final RegistryObject<Item> HELLO = block(ThebrokenscriptModBlocks.HELLO);
/* 29 */   public static final RegistryObject<Item> EMPTY = block(ThebrokenscriptModBlocks.EMPTY);
/* 30 */   public static final RegistryObject<Item> IT = block(ThebrokenscriptModBlocks.IT);
/* 31 */   public static final RegistryObject<Item> HELLISH_GENERATOR = block(ThebrokenscriptModBlocks.HELLISH_GENERATOR);
/* 32 */   public static final RegistryObject<Item> EXIT = block(ThebrokenscriptModBlocks.EXIT);
/* 33 */   public static final RegistryObject<Item> CLANBUILD_ANOMALY_GENERATOR = block(ThebrokenscriptModBlocks.CLANBUILD_ANOMALY_GENERATOR);
/* 34 */   public static final RegistryObject<Item> RECORD_14 = REGISTRY.register("record_14", () -> new Record14Item());
/* 35 */   public static final RegistryObject<Item> DISRUPTION = block(ThebrokenscriptModBlocks.DISRUPTION);
/* 36 */   public static final RegistryObject<Item> PROTECTED_VOID = block(ThebrokenscriptModBlocks.PROTECTED_VOID);
/* 37 */   public static final RegistryObject<Item> PROTECTED_VOID_STAIRS = block(ThebrokenscriptModBlocks.PROTECTED_VOID_STAIRS);
/* 38 */   public static final RegistryObject<Item> PROTECTED_VOID_SLAB = block(ThebrokenscriptModBlocks.PROTECTED_VOID_SLAB);
/* 39 */   public static final RegistryObject<Item> VOID_DOOR = doubleBlock(ThebrokenscriptModBlocks.VOID_DOOR);
/* 40 */   public static final RegistryObject<Item> RECORD_15 = REGISTRY.register("record_15", () -> new Record15Item());
/* 41 */   public static final RegistryObject<Item> PROTECTED_VOID_LIGHT = block(ThebrokenscriptModBlocks.PROTECTED_VOID_LIGHT);
/* 42 */   public static final RegistryObject<Item> CONSOLE = block(ThebrokenscriptModBlocks.CONSOLE);
/* 43 */   public static final RegistryObject<Item> GORE = REGISTRY.register("gore", () -> new GoreItem());
/* 44 */   public static final RegistryObject<Item> FIELD_GENERATOR = block(ThebrokenscriptModBlocks.FIELD_GENERATOR);
/* 45 */   public static final RegistryObject<Item> PHYSICAL_STACKTRACE = block(ThebrokenscriptModBlocks.PHYSICAL_STACKTRACE);
/* 46 */   public static final RegistryObject<Item> RECORD_16 = REGISTRY.register("record_16", () -> new Record16Item());
/* 47 */   public static final RegistryObject<Item> OBSIDIAN = block(ThebrokenscriptModBlocks.OBSIDIAN);
/* 48 */   public static final RegistryObject<Item> WHITE = block(ThebrokenscriptModBlocks.WHITE);
/* 49 */   public static final RegistryObject<Item> VOIDEXP_GENERATOR = block(ThebrokenscriptModBlocks.VOIDEXP_GENERATOR);
/* 50 */   public static final RegistryObject<Item> BLOCK_IS_MISSING_ID = block(ThebrokenscriptModBlocks.BLOCK_IS_MISSING_ID);
/* 51 */   public static final RegistryObject<Item> R_3 = block(ThebrokenscriptModBlocks.R_3);
/* 52 */   public static final RegistryObject<Item> INT = block(ThebrokenscriptModBlocks.INT);
/* 53 */   public static final RegistryObject<Item> SHADOW_BUG = block(ThebrokenscriptModBlocks.SHADOW_BUG);
/*    */ 
/*    */ 
/*    */   
/*    */   private static RegistryObject<Item> block(RegistryObject<Block> block) {
/* 58 */     return REGISTRY.register(block.getId().m_135815_(), () -> new BlockItem((Block)block.get(), new Item.Properties()));
/*    */   }
/*    */   
/*    */   private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
/* 62 */     return REGISTRY.register(block.getId().m_135815_(), () -> new DoubleHighBlockItem((Block)block.get(), new Item.Properties()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */