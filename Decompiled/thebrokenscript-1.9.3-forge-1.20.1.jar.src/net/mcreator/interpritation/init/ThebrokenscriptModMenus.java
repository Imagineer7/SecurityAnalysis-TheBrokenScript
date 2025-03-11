/*    */ package net.mcreator.interpritation.init;
/*    */ 
/*    */ import net.mcreator.interpritation.world.inventory.ConfigMenu;
/*    */ import net.mcreator.interpritation.world.inventory.DevPassMenu;
/*    */ import net.mcreator.interpritation.world.inventory.NullInterface2Menu;
/*    */ import net.mcreator.interpritation.world.inventory.NulledGuiMenu;
/*    */ import net.mcreator.interpritation.world.inventory.Nullinterface3Menu;
/*    */ import net.mcreator.interpritation.world.inventory.NullinterfaceMenu;
/*    */ import net.mcreator.interpritation.world.inventory.PcGuiMenu;
/*    */ import net.mcreator.interpritation.world.inventory.TabMenu;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.minecraftforge.common.extensions.IForgeMenuType;
/*    */ import net.minecraftforge.network.IContainerFactory;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ThebrokenscriptModMenus
/*    */ {
/* 25 */   public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, "thebrokenscript");
/* 26 */   public static final RegistryObject<MenuType<NullinterfaceMenu>> NULLINTERFACE = REGISTRY.register("nullinterface", () -> IForgeMenuType.create(NullinterfaceMenu::new));
/* 27 */   public static final RegistryObject<MenuType<NullInterface2Menu>> NULL_INTERFACE_2 = REGISTRY.register("null_interface_2", () -> IForgeMenuType.create(NullInterface2Menu::new));
/* 28 */   public static final RegistryObject<MenuType<Nullinterface3Menu>> NULLINTERFACE_3 = REGISTRY.register("nullinterface_3", () -> IForgeMenuType.create(Nullinterface3Menu::new));
/* 29 */   public static final RegistryObject<MenuType<NulledGuiMenu>> NULLED_GUI = REGISTRY.register("nulled_gui", () -> IForgeMenuType.create(NulledGuiMenu::new));
/* 30 */   public static final RegistryObject<MenuType<TabMenu>> TAB = REGISTRY.register("tab", () -> IForgeMenuType.create(TabMenu::new));
/* 31 */   public static final RegistryObject<MenuType<PcGuiMenu>> PC_GUI = REGISTRY.register("pc_gui", () -> IForgeMenuType.create(PcGuiMenu::new));
/* 32 */   public static final RegistryObject<MenuType<ConfigMenu>> CONFIG = REGISTRY.register("config", () -> IForgeMenuType.create(ConfigMenu::new));
/* 33 */   public static final RegistryObject<MenuType<DevPassMenu>> DEV_PASS = REGISTRY.register("dev_pass", () -> IForgeMenuType.create(DevPassMenu::new));
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\init\ThebrokenscriptModMenus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */