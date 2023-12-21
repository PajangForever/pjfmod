package name.pjfmod.ziDingYi;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FrostEnchantment extends Enchantment {
    public FrostEnchantment() {
        super(Enchantment.Rarity.UNCOMMON,
                EnchantmentTarget.WEAPON,
                new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
    //决定在附魔台什么等级时出现
    @Override
    public int getMinPower(int level) {
        return 7 * level;
    }
    //最大等级
    @Override
    public int getMaxLevel() {
        return 3;
    }
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(
                    StatusEffects.SLOWNESS, 20 * 2 * level, level - 1));
        }
        super.onTargetDamaged(user, target, level);
    }
}
