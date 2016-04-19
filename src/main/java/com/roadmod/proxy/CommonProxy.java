package com.roadmod.proxy;

import java.util.logging.Level;

import com.roadmod.blocks.BlockSlope;
import com.roadmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.b3d.B3DLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements ProxyInterface
{
	public void registerRenders(){		
	}

public void register(){	
	}

	
	public static void preInitCommon(){
		
			}
	
	 public void registerNetworkStuff(){
		  }

		 public void registerTileEntities(){
		 }
		 public World getClientWorld()
			{
				return null;
			}

			public EntityPlayer getClientPlayer()
			{
				return null;
			}

			public boolean isSinglePlayer()
			{
				return false;
			}

			public boolean isDedicatedServer()
			{
				return MinecraftServer.getServer().isDedicatedServer();
			}
			
			public ModelBiped getArmorModel(){
				return null;
				}

			public ModelBiped getArmorModelWings() {
				
				return null;
			}
			
}