package net.sRt0rt1t4.new_ores_plus;

import net.fabricmc.api.ModInitializer;
import net.sRt0rt1t4.new_ores_plus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class newOresMod implements ModInitializer {
	public static final String MOD_ID = "new_ores_plus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("New Ores+ says hi!");
		ModItems.registerModItems();
	}
}
