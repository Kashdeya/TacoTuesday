package com.kashdeya.tacotuesday.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemBase  extends Item {
	
	public ItemBase() {
		super();
		this.setCreativeTab(CreativeTabs.FOOD);
	}
}