package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ModInitializer;
import net.joltthewolf.cobblemonarmory.registry.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonArmory implements ModInitializer {
	public static final String MOD_ID = "cobblemonarmory";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ItemRegistry.init();
        ArmorRegistry.init();
        ItemGroupRegistry.init();
        LootInjectorRegistry.init();
        RightClickEntityRegistry.init();
        ComponentRegistry.init();
	}
}