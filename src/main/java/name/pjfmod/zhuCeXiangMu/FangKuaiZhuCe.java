package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FangKuaiZhuCe {
    public static final Block PJFBLOCK = registerBlock("pjfblock",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Block SLIVER_ORE = registerBlock("sliver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Block DEEPSLATE_SLIVER_ORE = registerBlock("deepslate_sliver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Block RAW_SLIVER_BLOCK = registerBlock("raw_sliver_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Block SLIVER_BLOCK = registerBlock("sliver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            WuPinZuZhuCe.PJFGROUP);
    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups){
        WuPinZhuCe.registerItem(
                name,
                new BlockItem(block,new FabricItemSettings()),
                itemGroups);
        return Registry.register(
                Registries.BLOCK,
                new Identifier(Pjfmod.MOD_ID,name),
                block);
    }
    public static void zhuCeSuoYouFangKuai() {
        Pjfmod.LOGGER.debug("Pajang said that Registering mod blocks for" + Pjfmod.MOD_ID);
    }
}






















