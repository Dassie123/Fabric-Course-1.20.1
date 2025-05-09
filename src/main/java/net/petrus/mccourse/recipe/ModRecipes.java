package net.petrus.mccourse.recipe;

import net.petrus.mccourse.MCCourseMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MCCourseMod.MOD_ID, GemEmpoweringRecipe.Serializer.ID),
                GemEmpoweringRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(MCCourseMod.MOD_ID, GemEmpoweringRecipe.Type.ID),
                GemEmpoweringRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MCCourseMod.MOD_ID, "kaupen_furnace"),
                KaupenFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(MCCourseMod.MOD_ID, "kaupen_furnace"),
                KaupenFurnaceRecipe.Type.INSTANCE);

    }
}
