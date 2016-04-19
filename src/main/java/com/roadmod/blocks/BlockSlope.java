package com.roadmod.blocks;

import com.roadmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.b3d.B3DLoader;
import net.minecraftforge.common.property.ExtendedBlockState;
import net.minecraftforge.common.property.IExtendedBlockState;
import net.minecraftforge.common.property.IUnlistedProperty;

 public class BlockSlope extends Block
    {
        public static final PropertyDirection FACING = PropertyDirection.create("facing");
        public static final BlockSlope instance = new BlockSlope();
        public static final String name = "slope";
        private int counter = 1;
        public ExtendedBlockState state = new ExtendedBlockState(this, new IProperty[]{FACING}, new IUnlistedProperty[]{B3DLoader.B3DFrameProperty.instance});

        private BlockSlope()
        {
            super(Material.iron);
            this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
            setCreativeTab(CreativeTabs.tabBlock);
            setUnlocalizedName(Reference.MOD_ID + ":" + name);
        }

        @Override
        public boolean isOpaqueCube() { return false; }

        @Override
        public boolean isFullCube() { return false; }

        @Override
        public boolean isVisuallyOpaque() { return false; }

        @Override
        public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
        {
            return this.getDefaultState().withProperty(FACING, getFacingFromEntity(world, pos, placer));
        }
        
        @Override
        public IBlockState getStateFromMeta(int meta)
        {
            return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
        }
        
        @Override
        public int getMetaFromState(IBlockState state)
        {
            return ((EnumFacing) state.getValue(FACING)).getIndex();
        }
        
        @Override
        public IBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos)
        {
            //Only return an IExtendedBlockState from this method and createState(), otherwise block placement might break!
            B3DLoader.B3DState newState = new B3DLoader.B3DState(null, counter);
            return ((IExtendedBlockState) state).withProperty(B3DLoader.B3DFrameProperty.instance, newState);
        }

        @Override
        public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
        {
            if(world.isRemote)
            {
                System.out.println("click " + counter);
                if(player.isSneaking()) counter--;
                else counter++;
                //if(counter >= model.getNode().getKeys().size()) counter = 0;
                world.markBlockRangeForRenderUpdate(pos, pos);
            }
            return false;
        }
        
        @Override
        public BlockState createBlockState()
        {
            return new ExtendedBlockState(this, new IProperty[]{FACING}, new IUnlistedProperty[]{B3DLoader.B3DFrameProperty.instance});
        }
        
        public static EnumFacing getFacingFromEntity(World worldIn, BlockPos clickedBlock, EntityLivingBase entityIn)
        {
            if (MathHelper.abs((float)entityIn.posX - (float)clickedBlock.getX()) < 2.0F && MathHelper.abs((float)entityIn.posZ - (float)clickedBlock.getZ()) < 2.0F)
            {
                double d0 = entityIn.posY + (double)entityIn.getEyeHeight();

                if (d0 - (double)clickedBlock.getY() > 2.0D)
                {
                    return EnumFacing.UP;
                }

                if ((double)clickedBlock.getY() - d0 > 0.0D)
                {
                    return EnumFacing.DOWN;
                }
            }

            return entityIn.getHorizontalFacing().getOpposite();
        }
    }