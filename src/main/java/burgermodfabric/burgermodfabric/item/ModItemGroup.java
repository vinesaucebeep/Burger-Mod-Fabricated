package burgermodfabric.burgermodfabric.item;

import burgermodfabric.burgermodfabric.BurgerModFabric;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup BURGERMOD_TAB = FabricItemGroupBuilder.build(new Identifier(BurgerModFabric.MOD_ID, "beef_burger"),
            () -> new ItemStack(ItemInit.BEEF_BURGER));

}

