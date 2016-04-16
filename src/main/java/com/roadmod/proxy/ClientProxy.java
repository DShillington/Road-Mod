package com.roadmod.proxy;

import com.roadmod.blocks.RoadBlocks;
import com.roadmod.items.RoadItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy{

	public void register() {
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		 }
	
	public EntityPlayer getClientPlayer()
	{
		return Minecraft.getMinecraft().thePlayer;
	}
	public boolean isSinglePlayer()
	{
		return Minecraft.getMinecraft().isSingleplayer();
	}

	public boolean isDedicatedServer()
	{
		return false;
	}

	@SubscribeEvent
	public void onClientWorldLoad(WorldEvent.Load event)
	{
		
	}

	@SubscribeEvent
	public void onClientWorldUnload(WorldEvent.Unload event)
	{
		
	}


	@SubscribeEvent
	public void onPrePlayerRender(RenderPlayerEvent.Pre event)
	{
		
	}

	@SubscribeEvent
	public void onPostPlayerRender(RenderPlayerEvent.Post event)
	{
		
	}
	public void registerRenderThings()
	{
    RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
	}

	

	public void registerRenders() 
	{
		RoadBlocks.registerRenders();
		RoadItems.registerRenders();
			}
}
