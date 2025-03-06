package net.petrus.mccourse.world.tree;

import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.petrus.mccourse.MCCourseMod;
import net.petrus.mccourse.mixin.FoliagePlacerTypeInvoker;
import net.petrus.mccourse.world.tree.custom.DriftwoodFoliagePlacer;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> DRIFTWOOD_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister(
            "driftwood_foliage_placer", DriftwoodFoliagePlacer.CODEC);

    public static void register() {
        MCCourseMod.LOGGER.info("Registering the Foliage Placer for " + MCCourseMod.MOD_ID);
    }
}
