package com.kashdeya.tacotuesday.proxy;

import com.kashdeya.tacotuesday.recipes.Recipes;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CommonProxy {

	public void registerTileEntities() {
    	// Tile Entities		
	}

    public void init() {
    	// Recipes
    	Recipes.registerRecipes();
    }

	public void registerRenderers() {
		//unused - only called clientside
	}

}