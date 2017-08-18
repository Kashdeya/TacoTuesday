package com.kashdeya.tacotuesday.main;

import com.kashdeya.tacotuesday.configs.TacoConfig;
import com.kashdeya.tacotuesday.inits.TacoItems;
import com.kashdeya.tacotuesday.proxy.CommonProxy;
import com.kashdeya.tacotuesday.util.MobDrops;
import com.kashdeya.tacotuesday.util.OreDict;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class TacoTuesday {
	
	@Instance(Reference.MOD_ID)
    public static TacoTuesday instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	
		// Configs
		TacoConfig.initMain();
		
    	// Load everything else
		TacoItems.init();
    	
    	// Events
    	OreDict.init();
    	MinecraftForge.EVENT_BUS.register(instance);
    	MinecraftForge.EVENT_BUS.register(new MobDrops());
    	
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    	
    	// Renders
        PROXY.registerTileEntities();
        PROXY.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {}
    
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        TacoItems.registerItems(event);
    }
}
