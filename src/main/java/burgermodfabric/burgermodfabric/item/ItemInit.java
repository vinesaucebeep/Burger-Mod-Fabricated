package burgermodfabric.burgermodfabric.item;

import burgermodfabric.burgermodfabric.BurgerModFabric;
import burgermodfabric.burgermodfabric.item.custom.EnchantedBurgerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;


public class ItemInit {





    public static final Item BEEF_BURGER = registerItem("beef_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item PORK_BURGER = registerItem("pork_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item MUTTON_BURGER = registerItem("mutton_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_2)));
    public static final Item CHICKEN_BURGER = registerItem("chicken_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_3)));

    public static final Item SALMON_BURGER = registerItem("salmon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_4)));
    public static final Item COD_BURGER = registerItem("cod_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_5)));

    public static final Item BEEF_CHEESE_BURGER = registerItem("beef_cheese_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item PORK_CHEESE_BURGER = registerItem("pork_cheese_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item MUTTON_CHEESE_BURGER = registerItem("mutton_cheese_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_2)));
    public static final Item CHICKEN_CHEESE_BURGER = registerItem("chicken_cheese_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_3)));

    public static final Item SALMON_CHEESE_BURGER = registerItem("salmon_cheese_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_4)));
    public static final Item COD_CHEESE_BURGER = registerItem("cod_cheese_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_5)));

    public static final Item BEEF_CHAMPIGNON_BURGER = registerItem("beef_champignon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item PORK_CHAMPIGNON_BURGER = registerItem("pork_champignon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_1)));
    public static final Item MUTTON_CHAMPIGNON_BURGER = registerItem("mutton_champignon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_2)));
    public static final Item CHICKEN_CHAMPIGNON_BURGER = registerItem("chicken_champignon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_3)));

    public static final Item SALMON_CHAMPIGNON_BURGER = registerItem("salmon_champignon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_4)));
    public static final Item COD_CHAMPIGNON_BURGER = registerItem("cod_champignon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BURGER_TIER_5)));

    public static final Item GOLDEN_BEEF_BURGER = registerItem("golden_beef_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.GOLDEN_BURGER_TIER_1).rarity(Rarity.RARE)));
    public static final Item GOLDEN_PORK_BURGER = registerItem("golden_pork_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.GOLDEN_BURGER_TIER_1).rarity(Rarity.RARE)));
    public static final Item GOLDEN_MUTTON_BURGER = registerItem("golden_mutton_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.GOLDEN_BURGER_TIER_2).rarity(Rarity.RARE)));
    public static final Item GOLDEN_CHICKEN_BURGER = registerItem("golden_chicken_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.GOLDEN_BURGER_TIER_3).rarity(Rarity.RARE)));
    public static final Item GOLDEN_SALMON_BURGER = registerItem("golden_salmon_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.GOLDEN_BURGER_TIER_2).rarity(Rarity.RARE)));
    public static final Item GOLDEN_COD_BURGER = registerItem("golden_cod_burger", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.GOLDEN_BURGER_TIER_4).rarity(Rarity.RARE)));

    public static final Item ENCHANTED_GOLDEN_BURGER = registerItem("enchanted_golden_burger", new EnchantedBurgerItem(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.ENCHANTED_GOLDEN_BURGER).rarity(Rarity.EPIC)));

    public static final Item SCRAMBLED_EGG = registerItem("scrambled_egg", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.RAW_EGG_FOOD)));
    public static final Item FRIED_SCRAMBLED_EGG = registerItem("fried_scrambled_egg", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.FRIED_EGG_FOOD)));

    public static final Item RAW_CHAMPIGNONS = registerItem("raw_champignons", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.RAW_CHAMPIGNONS_FOOD)));
    public static final Item COOKED_CHAMPIGNONS = registerItem("cooked_champignons", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.INGREDIENT_FOOD)));

    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.INGREDIENT_FOOD)));
    public static final Item COOKED_CHICKEN_NUGGET = registerItem("cooked_chicken_nugget", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.NUGGET_FOOD)));
    public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.FRIES_FOOD)));
    public static final Item HOTDOG = registerItem("hotdog", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.HOTDOG_FOOD)));
    public static final Item SWEET_BERRY_TART = registerItem("sweet_berry_tart", new Item(new FabricItemSettings().group(ModItemGroup.BURGERMOD_TAB).food(ModFoodComponets.BERRY_TART_FOOD)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BurgerModFabric.MOD_ID, name), item);

    }



    public static void registerModItems() {
        BurgerModFabric.LOGGER.info("registering Mod Items for " + BurgerModFabric.MOD_ID);
    }


}

