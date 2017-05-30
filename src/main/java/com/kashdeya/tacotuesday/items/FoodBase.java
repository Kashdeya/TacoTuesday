package com.kashdeya.tacotuesday.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodBase extends ItemFood {
	
	public FoodBase(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.FOOD);
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }
}
