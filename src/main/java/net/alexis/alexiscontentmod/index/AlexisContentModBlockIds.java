package net.alexis.alexiscontentmod.index;

import net.alexis.alexiscontentmod.AlexisContentMod;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;

public class AlexisContentModBlockIds {
    // plush
    public static final BlockItemId ALEXIS_PLUSH = create("alexis_plush");

    // rest of it
    public static final BlockItemId OAK_BRANCH = create("oak_branch");

    public static final BlockItemId CALCITE_STAIR = create("calcite_stair");
    public static final BlockItemId CALCITE_SLAB = create("calcite_slab");
    public static final BlockItemId CALCITE_WALL = create("calcite_wall");

    public static final BlockItemId POLISHED_CALCITE = create("polished_calcite");
    public static final BlockItemId POLISHED_CALCITE_STAIR = create("polished_calcite_stair");
    public static final BlockItemId POLISHED_CALCITE_SLAB = create("polished_calcite_slab");
    public static final BlockItemId POLISHED_CALCITE_WALL = create("polished_calcite_wall");

    private static BlockItemId create(String name) {
        Identifier id = AlexisContentMod.id(name);
        return BlockItemId.create(id, id);
    }
}
