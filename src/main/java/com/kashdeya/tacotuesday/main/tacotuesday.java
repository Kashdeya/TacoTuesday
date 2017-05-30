package com.kashdeya.tacotuesday.main;

import com.kashdeya.tacotuesday.configs.TacoConfig;
import com.kashdeya.tacotuesday.inits.TacoItems;
import com.kashdeya.tacotuesday.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class tacotuesday {
	
	@Instance(Reference.MOD_ID)
    public static tacotuesday instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	
		// Configs
		TacoConfig.initMain();
		
    	// Load everything else
		TacoItems.init();
		
		// Renders
		PROXY.registerTileEntities();
    	PROXY.registerRenderers();
    	
    	// Events

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {}
}
