package name.pjfmod;

import name.pjfmod.ziDingYi.SliverChestScreen;
import name.pjfmod.ziDingYi.SliverCubeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import name.pjfmod.ziDingYi.SliverCubeEntityModel;

import static name.pjfmod.zhuCeXiangMu.FangKuaiZhuCe.SLIVER_CROP_BLOCK;
import static name.pjfmod.zhuCeXiangMu.ScreenHandlerZhuCe.SLIVER_CHEST_SCREEN_HANDLER;
import static name.pjfmod.zhuCeXiangMu.ShiTiZhuCe.SLIVER_CUBE;

@Environment(EnvType.CLIENT)
public class PjfmodClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CUBE_LAYER =
            new EntityModelLayer(new Identifier(Pjfmod.MOD_ID, "sliver_cube"), "main");
    @Override
    public void onInitializeClient() {
        HandledScreens.register(SLIVER_CHEST_SCREEN_HANDLER, SliverChestScreen::new);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), SLIVER_CROP_BLOCK);
        EntityRendererRegistry.register(SLIVER_CUBE, SliverCubeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, SliverCubeEntityModel::getTexturedModelData);
        FluidRenderHandlerRegistry.INSTANCE.register(Pjfmod.STILL_SLIVER, Pjfmod.FLOWING_SLIVER, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xa0a0a0));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), Pjfmod.STILL_SLIVER, Pjfmod.FLOWING_SLIVER);

    }
}
