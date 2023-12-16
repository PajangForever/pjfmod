package name.pjfmod.ziDingYi;

import name.pjfmod.zhuCeXiangMu.WuPinZhuCe;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SliverKuiJiaCaiLiao implements ArmorMaterial {
    public static final ArmorMaterial SLIVER_ARMOR_MATERIAL = new SliverKuiJiaCaiLiao();
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};
    //[头盔，护腿，胸甲，靴子]

    @Override
    public int getDurability(EquipmentSlot slot) {
        //计算你的盔甲在损坏之前能承受多少次打击，利用的是你在'BASE_DURABILITY'里所写的int值。皮革是5，钻石33，下届合金的是37。
        return BASE_DURABILITY[slot.getEntitySlotId()] * 33;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(WuPinZhuCe.SLIVER_INGOT);
    }

    @Override
    public String getName() {
        return "sliver";
    }

    @Override
    public float getToughness() {
        //盔甲韧性
        return 2.0f;
    }

    @Override
    public float getKnockbackResistance() {
        //击退抗性
        return 0.2f;
    }
}
