package name.pjfmod.zhucexiangmu;

import name.pjfmod.Pjfmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WuPinZuZhuCe {
    public static ItemGroup PJFGROUP =
            FabricItemGroup.builder(
                    new Identifier(Pjfmod.MOD_ID,"pjftest")
                    )
            .displayName(
                    Text.translatable("itemgroup.pjfmod.pjfgroup")
            )
            .icon(
                    () -> new ItemStack(WuPinZhuCe.PJFTESTITEM)
            ).build();
    public static void  registerModItemGroup(){
        Pjfmod.LOGGER.debug("Pajang said that Registering mod item group for "+Pjfmod.MOD_ID);
    }
}


























