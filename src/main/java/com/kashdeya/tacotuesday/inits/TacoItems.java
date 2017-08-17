package com.kashdeya.tacotuesday.inits;

import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tacotuesday.handlers.ConfigHandler;
import com.kashdeya.tacotuesday.items.BottledMilk;
import com.kashdeya.tacotuesday.items.FoodBase;
import com.kashdeya.tacotuesday.items.IcecreamBase;
import com.kashdeya.tacotuesday.items.ItemBase;
import com.kashdeya.tacotuesday.items.SecretSoup;
import com.kashdeya.tacotuesday.items.SecretSpice;
import com.kashdeya.tacotuesday.items.SuperOpTaco;
import com.kashdeya.tacotuesday.items.hard.CoalHardTaco;
import com.kashdeya.tacotuesday.items.hard.DiamondHardTaco;
import com.kashdeya.tacotuesday.items.hard.EmeraldHardTaco;
import com.kashdeya.tacotuesday.items.hard.IronHardTaco;
import com.kashdeya.tacotuesday.items.hard.LapisHardTaco;
import com.kashdeya.tacotuesday.items.hard.OpHardTaco;
import com.kashdeya.tacotuesday.items.hard.QuartzHardTaco;
import com.kashdeya.tacotuesday.items.hard.RedstoneHardTaco;
import com.kashdeya.tacotuesday.items.soft.CoalTaco;
import com.kashdeya.tacotuesday.items.soft.DiamondTaco;
import com.kashdeya.tacotuesday.items.soft.EmeraldTaco;
import com.kashdeya.tacotuesday.items.soft.IronTaco;
import com.kashdeya.tacotuesday.items.soft.LapisTaco;
import com.kashdeya.tacotuesday.items.soft.OpTaco;
import com.kashdeya.tacotuesday.items.soft.QuartzTaco;
import com.kashdeya.tacotuesday.items.soft.RedstoneTaco;
import com.kashdeya.tacotuesday.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class TacoItems {
    static Set<Item> items = Sets.newHashSet();
    
	// Soft
	public static Item soft_tortilla;
	public static Item soft_beef_taco;
	public static Item soft_pork_taco;
	public static Item soft_chicken_taco;
	public static Item soft_fish_taco;
	public static Item soft_mutton_taco;
	public static Item soft_rabbit_taco;
	// Crunchy
	public static Item hard_tortilla;
	public static Item hard_beef_taco;
	public static Item hard_pork_taco;
	public static Item hard_chicken_taco;
	public static Item hard_fish_taco;
	public static Item hard_mutton_taco;
	public static Item hard_rabbit_taco;
	// Ice Cream
	public static Item bottled_milk;
	public static Item plain_ice_cream;
	public static Item chocolate_ice_cream;
	public static Item watermelon_ice_cream;
	public static Item pumpkin_ice_cream;
	public static Item apple_ice_cream;
	public static Item cookie_ice_cream;
	// Ice Cream Tacos
	public static Item uncooked_waffle_tortilla;
	public static Item waffle_tortilla;
	public static Item plain_ice_cream_taco;
	public static Item chocolate_ice_cream_taco;
	public static Item watermelon_ice_cream_taco;
	public static Item pumpkin_ice_cream_taco;
	public static Item apple_ice_cream_taco;
	public static Item cookie_ice_cream_taco;
	// Magic Tacos T1
	public static Item taco_taco;
	public static Item iron_taco;
	public static Item coal_taco;
	public static Item lapis_taco;
	public static Item diamond_taco;
	public static Item emerald_taco;
	public static Item redstone_taco;
	public static Item quartz_taco;
	public static Item op_soft_taco;
	// Magic Tacos T2
	public static Item hard_taco_taco;
	public static Item hard_iron_taco;
	public static Item hard_coal_taco;
	public static Item hard_lapis_taco;
	public static Item hard_diamond_taco;
	public static Item hard_emerald_taco;
	public static Item hard_redstone_taco;
	public static Item hard_quartz_taco;
	public static Item op_hard_taco;
	// Magic OP Taco
	public static Item super_op_taco;
	// Taco Soup
	public static Item secret_taco_soup;
	public static Item secret_spice;
	
	public static void init(){
		// Soft
		soft_tortilla = new FoodBase(ConfigHandler.TortillaHealAmount, ConfigHandler.TortillaSaturation, ConfigHandler.TortillaFood).setUnlocalizedName("soft_tortilla");
	    registerItem(soft_tortilla, "soft_tortilla");
	    soft_beef_taco = new FoodBase(ConfigHandler.TacoHealAmount, ConfigHandler.TacoSaturation, ConfigHandler.TacoFood).setUnlocalizedName("soft_beef_taco");
	    registerItem(soft_beef_taco, "soft_beef_taco");
	    soft_pork_taco = new FoodBase(ConfigHandler.PorkTacoHealAmount, ConfigHandler.PorkTacoSaturation, ConfigHandler.PorkTacoFood).setUnlocalizedName("soft_pork_taco");
	    registerItem(soft_pork_taco, "soft_pork_taco");
	    soft_chicken_taco = new FoodBase(ConfigHandler.ChickenTacoHealAmount, ConfigHandler.ChickenTacoSaturation, ConfigHandler.ChickenTacoFood).setUnlocalizedName("soft_chicken_taco");
	    registerItem(soft_chicken_taco, "soft_chicken_taco");
	    soft_fish_taco = new FoodBase(ConfigHandler.FishTacoHealAmount, ConfigHandler.FishTacoSaturation, ConfigHandler.FishTacoFood).setUnlocalizedName("soft_fish_taco");
	    registerItem(soft_fish_taco, "soft_fish_taco");
	    soft_mutton_taco = new FoodBase(ConfigHandler.MuttonTacoHealAmount, ConfigHandler.MuttonTacoSaturation, ConfigHandler.MuttonTacoFood).setUnlocalizedName("soft_mutton_taco");
	    registerItem(soft_mutton_taco, "soft_mutton_taco");
	    soft_rabbit_taco = new FoodBase(ConfigHandler.RabbitTacoHealAmount, ConfigHandler.RabbitTacoSaturation, ConfigHandler.RabbitTacoFood).setUnlocalizedName("soft_rabbit_taco");
	    registerItem(soft_rabbit_taco, "soft_rabbit_taco");
	    
	    // Crunchy
	    hard_tortilla = new FoodBase(ConfigHandler.HardTacoShellHealAmount, ConfigHandler.HardTacoShellSaturation, ConfigHandler.HardTacoShellFood).setUnlocalizedName("hard_torllia");
	    registerItem(hard_tortilla, "hard_tortilla");
	    hard_beef_taco = new FoodBase(ConfigHandler.HardTacoHealAmount, ConfigHandler.HardTacoSaturation, ConfigHandler.HardTacoFood).setUnlocalizedName("hard_beef_taco");
	    registerItem(hard_beef_taco, "hard_beef_taco");
	    hard_pork_taco = new FoodBase(ConfigHandler.HardPorkTacoHealAmount, ConfigHandler.HardPorkTacoSaturation, ConfigHandler.HardChickenTacoFood).setUnlocalizedName("hard_pork_taco");
	    registerItem(hard_pork_taco, "hard_pork_taco");
	    hard_chicken_taco = new FoodBase(ConfigHandler.HardChickenTacoHealAmount, ConfigHandler.HardChickenTacoSaturation, ConfigHandler.HardPorkTacoFood).setUnlocalizedName("hard_chicken_taco");
	    registerItem(hard_chicken_taco, "hard_chicken_taco");
	    hard_fish_taco = new FoodBase(ConfigHandler.HardFishTacoHealAmount, ConfigHandler.HardFishTacoSaturation, ConfigHandler.HardFishTacoFood).setUnlocalizedName("hard_fish_taco");
	    registerItem(hard_fish_taco, "hard_fish_taco");
	    hard_mutton_taco = new FoodBase(ConfigHandler.HardMuttonTacoHealAmount, ConfigHandler.HardMuttonTacoSaturation, ConfigHandler.HardMuttonTacoFood).setUnlocalizedName("hard_mutton_taco");
	    registerItem(hard_mutton_taco, "hard_mutton_taco");
	    hard_rabbit_taco = new FoodBase(ConfigHandler.HardRabbitTacoHealAmount, ConfigHandler.HardRabbitTacoSaturation, ConfigHandler.HardRabbitTacoFood).setUnlocalizedName("hard_rabbit_taco");
	    registerItem(hard_rabbit_taco, "hard_rabbit_taco");
	    
	    // IceCream
	    bottled_milk = new BottledMilk().setUnlocalizedName("bottled_milk");
	    registerItem(bottled_milk, "bottled_milk");
	    plain_ice_cream = new IcecreamBase(ConfigHandler.PlainHealAmount, ConfigHandler.PlainSaturation, ConfigHandler.PlainFood).setUnlocalizedName("plain_ice_cream");
	    registerItem(plain_ice_cream, "plain_ice_cream");
	    chocolate_ice_cream = new IcecreamBase(ConfigHandler.ChocolateHealAmount, ConfigHandler.ChocolateSaturation, ConfigHandler.ChocolateFood).setUnlocalizedName("chocolate_ice_cream");
	    registerItem(chocolate_ice_cream, "chocolate_ice_cream");
	    watermelon_ice_cream = new IcecreamBase(ConfigHandler.WatermelonHealAmount, ConfigHandler.WatermelonSaturation, ConfigHandler.WatermelonFood).setUnlocalizedName("watermelon_ice_cream");
	    registerItem(watermelon_ice_cream, "watermelon_ice_cream");
	    pumpkin_ice_cream = new IcecreamBase(ConfigHandler.PumpkinHealAmount, ConfigHandler.PumpkinSaturation, ConfigHandler.PumpkinFood).setUnlocalizedName("pumpkin_ice_cream");
	    registerItem(pumpkin_ice_cream, "pumpkin_ice_cream");
	    apple_ice_cream = new IcecreamBase(ConfigHandler.AppleHealAmount, ConfigHandler.AppleSaturation, ConfigHandler.AppleFood).setUnlocalizedName("apple_ice_cream");
	    registerItem(apple_ice_cream, "apple_ice_cream");
	    cookie_ice_cream = new IcecreamBase(ConfigHandler.CookieHealAmount, ConfigHandler.CookieSaturation, ConfigHandler.CookieFood).setUnlocalizedName("cookie_ice_cream");
	    registerItem(cookie_ice_cream, "cookie_ice_cream");
	    
	    // IceCream Tacos
	    uncooked_waffle_tortilla = new ItemBase().setUnlocalizedName("uncooked_waffle_tortilla");
	    registerItem(uncooked_waffle_tortilla, "uncooked_waffle_tortilla");
	    waffle_tortilla = new FoodBase(ConfigHandler.WaffleHealAmount, ConfigHandler.WaffleSaturation, ConfigHandler.WaffleFood).setUnlocalizedName("waffle_tortilla");
	    registerItem(waffle_tortilla, "waffle_tortilla");
	    plain_ice_cream_taco = new FoodBase(ConfigHandler.PlainTacoHealAmount, ConfigHandler.plainTacoSaturation, ConfigHandler.plainTacoFood).setUnlocalizedName("plain_ice_cream_taco");
	    registerItem(plain_ice_cream_taco, "plain_ice_cream_taco");
	    chocolate_ice_cream_taco = new FoodBase(ConfigHandler.ChocolateTacoHealAmount, ConfigHandler.ChocolateTacoSaturation, ConfigHandler.ChocolateTacoFood).setUnlocalizedName("chocolate_ice_cream_taco");
	    registerItem(chocolate_ice_cream_taco, "chocolate_ice_cream_taco");
	    watermelon_ice_cream_taco = new FoodBase(ConfigHandler.WatermelonTacoHealAmount, ConfigHandler.WatermelonTacoSaturation, ConfigHandler.WatermelonTacoFood).setUnlocalizedName("watermelon_ice_cream_taco");
	    registerItem(watermelon_ice_cream_taco, "watermelon_ice_cream_taco");
	    pumpkin_ice_cream_taco = new FoodBase(ConfigHandler.PumpkinTacoHealAmount, ConfigHandler.PumpkinTacoSaturation, ConfigHandler.PumpkinTacoFood).setUnlocalizedName("pumpkin_ice_cream_taco");
	    registerItem(pumpkin_ice_cream_taco, "pumpkin_ice_cream_taco");
	    apple_ice_cream_taco = new FoodBase(ConfigHandler.AppleTacoHealAmount, ConfigHandler.AppleTacoSaturation, ConfigHandler.AppleTacoFood).setUnlocalizedName("apple_ice_cream_taco");
	    registerItem(apple_ice_cream_taco, "apple_ice_cream_taco");
	    cookie_ice_cream_taco = new FoodBase(ConfigHandler.CookieTacoHealAmount, ConfigHandler.CookieTacoSaturation, ConfigHandler.CookieTacoFood).setUnlocalizedName("cookie_ice_cream_taco");
	    registerItem(cookie_ice_cream_taco, "cookie_ice_cream_taco");
		
	    // Magic Tacos T1
	 	taco_taco = new FoodBase(ConfigHandler.TacoTaco, ConfigHandler.TacoTacoSaturation, ConfigHandler.TacoTacoFood).setUnlocalizedName("taco_taco");
	 	registerItem(taco_taco, "taco_taco");
	 	iron_taco = new IronTaco(ConfigHandler.IronTaco, ConfigHandler.IronTacoSaturation, ConfigHandler.IronTacoFood).setUnlocalizedName("iron_taco");
	 	registerItem(iron_taco, "iron_taco");
	 	coal_taco = new CoalTaco(ConfigHandler.CoalTaco, ConfigHandler.CoalTacoSaturation, ConfigHandler.CoalTacoFood).setUnlocalizedName("coal_taco");
	 	registerItem(coal_taco, "coal_taco");
	 	lapis_taco = new LapisTaco(ConfigHandler.LapisTaco, ConfigHandler.LapisTacoSaturation, ConfigHandler.LapisTacoFood).setUnlocalizedName("lapis_taco");
	 	registerItem(lapis_taco, "lapis_taco");
	 	diamond_taco = new DiamondTaco(ConfigHandler.DiamondTaco, ConfigHandler.DiamondTacoSaturation, ConfigHandler.DiamondTacoFood).setUnlocalizedName("diamond_taco");
	 	registerItem(diamond_taco, "diamond_taco");
	 	emerald_taco = new EmeraldTaco(ConfigHandler.EmeraldTaco, ConfigHandler.EmeraldTacoSaturation, ConfigHandler.EmeraldTacoFood).setUnlocalizedName("emerald_taco");
	 	registerItem(emerald_taco, "emerald_taco");
	 	redstone_taco = new RedstoneTaco(ConfigHandler.RedstoneTaco, ConfigHandler.RedstoneTacoSaturation, ConfigHandler.RedstoneTacoFood).setUnlocalizedName("redstone_taco");
	 	registerItem(redstone_taco, "redstone_taco");
	 	quartz_taco = new QuartzTaco(ConfigHandler.QuartzTaco, ConfigHandler.QuartzTacoSaturation, ConfigHandler.QuartzTacoFood).setUnlocalizedName("quartz_taco");
	 	registerItem(quartz_taco, "quartz_taco");
	 	op_soft_taco = new OpTaco(ConfigHandler.OpSoftTaco, ConfigHandler.OpSoftTacoSaturation, ConfigHandler.OpSoftTacoFood).setUnlocalizedName("op_soft_taco");
	 	registerItem(op_soft_taco, "op_soft_taco");
	 	  
	 	// Magic Tacos T2
	 	hard_taco_taco = new FoodBase(ConfigHandler.HardTacoTaco, ConfigHandler.HardTacoTacoSaturation, ConfigHandler.HardTacoTacoFood).setUnlocalizedName("hard_taco_taco");
	 	registerItem(hard_taco_taco, "hard_taco_taco");
	 	hard_iron_taco = new IronHardTaco(ConfigHandler.HardIronTaco, ConfigHandler.HardIronTacoSaturation, ConfigHandler.HardIronTacoFood).setUnlocalizedName("hard_iron_taco");
	 	registerItem(hard_iron_taco, "hard_iron_taco");
	 	hard_coal_taco = new CoalHardTaco(ConfigHandler.HardCoalTaco, ConfigHandler.HardCoalTacoSaturation, ConfigHandler.HardCoalTacoFood).setUnlocalizedName("hard_coal_taco");
	 	registerItem(hard_coal_taco, "hard_coal_taco");
	 	hard_lapis_taco = new LapisHardTaco(ConfigHandler.HardLapisTaco, ConfigHandler.HardLapisTacoSaturation, ConfigHandler.HardLapisTacoFood).setUnlocalizedName("hard_lapis_taco");
	 	registerItem(hard_lapis_taco, "hard_lapis_taco");
	 	hard_diamond_taco = new DiamondHardTaco(ConfigHandler.HardDiamondTaco, ConfigHandler.HardDiamondTacoSaturation, ConfigHandler.HardDiamondTacoFood).setUnlocalizedName("hard_diamond_taco");
	 	registerItem(hard_diamond_taco, "hard_diamond_taco");
	 	hard_emerald_taco = new EmeraldHardTaco(ConfigHandler.HardEmeraldTaco, ConfigHandler.HardEmeraldTacoSaturation, ConfigHandler.HardEmeraldTacoFood).setUnlocalizedName("hard_emerald_taco");
	 	registerItem(hard_emerald_taco, "hard_emerald_taco");
	 	hard_quartz_taco = new RedstoneHardTaco(ConfigHandler.HardQuartzTaco, ConfigHandler.HardQuartzTacoSaturation, ConfigHandler.HardQuartzTacoFood).setUnlocalizedName("hard_quartz_taco");
	 	registerItem(hard_quartz_taco, "hard_quartz_taco");
	 	hard_redstone_taco = new QuartzHardTaco(ConfigHandler.HardRedstoneTaco, ConfigHandler.HardRedstoneTacoSaturation, ConfigHandler.HardRedstoneTacoFood).setUnlocalizedName("hard_redstone_taco");
	 	registerItem(hard_redstone_taco, "hard_redstone_taco");
	 	op_hard_taco = new OpHardTaco(ConfigHandler.OpHardTaco, ConfigHandler.OpHardTacoSaturation, ConfigHandler.OpHardTacoFood).setUnlocalizedName("op_hard_taco");
	 	registerItem(op_hard_taco, "op_hard_taco");
	 	 	
	 	// Super OP Taco
	 	super_op_taco = new SuperOpTaco(ConfigHandler.SuperOpTaco, ConfigHandler.SuperOpTacoSaturation, ConfigHandler.SuperOpTacoFood).setUnlocalizedName("super_op_taco");
	 	registerItem(super_op_taco, "super_op_taco");
	 	
	 	// Taco Soup
	 	secret_taco_soup = new SecretSoup(ConfigHandler.SoupTaco , ConfigHandler.SoupTacoSaturation , ConfigHandler.SoupTacoFood).setUnlocalizedName("secret_taco_soup");
	 	registerItem(secret_taco_soup, "secret_taco_soup");
	 	 	
	 	secret_spice = new SecretSpice(ConfigHandler.SecretSpice , ConfigHandler.SecretSpiceSaturation, ConfigHandler.SecretSpiceFood).setUnlocalizedName("secret_spice");
	 	registerItem(secret_spice, "secret_spice");
	}
	
	static void registerItem(Item item, String name){
	    item.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
	    items.add(item);
	}
	
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        Iterator<Item> iterator = items.iterator();
        
        while(iterator.hasNext())
            registry.register(iterator.next());
    }
}
