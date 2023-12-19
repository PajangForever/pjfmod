package name.pjfmod.ziDingYi;

import name.pjfmod.muBan.ImplementedInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import static name.pjfmod.zhuCeXiangMu.FangKuaiShiTiZhuCe.SLIVER_CHEST_ENTITY;

public class SliverChestEntity extends BlockEntity implements NamedScreenHandlerFactory,ImplementedInventory , SidedInventory {
    private int test_number = 114514;
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(15, ItemStack.EMPTY);


    public SliverChestEntity(BlockPos pos, BlockState state) {
        super(SLIVER_CHEST_ENTITY, pos, state);
    }
    /*
     一旦实现了 writeNbt 和 readNbt 方法，您只需要确保在合适的时候调用即可。
     每当您的 BlockEntity 数据发生更改并需要保存时，请调用 markDirty()。
     这会将方块所在的区块标记为dirty，在世界下次保存时强制调用 writeNbt 方法。
     原则上，只要修改了 BlockEntity 类中的任何一个自定义变量，就只需要简单调用 markDirty，
     否则当你退出并重进世界后，这个方块实体依然会是没有修改过的。
     */
    /**
     * 写入NBT退出游戏时能够保存
     *
     * @param nbt
     */
    @Override
    public void writeNbt(NbtCompound nbt) {
        nbt.putInt("test number", test_number);
        Inventories.writeNbt(nbt, items);
        Inventories.writeNbt(nbt, this.inventory);
        super.writeNbt(nbt);
    }
    /**
     * 从NBT读取数据
     * @param nbt
     */
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, items);
        Inventories.readNbt(nbt, this.inventory);
        test_number = nbt.getInt("test number");
    }
    /**
     * 设置物品栏格子数量
     */
    private final DefaultedList<ItemStack> items = DefaultedList.ofSize(2, ItemStack.EMPTY);

    /**
     *
     * 从此物品栏中检索物品。
     * 每次被调用时必须返回相同实例。
     * @return items
     */
    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }
    @Override
    public int[] getAvailableSlots(Direction var1) {
        // Just return an array of all slots
        int[] result = new int[getItems().size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }

        return result;
    }
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        // 因为我们的类实现 Inventory，所以将*这个*提供给 ScreenHandler
        // 一开始只有服务器拥有物品栏，然后在 ScreenHandler 中同步给客户端
        return new SliverChestScreenHandler(syncId, playerInventory, this);
    }
    @Override
    public Text getDisplayName() {
        return Text.translatable(getCachedState().getBlock().getTranslationKey());
        // 对于1.19之前的版本，请使用：
        // return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }
    @Override
    public boolean canInsert(int slot, ItemStack stack, Direction direction) {
        return direction != Direction.DOWN;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction direction) {
        return direction == Direction.DOWN;
    }
}