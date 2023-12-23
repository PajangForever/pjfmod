package name.pjfmod.ziDingYi;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

import java.util.Optional;

import static name.pjfmod.Pjfmod.*;
import static name.pjfmod.zhuCeXiangMu.WuPinZhuCe.SLIVER_BUCKET;

public abstract class SliverFluid extends ModelFluid{
    @Override
    public Fluid getStill() {
        return STILL_SLIVER;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_SLIVER;
    }

    @Override
    public Item getBucketItem() {
        return SLIVER_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return FLUID_SLIVER_BLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    @Override
    public Optional<SoundEvent> getBucketFillSound() {
        return Optional.ofNullable(SoundEvents.ITEM_BUCKET_FILL_LAVA);
    }
    public static class Flowing extends SliverFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends SliverFluid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }

    }
}
