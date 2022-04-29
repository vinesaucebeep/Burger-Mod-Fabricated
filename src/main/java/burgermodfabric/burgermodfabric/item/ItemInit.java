package burgermodfabric.burgermodfabric.item;

import burgermodfabric.burgermodfabric.BurgerModFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static final Item BEEF_BURGER = registerItem("beef_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item PORK_BURGER = registerItem("pork_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item MUTTON_BURGER = registerItem("mutton_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_2)));
    public static final Item CHICKEN_BURGER = registerItem("chicken_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_3)));

    public static final Item SCRAMBLED_EGG = registerItem("scrambled_egg", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.RAW_EGG_FOOD)));
    public static final Item FRIED_SCRAMBLED_EGG = registerItem("fried_scrambled_egg", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food()))


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BurgerModFabric.MOD_ID, name), item);
    }


    public static void registerModItems() {
        BurgerModFabric.LOGGER.info("Registering Mod Items for " + BurgerModFabric.MOD_ID);
    }
}
