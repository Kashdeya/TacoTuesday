package com.kashdeya.tacotuesday.handlers;

import com.kashdeya.tacotuesday.inits.TacoItems;
import com.kashdeya.tacotuesday.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler {
	
	public static void tacoItems(){
		// Soft
		InventoryItemRender(TacoItems.soft_tortilla, "soft_tortilla");
		InventoryItemRender(TacoItems.soft_beef_taco, "soft_beef_taco");
		InventoryItemRender(TacoItems.soft_chicken_taco, "soft_chicken_taco");
		InventoryItemRender(TacoItems.soft_pork_taco, "soft_pork_taco");
		InventoryItemRender(TacoItems.soft_fish_taco, "soft_fish_taco");
		InventoryItemRender(TacoItems.soft_mutton_taco, "soft_mutton_taco");
		InventoryItemRender(TacoItems.soft_rabbit_taco, "soft_rabbit_taco");
		// Crunchy
		InventoryItemRender(TacoItems.hard_tortilla, "hard_tortilla");
		InventoryItemRender(TacoItems.hard_beef_taco, "hard_beef_taco");
		InventoryItemRender(TacoItems.hard_chicken_taco, "hard_chicken_taco");
		InventoryItemRender(TacoItems.hard_pork_taco, "hard_pork_taco");
		InventoryItemRender(TacoItems.hard_fish_taco, "hard_fish_taco");
		InventoryItemRender(TacoItems.hard_mutton_taco, "hard_mutton_taco");
		InventoryItemRender(TacoItems.hard_rabbit_taco, "hard_rabbit_taco");
		// Ice Cream
		InventoryItemRender(TacoItems.uncooked_waffle_tortilla, "uncooked_waffle_tortilla");
		InventoryItemRender(TacoItems.waffle_tortilla, "waffle_tortilla");
		InventoryItemRender(TacoItems.plain_ice_cream, "plain_ice_cream");
		InventoryItemRender(TacoItems.chocolate_ice_cream, "chocolate_ice_cream");
		InventoryItemRender(TacoItems.apple_ice_cream, "apple_ice_cream");
		InventoryItemRender(TacoItems.watermelon_ice_cream, "watermelon_ice_cream");
		InventoryItemRender(TacoItems.pumpkin_ice_cream, "pumpkin_ice_cream");
		InventoryItemRender(TacoItems.cookie_ice_cream, "cookie_ice_cream");		
		// Ice Cream Tacos
		InventoryItemRender(TacoItems.bottled_milk, "bottled_milk");
		InventoryItemRender(TacoItems.plain_ice_cream_taco, "plain_ice_cream_taco");
		InventoryItemRender(TacoItems.chocolate_ice_cream_taco, "chocolate_ice_cream_taco");
		InventoryItemRender(TacoItems.apple_ice_cream_taco, "apple_ice_cream_taco");
		InventoryItemRender(TacoItems.watermelon_ice_cream_taco, "watermelon_ice_cream_taco");
		InventoryItemRender(TacoItems.pumpkin_ice_cream_taco, "pumpkin_ice_cream_taco");
		InventoryItemRender(TacoItems.cookie_ice_cream_taco, "cookie_ice_cream_taco");
		// Magic Tacos T1
		InventoryItemRender(TacoItems.iron_taco, "iron_taco");
		InventoryItemRender(TacoItems.coal_taco, "coal_taco");
		InventoryItemRender(TacoItems.diamond_taco, "diamond_taco");
		InventoryItemRender(TacoItems.emerald_taco, "emerald_taco");
		InventoryItemRender(TacoItems.lapis_taco, "lapis_taco");
		InventoryItemRender(TacoItems.op_soft_taco, "op_soft_taco");
		InventoryItemRender(TacoItems.quartz_taco, "quartz_taco");
		InventoryItemRender(TacoItems.redstone_taco, "redstone_taco");
		InventoryItemRender(TacoItems.taco_taco, "taco_taco");
		// Magic Tacos T2
		InventoryItemRender(TacoItems.hard_iron_taco, "hard_iron_taco");
		InventoryItemRender(TacoItems.hard_coal_taco, "hard_coal_taco");
		InventoryItemRender(TacoItems.hard_diamond_taco, "hard_diamond_taco");
		InventoryItemRender(TacoItems.hard_emerald_taco, "hard_emerald_taco");
		InventoryItemRender(TacoItems.hard_lapis_taco, "hard_lapis_taco");
		InventoryItemRender(TacoItems.op_hard_taco, "op_hard_taco");
		InventoryItemRender(TacoItems.hard_quartz_taco, "hard_quartz_taco");
		InventoryItemRender(TacoItems.hard_redstone_taco, "hard_redstone_taco");
		InventoryItemRender(TacoItems.hard_taco_taco, "hard_taco_taco");
		// Super OP Taco
		InventoryItemRender(TacoItems.super_op_taco, "super_op_taco");
		// Bam Taco Soup
		InventoryItemRender(TacoItems.secret_taco_soup, "secret_taco_soup");
		InventoryItemRender(TacoItems.secret_spice, "secret_spice");
	}
	
	public static void InventoryBlockRender(Block block, String blockName) {
		if(block != null)
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
	}
	  
	public static void InventoryItemRender(Item item, String itemName) {
		if(item != null)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}
	
	public static void setCustomStateMap(Block block, StateMap stateMap){
		ModelLoader.setCustomStateMapper(block, stateMap);
	}

}
