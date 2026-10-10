package net.alexis.alexiscontentmod.datagen.recipe;

import net.alexis.alexiscontentmod.index.AlexisContentModBlockIds;
import net.alexis.alexiscontentmod.index.AlexisContentModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class AlexisContentModRecipeProvider extends FabricRecipeProvider {
    public AlexisContentModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                generateRecipes(AlexisContentModBlockIds.CALCITE_FAMILY, FeatureFlagSet.of(FeatureFlags.VANILLA));
                generateRecipes(AlexisContentModBlockIds.POLISHED_CALCITE_FAMILY, FeatureFlagSet.of(FeatureFlags.VANILLA));

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AlexisContentModBlocks.CALCITE_STAIR, Items.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AlexisContentModBlocks.CALCITE_SLAB, Items.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AlexisContentModBlocks.CALCITE_WALL, Items.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AlexisContentModBlocks.POLISHED_CALCITE, Items.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AlexisContentModBlocks.POLISHED_CALCITE_STAIR, AlexisContentModBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AlexisContentModBlocks.POLISHED_CALCITE_SLAB, AlexisContentModBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AlexisContentModBlocks.POLISHED_CALCITE_WALL, AlexisContentModBlocks.POLISHED_CALCITE);
            }
        };
    }

    @Override
    public String getName() {
        return "AlexisContentModRecipeProvider";
    }
}
