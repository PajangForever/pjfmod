package name.pjfmod;

import name.pjfmod.zhucexiangmu.FangKuaiZhuCe;
import name.pjfmod.zhucexiangmu.WuPinZuZhuCe;
import name.pjfmod.zhucexiangmu.WuPinZhuCe;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pjfmod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "pjfmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("pjfmod");
	public static final RegistryKey<PlacedFeature> SLIVER_ORE_PLACED_KEY =
			RegistryKey.of(
					RegistryKeys.PLACED_FEATURE,
					new Identifier("pjfmod","ore_sliver"));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Pajang! It's Fabric world!");
		WuPinZuZhuCe.registerModItemGroup();
		WuPinZhuCe.registerModItems();
		FangKuaiZhuCe.registerModBlocks();
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Feature.UNDERGROUND_ORES,
				SLIVER_ORE_PLACED_KEY);
	}
}













