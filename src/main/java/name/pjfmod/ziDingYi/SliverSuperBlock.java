package name.pjfmod.ziDingYi;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SliverSuperBlock extends Block {
    public SliverSuperBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(POWERED, false));
    }
    public static final BooleanProperty POWERED = BooleanProperty.of("powered");
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(POWERED);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        //右键一次ActionResult会返回两次，一次isClient是true另一次是false
        if (!world.isClient)    //isClient是false：在服务端执行
        {
            player.sendMessage(Text.literal("Powered!"), false);
            world.setBlockState(pos, state.with(POWERED, true));
        }
        else    //isClient是true：在客户端执行，playSound要写在这里否则没反应
        {
            player.playSound(SoundEvents.ENTITY_VILLAGER_YES, 1.0F, 1.0F);
        }
        return ActionResult.SUCCESS;
    }
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (world.getBlockState(pos).get(POWERED)){
            LightningEntity lightningEntity = (LightningEntity) EntityType.LIGHTNING_BOLT.create(world);
            if (lightningEntity != null) {
                lightningEntity.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(pos));
            }
            world.spawnEntity(lightningEntity);
        }

        world.setBlockState(pos, state.with(POWERED, false));
        super.onSteppedOn(world, pos, state, entity);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.4, 0f, 0.4f, 0.6f, 0.8f, 0.6f);
    }
}
