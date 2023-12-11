package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class DiWuZhuCe {
    public static final RegistryKey<PlacedFeature> SLIVER_ORE_PLACED_KEY =
            RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE,
                    new Identifier("pjfmod","ore_sliver"));

    public static void zhuCeSuoYouDiWu(){
        Pjfmod.LOGGER.debug("Pajang said that Registering mod feature for "+Pjfmod.MOD_ID);
    }
}
