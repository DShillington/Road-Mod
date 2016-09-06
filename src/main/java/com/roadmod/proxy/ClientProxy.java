package com.roadmod.proxy;


import com.roadmod.blocks.RoadBlocks;
import com.roadmod.items.RoadItems;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements IRoadProxy 
{
	@Override
	public void preInit() {}

	@Override
	public void init() 
	{
		RoadBlocks.registerRenders();
		RoadItems.registerRenders();
		
		
	}

	@Override
	public void postInit() {}
}