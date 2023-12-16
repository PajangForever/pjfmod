package name.pjfmod.ziDingYi;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class WuPin extends Item {
    public String tipsKey;
    public WuPin(Settings settings,String itemTipsKey) {
        super(settings);
        this.tipsKey=itemTipsKey;
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if(world.isClient()){
            playerEntity.playSound(SoundEvents.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
        }
        else {
            playerEntity.sendMessage(Text.literal("OUCH!"), false);
        }
        //客户端和服务端要分开不然会弹两次文本
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable(tipsKey).formatted(Formatting.YELLOW) );
    }
}
