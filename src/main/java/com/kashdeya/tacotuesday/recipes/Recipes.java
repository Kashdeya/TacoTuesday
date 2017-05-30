package com.kashdeya.tacotuesday.recipes;

import com.kashdeya.tacotuesday.inits.TacoItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void registerRecipes(){
		// Soft
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_tortilla), " w ", "www", " w ", 'w', new ItemStack(Items.WHEAT));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_beef_taco), "b", "t", 't', new ItemStack(TacoItems.bams_tortilla), 'b', new ItemStack(Items.COOKED_BEEF));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_pork_taco), "b", "t", 't', new ItemStack(TacoItems.bams_tortilla), 'b', new ItemStack(Items.COOKED_PORKCHOP));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_chicken_taco), "b", "t", 't', new ItemStack(TacoItems.bams_tortilla), 'b', new ItemStack(Items.COOKED_CHICKEN));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_mutton_taco), "b", "t", 't', new ItemStack(TacoItems.bams_tortilla), 'b', new ItemStack(Items.COOKED_MUTTON));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_rabbit_taco), "b", "t", 't', new ItemStack(TacoItems.bams_tortilla), 'b', new ItemStack(Items.COOKED_RABBIT));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_fish_taco), "b", "t", 't', new ItemStack(TacoItems.bams_tortilla), 'b', new ItemStack(Items.COOKED_FISH, 1, 0));
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_fish_taco), "b", "t", 't', new ItemStack(TacoItems.bams_tortilla), 'b', new ItemStack(Items.COOKED_FISH, 1, 1));
		
		// Crunchy
		GameRegistry.addSmelting(new ItemStack(TacoItems.bams_tortilla), new ItemStack(TacoItems.bams_hard_taco_shell), 1.0F);
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_hard_beef_taco), "b", "t", 't', new ItemStack(TacoItems.bams_hard_taco_shell), 'b', new ItemStack(Items.COOKED_BEEF));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_hard_pork_taco), "b", "t", 't', new ItemStack(TacoItems.bams_hard_taco_shell), 'b', new ItemStack(Items.COOKED_PORKCHOP));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_hard_chicken_taco), "b", "t", 't', new ItemStack(TacoItems.bams_hard_taco_shell), 'b', new ItemStack(Items.COOKED_CHICKEN));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_hard_mutton_taco), "b", "t", 't', new ItemStack(TacoItems.bams_hard_taco_shell), 'b', new ItemStack(Items.COOKED_MUTTON));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_hard_rabbit_taco), "b", "t", 't', new ItemStack(TacoItems.bams_hard_taco_shell), 'b', new ItemStack(Items.COOKED_RABBIT));
		
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_hard_fish_taco), "b", "t", 't', new ItemStack(TacoItems.bams_hard_taco_shell), 'b', new ItemStack(Items.COOKED_FISH, 1, 0));
		GameRegistry.addRecipe(new ItemStack(TacoItems.bams_hard_fish_taco), "b", "t", 't', new ItemStack(TacoItems.bams_hard_taco_shell), 'b', new ItemStack(Items.COOKED_FISH, 1, 1));
		
	}

}
