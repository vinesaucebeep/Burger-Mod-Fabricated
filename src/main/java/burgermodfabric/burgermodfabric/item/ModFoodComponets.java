package burgermodfabric.burgermodfabric.item;

import burgermodfabric.burgermodfabric.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponets {

    public static final FoodComponent BURGER_TIER_1 = new FoodComponent.Builder().hunger(10).meat().saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_2 = new FoodComponent.Builder().hunger(8).meat().saturationModifier(1.0f).build();
    public static final FoodComponent BURGER_TIER_3 = new FoodComponent.Builder().hunger(8).meat().saturationModifier(0.8f).build();

    public static final FoodComponent RAW_EGG_FOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(ModEffects.RAW_SCRAMBLED_EGG_EFFECTS, 200, 0), 1.0f).build();
    public static final FoodComponent FRIED_EGG_FOOD = new FoodComponent.Builder().hunger(2).meat().saturationModifier(0.6f).build();

}
