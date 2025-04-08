package net.petrus.mccourse.screen;

import net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.petrus.mccourse.item.ModItems;

import java.util.Set;

public class KaupenFurnaceRecipeBookComponent extends AbstractFurnaceRecipeBookScreen {
    @Override
    protected Set<Item> getAllowedFuels() {
        return Set.of(ModItems.PEAT_BRICK, ModItems.DICE, Items.BLAZE_POWDER);
    }
}
