package net.alexis.alexiscontentmod.index;

import net.alexis.alexiscontentmod.AlexisContentMod;
import net.alexis.alexiscontentmod.blocks.WheyProtienBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;


public class AlexisContentModBlocks {
    public static Block WHEYPROTIEN = register("wheyprotien", settings -> new WheyProtienBlock(settings
            .sound(SoundType.COPPER)
            ), Rarity.COMMON
    );


    // Calcite Blocks
    /*
    public static Block CALCITE_STAIRS = register("calcite_stairs", settings -> new StairBlock(settings
            ), Rarity.COMMON
    );
     */

    public static Block CALCITE_SLAB = register("calcite_slab", settings -> new SlabBlock(settings
                .mapColor(MapColor.TERRACOTTA_WHITE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .sound(SoundType.CALCITE)
                .requiresCorrectToolForDrops()
                .strength(0.75F)
            ), Rarity.COMMON
    );

    public static Block CALCITE_WALL = register("calcite_wall", settings -> new WallBlock(settings
                .mapColor(MapColor.TERRACOTTA_WHITE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .sound(SoundType.CALCITE)
                .requiresCorrectToolForDrops()
                .strength(0.75F)
            ), Rarity.COMMON
    );


    // code made by HollowedWander on GitHub with their permission to be used. Their modrinth -> https://modrinth.com/user/Hollowed
    static Block register(String id, Function<BlockBehaviour.Properties, Block> factory, Rarity rarity) {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, AlexisContentMod.id(id));
        Block block = factory.apply(BlockBehaviour.Properties.of().setId(key));
        registerBlockItem(id, block, rarity);
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block, Rarity rarity) {
        Registry.register(BuiltInRegistries.ITEM, AlexisContentMod.id(name),
                new BlockItem(block, new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, AlexisContentMod.id(name)))
                        .useBlockDescriptionPrefix()
                        .rarity(rarity)
                ));
    }

    // my code
    public static void init(){}
}
