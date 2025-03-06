package net.petrus.mccourse.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.petrus.mccourse.MCCourseMod;
import net.petrus.mccourse.block.ModBlocks;
import net.petrus.mccourse.item.ModItems;

public class ModBoats {
    public static final Identifier DRIFTWOOD_BOAT_ID = new Identifier(MCCourseMod.MOD_ID, "driftwood_boat");
    public static final Identifier DRIFTWOOD_CHEST_BOAT_ID = new Identifier(MCCourseMod.MOD_ID, "driftwood_chest_boat");

    public static final RegistryKey<TerraformBoatType> DRIFTWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(DRIFTWOOD_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType driftwoodBoat = new TerraformBoatType.Builder()
                .item(ModItems.DRIFTWOOD_BOAT)
                .chestItem(ModItems.DRIFTWOOD_CHEST_BOAT)
                .planks(ModBlocks.DRIFTWOOD_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, DRIFTWOOD_BOAT_KEY, driftwoodBoat);
    }

}
