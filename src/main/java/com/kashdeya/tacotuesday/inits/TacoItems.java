package com.kashdeya.tacotuesday.inits;

import com.kashdeya.tacotuesday.handlers.ConfigHandler;
import com.kashdeya.tacotuesday.items.FoodBase;
import com.kashdeya.tacotuesday.items.ItemBase;
import com.kashdeya.tacotuesday.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TacoItems {
	// Soft
	public static Item bams_tortilla;
	public static Item bams_beef_taco;
	public static Item bams_pork_taco;
	public static Item bams_chicken_taco;
	public static Item bams_fish_taco;
	public static Item bams_mutton_taco;
	public static Item bams_rabbit_taco;
	// Crunchy
	public static Item bams_hard_taco_shell;
	public static Item bams_hard_beef_taco;
	public static Item bams_hard_pork_taco;
	public static Item bams_hard_chicken_taco;
	public static Item bams_hard_fish_taco;
	public static Item bams_hard_mutton_taco;
	public static Item bams_hard_rabbit_taco;
	
	public static void init(){
		// Soft
	    bams_tortilla = new ItemBase().setUnlocalizedName("bams_tortilla");
	    registerItem(bams_tortilla, "bams_tortilla");
	    
		bams_beef_taco = new FoodBase(ConfigHandler.TacoHealAmount, ConfigHandler.TacoSaturation, true).setUnlocalizedName("bams_beef_taco");
	    registerItem(bams_beef_taco, "bams_beef_taco");
	    
	    bams_pork_taco = new FoodBase(ConfigHandler.PorkTacoHealAmount, ConfigHandler.PorkTacoSaturation, true).setUnlocalizedName("bams_pork_taco");
	    registerItem(bams_pork_taco, "bams_pork_taco");
	    
	    bams_chicken_taco = new FoodBase(ConfigHandler.ChickenTacoHealAmount, ConfigHandler.ChickenTacoSaturation, true).setUnlocalizedName("bams_chicken_taco");
	    registerItem(bams_chicken_taco, "bams_chicken_taco");
	    
	    bams_fish_taco = new FoodBase(ConfigHandler.FishTacoHealAmount, ConfigHandler.FishTacoSaturation, true).setUnlocalizedName("bams_fish_taco");
	    registerItem(bams_fish_taco, "bams_fish_taco");
	    
	    bams_mutton_taco = new FoodBase(ConfigHandler.MuttonTacoHealAmount, ConfigHandler.MuttonTacoSaturation, true).setUnlocalizedName("bams_mutton_taco");
	    registerItem(bams_mutton_taco, "bams_mutton_taco");
	    
	    bams_rabbit_taco = new FoodBase(ConfigHandler.RabbitTacoHealAmount, ConfigHandler.RabbitTacoSaturation, true).setUnlocalizedName("bams_rabbit_taco");
	    registerItem(bams_rabbit_taco, "bams_rabbit_taco");
	    
	    // Crunchy
	    bams_hard_taco_shell = new ItemBase().setUnlocalizedName("bams_hard_taco_shell");
	    registerItem(bams_hard_taco_shell, "bams_hard_taco_shell");
	    
	    bams_hard_beef_taco = new FoodBase(ConfigHandler.HardTacoHealAmount, ConfigHandler.HardTacoSaturation, true).setUnlocalizedName("bams_hard_beef_taco");
	    registerItem(bams_hard_beef_taco, "bams_hard_beef_taco");
	    
	    bams_hard_pork_taco = new FoodBase(ConfigHandler.HardPorkTacoHealAmount, ConfigHandler.HardPorkTacoSaturation, true).setUnlocalizedName("bams_hard_pork_taco");
	    registerItem(bams_hard_pork_taco, "bams_hard_pork_taco");
	    
	    bams_hard_chicken_taco = new FoodBase(ConfigHandler.HardChickenTacoHealAmount, ConfigHandler.HardChickenTacoSaturation, true).setUnlocalizedName("bams_hard_chicken_taco");
	    registerItem(bams_hard_chicken_taco, "bams_hard_chicken_taco");
	    
	    bams_hard_fish_taco = new FoodBase(ConfigHandler.HardFishTacoHealAmount, ConfigHandler.HardFishTacoSaturation, true).setUnlocalizedName("bams_hard_fish_taco");
	    registerItem(bams_hard_fish_taco, "bams_hard_fish_taco");
	    
	    bams_hard_mutton_taco = new FoodBase(ConfigHandler.HardMuttonTacoHealAmount, ConfigHandler.HardMuttonTacoSaturation, true).setUnlocalizedName("bams_hard_mutton_taco");
	    registerItem(bams_hard_mutton_taco, "bams_hard_mutton_taco");
	    
	    bams_hard_rabbit_taco = new FoodBase(ConfigHandler.HardRabbitTacoHealAmount, ConfigHandler.HardRabbitTacoSaturation, true).setUnlocalizedName("bams_hard_rabbit_taco");
	    registerItem(bams_hard_rabbit_taco, "bams_hard_rabbit_taco");
		
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
