package com.roadmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockRoadFull extends Block {

	public BlockRoadFull(Material p_i46399_1_, MapColor p_i46399_2_) {
		super(p_i46399_1_, p_i46399_2_);
	}
	

    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean isFullCube() {
        return false;
    }
    
    public int getRenderType()
    {
        return 3;
}
    
   

}
