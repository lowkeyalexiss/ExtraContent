package net.alexis.alexiscontentmod.index;

import net.alexis.alexiscontentmod.blocks.PlushBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;


public class AlexisContentModBlocks {
    public static final Block ALEXIS_PLUSH = register(
            AlexisContentModBlockIds.ALEXIS_PLUSH,
            PlushBlock::new,
            BlockBehaviour.Properties.of().noOcclusion()
    );

    // Calcite Blocks

    public static final Block CALCITE_STAIR = register(
            AlexisContentModBlockIds.CALCITE_STAIR,
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties), ofFullCopy(Blocks.CALCITE)
    );

    public static final Block CALCITE_SLAB = register(
            AlexisContentModBlockIds.CALCITE_SLAB,
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
    );

    public static final Block CALCITE_WALL = register(
            AlexisContentModBlockIds.CALCITE_WALL,
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).forceSolidOn()
    );

    // polished calcite

    public static final Block POLISHED_CALCITE = register(
            AlexisContentModBlockIds.POLISHED_CALCITE,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
    );

    public static final Block POLISHED_CALCITE_STAIR = register(
            AlexisContentModBlockIds.POLISHED_CALCITE_STAIR,
            properties -> new StairBlock(POLISHED_CALCITE.defaultBlockState(), properties), ofFullCopy(POLISHED_CALCITE)
    );

    public static final Block POLISHED_CALCITE_SLAB = register(
            AlexisContentModBlockIds.POLISHED_CALCITE_SLAB,
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE)
    );

    public static final Block POLISHED_CALCITE_WALL = register(
            AlexisContentModBlockIds.POLISHED_CALCITE_WALL,
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE).forceSolidOn()
    );


    // register
    private static Block register(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        // Create the block instance
        Block block = blockFactory.apply(properties.setId(id));

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    public static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        // Create the block instance
        Block block = register(id.block(), blockFactory, properties);

        // Create the block item instance
        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
        Registry.register(BuiltInRegistries.ITEM, id.item(), blockItem);

        return block;
    }


    public static void init(){}
}
