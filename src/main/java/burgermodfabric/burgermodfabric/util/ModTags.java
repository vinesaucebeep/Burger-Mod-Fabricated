package burgermodfabric.burgermodfabric.util;

import burgermodfabric.burgermodfabric.BurgerModFabric;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> BEEF_BURGERS = createCommonTag("beef_burgers");
        public static final TagKey<Item> BURGERS = createCommonTag("burgers");
        public static final TagKey<Item> CHAMPIGNON_BURGERS = createCommonTag("champignon_burgers");
        public static final TagKey<Item> CHEESE_BURGERS = createCommonTag("cheese_burgers");
        public static final TagKey<Item> CHICKEN_BURGERS = createTag("chicken_burgers");
        public static final TagKey<Item> COD_BURGERS = createCommonTag("cod_burgers");
        public static final TagKey<Item> EGG_BURGERS = createCommonTag("egg_burgers");
        public static final TagKey<Item> GOLDEN_BURGERS = createCommonTag("golden_burgers");
        public static final TagKey<Item> MUTTON_BURGERS = createTag("mutton_burgers");
        public static final TagKey<Item> PORK_BURGERS = createCommonTag("pork_burgers");
        public static final TagKey<Item> SALMON_BURGERS = createCommonTag("salmon_burgers");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(BurgerModFabric.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}

