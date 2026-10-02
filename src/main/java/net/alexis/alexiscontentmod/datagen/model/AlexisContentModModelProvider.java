package net.alexis.alexiscontentmod.datagen.model;

import net.alexis.alexiscontentmod.index.AlexisContentModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Blocks;

public class AlexisContentModModelProvider extends FabricModelProvider {
    public AlexisContentModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.family(Blocks.CALCITE)
                // .stairs(AlexisContentModBlocks.CALCITE_STAIR)
                .slab(AlexisContentModBlocks.CALCITE_SLAB)
                .wall(AlexisContentModBlocks.CALCITE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "AlexisContentModModelProvider";
    }
}
