package name.pjfmod.ziDingYi;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public class SliverCubeEntityModel extends EntityModel<SliverCubeEntity> {

    private final ModelPart base;

    public SliverCubeEntityModel(ModelPart modelPart) {
        base = modelPart.getChild(EntityModelPartNames.CUBE);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.CUBE, ModelPartBuilder.create()
                .uv(16, 23)
                .cuboid(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F)
                .uv(0,42)
                .cuboid(-8.0F, -6.0F, -8.0F, 16.0F, 6.0F, 16.0F)
                .uv(0,0)
                .cuboid(-8.0F, -20.0F, -8.0F, 16.0F, 6.0F, 16.0F),
                ModelTransform.pivot(0F, 24.0F, 0F));
        //.texOffs(16, 32).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
        //		.texOffs(0, 42).addBox(-8.0F, -6.0F, -8.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F))
        //		.texOffs(0, 0).addBox(-8.0F, -20.0F, -8.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(SliverCubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.base).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}
