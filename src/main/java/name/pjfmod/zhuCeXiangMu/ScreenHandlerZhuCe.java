package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import name.pjfmod.ziDingYi.SliverChestScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;

import static name.pjfmod.ziDingYi.SliverChest.IDF_ID;

public class ScreenHandlerZhuCe {
    public static final ScreenHandlerType<SliverChestScreenHandler> SLIVER_CHEST_SCREEN_HANDLER
            = Registry.register(Registries.SCREEN_HANDLER,IDF_ID, new ScreenHandlerType<>(SliverChestScreenHandler::new));
    public static void zhuCeSuoYouScreenHandlers(){
        Pjfmod.LOGGER.debug("Pajang said that Registering screen handlers for" + Pjfmod.MOD_ID);
    }
}
