package net.alexis.alexiscontentmod.index;

import net.alexis.alexiscontentmod.AlexisContentMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class AlexisContentModSounds {
    public static final SoundEvent BLOCK_ALEXIS_PLUSH_GLEEP = registerSound("gleep");

    // actual registration of all the custom SoundEvents
    private static SoundEvent registerSound(String id) {
        Identifier identifier = AlexisContentMod.id(id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }

    public static void init() {
        AlexisContentMod.LOGGER.info("Registering " + AlexisContentMod.MOD_ID + " Sounds");
    }
}
