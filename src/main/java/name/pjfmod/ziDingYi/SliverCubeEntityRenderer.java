package name.pjfmod.ziDingYi;

import name.pjfmod.Pjfmod;
import name.pjfmod.PjfmodClient;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SliverCubeEntityRenderer extends MobEntityRenderer<SliverCubeEntity, SliverCubeEntityModel> {
    public SliverCubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SliverCubeEntityModel(context.getPart(PjfmodClient.MODEL_CUBE_LAYER)), 0.5f);
    }
    @Override
    public Identifier getTexture(SliverCubeEntity entity) {
        return new Identifier(Pjfmod.MOD_ID, "textures/entity/sliver_cube.png");
    }
}
