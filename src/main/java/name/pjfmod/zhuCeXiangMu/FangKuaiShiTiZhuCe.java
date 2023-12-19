package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import name.pjfmod.ziDingYi.SliverChestEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static name.pjfmod.zhuCeXiangMu.FangKuaiZhuCe.SLIVER_CHEST;

public class FangKuaiShiTiZhuCe {
    public static final BlockEntityType<SliverChestEntity> SLIVER_CHEST_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Pjfmod.MOD_ID, "sliver_chest_entity"),
            FabricBlockEntityTypeBuilder.create(SliverChestEntity::new, SLIVER_CHEST).build()
    );

    public static void zhuCeSuoYouFangKuaiShiTi() {
        Pjfmod.LOGGER.debug("Pajang said that Registering mod block entities for" + Pjfmod.MOD_ID);
    }
}
