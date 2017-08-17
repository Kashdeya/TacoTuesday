package com.kashdeya.tacotuesday.util;

import com.kashdeya.tacotuesday.inits.TacoItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	
	public static void init(){
		// IceCream
		OreDictionary.registerOre("bowl", Items.BOWL);
		OreDictionary.registerOre("sugar", Items.SUGAR);
		OreDictionary.registerOre("snowball", Items.SNOWBALL);
		OreDictionary.registerOre("apple", Items.APPLE);
		OreDictionary.registerOre("melon", Items.MELON);
		OreDictionary.registerOre("pumpkin", Blocks.PUMPKIN);
		OreDictionary.registerOre("cookie", Items.COOKIE);
		OreDictionary.registerOre("milkBucket", Items.MILK_BUCKET);
		
		// Meats
		OreDictionary.registerOre("cookedFish", Items.COOKED_FISH);
		OreDictionary.registerOre("cookedPork", Items.COOKED_PORKCHOP);
		OreDictionary.registerOre("cookedBeef", Items.COOKED_BEEF);
		OreDictionary.registerOre("cookedMutton", Items.COOKED_MUTTON);
		OreDictionary.registerOre("cookedRabbit", Items.COOKED_RABBIT);
		OreDictionary.registerOre("cookedChicken", Items.COOKED_CHICKEN);
		
		// Tortillas
		OreDictionary.registerOre("waffleTortilla", TacoItems.waffle_tortilla);
		OreDictionary.registerOre("softTortilla", TacoItems.soft_tortilla);
		OreDictionary.registerOre("crunchyTortilla", TacoItems.hard_tortilla);
		
		// Ice Cream
		OreDictionary.registerOre("vanillaIceCream", TacoItems.plain_ice_cream);
		OreDictionary.registerOre("chocolateIceCream", TacoItems.chocolate_ice_cream);
		OreDictionary.registerOre("pumpkinIceCream", TacoItems.pumpkin_ice_cream);
		OreDictionary.registerOre("watermelonIceCream", TacoItems.watermelon_ice_cream);
		OreDictionary.registerOre("cookieIceCream", TacoItems.cookie_ice_cream);
		OreDictionary.registerOre("appleIceCream", TacoItems.apple_ice_cream);
		OreDictionary.registerOre("listAllmilk", TacoItems.bottled_milk);
		
		// Tacos
		OreDictionary.registerOre("softTaco", TacoItems.soft_beef_taco);
		OreDictionary.registerOre("softTaco", TacoItems.soft_chicken_taco);
		OreDictionary.registerOre("softTaco", TacoItems.soft_fish_taco);
		OreDictionary.registerOre("softTaco", TacoItems.soft_mutton_taco);
		OreDictionary.registerOre("softTaco", TacoItems.soft_pork_taco);
		OreDictionary.registerOre("softTaco", TacoItems.soft_rabbit_taco);
		
		// Hard Tacos
		OreDictionary.registerOre("hardTaco", TacoItems.hard_beef_taco);
		OreDictionary.registerOre("hardTaco", TacoItems.hard_chicken_taco);
		OreDictionary.registerOre("hardTaco", TacoItems.hard_fish_taco);
		OreDictionary.registerOre("hardTaco", TacoItems.hard_mutton_taco);
		OreDictionary.registerOre("hardTaco", TacoItems.hard_pork_taco);
		OreDictionary.registerOre("hardTaco", TacoItems.hard_rabbit_taco);
		
		// Soft Magic Tacos
		OreDictionary.registerOre("softTacoTaco", TacoItems.taco_taco);
		OreDictionary.registerOre("softCoalTaco", TacoItems.coal_taco);
		OreDictionary.registerOre("softDiamondTaco", TacoItems.diamond_taco);
		OreDictionary.registerOre("softEmeraldTaco", TacoItems.emerald_taco);
		OreDictionary.registerOre("softIronTaco", TacoItems.iron_taco);
		OreDictionary.registerOre("softLapisTaco", TacoItems.lapis_taco);
		OreDictionary.registerOre("softQuartzTaco", TacoItems.quartz_taco);
		OreDictionary.registerOre("softRedstoneTaco", TacoItems.redstone_taco);
		OreDictionary.registerOre("softOpTaco", TacoItems.op_soft_taco);
		
		// Hard Magic Tacos
		OreDictionary.registerOre("hardTacoTaco", TacoItems.hard_taco_taco);
		OreDictionary.registerOre("hardCoalTaco", TacoItems.hard_coal_taco);
		OreDictionary.registerOre("hardDiamondTaco", TacoItems.hard_diamond_taco);
		OreDictionary.registerOre("hardEmeraldTaco", TacoItems.hard_emerald_taco);
		OreDictionary.registerOre("hardIronTaco", TacoItems.hard_iron_taco);
		OreDictionary.registerOre("hardLapisTaco", TacoItems.hard_lapis_taco);
		OreDictionary.registerOre("hardQuartzTaco", TacoItems.hard_quartz_taco);
		OreDictionary.registerOre("hardRedstoneTaco", TacoItems.hard_redstone_taco);
		OreDictionary.registerOre("hardOpTaco", TacoItems.op_hard_taco);
		
		// Soup
		OreDictionary.registerOre("secretSpice", TacoItems.secret_spice);
		OreDictionary.registerOre("waterBucket", Items.WATER_BUCKET);
	}

}
