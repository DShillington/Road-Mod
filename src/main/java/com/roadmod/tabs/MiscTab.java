package com.roadmod.tabs;


import com.roadmod.blocks.RoadBlocks;
import com.roadmod.items.RoadItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MiscTab extends CreativeTabs {

	public MiscTab(String label) {
		super(label);
	}
	@Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(RoadBlocks.Fire_Hydrant);
    }
}
