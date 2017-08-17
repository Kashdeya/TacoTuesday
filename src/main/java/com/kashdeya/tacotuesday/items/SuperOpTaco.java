package com.kashdeya.tacotuesday.items;

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

public class SuperOpTaco extends ItemFood {
	
	public SuperOpTaco(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setAlwaysEdible();
	}
	
	@Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
        if(!world.isRemote) {
        	int duration = 0;
            PotionEffect potion;
            int buffLength = 10 * 20;
            
            potion = player.getActivePotionEffect(MobEffects.SPEED);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.SPEED, duration + 180 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.HASTE);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.HASTE, duration + 180 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.REGENERATION);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, duration + 90 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.SATURATION);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, duration + 180 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.INSTANT_HEALTH);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, duration + 30 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.HEALTH_BOOST);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, duration + 30 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.RESISTANCE);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, duration + 180 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.FIRE_RESISTANCE);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, duration + 180 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.LUCK);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.LUCK, duration + 180 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.WATER_BREATHING);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, duration + 180 * buffLength, 5, false, false));
        	
        	potion = player.getActivePotionEffect(MobEffects.STRENGTH);
            if(potion != null){
            	duration = potion.getDuration();
            }
        	player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, duration + 180 * buffLength, 5, false, false));
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
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_2").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_3").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_4").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_5").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_6").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_7").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_8").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_9").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_10").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.sopt_11").getFormattedText());
    }
	
}
