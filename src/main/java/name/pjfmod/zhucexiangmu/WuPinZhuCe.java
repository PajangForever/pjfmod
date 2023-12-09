package name.pjfmod.zhucexiangmu;

import name.pjfmod.Pjfmod;
import name.pjfmod.zidingyi.WuPin;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class WuPinZhuCe {
    public static final WuPin PJFTESTITEM=zhuCeWuPin("pjftest",
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
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups){
        Item registeredItem = Registry.register(
                Registries.ITEM,
                new Identifier(Pjfmod.MOD_ID,name),
                item);
        for (ItemGroup itemGroup: itemGroups){
            ItemGroupEvents.
                    modifyEntriesEvent(itemGroup).
                    register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static WuPin zhuCeWuPin(String name, WuPin item, ItemGroup... itemGroups){
        WuPin zhuCeDeWuPin = Registry.register(
                Registries.ITEM,
                new Identifier(Pjfmod.MOD_ID,name),
                item);
        for (ItemGroup itemGroup: itemGroups){
            ItemGroupEvents.
                    modifyEntriesEvent(itemGroup).
                    register(entries -> entries.add(zhuCeDeWuPin));
        }
        return zhuCeDeWuPin;
    }

    public static void registerModItems(){
        Pjfmod.LOGGER.debug("Pajang said that Registering mod items for"+Pjfmod.MOD_ID);
    }
}



















