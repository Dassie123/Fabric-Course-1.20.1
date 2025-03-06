package net.petrus.mccourse;

import net.fabricmc.api.ModInitializer;

import net.petrus.mccourse.block.ModBlocks;
import net.petrus.mccourse.block.entity.ModBlockEntities;
import net.petrus.mccourse.effect.ModEffects;
import net.petrus.mccourse.enchantment.ModEnchantments;
import net.petrus.mccourse.entity.ModBoats;
import net.petrus.mccourse.entity.ModEntities;
import net.petrus.mccourse.fluid.ModFluids;
import net.petrus.mccourse.item.ModItemGroup;
import net.petrus.mccourse.item.ModItems;
import net.petrus.mccourse.painting.ModPaintings;
import net.petrus.mccourse.particle.ModParticles;
import net.petrus.mccourse.potion.ModPotions;
import net.petrus.mccourse.recipe.ModRecipes;
import net.petrus.mccourse.screen.ModScreenHandlers;
import net.petrus.mccourse.sound.ModSounds;
import net.petrus.mccourse.util.ModLootTableModifiers;
import net.petrus.mccourse.util.ModRegistries;
import net.petrus.mccourse.villager.ModVillagers;
import net.petrus.mccourse.world.gen.ModWorldGeneration;
import net.petrus.mccourse.world.tree.ModFoliagePlacerTypes;
import net.petrus.mccourse.world.tree.ModTrunkPlacerTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModEnchantments.registerModEnchantments();

		ModSounds.registerSounds();

		ModLootTableModifiers.modifyLootTables();

		ModPaintings.registerPaintings();

		ModEffects.registerEffects();

		ModPotions.registerPotions();

		ModParticles.registerParticles();

		ModVillagers.registerVillagers();

		ModFluids.registerFluids();

		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerScreenHandler();

		ModRecipes.registerRecipes();

		ModWorldGeneration.generateModWorldGeneration();

		ModEntities.registerModEntities();

		ModTrunkPlacerTypes.register();

		ModFoliagePlacerTypes.register();

		ModBoats.registerBoats();

	}
}