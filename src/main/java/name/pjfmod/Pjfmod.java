package name.pjfmod;

import name.pjfmod.caoZuo.TianJiaDiWu;
import name.pjfmod.zhuCeXiangMu.*;
import name.pjfmod.ziDingYi.SliverChestScreenHandler;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static name.pjfmod.zhuCeXiangMu.FangKuaiZhuCe.SLIVER_CHEST;
import static name.pjfmod.ziDingYi.SliverChest.IDF_ID;

public class Pjfmod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "pjfmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("pjfmod");


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

	}
}













