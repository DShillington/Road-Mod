package com.roadmod;

import com.roadmod.blocks.RoadBlocks;
import com.roadmod.items.RoadItems;
import com.roadmod.proxy.CommonProxy;
import com.roadmod.tabs.RoadTab;
import com.roadmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class RoadMod
{
@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
	public static CommonProxy proxy;

    public static boolean isCarsAndDrivesLoaded;
    
    public static CreativeTabs RoadTab = new RoadTab("tabRoad");
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.register();
		proxy.registerRenders();
    }
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event)
    {
    	RoadBlocks.init();
    	RoadBlocks.register();
    	RoadItems.init();
    	RoadItems.register();
    	isCarsAndDrivesLoaded = Loader.isModLoaded("carsanddrives");
	}
    
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{	
	}
}