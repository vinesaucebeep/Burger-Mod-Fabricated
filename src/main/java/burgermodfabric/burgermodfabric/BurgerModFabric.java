package burgermodfabric.burgermodfabric;

import burgermodfabric.burgermodfabric.item.ItemInit;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BurgerModFabric implements ModInitializer {

    public static final String MOD_ID = "burgermod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ItemInit.registerModItems();


    }
}
