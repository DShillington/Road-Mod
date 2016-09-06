package com.roadmod.items;
import papertazer.items.ItemBase;

import com.google.common.base.Function;
import com.roadmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RoadItems {
		
	public static Item inventorylogo;
	
	public static void init()
	{
		inventorylogo = (new ItemBase().setUnlocalizedName("inventorylogo"));
		
	}
	//test
	
	public static void register()
	{	
		GameRegistry.registerItem(inventorylogo, inventorylogo.getUnlocalizedName().substring(5));
	
	}
	
	public static void registerRenders()
	{
		registerRender(inventorylogo);
		
	}
	
	public static void registerRender(Item item)
	{
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		}
}
