package com.kashdeya.tacotuesday.items.soft;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
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

public class OpTaco extends ItemFood {
	
	public OpTaco(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setAlwaysEdible();
	}
	
	@Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
        if(!world.isRemote) {
        	int duration = 0;
            PotionEffect potion;
            int buffLength = 2 * 20;
            
            potion = player.getActivePotionEffect(MobEffects.SPEED);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.SPEED, duration + 60 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.HASTE);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.HASTE, duration + 60 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.REGENERATION);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, duration + 30 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.SATURATION);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, duration + 60 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.INSTANT_HEALTH);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, duration + 10 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.HEALTH_BOOST);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, duration + 10 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.RESISTANCE);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, duration + 60 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.FIRE_RESISTANCE);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, duration + 60 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.LUCK);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.LUCK, duration + 60 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.WATER_BREATHING);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, duration + 60 * buffLength, 1, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.STRENGTH);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, duration + 60 * buffLength, 1, false, false));
        }
    }
    
    @Override
    public boolean hasEffect(ItemStack stack){
    	return true;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World player, List<String> list, ITooltipFlag flag)
    {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_2").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_3").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_4").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_5").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_6").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_7").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_8").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_9").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_10").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.opt_11").getFormattedText());
    }
	
}
