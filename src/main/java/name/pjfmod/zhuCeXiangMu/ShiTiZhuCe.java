package name.pjfmod.zhuCeXiangMu;

import name.pjfmod.Pjfmod;
import name.pjfmod.ziDingYi.SliverCubeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ShiTiZhuCe {
    public static final EntityType<SliverCubeEntity> SLIVER_CUBE =
            registerEntity("sliver_cube",SpawnGroup.CREATURE,SliverCubeEntity::new,
                    1.00f,1.25f);
    public static <T extends PathAwareEntity> EntityType<T> registerEntity(String name, SpawnGroup spawnGroup, EntityType.EntityFactory<T> factory, Float width, Float height){
        EntityType<T> registeredEntity = Registry.register(Registries.ENTITY_TYPE,
                new Identifier(Pjfmod.MOD_ID, name),
                FabricEntityTypeBuilder.create(spawnGroup,factory).
                        dimensions(EntityDimensions.fixed(width, height)).build());
        FabricDefaultAttributeRegistry.register(registeredEntity, SliverCubeEntity.createMobAttributes());
        return registeredEntity;//并非总是null，垃圾编译器报个屁的warning
    }
    public static void zhuCeSuoYouShiTi(){
        Pjfmod.LOGGER.debug("Pajang said that Registering mod entities for"+Pjfmod.MOD_ID);
    }
}
