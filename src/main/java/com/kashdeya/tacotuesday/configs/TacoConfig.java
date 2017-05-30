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
		
		config.addCustomCategoryComment(category + " Bams Food", "Cause everybody loves Tacos!");
		// Soft
		ConfigHandler.TacoHealAmount = config.getInt("Bams Soft Beef Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.TacoSaturation = config.getFloat("Bams Soft Beef Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PorkTacoHealAmount = config.getInt("Bams Soft Pork Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PorkTacoSaturation = config.getFloat("Bams Soft Pork Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.ChickenTacoHealAmount = config.getInt("Bams Soft Chicken Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.ChickenTacoSaturation = config.getFloat("Bams Soft Chicken Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.FishTacoHealAmount = config.getInt("Bams Soft Fish Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.FishTacoSaturation = config.getFloat("Bams Soft Fish Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MuttonTacoHealAmount = config.getInt("Bams Soft Mutton Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MuttonTacoSaturation = config.getFloat("Bams Soft Mutton Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.RabbitTacoHealAmount = config.getInt("Bams Soft Rabbit Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.RabbitTacoSaturation = config.getFloat("Bams Soft Rabbit Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		// Crunchy
		ConfigHandler.HardTacoHealAmount = config.getInt("Bams Hard Beef Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardTacoSaturation = config.getFloat("Bams Hard Beef Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardPorkTacoHealAmount = config.getInt("Bams Hard Pork Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardPorkTacoSaturation = config.getFloat("Bams Hard Pork Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardChickenTacoHealAmount = config.getInt("Bams Hard Chicken Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardChickenTacoSaturation = config.getFloat("Bams Hard Chicken Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardFishTacoHealAmount = config.getInt("Bams Hard Fish Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardFishTacoSaturation = config.getFloat("Bams Hard Fish Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardMuttonTacoHealAmount = config.getInt("Bams Hard Mutton Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardMuttonTacoSaturation = config.getFloat("Bams Hard Mutton Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.HardRabbitTacoHealAmount = config.getInt("Bams Hard Rabbit Taco Heal Amount", category + " Bams Food", 2, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.HardRabbitTacoSaturation = config.getFloat("Bams Hard Rabbit Taco Saturation Amount", category + " Bams Food", 0.4F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		if (config.hasChanged())
	        config.save();    
		}
}
