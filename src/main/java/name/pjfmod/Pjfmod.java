package name.pjfmod;

import name.pjfmod.caoZuo.TianJiaDiWu;
import name.pjfmod.zhuCeXiangMu.*;
import name.pjfmod.ziDingYi.ExpStatusEffect;
import name.pjfmod.ziDingYi.SliverCubeEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Pjfmod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "pjfmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("pjfmod");

	public static final StatusEffect EXP = new ExpStatusEffect();


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Pajang! It's Fabric world!");
		ScreenHandlerZhuCe.zhuCeSuoYouScreenHandlers();
		WuPinZuZhuCe.zhuCeSuoYouWuPinZu();
		WuPinZhuCe.zhuCeSuoYouWuPin();
		FangKuaiZhuCe.zhuCeSuoYouFangKuai();
		DiWuZhuCe.zhuCeSuoYouDiWu();
		TianJiaDiWu.tianJiaSuoYouiDiWu();
		FangKuaiShiTiZhuCe.zhuCeSuoYouFangKuaiShiTi();
		FuMoZhuCe.zhuCeSuoYouFuMo();
		ShiTiZhuCe.zhuCeSuoYouShiTi();

		Registry.register(Registries.STATUS_EFFECT, new Identifier(Pjfmod.MOD_ID, "exp"), EXP);


	}
}













