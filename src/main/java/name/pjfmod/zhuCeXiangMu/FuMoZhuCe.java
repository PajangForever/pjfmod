package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import name.pjfmod.ziDingYi.FrostEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FuMoZhuCe {
    public static Enchantment FROST = Registry.register(
            Registries.ENCHANTMENT, new Identifier(Pjfmod.MOD_ID,"frost"),new FrostEnchantment());
    public static void zhuCeSuoYouFuMo() {
        Pjfmod.LOGGER.debug("Pajang said that Registering mod enchantments for" + Pjfmod.MOD_ID);
    }
}
