package net.alexis.alexiscontentmod.blocks;

import net.alexis.alexiscontentmod.index.AlexisContentModBlockEntityType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class PlushBlockEntity extends BlockEntity {
    public PlushBlockEntity(BlockPos pos, BlockState state) {
        super(AlexisContentModBlockEntityType.PLUSH_BLOCK_ENTITY, pos, state);
    }
}
