/*    */ package net.mcreator.interpritation.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class TheGrimLimitProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
/* 27 */     if (event.getHand() != event.getEntity().m_7655_())
/*    */       return; 
/* 29 */     execute((Event)event, (LevelAccessor)event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), (Entity)event.getEntity());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 33 */     execute(null, world, x, y, z, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload #8
/*    */     //   2: ifnonnull -> 6
/*    */     //   5: return
/*    */     //   6: iconst_0
/*    */     //   7: istore #9
/*    */     //   9: dconst_0
/*    */     //   10: dstore #10
/*    */     //   12: dconst_0
/*    */     //   13: dstore #12
/*    */     //   15: dconst_0
/*    */     //   16: dstore #14
/*    */     //   18: aload #8
/*    */     //   20: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #8
/*    */     //   28: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   31: astore #16
/*    */     //   33: aload #16
/*    */     //   35: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   38: goto -> 44
/*    */     //   41: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   44: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   47: getstatic net/minecraft/world/item/Items.f_42710_ : Lnet/minecraft/world/item/Item;
/*    */     //   50: if_acmpeq -> 88
/*    */     //   53: aload #8
/*    */     //   55: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   58: ifeq -> 76
/*    */     //   61: aload #8
/*    */     //   63: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   66: astore #17
/*    */     //   68: aload #17
/*    */     //   70: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   73: goto -> 79
/*    */     //   76: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   79: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   82: getstatic net/minecraft/world/item/Items.f_42752_ : Lnet/minecraft/world/item/Item;
/*    */     //   85: if_acmpne -> 274
/*    */     //   88: ldc2_w -3.0
/*    */     //   91: dstore #10
/*    */     //   93: iconst_0
/*    */     //   94: istore #9
/*    */     //   96: iconst_0
/*    */     //   97: istore #18
/*    */     //   99: iload #18
/*    */     //   101: bipush #6
/*    */     //   103: if_icmpge -> 207
/*    */     //   106: ldc2_w -3.0
/*    */     //   109: dstore #12
/*    */     //   111: iconst_0
/*    */     //   112: istore #19
/*    */     //   114: iload #19
/*    */     //   116: bipush #6
/*    */     //   118: if_icmpge -> 195
/*    */     //   121: ldc2_w -3.0
/*    */     //   124: dstore #14
/*    */     //   126: iconst_0
/*    */     //   127: istore #20
/*    */     //   129: iload #20
/*    */     //   131: bipush #6
/*    */     //   133: if_icmpge -> 183
/*    */     //   136: aload_1
/*    */     //   137: dload_2
/*    */     //   138: dload #10
/*    */     //   140: dadd
/*    */     //   141: dload #4
/*    */     //   143: dload #12
/*    */     //   145: dadd
/*    */     //   146: dload #6
/*    */     //   148: dload #14
/*    */     //   150: dadd
/*    */     //   151: invokestatic m_274561_ : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   154: invokeinterface m_8055_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   159: invokevirtual m_60734_ : ()Lnet/minecraft/world/level/block/Block;
/*    */     //   162: getstatic net/minecraft/world/level/block/Blocks.f_50131_ : Lnet/minecraft/world/level/block/Block;
/*    */     //   165: if_acmpne -> 171
/*    */     //   168: iconst_1
/*    */     //   169: istore #9
/*    */     //   171: dload #14
/*    */     //   173: dconst_1
/*    */     //   174: dadd
/*    */     //   175: dstore #14
/*    */     //   177: iinc #20, 1
/*    */     //   180: goto -> 129
/*    */     //   183: dload #12
/*    */     //   185: dconst_1
/*    */     //   186: dadd
/*    */     //   187: dstore #12
/*    */     //   189: iinc #19, 1
/*    */     //   192: goto -> 114
/*    */     //   195: dload #10
/*    */     //   197: dconst_1
/*    */     //   198: dadd
/*    */     //   199: dstore #10
/*    */     //   201: iinc #18, 1
/*    */     //   204: goto -> 99
/*    */     //   207: iload #9
/*    */     //   209: iconst_1
/*    */     //   210: if_icmpne -> 274
/*    */     //   213: aload_1
/*    */     //   214: invokestatic get : (Lnet/minecraft/world/level/LevelAccessor;)Lnet/mcreator/interpritation/network/ThebrokenscriptModVariables$MapVariables;
/*    */     //   217: iconst_1
/*    */     //   218: putfield disc13or11played : Z
/*    */     //   221: aload_1
/*    */     //   222: invokestatic get : (Lnet/minecraft/world/level/LevelAccessor;)Lnet/mcreator/interpritation/network/ThebrokenscriptModVariables$MapVariables;
/*    */     //   225: aload_1
/*    */     //   226: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   229: aload_1
/*    */     //   230: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   233: ifeq -> 274
/*    */     //   236: aload_1
/*    */     //   237: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   240: astore #18
/*    */     //   242: aload #18
/*    */     //   244: getstatic net/mcreator/interpritation/init/ThebrokenscriptModParticleTypes.NULL_PARTICLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   247: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   250: checkcast net/minecraft/core/particles/SimpleParticleType
/*    */     //   253: dload_2
/*    */     //   254: dload #4
/*    */     //   256: dload #6
/*    */     //   258: bipush #40
/*    */     //   260: ldc2_w 3.0
/*    */     //   263: ldc2_w 3.0
/*    */     //   266: ldc2_w 3.0
/*    */     //   269: dconst_0
/*    */     //   270: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   273: pop
/*    */     //   274: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 0
/*    */     //   #38	-> 5
/*    */     //   #39	-> 6
/*    */     //   #40	-> 9
/*    */     //   #41	-> 12
/*    */     //   #42	-> 15
/*    */     //   #43	-> 18
/*    */     //   #44	-> 53
/*    */     //   #45	-> 88
/*    */     //   #46	-> 93
/*    */     //   #47	-> 96
/*    */     //   #48	-> 106
/*    */     //   #49	-> 111
/*    */     //   #50	-> 121
/*    */     //   #51	-> 126
/*    */     //   #52	-> 136
/*    */     //   #53	-> 168
/*    */     //   #55	-> 171
/*    */     //   #51	-> 177
/*    */     //   #57	-> 183
/*    */     //   #49	-> 189
/*    */     //   #59	-> 195
/*    */     //   #47	-> 201
/*    */     //   #61	-> 207
/*    */     //   #62	-> 213
/*    */     //   #63	-> 221
/*    */     //   #64	-> 229
/*    */     //   #65	-> 242
/*    */     //   #68	-> 274
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   33	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   68	8	17	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   129	54	20	index2	I
/*    */     //   114	81	19	index1	I
/*    */     //   99	108	18	index0	I
/*    */     //   242	32	18	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   0	275	0	event	Lnet/minecraftforge/eventbus/api/Event;
/*    */     //   0	275	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	275	2	x	D
/*    */     //   0	275	4	y	D
/*    */     //   0	275	6	z	D
/*    */     //   0	275	8	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   9	266	9	found	Z
/*    */     //   12	263	10	sx	D
/*    */     //   15	260	12	sy	D
/*    */     //   18	257	14	sz	D
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\procedures\TheGrimLimitProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */