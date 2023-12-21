package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import name.pjfmod.ziDingYi.SliverGongJuCaiLiao;
import name.pjfmod.ziDingYi.SliverKuiJiaCaiLiao;
import name.pjfmod.ziDingYi.WuPin;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static name.pjfmod.zhuCeXiangMu.FangKuaiZhuCe.SLIVER_CROP_BLOCK;
import static name.pjfmod.zhuCeXiangMu.ShiTiZhuCe.SLIVER_CUBE;


public class WuPinZhuCe {
    public static final WuPin PJF_TEST_ITEM =registerItem("pjftest",
            new WuPin(new FabricItemSettings().maxCount(16),"tips.pjfmod.pjftest"),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item RAW_SLIVER=registerItem("raw_sliver",
            new Item(new FabricItemSettings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_INGOT=registerItem("sliver_ingot",
            new Item(new FabricItemSettings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_NUGGET=registerItem("sliver_nugget",
            new Item(new FabricItemSettings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_SWORD=registerItem("sliver_sword",
            new SwordItem(SliverGongJuCaiLiao.SLIVER_MATERIAL,
                    3, -2.4f, new Item.Settings().maxDamage(1000)),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_PICKAXE=registerItem("sliver_pickaxe",
            new PickaxeItem(SliverGongJuCaiLiao.SLIVER_MATERIAL,
                    1, -2.8f, new Item.Settings().maxDamage(1000)),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_HELMET = registerItem("sliver_helmet",
            new ArmorItem(SliverKuiJiaCaiLiao.SLIVER_ARMOR_MATERIAL,
                    EquipmentSlot.HEAD, new Item.Settings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_CHESTPLATE = registerItem("sliver_chestplate",
            new ArmorItem(SliverKuiJiaCaiLiao.SLIVER_ARMOR_MATERIAL,
                    EquipmentSlot.CHEST, new Item.Settings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_LEGGINGS = registerItem("sliver_leggings",
            new ArmorItem(SliverKuiJiaCaiLiao.SLIVER_ARMOR_MATERIAL,
                    EquipmentSlot.LEGS, new Item.Settings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_BOOTS = registerItem("sliver_boots",
            new ArmorItem(SliverKuiJiaCaiLiao.SLIVER_ARMOR_MATERIAL,
                    EquipmentSlot.FEET, new Item.Settings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_SEEDS = registerItem("sliver_seeds",
            new AliasedBlockItem(SLIVER_CROP_BLOCK, new Item.Settings()),
            WuPinZuZhuCe.PJFGROUP);
    public static final Item SLIVER_CUBE_SPAWN_EGG=registerItem("sliver_cube_spawn_egg",
            new SpawnEggItem(SLIVER_CUBE, 0x000000, 0xffffff, new FabricItemSettings()),
            WuPinZuZhuCe.PJFGROUP);

    public static <T extends Item> T registerItem(String name, T item, ItemGroup... itemGroups) {
        T registeredItem = Registry.register(
                Registries.ITEM,
                new Identifier(Pjfmod.MOD_ID, name),
                item);
        for (ItemGroup itemGroup : itemGroups) {
            ItemGroupEvents.
                    modifyEntriesEvent(itemGroup).
                    register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }

    public static void zhuCeSuoYouWuPin(){
        Pjfmod.LOGGER.debug("Pajang said that Registering mod items for"+Pjfmod.MOD_ID);
    }
}



















