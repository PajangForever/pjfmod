/*package name.pjfmod.ziDingYi;

import name.pjfmod.Pjfmod;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class Advancements implements Consumer<Consumer<Advancement>>{
    @Override
    public void accept(Consumer<Advancement> consumer) {
        // 我们将在这里创建我们的自定义进度
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        Items.DIRT, // 显示的图标
                        Text.literal("你的第一个泥土方块！"), // 标题
                        Text.literal("现在做了一个 3x3 ！"), // 描述
                        new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // 使用的背景图片
                        AdvancementFrame.TASK, // 选项: TASK, CHALLENGE, GOAL
                        true, // 在右上角显示
                        true, // 在聊天框中提示
                        false // 在进度页面里隐藏
                )
                // Criterion 中使用的第一个字符串是其他进度在需要 'requirements' 时引用的名字
                .criterion("got_dirt", InventoryChangedCriterion.Conditions.items(Items.DIRT))
                .build(consumer, Pjfmod.MOD_ID + "/root");
    }
}


 */