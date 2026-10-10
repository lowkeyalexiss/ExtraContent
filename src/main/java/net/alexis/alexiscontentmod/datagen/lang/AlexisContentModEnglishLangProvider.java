package net.alexis.alexiscontentmod.datagen.lang;

import net.alexis.alexiscontentmod.index.AlexisContentModBlocks;
import net.alexis.alexiscontentmod.index.AlexisContentModSounds;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class AlexisContentModEnglishLangProvider extends FabricLanguageProvider {
    public AlexisContentModEnglishLangProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {
        //translationBuilder.add("blocks.alexis_plush.gleep", "Plushie Gleeps");

        translationBuilder.add(AlexisContentModBlocks.CALCITE_STAIR, "Calcite Stair");
        translationBuilder.add(AlexisContentModBlocks.CALCITE_SLAB, "Calcite Slab");
        translationBuilder.add(AlexisContentModBlocks.CALCITE_WALL, "Calcite Wall");

        translationBuilder.add(AlexisContentModBlocks.POLISHED_CALCITE, "Polished Calcite");
        translationBuilder.add(AlexisContentModBlocks.POLISHED_CALCITE_STAIR, "Polished Calcite Stair");
        translationBuilder.add(AlexisContentModBlocks.POLISHED_CALCITE_SLAB, "Polished Calcite Slab");
        translationBuilder.add(AlexisContentModBlocks.POLISHED_CALCITE_WALL, "Polished Calcite Wall");

    }
}
