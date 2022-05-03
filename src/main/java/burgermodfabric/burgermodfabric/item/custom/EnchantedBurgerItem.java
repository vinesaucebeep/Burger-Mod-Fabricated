package burgermodfabric.burgermodfabric.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class EnchantedBurgerItem extends Item {
    public EnchantedBurgerItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack itemStack) {
        return true;
    }
}
