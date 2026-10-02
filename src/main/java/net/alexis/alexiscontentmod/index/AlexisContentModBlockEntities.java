package net.alexis.alexiscontentmod.index;

import net.alexis.alexiscontentmod.AlexisContentMod;
import net.alexis.alexiscontentmod.blocks.WheyProtienBlock;
import net.alexis.alexiscontentmod.blocks.WheyProtienEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class AlexisContentModBlockEntities {
    public static final BlockEntityType<WheyProtienEntity> WHEY_PROTIEN_ENTITY =
            register("wheyprotien", WheyProtienEntity::new,AlexisContentModBlocks.WHEYPROTIEN);

    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = AlexisContentMod.id(name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }

    public static void init() {
    }
}
