/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.entity.BlockEntityType;
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
/*    */ 
/*    */ 
/*    */ public class ThebrokenscriptModBlockEntities
/*    */ {
/* 19 */   public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "thebrokenscript");
/* 20 */   public static final RegistryObject<BlockEntityType<?>> CONSOLE = register("console", ThebrokenscriptModBlocks.CONSOLE, net.mcreator.interpritation.block.entity.ConsoleBlockEntity::new);
/* 21 */   public static final RegistryObject<BlockEntityType<?>> WHITE = register("white", ThebrokenscriptModBlocks.WHITE, net.mcreator.interpritation.block.entity.WhiteBlockEntity::new);
/*    */ 
/*    */ 
/*    */   
/*    */   private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
/* 26 */     return REGISTRY.register(registryname, () -> BlockEntityType.Builder.m_155273_(supplier, new Block[] { (Block)block.get() }).m_58966_(null));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModBlockEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */