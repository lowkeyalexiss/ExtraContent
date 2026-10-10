package net.alexis.alexiscontentmod.index;

import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Blocks;

public class AlexisContentModBlockFamilies {
    public static final BlockFamily CALCITE_FAMILY = BlockFamilies.familyBuilder(Blocks.CALCITE)
            .slab(AlexisContentModBlocks.CALCITE_SLAB)
            .stairs(AlexisContentModBlocks.CALCITE_STAIR)
            .wall(AlexisContentModBlocks.CALCITE_WALL)
            .getFamily();

    public static final BlockFamily POLISHED_CALCITE_FAMILY = BlockFamilies.familyBuilder(AlexisContentModBlocks.POLISHED_CALCITE)
            .slab(AlexisContentModBlocks.POLISHED_CALCITE_SLAB)
            .stairs(AlexisContentModBlocks.POLISHED_CALCITE_STAIR)
            .wall(AlexisContentModBlocks.POLISHED_CALCITE_WALL)
            .getFamily();
}
