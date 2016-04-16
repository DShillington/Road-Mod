package com.roadmod.tabs;


import com.roadmod.items.RoadItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class RoadTab extends CreativeTabs {

	public RoadTab(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return RoadItems.inventorylogo;
	}

}
