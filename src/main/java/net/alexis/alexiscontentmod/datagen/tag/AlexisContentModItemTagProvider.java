package net.alexis.alexiscontentmod.datagen.tag;

import net.alexis.alexiscontentmod.index.AlexisContentModBlockIds;
import net.alexis.alexiscontentmod.index.AlexisContentModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class AlexisContentModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public AlexisContentModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        builder(ItemTags.WALLS)
                .add(AlexisContentModBlockIds.POLISHED_CALCITE_WALL)
                .add(AlexisContentModBlockIds.CALCITE_WALL);
    }
}
