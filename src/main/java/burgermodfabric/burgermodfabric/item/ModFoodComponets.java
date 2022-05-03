package burgermodfabric.burgermodfabric.item;

import burgermodfabric.burgermodfabric.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import org.apache.commons.lang3.function.FailableObjDoubleConsumer;

public class ModFoodComponets {

    public static final FoodComponent BURGER_TIER_1 = new FoodComponent.Builder().hunger(10).meat().saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_2 = new FoodComponent.Builder().hunger(8).meat().saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_3 = new FoodComponent.Builder().hunger(8).meat().saturationModifier(0.8f).build();
    public static final FoodComponent BURGER_TIER_4 = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_5 = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build();

    public static final FoodComponent RAW_EGG_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(ModEffects.RAW_SCRAMBLED_EGG_EFFECTS, 200, 0), 1.0f).build();
    public static final FoodComponent FRIED_EGG_FOOD = new FoodComponent.Builder().hunger(2).meat().saturationModifier(0.6f).build();

    public static final FoodComponent RAW_CHAMPIGNONS_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(ModEffects.RAW_CHAMPIGNONS_EFFECTS, 600, 1), 1.0f).build();
    public static final FoodComponent INGREDIENT_FOOD = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build();

    public static final FoodComponent FRIES_FOOD = new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build();
    public static final FoodComponent BERRY_TART_FOOD = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build();
    public static final FoodComponent HOTDOG_FOOD = new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).meat().build();
    public static final FoodComponent NUGGET_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).meat().build();

}
