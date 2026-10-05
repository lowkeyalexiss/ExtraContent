package net.alexis.alexiscontentmod.datagen;

import net.alexis.alexiscontentmod.datagen.lang.AlexisContentModEnglishLangProvider;
import net.alexis.alexiscontentmod.datagen.model.AlexisContentModModelProvider;
import net.alexis.alexiscontentmod.datagen.tag.AlexisContentModBlockTagProvider;
import net.alexis.alexiscontentmod.datagen.tag.AlexisContentModItemTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AlexisContentModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(AlexisContentModModelProvider::new);
		pack.addProvider(AlexisContentModEnglishLangProvider::new);
		pack.addProvider(AlexisContentModItemTagProvider::new);
		pack.addProvider(AlexisContentModBlockTagProvider::new);
	}
}
