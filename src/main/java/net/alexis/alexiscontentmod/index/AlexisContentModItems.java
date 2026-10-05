package net.alexis.alexiscontentmod.index;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;

public class AlexisContentModItems {
    public static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(AlexisContentModItems::addBuilding);
    }

    private static void addBuilding(FabricCreativeModeTabOutput output) {
        output.insertAfter(Blocks.POLISHED_DIORITE_SLAB,
                Blocks.CALCITE,
                AlexisContentModBlocks.CALCITE_STAIR,
                AlexisContentModBlocks.CALCITE_SLAB,
                AlexisContentModBlocks.CALCITE_WALL,
                AlexisContentModBlocks.POLISHED_CALCITE,
                AlexisContentModBlocks.POLISHED_CALCITE_STAIR,
                AlexisContentModBlocks.POLISHED_CALCITE_SLAB,
                AlexisContentModBlocks.POLISHED_CALCITE_WALL
        );
    }
}
