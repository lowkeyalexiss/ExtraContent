package net.alexis.alexiscontentmod.blocks;

import net.alexis.alexiscontentmod.index.AlexisContentModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WheyProtienEntity extends BlockEntity {
    public WheyProtienEntity(BlockPos pos, BlockState state) {
        super(AlexisContentModBlockEntities.WHEY_PROTIEN_ENTITY, pos, state);
    }
}
