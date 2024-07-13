package gay.frot;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TotemImpactFrames implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("totem-impact-frames");
	public static final String MOD_ID = "totem-impact-frames";

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized.");
	}
}