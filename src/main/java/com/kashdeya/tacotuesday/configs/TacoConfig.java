package com.kashdeya.tacotuesday.configs;

import java.io.File;

import com.kashdeya.tacotuesday.handlers.ConfigHandler;
import com.kashdeya.tacotuesday.main.Reference;

import net.minecraftforge.common.config.Configuration;

public class TacoConfig {
	
	public static Configuration config;
	public static final File configDir = new File("config/Taco Tuesday");
	
	public static void initMain()
	{
		
		File f = new File(configDir, "Main.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Taco Tuesday";
		
		// Soft
		config.addCustomCategoryComment(category + " Soft Tacos", "Cause everybody loves Tacos!");
		ConfigHandler.TortillaHealAmount = config.getInt("Soft Taco Shell Heal Amount", category + " Soft Tacos", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.TortillaSaturation = config.getFloat("Soft Taco Shell Saturation Amount", category + " Soft Tacos", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.TortillaFood = config.getBoolean("Soft Taco Shell Wolf Food", category + " Soft Tacos", false, "Is Wolf Food?");
		ConfigHandler.TacoHealAmount = config.getInt("Soft Beef Taco Heal Amount", category + " Soft Tacos", 11, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.TacoSaturation = config.getFloat("Soft Beef Taco Saturation Amount", category + " Soft Tacos", 0.6F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.TacoFood = config.getBoolean("Soft Beef Taco Wolf Food", category + " Soft Tacos", false, "Is Wolf Food?");
		ConfigHandler.PorkTacoHealAmount = config.getInt("Soft Pork Taco Heal Amount", category + " Soft Tacos", 11, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PorkTacoSaturation = config.getFloat("Soft Pork Taco Saturation Amount", category + " Soft Tacos", 0.6F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PorkTacoFood = config.getBoolean("Soft Pork Taco Wolf Food", category + " Soft Tacos", false, "Is Wolf Food?");
		ConfigHandler.ChickenTacoHealAmount = config.getInt("Soft Chicken Taco Heal Amount", category + " Soft Tacos", 9, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.ChickenTacoSaturation = config.getFloat("Soft Chicken Taco Saturation Amount", category + " Soft Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.ChickenTacoFood = config.getBoolean("Soft Chicken Taco Wolf Food", category + " Soft Tacos", false, "Is Wolf Food?");
		ConfigHandler.FishTacoHealAmount = config.getInt("Soft Fish Taco Heal Amount", category + " Soft Tacos", 8, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.FishTacoSaturation = config.getFloat("Soft Fish Taco Saturation Amount", category + " Soft Tacos", 0.5F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.FishTacoFood = config.getBoolean("Soft Fish Taco Wolf Food", category + " Soft Tacos", false, "Is Wolf Food?");
		ConfigHandler.MuttonTacoHealAmount = config.getInt("Soft Mutton Taco Heal Amount", category + " Soft Tacos", 9, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MuttonTacoSaturation = config.getFloat("Soft Mutton Taco Saturation Amount", category + " Soft Tacos", 0.6F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MuttonTacoFood = config.getBoolean("Soft Mutton Taco Wolf Food", category + " Soft Tacos", false, "Is Wolf Food?");
		ConfigHandler.RabbitTacoHealAmount = config.getInt("Soft Rabbit Taco Heal Amount", category + " Soft Tacos", 9, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.RabbitTacoSaturation = config.getFloat("Soft Rabbit Taco Saturation Amount", category + " Soft Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.RabbitTacoFood = config.getBoolean("Soft Rabbit Taco Wolf Food", category + " Soft Tacos", false, "Is Wolf Food?");
		
		// Crunchy
		config.addCustomCategoryComment(category + " Hard Tacos", "Cause everybody loves Tacos!");
		ConfigHandler.HardTacoShellHealAmount = config.getInt("Hard Taco Shell Heal Amount", category + " Hard Tacos", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardTacoShellSaturation = config.getFloat("Hard Taco Shell Saturation Amount", category + " Hard Tacos", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardTacoShellFood = config.getBoolean("Hard Taco Shell Wolf Food", category + " Hard Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardTacoHealAmount = config.getInt("Hard Beef Taco Heal Amount", category + " Hard Tacos", 11, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardTacoSaturation = config.getFloat("Hard Beef Taco Saturation Amount", category + " Hard Tacos", 0.6F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardTacoFood = config.getBoolean("Hard Beef Taco Wolf Food", category + " Hard Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardPorkTacoHealAmount = config.getInt("Hard Pork Taco Heal Amount", category + " Hard Tacos", 11, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardPorkTacoSaturation = config.getFloat("Hard Pork Taco Saturation Amount", category + " Hard Tacos", 0.6F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardPorkTacoFood = config.getBoolean("Hard Pork Taco Wolf Food", category + " Hard Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardChickenTacoHealAmount = config.getInt("Hard Chicken Taco Heal Amount", category + " Hard Tacos", 9, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardChickenTacoSaturation = config.getFloat("Hard Chicken Taco Saturation Amount", category + " Hard Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardChickenTacoFood = config.getBoolean("Hard Chicken Taco Wolf Food", category + " Hard Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardFishTacoHealAmount = config.getInt("Hard Fish Taco Heal Amount", category + " Hard Tacos", 8, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardFishTacoSaturation = config.getFloat("Hard Fish Taco Saturation Amount", category + " Hard Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardFishTacoFood = config.getBoolean("Hard Fish Taco Wolf Food", category + " Hard Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardMuttonTacoHealAmount = config.getInt("Hard Mutton Taco Heal Amount", category + " Hard Tacos", 9, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardMuttonTacoSaturation = config.getFloat("Hard Mutton Taco Saturation Amount", category + " Hard Tacos", 0.6F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardMuttonTacoFood = config.getBoolean("Hard Mutton Taco Wolf Food", category + " Hard Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardRabbitTacoHealAmount = config.getInt("Hard Rabbit Taco Heal Amount", category + " Hard Tacos", 8, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardRabbitTacoSaturation = config.getFloat("Hard Rabbit Taco Saturation Amount", category + " Hard Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardRabbitTacoFood = config.getBoolean("Hard Rabbit Taco Wolf Food", category + " Hard Tacos", false, "Is Wolf Food?");
		
		//IceCream
		config.addCustomCategoryComment(category + " Ice Cream", "Cause Ice Cream!");
		ConfigHandler.PlainHealAmount = config.getInt("Vanilla Heal Amount", category + " Ice Cream", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PlainSaturation = config.getFloat("Vanilla Saturation Amount", category + " Ice Cream", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PlainFood = config.getBoolean("Vanilla Wolf Food", category + " Ice Cream", false, "Is Wolf Food?");
		ConfigHandler.ChocolateHealAmount = config.getInt("Chocolate Heal Amount", category + " Ice Cream", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.ChocolateSaturation = config.getFloat("Chocolate Saturation Amount", category + " Ice Cream", 0.31F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.ChocolateFood = config.getBoolean("Chocolate Wolf Food", category + " Ice Cream", false, "Is Wolf Food?");
		ConfigHandler.WatermelonHealAmount = config.getInt("Watermelon Heal Amount", category + " Ice Cream", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.WatermelonSaturation = config.getFloat("Watermelon Saturation Amount", category + " Ice Cream", 0.315F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.WatermelonFood = config.getBoolean("Watermelon Wolf Food", category + " Ice Cream", false, "Is Wolf Food?");
		ConfigHandler.PumpkinHealAmount = config.getInt("Pumpkin Spice Heal Amount", category + " Ice Cream", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PumpkinSaturation = config.getFloat("Pumpkin Spice Saturation Amount", category + " Ice Cream", 0.35F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PumpkinFood = config.getBoolean("Pumpkin Spice Wolf Food", category + " Ice Cream", false, "Is Wolf Food?");
		ConfigHandler.AppleHealAmount = config.getInt("Apple Heal Amount", category + " Ice Cream", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.AppleSaturation = config.getFloat("Apple Saturation Amount", category + " Ice Cream", 0.325F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.AppleFood = config.getBoolean("Apple Wolf Food", category + " Ice Cream", false, "Is Wolf Food?");
		ConfigHandler.CookieHealAmount = config.getInt("Cookies & Cream Heal Amount", category + " Ice Cream", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CookieSaturation = config.getFloat("Cookies & Cream Saturation Amount", category + " Ice Cream", 0.325F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CookieFood = config.getBoolean("Cookies & Cream Wolf Food", category + " Ice Cream", false, "Is Wolf Food?");
		
		// Ice Cream Tacos
		config.addCustomCategoryComment(category + " Ice Cream Tacos", "Who don't love Ice Cream Tacos?");
		ConfigHandler.WaffleHealAmount = config.getInt("Waffle Shell Heal Amount", category + " Ice Cream Tacos", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.WaffleSaturation = config.getFloat("Waffle Shell Saturation Amount", category + " Ice Cream Tacos", 0.05F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.WaffleFood = config.getBoolean("Waffle Shell Wolf Food", category + " Ice Cream Tacos", false, "Is Wolf Food?");
		ConfigHandler.PlainTacoHealAmount = config.getInt("Vanilla Taco Heal Amount", category + " Ice Cream Tacos", 7, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.plainTacoSaturation = config.getFloat("Vanilla Taco Saturation Amount", category + " Ice Cream Tacos", 0.35F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.plainTacoFood = config.getBoolean("Vanilla Taco Wolf Food", category + " Ice Cream Tacos", false, "Is Wolf Food?");
		ConfigHandler.ChocolateTacoHealAmount = config.getInt("Chocolate Taco Heal Amount", category + " Ice Cream Tacos", 7, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.ChocolateTacoSaturation = config.getFloat("Chocolate Taco Saturation Amount", category + " Ice Cream Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.ChocolateTacoFood = config.getBoolean("Chocolate Taco Wolf Food", category + " Ice Cream Tacos", false, "Is Wolf Food?");
		ConfigHandler.WatermelonTacoHealAmount = config.getInt("Watermelon Taco Heal Amount", category + " Ice Cream Tacos", 6, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.WatermelonTacoSaturation = config.getFloat("Watermelon Taco Saturation Amount", category + " Ice Cream Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.WatermelonTacoFood = config.getBoolean("Watermelon Taco Wolf Food", category + " Ice Cream Tacos", false, "Is Wolf Food?");
		ConfigHandler.PumpkinTacoHealAmount = config.getInt("Pumpkin Spice Taco Heal Amount", category + " Ice Cream Tacos", 8, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PumpkinTacoSaturation = config.getFloat("Pumpkin Spice Taco Saturation Amount", category + " Ice Cream Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PumpkinTacoFood = config.getBoolean("Pumpkin Spice Taco Wolf Food", category + " Ice Cream Tacos", false, "Is Wolf Food?");
		ConfigHandler.AppleTacoHealAmount = config.getInt("Apple Taco Heal Amount", category + " Ice Cream Tacos", 6, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.AppleTacoSaturation = config.getFloat("Apple Taco Saturation Amount", category + " Ice Cream Tacos", 0.6F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.AppleTacoFood = config.getBoolean("Apple Taco Wolf Food", category + " Ice Cream Tacos", false, "Is Wolf Food?");
		ConfigHandler.CookieTacoHealAmount = config.getInt("Cookies & Cream Taco Heal Amount", category + " Ice Cream Tacos", 7, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CookieTacoSaturation = config.getFloat("Cookies & Cream Taco Saturation Amount", category + " Ice Cream Tacos", 0.45F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CookieTacoFood = config.getBoolean("Cookies & Cream Taco Wolf Food", category + " Ice Cream Tacos", false, "Is Wolf Food?");
		
		// T1 Tacos
		config.addCustomCategoryComment(category + " Tier1 Tacos", "Who knew there was so many ways to make Tacos?");
		ConfigHandler.TacoTaco = config.getInt("Tier1 Taco Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.TacoTacoSaturation = config.getFloat("Tier1 Taco Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.TacoTacoFood = config.getBoolean("Tier1 Taco Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		ConfigHandler.IronTaco = config.getInt("Tier1 Iron Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.IronTacoSaturation = config.getFloat("Tier1 Iron Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.IronTacoFood = config.getBoolean("Tier1 Iron Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		ConfigHandler.CoalTaco = config.getInt("Tier1 Coal Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CoalTacoSaturation = config.getFloat("Tier1 Coal Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CoalTacoFood = config.getBoolean("Tier1 Coal Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		ConfigHandler.LapisTaco = config.getInt("Tier1 Lapis Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.LapisTacoSaturation = config.getFloat("Tier1 Lapis Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.LapisTacoFood = config.getBoolean("Tier1 Lapis Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		ConfigHandler.DiamondTaco = config.getInt("Tier1 Diamond Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.DiamondTacoSaturation = config.getFloat("Tier1 Diamond Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.DiamondTacoFood = config.getBoolean("Tier1 Diamond Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		ConfigHandler.EmeraldTaco = config.getInt("Tier1 Emerald Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.EmeraldTacoSaturation = config.getFloat("Tier1 Emerald Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.EmeraldTacoFood = config.getBoolean("Tier1 Emerald Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		ConfigHandler.RedstoneTaco = config.getInt("Tier1 Redstone Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.RedstoneTacoSaturation = config.getFloat("Tier1 Redstone Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.RedstoneTacoFood = config.getBoolean("Tier1 Redstone Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		ConfigHandler.QuartzTaco = config.getInt("Tier1 Quartz Taco Heal Amount", category + " Tier1 Tacos", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.QuartzTacoSaturation = config.getFloat("Tier1 Quartz Taco Saturation Amount", category + " Tier1 Tacos", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.QuartzTacoFood = config.getBoolean("Tier1 Quartz Taco Wolf Food", category + " Tier1 Tacos", false, "Is Wolf Food?");
		
		// T2 Tacos
		config.addCustomCategoryComment(category + " Tier2 Tacos", "Can it get any cooler?");
		ConfigHandler.HardTacoTaco = config.getInt("Tier2 Taco Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardTacoTacoSaturation = config.getFloat("Tier2 Taco Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardTacoTacoFood = config.getBoolean("Tier2 Taco Taco Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardIronTaco = config.getInt("Tier2 Iron Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardIronTacoSaturation = config.getFloat("Tier2 Iron Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardIronTacoFood = config.getBoolean("Tier2 Iron Taco Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardCoalTaco = config.getInt("Tier2 Coal Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardCoalTacoSaturation = config.getFloat("Tier2 Coal Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardCoalTacoFood = config.getBoolean("Tier2 Coal Taco Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardLapisTaco = config.getInt("Tier2 Lapis Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardLapisTacoSaturation = config.getFloat("Tier2 Lapis Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardLapisTacoFood = config.getBoolean("Tier2 Lapis Taco Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardDiamondTaco = config.getInt("Tier2 Diamond Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardDiamondTacoSaturation = config.getFloat("Tier2 Diamond Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardDiamondTacoFood = config.getBoolean("Tier2 Diamond Taco Shell Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardEmeraldTaco = config.getInt("Tier2 Emerald Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardEmeraldTacoSaturation = config.getFloat("Tier2 Emerald Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardEmeraldTacoFood = config.getBoolean("Tier2 Emerald Taco Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardRedstoneTaco = config.getInt("Tier2 Redstone Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardRedstoneTacoSaturation = config.getFloat("Tier2 Redstone Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardRedstoneTacoFood = config.getBoolean("Tier2 Redstone Taco Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		ConfigHandler.HardQuartzTaco = config.getInt("Tier2 Quartz Taco Heal Amount", category + " Tier2 Tacos", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardQuartzTacoSaturation = config.getFloat("Tier2 Quartz Taco Saturation Amount", category + " Tier2 Tacos", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardQuartzTacoFood = config.getBoolean("Tier2 Quartz Taco Wolf Food", category + " Tier2 Tacos", false, "Is Wolf Food?");
		
		// Misc
		config.addCustomCategoryComment(category + " Magical Section", "Who said Tacos could not be OP?");
		ConfigHandler.OpSoftTaco = config.getInt("Tier1 Magical Taco Heal Amount", category + " Magical Section", 15, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.OpSoftTacoSaturation = config.getFloat("Tier1 Magical Taco Saturation Amount", category + " Magical Section", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.OpSoftTacoFood = config.getBoolean("Tier1 Magical Taco Wolf Food", category + " Magical Section", false, "Is Wolf Food?");
		ConfigHandler.OpHardTaco = config.getInt("Tier2 Magical Taco Heal Amount", category + " Magical Section", 17, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.OpHardTacoSaturation = config.getFloat("Tier2 Magical Taco Saturation Amount", category + " Magical Section", 0.75F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.OpHardTacoFood = config.getBoolean("Tier2 Magical Taco Wolf Food", category + " Magical Section", false, "Is Wolf Food?");
		ConfigHandler.SuperOpTaco = config.getInt("Tier3 Magical Taco Heal Amount", category + " Magical Section", 20, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.SuperOpTacoSaturation = config.getFloat("Tier3 Magical Taco Saturation Amount", category + " Magical Section", 1.0F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.SuperOpTacoFood = config.getBoolean("Tier3 Magical Taco Wolf Food", category + " Magical Section", false, "Is Wolf Food?");
		
		
		// Secrete Section
		config.addCustomCategoryComment(category + " Secrete Section", "Who said Tacos could not be OP?");
		ConfigHandler.SoupTaco = config.getInt("Secret Soup Heal Amount", category + " Secrete Section", 20, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.SoupTacoSaturation = config.getFloat("Secret Soup Saturation Amount", category + " Secrete Section", 1.0F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.SoupTacoFood = config.getBoolean("Secret Soup Wolf Food", category + " Secrete Section", false, "Is Wolf Food?");
		ConfigHandler.SecretSpice = config.getInt("Secrete Spice Heal Amount", category + " Secrete Section", 1, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.SecretSpiceSaturation = config.getFloat("Secrete Spice Saturation Amount", category + " Secrete Section", 0.02F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.SideEffects = config.getBoolean("Secrete Spice Side Effects", category + " Secrete Section", false, "Enable Side Effects when eaten?");
		ConfigHandler.SecretSpiceFood = config.getBoolean("Secrete Spice Wolf Food", category + " Secrete Section", false, "Is Wolf Food?");
		ConfigHandler.playerdrops = config.getBoolean("Secrete Spice Player Kill Drops", category + " Secrete Section", true, "Enable Player Kill Drops?\n[Player Kills Drop a Random amount between 0-4.]");
		ConfigHandler.nonplayerdrops = config.getBoolean("Secrete Spice Non-Player Kill Drop", category + " Secrete Section", false, "Enable Non-Player Kill Drops?\n[Non-Player Kills Drop a Random amount between 0-2.]");
		
		// Player Drop Section
		config.addCustomCategoryComment(category + " Secrete Section Player Kill Drops", "Who said Tacos could not be OP?");
		ConfigHandler.BlazeDropChance = config.getFloat("Secrete Spice Blaze Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.CaveDropChance = config.getFloat("Secrete Spice Cave Spider Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.CreeperDropChance = config.getFloat("Secrete Spice Creeper Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.EndermanDropChance = config.getFloat("Secrete Spice Enderman Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.EndermiteDropChance = config.getFloat("Secrete Spice Endermite Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.GhastDropChance = config.getFloat("Secrete Spice Ghast Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.GiantDropChance = config.getFloat("Secrete Spice Giant Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.GuardianDropChance = config.getFloat("Secrete Spice Guardian Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.IronDropChance = config.getFloat("Secrete Spice Iron Golem Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.MagmaDropChance = config.getFloat("Secrete Spice Magma Cube Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.PigZombieDropChance = config.getFloat("Secrete Spice Pig Zombie Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.PolarDropChance = config.getFloat("Secrete Spice Polar Bear Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.ShulkerDropChance = config.getFloat("Secrete Spice Shulker Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.SilverfishDropChance = config.getFloat("Secrete Spice Silverfish Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.SkeletonDropChance = config.getFloat("Secrete Spice Skeleton Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.SlimeDropChance = config.getFloat("Secrete Spice Slime Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.SnowmanDropChance = config.getFloat("Secrete Spice Snowman Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.SpiderDropChance = config.getFloat("Secrete Spice Spider Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.WitchDropChance = config.getFloat("Secrete Spice Witch Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.ZombieDropChance = config.getFloat("Secrete Spice Zombie Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.BatDropChance = config.getFloat("Secrete Spice Bat Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.ChickenDropChance = config.getFloat("Secrete Spice Chicken Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.CowDropChance = config.getFloat("Secrete Spice Cow Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.HorseDropChance = config.getFloat("Secrete Spice Horse Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.MooshroomDropChance = config.getFloat("Secrete Spice Mooshroom Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.OcelotDropChance = config.getFloat("Secrete Spice Ocelot Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.PigDropChance = config.getFloat("Secrete Spice Pig Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.RabbitDropChance = config.getFloat("Secrete Spice Rabbit Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.SheepDropChance = config.getFloat("Secrete Spice Sheep Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.SquidDropChance = config.getFloat("Secrete Spice Squid Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.VillagerDropChance = config.getFloat("Secrete Spice Villager Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.WolfDropChance = config.getFloat("Secrete Spice Wolf Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.DragonDropChance = config.getFloat("Secrete Spice Dragon Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		ConfigHandler.WitherDropChance = config.getFloat("Secrete Spice Wither Drop Chance", category + " Secrete Section Player Kill Drops", 0.2F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable player drop in Secrete Section.]");
		
		// Non-Player Drop Section
		config.addCustomCategoryComment(category + " Secrete Section Non-Player Kill Drops", "That's what she said!");
		ConfigHandler.NonBlazeDropChance = config.getFloat("Secrete Spice Blaze Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonCaveDropChance = config.getFloat("Secrete Spice Cave Spider Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonCreeperDropChance = config.getFloat("Secrete Spice Creeper Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonEndermanDropChance = config.getFloat("Secrete Spice Enderman Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonEndermiteDropChance = config.getFloat("Secrete Spice Endermite Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonGhastDropChance = config.getFloat("Secrete Spice Ghast Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonGiantDropChance = config.getFloat("Secrete Spice Giant Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonGuardianDropChance = config.getFloat("Secrete Spice Guardian Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonIronDropChance = config.getFloat("Secrete Spice Iron Golem Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonMagmaDropChance = config.getFloat("Secrete Spice Magma Cube Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonPigZombieDropChance = config.getFloat("Secrete Spice Pig Zombie Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonPolarDropChance = config.getFloat("Secrete Spice Polar Bear Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonShulkerDropChance = config.getFloat("Secrete Spice Shulker Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonSilverfishDropChance = config.getFloat("Secrete Spice Silverfish Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonSkeletonDropChance = config.getFloat("Secrete Spice Skeleton Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonSlimeDropChance = config.getFloat("Secrete Spice Slime Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonSnowmanDropChance = config.getFloat("Secrete Spice Snowman Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonSpiderDropChance = config.getFloat("Secrete Spice Spider Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonWitchDropChance = config.getFloat("Secrete Spice Witch Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonZombieDropChance = config.getFloat("Secrete Spice Zombie Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonBatDropChance = config.getFloat("Secrete Spice Bat Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonChickenDropChance = config.getFloat("Secrete Spice Chicken Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonCowDropChance = config.getFloat("Secrete Spice Cow Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonHorseDropChance = config.getFloat("Secrete Spice Horse Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonMooshroomDropChance = config.getFloat("Secrete Spice Mooshroom Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonOcelotDropChance = config.getFloat("Secrete Spice Ocelot Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonPigDropChance = config.getFloat("Secrete Spice Pig Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonRabbitDropChance = config.getFloat("Secrete Spice Rabbit Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonSheepDropChance = config.getFloat("Secrete Spice Sheep Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonSquidDropChance = config.getFloat("Secrete Spice Squid Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonVillagerDropChance = config.getFloat("Secrete Spice Villager Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonWolfDropChance = config.getFloat("Secrete Spice Wolf Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonDragonDropChance = config.getFloat("Secrete Spice Dragon Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		ConfigHandler.NonWitherDropChance = config.getFloat("Secrete Spice Wither Drop Chance", category + " Secrete Section Non-Player Kill Drops", 0.05F, 0.0F, 1.0F, "Sets the Chance of Secrete Spice.\n[To turn off just disable Non-player drop in Secrete Section.]");
		
		
		
		
		if (config.hasChanged())
	        config.save();    
		}
}
