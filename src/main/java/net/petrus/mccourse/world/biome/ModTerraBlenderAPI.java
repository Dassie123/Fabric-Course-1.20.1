package net.petrus.mccourse.world.biome;

import net.minecraft.util.Identifier;
import net.petrus.mccourse.MCCourseMod;
import net.petrus.mccourse.world.biome.surface.ModMaterialRules;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(MCCourseMod.MOD_ID, "overworld"), 4)); // Dont make height too high bc it will interfere with other mods' biomes and replace vanilla biomes all the time

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MCCourseMod.MOD_ID, ModMaterialRules.makeRules());
    }
}
