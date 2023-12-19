package name.pjfmod;

import name.pjfmod.ziDingYi.SliverChestScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

import static name.pjfmod.zhuCeXiangMu.FangKuaiZhuCe.SLIVER_CROP_BLOCK;
import static name.pjfmod.zhuCeXiangMu.ScreenHandlerZhuCe.SLIVER_CHEST_SCREEN_HANDLER;

@Environment(EnvType.CLIENT)
public class PjfmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(SLIVER_CHEST_SCREEN_HANDLER, SliverChestScreen::new);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), SLIVER_CROP_BLOCK);
    }
}
