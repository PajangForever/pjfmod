package name.pjfmod.caoZuo;

import name.pjfmod.Pjfmod;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

import static name.pjfmod.zhuCeXiangMu.DiWuZhuCe.SLIVER_ORE_PLACED_KEY;

public class TianJiaDiWu {
    public static void addOres(){
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                SLIVER_ORE_PLACED_KEY);
    }
    public static void tianJiaSuoYouiDiWu(){
        addOres();
        Pjfmod.LOGGER.debug("Pajang said that adding mod feature for "+Pjfmod.MOD_ID);
    }
}
