package com.kashdeya.tacotuesday.items;

import javax.annotation.Nullable;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class IcecreamBase extends FoodBase{
	
	public IcecreamBase(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setContainerItem(Items.BOWL);
	}	
	
	@Nullable
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
		if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            if(!entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.BOWL)))
            	ForgeHooks.onPlayerTossEvent(entityplayer, new ItemStack(Items.BOWL), false);	
        }
		return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
