package com.kashdeya.tacotuesday.items;

import java.util.List;

import com.kashdeya.tacotuesday.handlers.ConfigHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SecretSpice extends ItemFood {
	
	public SecretSpice(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.FOOD);
	}
	
	@Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
        if(!world.isRemote) {
        	if (ConfigHandler.SideEffects){
            	int duration = 0;
                PotionEffect potion;
                int buffLength = 20;
                
                potion = player.getActivePotionEffect(MobEffects.LEVITATION);
                if(potion != null){
                	duration = potion.getDuration();
                }
            	player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, duration + 3 * buffLength, 0, false, false));
        	}
        }
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag)
    {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.secret_spice_1").getFormattedText());
		list.add(TextFormatting.RED + new TextComponentTranslation("tooltip.secret_spice_2").getFormattedText());
    }
}