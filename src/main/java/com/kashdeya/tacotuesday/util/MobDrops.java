package com.kashdeya.tacotuesday.util;

import java.util.Random;

import com.kashdeya.tacotuesday.handlers.ConfigHandler;
import com.kashdeya.tacotuesday.inits.TacoItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDrops {
	
	public static Random CHANCE = new java.util.Random();
	public static Random AMOUNT = new java.util.Random();
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
			if ((event.getSource().getImmediateSource() instanceof EntityPlayer && ConfigHandler.playerdrops)) {
				if (event.getEntityLiving() != null) {
					EntityLivingBase entity = event.getEntityLiving();
					// Monster
					if ((entity instanceof EntityBlaze)) {
						if(CHANCE.nextFloat() < ConfigHandler.BlazeDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityCaveSpider)) {
						if(CHANCE.nextFloat() < ConfigHandler.CaveDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityCreeper)) {
						if(CHANCE.nextFloat() < ConfigHandler.CreeperDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityEnderman)) {
						if(CHANCE.nextFloat() < ConfigHandler.EndermanDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityEndermite)) {
						if(CHANCE.nextFloat() < ConfigHandler.EndermiteDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityGhast)) {
						if(CHANCE.nextFloat() < ConfigHandler.GhastDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityGiantZombie)) {
						if(CHANCE.nextFloat() < ConfigHandler.GiantDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityGuardian)) {
						if(CHANCE.nextFloat() < ConfigHandler.GuardianDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityIronGolem)) {
						if(CHANCE.nextFloat() < ConfigHandler.IronDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityMagmaCube)) {
						if(CHANCE.nextFloat() < ConfigHandler.MagmaDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityPigZombie)) {
						if(CHANCE.nextFloat() < ConfigHandler.PigZombieDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityPolarBear)) {
						if(CHANCE.nextFloat() < ConfigHandler.PolarDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityShulker)) {
						if(CHANCE.nextFloat() < ConfigHandler.ShulkerDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntitySilverfish)) {
						if(CHANCE.nextFloat() < ConfigHandler.SilverfishDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntitySkeleton)) {
						if(CHANCE.nextFloat() < ConfigHandler.SkeletonDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntitySlime)) {
						if(CHANCE.nextFloat() < ConfigHandler.SlimeDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntitySnowman)) {
						if(CHANCE.nextFloat() < ConfigHandler.SnowmanDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntitySpider)) {
						if(CHANCE.nextFloat() < ConfigHandler.SpiderDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityWitch)) {
						if(CHANCE.nextFloat() < ConfigHandler.WitchDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityZombie)) {
						if(CHANCE.nextFloat() < ConfigHandler.ZombieDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					// Passive
					if ((entity instanceof EntityBat)) {
						if(CHANCE.nextFloat() < ConfigHandler.BatDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityChicken)) {
						if(CHANCE.nextFloat() < ConfigHandler.ChickenDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityCow)) {
						if(CHANCE.nextFloat() < ConfigHandler.CowDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityHorse)) {
						if(CHANCE.nextFloat() < ConfigHandler.HorseDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityMooshroom)) {
						if(CHANCE.nextFloat() < ConfigHandler.MooshroomDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityOcelot)) {
						if(CHANCE.nextFloat() < ConfigHandler.OcelotDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityPig)) {
						if(CHANCE.nextFloat() < ConfigHandler.PigDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityRabbit)) {
						if(CHANCE.nextFloat() < ConfigHandler.RabbitDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntitySheep)) {
						if(CHANCE.nextFloat() < ConfigHandler.SheepDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntitySquid)) {
						if(CHANCE.nextFloat() < ConfigHandler.SquidDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityVillager)) {
						if(CHANCE.nextFloat() < ConfigHandler.VillagerDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityWolf)) {
						if(CHANCE.nextFloat() < ConfigHandler.WolfDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					// Bosses
					if ((entity instanceof EntityDragon)) {
						if(CHANCE.nextFloat() < ConfigHandler.DragonDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
					if ((entity instanceof EntityWither)) {
						if(CHANCE.nextFloat() < ConfigHandler.WitherDropChance) {
							entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(4)), 0.0F);
						}						
					}
				}
			}
			
			if (event.getEntityLiving() != null && ConfigHandler.nonplayerdrops) {
				EntityLivingBase entity = event.getEntityLiving();
				// Monster
				if ((entity instanceof EntityBlaze)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonBlazeDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityCaveSpider)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonCaveDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityCreeper)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonCreeperDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityEnderman)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonEndermanDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityEndermite)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonEndermiteDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityGhast)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonGhastDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityGiantZombie)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonGiantDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityGuardian)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonGuardianDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityIronGolem)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonIronDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityMagmaCube)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonMagmaDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityPigZombie)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonPigZombieDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityPolarBear)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonPolarDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityShulker)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonShulkerDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntitySilverfish)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonSilverfishDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntitySkeleton)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonSkeletonDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntitySlime)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonSlimeDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntitySnowman)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonSnowmanDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntitySpider)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonSpiderDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityWitch)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonWitchDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityZombie)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonZombieDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				// Passive
				if ((entity instanceof EntityBat)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonBatDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityChicken)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonChickenDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityCow)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonCowDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityHorse)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonHorseDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityMooshroom)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonMooshroomDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityOcelot)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonOcelotDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityPig)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonPigDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityRabbit)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonRabbitDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntitySheep)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonSheepDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntitySquid)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonSquidDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityVillager)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonVillagerDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityWolf)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonWolfDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				// Bosses
				if ((entity instanceof EntityDragon)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonDragonDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
				if ((entity instanceof EntityWither)) {
					if(CHANCE.nextFloat() < ConfigHandler.NonWitherDropChance) {
						entity.entityDropItem(new ItemStack(TacoItems.secret_spice,AMOUNT.nextInt(2)), 0.0F);
					}						
				}
			}
	}
}
