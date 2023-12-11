package name.pjfmod.ziDingYi;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import name.pjfmod.zhuCeXiangMu.WuPinZhuCe;

public class SliverGongJuCaiLiao implements ToolMaterial {
    public static final SliverGongJuCaiLiao SLIVER_MATERIAL = new SliverGongJuCaiLiao();
    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 16.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(WuPinZhuCe.SLIVER_INGOT);
    }
}
