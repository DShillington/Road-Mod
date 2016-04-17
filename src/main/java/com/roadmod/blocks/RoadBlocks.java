package com.roadmod.blocks;

import com.roadmod.RoadMod;
import com.roadmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class RoadBlocks 
	{
	//Road Base
	public static Block Road;
	//Road Lines (White)
	public static Block Road_White_Middle_Solid, Road_White_Middle_Dotted,Road_White_Side_Solid,
	Road_White_Side_Corner, Road_White_Side_Corner_Out, Road_White_Cross, Road_White_T, Road_Crossing_White;
	//Road Lines (Yellow)
	public static Block Road_Yellow_Middle_Solid,Road_Yellow_Middle_Dotted, Road_Yellow_Side_Solid, 
	Road_Yellow_Side_Corner, Road_Yellow_Side_Corner_Out, Road_Yellow_Cross, Road_Yellow_T, 
	Road_Yellow_Passing, Road_Yellow_X, Road_Yellow_X_Side, Road_Crossing_Yellow,
	Road_Crossing_Yellow_Corner; 
	//Road Symbols
	public static Block Road_Straight, Road_Straight_Right, Road_Straight_Left, Road_Right,
	Road_Left, Road_Handicap;
	//Other Road Blocks
	public static Block Road_Manhole, Road_Guard, Road_Guard_Corner, Road_Pothole, Road_Speedbump, Road_Curb,
	Road_Curb_Green, Road_Curb_Blue, Road_Curb_White, Road_Curb_Red, Road_Curb_Yellow, Road_Curb_Outer_Corner,
	Road_Curb_Green_Outer_Corner, Road_Curb_Blue_Outer_Corner, Road_Curb_White_Outer_Corner,
	Road_Curb_Red_Outer_Corner, Road_Curb_Yellow_Outer_Corner, Road_Curb_Inner_Corner, 
	Road_Curb_Green_Inner_Corner, Road_Curb_Blue_Inner_Corner, Road_Curb_White_Inner_Corner, 
	Road_Curb_Red_Inner_Corner, Road_Curb_Yellow_Inner_Corner;
	//Pathways
	public static Block Sidewalk, Sidewalk_Drain;
	//Light Pole Stuff
	public static Block Traffic_Light, Traffic_Light_Pole, Traffic_Light_Pole_Side, Traffic_Light_Pole_Corner,
	Street_Light, Sign_Crossing;
	//Pylons
	public static Block Pylon_Stick, Pylon_Triangle, Pylon_Large;
	//Signs
	public static Block Sign_Stop, Sign_Speed_KM_100, Sign_Speed_KM_50, Sign_Speed_70, Sign_Speed_35,
	Sign_Do_Not_Enter, Sign_No_Uturn, Sign_Yes_Uturn, Sign_One_Way_Left, Sign_One_Way_Right, Sign_Yeild,
	Sign_Crosswalk, Sign_Intersection_Left, Sign_Intersection_Right, Sign_Crossing_Railroad, Sign_Crossing_Cow,
	Sign_Stop_Ahead, Sign_Construction, Sign_Construction_End, Sign_Detour_Left, Sign_Detour_Right, 
	Sign_Merge_Left, Sign_Merge_Right, Sign_StopSign_Ahead, Sign_Road_Block, RailRoad_Crossing_Sign;
	//Misc
	public static Block Fire_Hydrant, Parking_Meter;
	//RailRoad  (These are not actually in the mod yet. Just thinking about it.)
	public static Block RailRoad, RailRoad_Powered, RailRoad_Detector;
	
	public static void init()
	{
		Road = new BlockRoad(Material.iron).setUnlocalizedName("Road");
		Road_White_Middle_Solid = new BlockRoad(Material.iron).setUnlocalizedName("WhiteMiddleSolid");
		Road_White_Middle_Dotted = new BlockRoad(Material.iron).setUnlocalizedName("WhiteMiddleDotted");
		Road_White_Side_Solid = new BlockRoad(Material.iron).setUnlocalizedName("WhiteSideSolid");
		Road_White_Side_Corner = new BlockRoad(Material.iron).setUnlocalizedName("WhiteSideCorner");
		Road_White_Side_Corner_Out = new BlockRoad(Material.iron).setUnlocalizedName("WhiteSideCornerOut");
		Road_White_Cross = new BlockRoad(Material.iron).setUnlocalizedName("WhiteCross");
		Road_White_T = new BlockRoad(Material.iron).setUnlocalizedName("WhiteT");
		Road_Crossing_White = new BlockRoad(Material.iron).setUnlocalizedName("Crossing");
		Road_Yellow_Middle_Solid = new BlockRoad(Material.iron).setUnlocalizedName("YellowMiddleSolid");
		Road_Yellow_Middle_Dotted = new BlockRoad(Material.iron).setUnlocalizedName("YellowMiddleDotted");
		Road_Yellow_Side_Solid = new BlockRoad(Material.iron).setUnlocalizedName("YellowSideSolid");
		Road_Yellow_Side_Corner = new BlockRoad(Material.iron).setUnlocalizedName("YellowSideCorner");
		Road_Yellow_Side_Corner_Out = new BlockRoad(Material.iron).setUnlocalizedName("YellowSideCornerOut");
		Road_Yellow_Side_Corner_Out = new BlockRoad(Material.iron).setUnlocalizedName("YellowSideCornerOut");
		Road_Yellow_Cross = new BlockRoad(Material.iron).setUnlocalizedName("YellowCross");
		Road_Yellow_T = new BlockRoad(Material.iron).setUnlocalizedName("YellowT");
		Road_Crossing_Yellow = new BlockRoad(Material.iron).setUnlocalizedName("YellowCrossing");
		Road_Crossing_Yellow_Corner = new BlockRoad(Material.iron).setUnlocalizedName("YellowCrossingCorner");
		Road_Yellow_Passing = new BlockRoad(Material.iron).setUnlocalizedName("YellowPassing");
		Road_Yellow_X = new BlockRoad(Material.iron).setUnlocalizedName("YellowX");
		Road_Yellow_X_Side = new BlockRoad(Material.iron).setUnlocalizedName("YellowXSide");
		Road_Straight = new BlockRoad(Material.iron).setUnlocalizedName("Straight");
		Road_Straight_Right = new BlockRoad(Material.iron).setUnlocalizedName("StraightRight");
		Road_Straight_Left = new BlockRoad(Material.iron).setUnlocalizedName("StraightLeft");
		Road_Right = new BlockRoad(Material.iron).setUnlocalizedName("Right");
		Road_Left = new BlockRoad(Material.iron).setUnlocalizedName("Left");
		Road_Manhole = new BlockRoad(Material.iron).setUnlocalizedName("Manhole");
		Road_Guard = new BlockRoad(Material.iron).setUnlocalizedName("Guardrail");
		Road_Guard_Corner = new BlockRoad(Material.iron).setUnlocalizedName("GuardrailCorner");
		Road_Pothole = new BlockRoad(Material.iron).setUnlocalizedName("Pothole");
		Road_Speedbump = new BlockRoad(Material.iron).setUnlocalizedName("SpeedBump");
		Road_Curb = new BlockRoad(Material.iron).setUnlocalizedName("Curb");
		Road_Curb_White = new BlockRoad(Material.iron).setUnlocalizedName("CurbWhite");
		Road_Curb_Blue = new BlockRoad(Material.iron).setUnlocalizedName("CurbBlue");
		Road_Curb_Red = new BlockRoad(Material.iron).setUnlocalizedName("CurbRed");
		Road_Curb_Green = new BlockRoad(Material.iron).setUnlocalizedName("CurbGreen");
		Road_Curb_Yellow = new BlockRoad(Material.iron).setUnlocalizedName("CurbYellow");
		Road_Curb_Outer_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbOuter");
		Road_Curb_White_Outer_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbWhiteOuter");
		Road_Curb_Blue_Outer_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbBlueOuter");
		Road_Curb_Red_Outer_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbRedOuter");
		Road_Curb_Green_Outer_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbGreenOuter");
		Road_Curb_Yellow_Outer_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbYellowOuter");
		Road_Curb_Inner_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbInner");
		Road_Curb_White_Inner_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbWhiteInner");
		Road_Curb_Blue_Inner_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbBlueInner");
		Road_Curb_Red_Inner_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbRedInner");
		Road_Curb_Green_Inner_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbGreenInner");
		Road_Curb_Yellow_Inner_Corner = new BlockRoad(Material.iron).setUnlocalizedName("CurbYellowInner");
		Road_Handicap = new BlockRoad(Material.iron).setUnlocalizedName("RoadHandicap");
		Sidewalk = new BlockSidewalk(Material.iron).setUnlocalizedName("Sidewalk");
		Sidewalk_Drain = new BlockSidewalk(Material.iron).setUnlocalizedName("SidewalkDrain");
		Traffic_Light = new BlockTrafficLight(Material.iron).setUnlocalizedName("TrafficLight");
		Traffic_Light_Pole = new BlockPole(Material.iron).setUnlocalizedName("TrafficLightPoleTest");
		Traffic_Light_Pole_Side = new BlockTrafficLightPole(Material.iron).setUnlocalizedName("TrafficLightPoleSide");
		Traffic_Light_Pole_Corner = new BlockTrafficLightPole(Material.iron).setUnlocalizedName("TrafficLightPoleCorner");
		Street_Light = new BlockTrafficLight(Material.iron).setLightLevel(1.0F).setUnlocalizedName("StreetLight");
		Pylon_Stick = new BlockRoad(Material.iron).setUnlocalizedName("PylonStick");
		Pylon_Triangle = new BlockRoad(Material.iron).setUnlocalizedName("PylonTriangle");
		Pylon_Large = new BlockRoad(Material.iron).setUnlocalizedName("PylonLarge");
		Sign_Stop = new BlockRoadSign(Material.iron).setUnlocalizedName("StopSign");
		Sign_Speed_KM_100 = new BlockRoadSign(Material.iron).setUnlocalizedName("Speed100");
		Sign_Speed_KM_50 = new BlockRoadSign(Material.iron).setUnlocalizedName("Speed50");
		Sign_Speed_70 = new BlockRoadSign(Material.iron).setUnlocalizedName("Speed70");
		Sign_Speed_35 = new BlockRoadSign(Material.iron).setUnlocalizedName("Speed35");
		Sign_Crossing = new BlockTrafficLight(Material.iron).setLightLevel(1.0F).setUnlocalizedName("CrossingSign");
		Sign_Do_Not_Enter = new BlockRoadSign(Material.iron).setUnlocalizedName("DoNotEnter");
		Sign_No_Uturn = new BlockRoadSign(Material.iron).setUnlocalizedName("NoUturn");
		Sign_Yeild = new BlockRoadSign(Material.iron).setUnlocalizedName("Yeild");
		Sign_Yes_Uturn = new BlockRoadSign(Material.iron).setUnlocalizedName("YesUturn");
		Sign_One_Way_Left = new BlockRoadSign(Material.iron).setUnlocalizedName("OneWayLeft");
		Sign_One_Way_Right = new BlockRoadSign(Material.iron).setUnlocalizedName("OneWayRight");
		Sign_Crosswalk = new BlockRoadSign(Material.iron).setUnlocalizedName("Crosswalk");
		Sign_Intersection_Left = new BlockRoadSign(Material.iron).setUnlocalizedName("IntersectionLeft");
		Sign_Intersection_Right = new BlockRoadSign(Material.iron).setUnlocalizedName("IntersectionRight");
		Sign_Crossing_Railroad = new BlockRoadSign(Material.iron).setUnlocalizedName("RailroadCrossing");
		Sign_Crossing_Cow = new BlockRoadSign(Material.iron).setUnlocalizedName("CowCrossing");
		Sign_Stop_Ahead = new BlockRoadSign(Material.iron).setUnlocalizedName("StopAhead");
		Sign_Construction = new BlockRoadSign(Material.iron).setUnlocalizedName("Construction");
		Sign_Construction_End = new BlockRoadSign(Material.iron).setUnlocalizedName("ConstructionEnd");
		Sign_Detour_Left = new BlockRoadSign(Material.iron).setUnlocalizedName("DetourLeft");
		Sign_Detour_Right = new BlockRoadSign(Material.iron).setUnlocalizedName("DetourRight");
		Sign_Merge_Left = new BlockRoadSign(Material.iron).setUnlocalizedName("MergeLeft");
		Sign_Merge_Right = new BlockRoadSign(Material.iron).setUnlocalizedName("MergeRight");
		Sign_StopSign_Ahead = new BlockRoadSign(Material.iron).setUnlocalizedName("StopSignAhead");
		Sign_Road_Block = new BlockRoadSign(Material.iron).setUnlocalizedName("RoadBlockSign");
		Fire_Hydrant = new BlockFireHydrant(Material.iron).setUnlocalizedName("FireHydrant");
		Parking_Meter = new BlockRoadSign(Material.iron).setUnlocalizedName("ParkingMeter");
		RailRoad_Crossing_Sign = new BlockRoadSign(Material.iron).setUnlocalizedName("RailRoadCrossingSign");
		
	}
	public static void register()
	{
		GameRegistry.registerBlock(Road, Road.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_White_Middle_Solid, Road_White_Middle_Solid.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_White_Middle_Dotted, Road_White_Middle_Dotted.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_White_Side_Solid, Road_White_Side_Solid.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_White_Side_Corner, Road_White_Side_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_White_Side_Corner_Out, Road_White_Side_Corner_Out.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_White_Cross, Road_White_Cross.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_White_T, Road_White_T.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Crossing_White, Road_Crossing_White.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);	
		GameRegistry.registerBlock(Road_Yellow_Middle_Solid, Road_Yellow_Middle_Solid.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_Middle_Dotted, Road_Yellow_Middle_Dotted.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_Side_Solid, Road_Yellow_Side_Solid.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_Side_Corner, Road_Yellow_Side_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_Side_Corner_Out, Road_Yellow_Side_Corner_Out.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_Cross, Road_Yellow_Cross.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_T, Road_Yellow_T.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Crossing_Yellow, Road_Crossing_Yellow.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Crossing_Yellow_Corner, Road_Crossing_Yellow_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_Passing, Road_Yellow_Passing.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_X, Road_Yellow_X.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Yellow_X_Side, Road_Yellow_X_Side.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Straight, Road_Straight.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Straight_Right, Road_Straight_Right.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Straight_Left, Road_Straight_Left.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Right, Road_Right.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Left, Road_Left.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Handicap, Road_Handicap.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Manhole, Road_Manhole.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Guard, Road_Guard.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Guard_Corner, Road_Guard_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Pothole, Road_Pothole.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Speedbump, Road_Speedbump.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb, Road_Curb.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_White, Road_Curb_White.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Blue, Road_Curb_Blue.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Red, Road_Curb_Red.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Yellow, Road_Curb_Yellow.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Green, Road_Curb_Green.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Inner_Corner, Road_Curb_Inner_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_White_Inner_Corner, Road_Curb_White_Inner_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Blue_Inner_Corner, Road_Curb_Blue_Inner_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Red_Inner_Corner, Road_Curb_Red_Inner_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Yellow_Inner_Corner, Road_Curb_Yellow_Inner_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Green_Inner_Corner, Road_Curb_Green_Inner_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Outer_Corner, Road_Curb_Outer_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_White_Outer_Corner, Road_Curb_White_Outer_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Blue_Outer_Corner, Road_Curb_Blue_Outer_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Red_Outer_Corner, Road_Curb_Red_Outer_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Yellow_Outer_Corner, Road_Curb_Yellow_Outer_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Road_Curb_Green_Outer_Corner, Road_Curb_Green_Outer_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sidewalk, Sidewalk.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sidewalk_Drain, Sidewalk_Drain.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Traffic_Light, Traffic_Light.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Traffic_Light_Pole, Traffic_Light_Pole.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Traffic_Light_Pole_Side, Traffic_Light_Pole_Side.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Traffic_Light_Pole_Corner, Traffic_Light_Pole_Corner.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Street_Light, Street_Light.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Pylon_Stick, Pylon_Stick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Pylon_Triangle, Pylon_Triangle.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Pylon_Large, Pylon_Large.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Stop, Sign_Stop.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Speed_KM_100, Sign_Speed_KM_100.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Speed_KM_50, Sign_Speed_KM_50.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Speed_70, Sign_Speed_70.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Speed_35, Sign_Speed_35.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Crossing, Sign_Crossing.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Do_Not_Enter, Sign_Do_Not_Enter.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_No_Uturn, Sign_No_Uturn.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Yeild, Sign_Yeild.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Yes_Uturn, Sign_Yes_Uturn.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_One_Way_Left, Sign_One_Way_Left.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_One_Way_Right, Sign_One_Way_Right.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Crosswalk, Sign_Crosswalk.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Intersection_Left, Sign_Intersection_Left.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Intersection_Right, Sign_Intersection_Right.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Crossing_Railroad, Sign_Crossing_Railroad.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Crossing_Cow, Sign_Crossing_Cow.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Stop_Ahead, Sign_Stop_Ahead.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Construction, Sign_Construction.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Construction_End, Sign_Construction_End.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Detour_Left, Sign_Detour_Left.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Detour_Right, Sign_Detour_Right.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Merge_Left, Sign_Merge_Left.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Merge_Right, Sign_Merge_Right.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_StopSign_Ahead, Sign_StopSign_Ahead.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Sign_Road_Block, Sign_Road_Block.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Fire_Hydrant, Fire_Hydrant.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(Parking_Meter, Parking_Meter.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
		GameRegistry.registerBlock(RailRoad_Crossing_Sign, RailRoad_Crossing_Sign.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setCreativeTab(RoadMod.RoadTab);
			
	}

	
	public static void registerRenders()
	{
		RegisterRender(Road);	
		RegisterRender(Road_White_Middle_Solid);	
		RegisterRender(Road_White_Middle_Dotted);	
		RegisterRender(Road_White_Side_Solid);	
		RegisterRender(Road_White_Side_Corner);	
		RegisterRender(Road_White_Side_Corner_Out);	
		RegisterRender(Road_White_Cross);	
		RegisterRender(Road_White_T);	
		RegisterRender(Road_Crossing_White);
		RegisterRender(Road_Yellow_Middle_Solid);	
		RegisterRender(Road_Yellow_Middle_Dotted);	
		RegisterRender(Road_Yellow_Side_Solid);	
		RegisterRender(Road_Yellow_Side_Corner);	
		RegisterRender(Road_Yellow_Side_Corner_Out);
		RegisterRender(Road_Yellow_Cross);	
		RegisterRender(Road_Yellow_T);
		RegisterRender(Road_Crossing_Yellow);
		RegisterRender(Road_Crossing_Yellow_Corner);
		RegisterRender(Road_Yellow_Passing);
		RegisterRender(Road_Yellow_X);
		RegisterRender(Road_Yellow_X_Side);
		RegisterRender(Road_Straight);
		RegisterRender(Road_Straight_Left);
		RegisterRender(Road_Straight_Right);
		RegisterRender(Road_Left);
		RegisterRender(Road_Right);
		RegisterRender(Road_Handicap);
		RegisterRender(Road_Manhole);
		RegisterRender(Road_Guard);
		RegisterRender(Road_Guard_Corner);
		RegisterRender(Road_Pothole);
		RegisterRender(Road_Speedbump);
		RegisterRender(Road_Curb);
		RegisterRender(Road_Curb_White);
		RegisterRender(Road_Curb_Red);
		RegisterRender(Road_Curb_Blue);
		RegisterRender(Road_Curb_Green);
		RegisterRender(Road_Curb_Yellow);
		RegisterRender(Road_Curb_Inner_Corner);
		RegisterRender(Road_Curb_White_Inner_Corner);
		RegisterRender(Road_Curb_Red_Inner_Corner);
		RegisterRender(Road_Curb_Blue_Inner_Corner);
		RegisterRender(Road_Curb_Green_Inner_Corner);
		RegisterRender(Road_Curb_Yellow_Inner_Corner);
		RegisterRender(Road_Curb_Outer_Corner);
		RegisterRender(Road_Curb_White_Outer_Corner);
		RegisterRender(Road_Curb_Red_Outer_Corner);
		RegisterRender(Road_Curb_Blue_Outer_Corner);
		RegisterRender(Road_Curb_Green_Outer_Corner);
		RegisterRender(Road_Curb_Yellow_Outer_Corner);
		RegisterRender(Sidewalk);	
		RegisterRender(Sidewalk_Drain);	
		RegisterRender(Traffic_Light);	
		RegisterRender(Traffic_Light_Pole);	
		RegisterRender(Traffic_Light_Pole_Side);	
		RegisterRender(Traffic_Light_Pole_Corner);	
		RegisterRender(Street_Light);	
		RegisterRender(Pylon_Stick);	
		RegisterRender(Pylon_Triangle);	
		RegisterRender(Pylon_Large);	
		RegisterRender(Sign_Crossing);	
		RegisterRender(Sign_Stop);	
		RegisterRender(Sign_Speed_KM_100);
		RegisterRender(Sign_Speed_KM_50);
		RegisterRender(Sign_Speed_70);
		RegisterRender(Sign_Speed_35);
		RegisterRender(Sign_Do_Not_Enter);
		RegisterRender(Sign_No_Uturn);
		RegisterRender(Sign_Yeild);
		RegisterRender(Sign_Yes_Uturn);
		RegisterRender(Sign_One_Way_Left);
		RegisterRender(Sign_One_Way_Right);
		RegisterRender(Sign_Crosswalk);
		RegisterRender(Sign_Intersection_Left);
		RegisterRender(Sign_Intersection_Right);
		RegisterRender(Sign_Crossing_Railroad);
		RegisterRender(Sign_Crossing_Cow);
		RegisterRender(Sign_Stop_Ahead);
		RegisterRender(Sign_Construction);
		RegisterRender(Sign_Construction_End);
		RegisterRender(Sign_Detour_Left);
		RegisterRender(Sign_Detour_Right);
		RegisterRender(Sign_Merge_Left);
		RegisterRender(Sign_Merge_Right);
		RegisterRender(Sign_StopSign_Ahead);
		RegisterRender(Sign_Road_Block);
		RegisterRender(Fire_Hydrant);
		RegisterRender(Parking_Meter);
		RegisterRender(RailRoad_Crossing_Sign);
	}
	
	public static void RegisterRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
