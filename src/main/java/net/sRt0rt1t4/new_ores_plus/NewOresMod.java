package net.sRt0rt1t4.new_ores_plus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewOresMod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("new_ores_plus");

	@Override
	public void onInitialize() {
		LOGGER.info("New Ores+ says hi!");
	}
}
