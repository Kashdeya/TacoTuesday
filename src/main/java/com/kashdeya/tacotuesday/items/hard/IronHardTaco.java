package com.kashdeya.tacotuesday.items.hard;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IronHardTaco extends ItemFood {
	
	public IronHardTaco(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setAlwaysEdible();
	}
	
	@Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
        if(!world.isRemote) {
        	int duration = 0;
            PotionEffect potion;
            int buffLength = 4 * 20;
            
            potion = player.getActivePotionEffect(MobEffects.STRENGTH);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, duration + 10 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.SLOWNESS);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, duration + 5 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.RESISTANCE);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, duration + 10 * buffLength, 1, false, false));
        }
    }
    
    @Override
    public boolean hasEffect(ItemStack stack){
    	return true;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag)
    {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.hit_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.hit_2").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.hit_3").getFormattedText());
    }
	
}
