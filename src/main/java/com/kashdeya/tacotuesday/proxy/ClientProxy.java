package com.kashdeya.tacotuesday.proxy;

import com.kashdeya.tacotuesday.handlers.RenderHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy extends CommonProxy {

    @Override
	public void registerRenderers() {
    	// Renders
        RenderHandler.tacoItems();
	}
    
    public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx)
    {
      return (EntityPlayerMP)(ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : ctx.getServerHandler().playerEntity);
    }
}
