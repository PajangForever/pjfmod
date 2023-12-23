package name.pjfmod;

import name.pjfmod.caoZuo.TianJiaDiWu;
import name.pjfmod.zhuCeXiangMu.*;
import name.pjfmod.ziDingYi.ExpStatusEffect;
import name.pjfmod.ziDingYi.SliverCubeEntity;
import name.pjfmod.ziDingYi.SliverFluid;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
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
	public static FlowableFluid STILL_SLIVER;
	public static FlowableFluid FLOWING_SLIVER;
	public static Block FLUID_SLIVER_BLOCK;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Pajang! It's Fabric world!");

		STILL_SLIVER = Registry.register(Registries.FLUID, new Identifier(Pjfmod.MOD_ID, "fluid_sliver"), new SliverFluid.Still());
		FLOWING_SLIVER = Registry.register(Registries.FLUID, new Identifier(Pjfmod.MOD_ID, "flowing_fluid_sliver"), new SliverFluid.Flowing());
		FLUID_SLIVER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Pjfmod.MOD_ID,"fluid_sliver_block"), new FluidBlock(STILL_SLIVER, FabricBlockSettings.copy(Blocks.WATER)){});

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













