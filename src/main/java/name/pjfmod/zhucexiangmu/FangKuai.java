package name.pjfmod.zhucexiangmu;

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

public class FangKuai {
    public static final Block PJFBLOCK = registerBlock("pjfblock",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            WuPinZu.PJFTEST);
    public static final Block SLIVER_ORE = registerBlock("sliver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            WuPinZu.PJFTEST);
    public static final Block SLIVER_BLOCK = registerBlock("sliver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            WuPinZu.PJFTEST);
    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups){
        WuPin.registerItem(
                name,
                new BlockItem(block,new FabricItemSettings()),
                itemGroups);
        return Registry.register(
                Registries.BLOCK,
                new Identifier(Pjfmod.MOD_ID,name),
                block);
    }
    public static void registerModBlocks() {
        Pjfmod.LOGGER.debug("Pajang said that Registering mod blocks for" + Pjfmod.MOD_ID);
    }
}






















