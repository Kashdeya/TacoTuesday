package com.kashdeya.tacotuesday.items;

import javax.annotation.Nullable;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class BottledMilk extends Item {
	
	public BottledMilk() {
		super();
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setContainerItem(Items.GLASS_BOTTLE);
	}
	
	@Nullable
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
		if (((entityLiving instanceof EntityPlayer)) && (!worldIn.isRemote))
    {
      entityLiving.stopActiveHand();
      if (!((EntityPlayer)entityLiving).capabilities.isCreativeMode)
      {
        stack.shrink(1);
        if ((!stack.isEmpty()) && (!((EntityPlayer)entityLiving).inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE)))) {
          ((EntityPlayer)entityLiving).dropItem(new ItemStack(Items.GLASS_BOTTLE), false);
        }
      }
      entityLiving.curePotionEffects(new ItemStack(Items.MILK_BUCKET));
      
      ((EntityPlayer)entityLiving).addStat(StatList.getObjectUseStats(this));
      
      return stack.isEmpty() ? new ItemStack(Items.GLASS_BOTTLE) : stack;
    }
    return stack;
  }

    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        playerIn.setActiveHand(hand);
        return new ActionResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(hand));
    }
}
