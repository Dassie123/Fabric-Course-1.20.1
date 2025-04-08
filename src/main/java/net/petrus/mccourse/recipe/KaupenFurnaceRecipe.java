package net.petrus.mccourse.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.text.Text;

public class KaupenFurnaceRecipe extends AbstractCookingRecipe {
    public KaupenFurnaceRecipe(String group, CookingRecipeCategory category, Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
        super(Type.INSTANCE, group, category, ingredient, result, experience, cookingTime);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    public static class Type implements RecipeType<KaupenFurnaceRecipe> {
        public static final Type INSTANCE = new Type();
    }

    public static class Serializer {
        public static final RecipeSerializer<KaupenFurnaceRecipe> INSTANCE = new CookingRecipeSerializer<>(KaupenFurnaceRecipe::new, 50);
    }
}
