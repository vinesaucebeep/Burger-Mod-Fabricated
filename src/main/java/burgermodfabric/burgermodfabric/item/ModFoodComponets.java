package burgermodfabric.burgermodfabric.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponets {

    public static final FoodComponent BURGER_TIER_1 = new FoodComponent.Builder().hunger(10).meat().saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_2 = new FoodComponent.Builder().hunger(8).meat().saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_3 = new FoodComponent.Builder().hunger(8).meat().saturationModifier(0.8f).build();
    public static final FoodComponent BURGER_TIER_4 = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_5 = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build();

    public static final FoodComponent GOLDEN_BURGER_TIER_1 = new FoodComponent.Builder().hunger(10).saturationModifier(1.4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0f).statusEffect
            (new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_BURGER_TIER_2 = new FoodComponent.Builder().hunger(9).saturationModifier(1.4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0f).statusEffect
            (new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_BURGER_TIER_3 = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0f).statusEffect
            (new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_BURGER_TIER_4 = new FoodComponent.Builder().hunger(7).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0f).statusEffect
            (new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent RAW_EGG_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 1.0f).build();
    public static final FoodComponent FRIED_EGG_FOOD = new FoodComponent.Builder().hunger(2).meat().saturationModifier(0.6f).build();

    public static final FoodComponent RAW_CHAMPIGNONS_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 1), 1.0f).build();
    public static final FoodComponent INGREDIENT_FOOD = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build();

    public static final FoodComponent FRIES_FOOD = new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build();
    public static final FoodComponent BERRY_TART_FOOD = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build();
    public static final FoodComponent HOTDOG_FOOD = new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).meat().build();
    public static final FoodComponent NUGGET_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).meat().build();

    public static final FoodComponent ENCHANTED_GOLDEN_BURGER = new FoodComponent.Builder().hunger(8).saturationModifier(1.8f).
            statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 5000, 0), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5000, 0), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1600, 3), 1.0f).build();

}
