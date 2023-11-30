package name.pjfmod.registry;

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

public class ModBlocks {
    public static final Block PJFBLOCK = registerBlock("pjfblock",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),ModItemGroup.PJFTEST);
    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups){
        ModItems.registerItem(name,new BlockItem(block,new FabricItemSettings()),itemGroups);
        return Registry.register(Registries.BLOCK,new Identifier(Pjfmod.MOD_ID,name),block);
    }
    public static void registerModBlocks() {
        Pjfmod.LOGGER.debug("Pajang said that Registering mod blocks for" + Pjfmod.MOD_ID);
    }
}






















