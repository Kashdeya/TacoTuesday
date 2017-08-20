package com.kashdeya.tacotuesday.recipes;

import com.kashdeya.tacotuesday.crafting.RecipeRegistry;
import com.kashdeya.tacotuesday.inits.TacoItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void registerRecipes(){
		// Soft
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.soft_tortilla), " w ", "www", " w ", 'w', "cropWheat");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.soft_beef_taco), "s", "b", 's', "softTortilla", 'b', "cookedBeef");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.soft_pork_taco), "s", "b", 's', "softTortilla", 'b', "cookedPork");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.soft_chicken_taco), "s", "b", 's', "softTortilla", 'b', "cookedChicken");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.soft_mutton_taco), "s", "b", 's', "softTortilla", 'b', "cookedMutton");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.soft_rabbit_taco), "s", "b", 's', "softTortilla", 'b', "cookedRabbit");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.soft_fish_taco), "s", "b", 's', "softTortilla", 'b', "cookedFish");
		// Crunchy
		GameRegistry.addSmelting(new ItemStack(TacoItems.soft_tortilla), new ItemStack(TacoItems.hard_tortilla), 1.0F);
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_beef_taco), "s", "b", 's', "crunchyTortilla", 'b', "cookedBeef");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_pork_taco), "s", "b", 's', "crunchyTortilla", 'b', "cookedPork");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_chicken_taco), "s", "b", 's', "crunchyTortilla", 'b', "cookedChicken");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_mutton_taco), "s", "b", 's', "crunchyTortilla", 'b', "cookedMutton");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_rabbit_taco), "s", "b", 's', "crunchyTortilla", 'b', "cookedRabbit");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_fish_taco), "s", "b", 's', "crunchyTortilla", 'b', "cookedFish");
		// IceCream
		GameRegistry.addSmelting(new ItemStack(TacoItems.uncooked_waffle_tortilla), new ItemStack(TacoItems.waffle_tortilla), 1.0F);
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.uncooked_waffle_tortilla), "wm", "es", 'w', "cropWheat", 'm', "listAllmilk", 'e', "egg", 's', "sugar");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.plain_ice_cream), "ccc", "mbm", "sss", 's', "snowball", 'm', "listAllmilk", 'c', "sugar", 'b', "bowl");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.chocolate_ice_cream), "ccc", "sbm", "aaa", 's', "snowball", 'm', "listAllmilk", 'c', "sugar", 'b', "bowl", 'a', new ItemStack(Items.DYE, 1, 3));
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.apple_ice_cream), "ccc", "sbm", "aaa", 's', "snowball", 'm', "listAllmilk", 'c', "sugar", 'b', "bowl", 'a', "apple");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.watermelon_ice_cream), "ccc", "sbm", "aaa", 's', "snowball", 'm', "listAllmilk", 'c', "sugar", 'b', "bowl", 'a', "melon");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.pumpkin_ice_cream), "ccc", "sbm", "aaa", 's', "snowball", 'm', "listAllmilk", 'c', "sugar", 'b', "bowl", 'a', "pumpkin");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.cookie_ice_cream), "ccc", "sbm", "aaa", 's', "snowball", 'm', "listAllmilk", 'c', "sugar", 'b', "bowl", 'a', "cookie");
		// IceCream Tacos
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.plain_ice_cream_taco), "sc", 's', "waffleTortilla", 'c', "vanillaIceCream");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.chocolate_ice_cream_taco), "sc", 's', "waffleTortilla", 'c', "chocolateIceCream");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.apple_ice_cream_taco), "sc", 's', "waffleTortilla", 'c', "appleIceCream");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.watermelon_ice_cream_taco), "sc", 's', "waffleTortilla", 'c', "watermelonIceCream");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.pumpkin_ice_cream_taco), "sc", 's', "waffleTortilla", 'c', "pumpkinIceCream");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.cookie_ice_cream_taco), "sc", 's', "waffleTortilla", 'c', "cookieIceCream");
		// Magic Tacos T1
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.taco_taco), "ttt", "tat", "ttt", 'a', "secretSpice", 't', "softTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.coal_taco), "cac", "ata", "cac", 'a', "secretSpice", 'c', new ItemStack(Items.COAL, 1, 0), 't', "softTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.diamond_taco), "dad", "ata", "dad", 'a', "secretSpice", 'd', "gemDiamond", 't', "softTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.emerald_taco), "eae", "ata", "eae", 'a', "secretSpice", 'e', "gemEmerald", 't', "softTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.iron_taco), "iai", "ata", "iai", 'a', "secretSpice", 'i', "ingotIron", 't', "softTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.lapis_taco), "lal", "ata", "lal", 'a', "secretSpice", 'l', "gemLapis", 't', "softTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.quartz_taco), "qaq", "ata", "qaq", 'a', "secretSpice", 'q', "gemQuartz", 't', "softTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.redstone_taco), "rar", "ata", "rar", 'a', "secretSpice", 'r', "blockRedstone", 't', "softTaco");
		// Magic Tacos T2
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_taco_taco), "ttt", "tat", "ttt", 'a', "secretSpice", 't', "hardTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_coal_taco), "cac", "ata", "cac", 'a', "secretSpice", 'c', "blockCoal", 't', "hardTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_diamond_taco), "dad", "ata", "dad", 'a', "secretSpice", 'd', "blockDiamond", 't', "hardTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_emerald_taco), "eae", "ata", "eae", 'a', "secretSpice", 'e', "blockEmerald", 't', "hardTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_iron_taco), "iai", "ata", "iai", 'a', "secretSpice", 'i', "blockIron", 't', "hardTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_lapis_taco), "lal", "ata", "lal", 'a', "secretSpice", 'l', "blockLapis", 't', "hardTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_quartz_taco), "qaq", "ata", "qaq", 'a', "secretSpice", 'q', "blockQuartz", 't', "hardTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.hard_redstone_taco), "rar", "ata", "rar", 'a', "secretSpice", 'r', "blockRedstone", 't', "hardTaco");
		// OP Tacos
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.op_soft_taco), "tcd", "eal", "qri", 'a', "secretSpice", 't', "softTacoTaco", 'c', "softCoalTaco", 'd', "softDiamondTaco", 'e', "softEmeraldTaco", 'l', "softLapisTaco", 'q', "softQuartzTaco", 'r', "softRedstoneTaco", 'i', "softIronTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.op_hard_taco), "tcd", "eal", "qri", 'a', "secretSpice", 't', "hardTacoTaco", 'c', "hardCoalTaco", 'd', "hardDiamondTaco", 'e', "hardEmeraldTaco", 'l', "hardLapisTaco", 'q', "hardQuartzTaco", 'r', "hardRedstoneTaco", 'i', "hardIronTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.super_op_taco), "aaa", "sah", "aaa", 'a', "secretSpice", 'h', "hardOpTaco", 's', "softOpTaco");
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.super_op_taco), "aaa", "has", "aaa", 'a', "secretSpice", 'h', "hardOpTaco", 's', "softOpTaco");
		// Bam Taco Soup
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.secret_taco_soup), "cwc", "sbs", "sss", 'c', "cookedBeef", 's', "secretSpice", 'b', "bowl", 'w', "waterBucket");
		// Bottled Milk
		RecipeRegistry.addShapedRecipe(new ItemStack(TacoItems.bottled_milk), "fg", 'f', new ItemStack(Items.MILK_BUCKET), 'g', new ItemStack(Items.GLASS_BOTTLE));
	}
	
}
