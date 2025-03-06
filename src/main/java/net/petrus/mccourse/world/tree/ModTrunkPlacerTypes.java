package net.petrus.mccourse.world.tree;

import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.petrus.mccourse.MCCourseMod;
import net.petrus.mccourse.mixin.TrunkPlacerTypeInvoker;
import net.petrus.mccourse.world.tree.custom.DriftwoodTrunkPlacer;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> DRIFTWOOD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("driftwood_trunk_placer",
            DriftwoodTrunkPlacer.CODEC);

    public static void register() {
        MCCourseMod.LOGGER.info("Registering Trunk Placer for " + MCCourseMod.MOD_ID);
    }
}
