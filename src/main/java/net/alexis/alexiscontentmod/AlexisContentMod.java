package net.alexis.alexiscontentmod;

import net.alexis.alexiscontentmod.index.AlexisContentModBlockEntities;
import net.alexis.alexiscontentmod.index.AlexisContentModBlocks;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlexisContentMod implements ModInitializer {
	public static final String MOD_ID = "alexiscontentmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AlexisContentModBlocks.init();
		AlexisContentModBlockEntities.init();

		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
