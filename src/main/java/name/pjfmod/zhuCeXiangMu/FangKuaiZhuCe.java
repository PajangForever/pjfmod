package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import name.pjfmod.ziDingYi.SliverChest;
import name.pjfmod.ziDingYi.SliverCropBlock;
import name.pjfmod.ziDingYi.SliverSuperBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
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
    public static final SliverSuperBlock SLIVER_SUPER_BLOCK = registerBlock("sliver_super_block",
            new SliverSuperBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f)),
            WuPinZuZhuCe.PJFGROUP);
    public static final SliverChest SLIVER_CHEST = registerBlock("sliver_chest",
            new SliverChest(FabricBlockSettings.of(Material.METAL).strength(3.0f)),
            WuPinZuZhuCe.PJFGROUP);
    public static final SliverCropBlock SLIVER_CROP_BLOCK = registerBlock("sliver_crop",
            new SliverCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)),
            WuPinZuZhuCe.PJFGROUP);

    public static <T extends Block> T registerBlock(String name, T block, ItemGroup... itemGroups){
        WuPinZhuCe.registerItem(name,
                new BlockItem(block,new FabricItemSettings()),
                itemGroups);
        Identifier idfID = new Identifier(Pjfmod.MOD_ID, name);
        T registeredBlock = Registry.register(Registries.BLOCK, idfID, block);
        if (registeredBlock instanceof  SliverChest)  SliverChest.IDF_ID =idfID;
        return registeredBlock;
    }
    public static void zhuCeSuoYouFangKuai() {
        Pjfmod.LOGGER.debug("Pajang said that Registering mod blocks for" + Pjfmod.MOD_ID);
    }
}






















