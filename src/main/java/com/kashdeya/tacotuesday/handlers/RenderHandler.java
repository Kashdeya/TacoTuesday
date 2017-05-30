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
		InventoryItemRender(TacoItems.bams_tortilla, "bams_tortilla");
		InventoryItemRender(TacoItems.bams_beef_taco, "bams_beef_taco");
		InventoryItemRender(TacoItems.bams_chicken_taco, "bams_chicken_taco");
		InventoryItemRender(TacoItems.bams_pork_taco, "bams_pork_taco");
		InventoryItemRender(TacoItems.bams_fish_taco, "bams_fish_taco");
		InventoryItemRender(TacoItems.bams_mutton_taco, "bams_mutton_taco");
		InventoryItemRender(TacoItems.bams_rabbit_taco, "bams_rabbit_taco");
		//Crunchy
		InventoryItemRender(TacoItems.bams_hard_taco_shell, "bams_hard_taco_shell");
		InventoryItemRender(TacoItems.bams_hard_beef_taco, "bams_hard_beef_taco");
		InventoryItemRender(TacoItems.bams_hard_chicken_taco, "bams_hard_chicken_taco");
		InventoryItemRender(TacoItems.bams_hard_pork_taco, "bams_hard_pork_taco");
		InventoryItemRender(TacoItems.bams_hard_fish_taco, "bams_hard_fish_taco");
		InventoryItemRender(TacoItems.bams_hard_mutton_taco, "bams_hard_mutton_taco");
		InventoryItemRender(TacoItems.bams_hard_rabbit_taco, "bams_hard_rabbit_taco");
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
