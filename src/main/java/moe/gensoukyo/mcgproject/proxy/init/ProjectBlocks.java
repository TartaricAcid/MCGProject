package moe.gensoukyo.mcgproject.proxy.init;

import moe.gensoukyo.mcgproject.MCGProject;
import moe.gensoukyo.mcgproject.proxy.block.BlockWoolSlab;
import moe.gensoukyo.mcgproject.proxy.block.BlockWoolStairs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author TartaricAcid
 * @date 2019/10/21 21:43
 **/
@Mod.EventBusSubscriber(modid = MCGProject.MOD_ID)
public final class ProjectBlocks {
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "white_wool_stairs")
    public static BlockStairs WHITE_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "orange_wool_stairs")
    public static Block ORANGE_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "magenta_wool_stairs")
    public static Block MAGENTA_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "light_blue_wool_stairs")
    public static Block LIGHT_BLUE_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "lime_wool_stairs")
    public static Block LIME_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "pink_wool_stairs")
    public static Block PINK_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "gray_wool_stairs")
    public static Block GRAY_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "silver_wool_stairs")
    public static Block SILVER_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "cyan_wool_stairs")
    public static Block CYAN_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "purple_wool_stairs")
    public static Block PURPLE_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "blue_wool_stairs")
    public static Block BLUE_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "brown_wool_stairs")
    public static Block BROWN_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "green_wool_stairs")
    public static Block GREEN_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "red_wool_stairs")
    public static Block RED_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "black_wool_stairs")
    public static Block BLACK_WOOL_STAIRS;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "white_wool_slab")
    public static BlockSlab WHITE_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "orange_wool_slab")
    public static BlockSlab ORANGE_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "magenta_wool_slab")
    public static BlockSlab MAGENTA_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "light_blue_wool_slab")
    public static BlockSlab LIGHT_BLUE_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "yellow_wool_slab")
    public static BlockSlab YELLOW_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "lime_wool_slab")
    public static BlockSlab LIME_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "pink_wool_slab")
    public static BlockSlab PINK_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "gray_wool_slab")
    public static BlockSlab GRAY_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "silver_wool_slab")
    public static BlockSlab SILVER_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "cyan_wool_slab")
    public static BlockSlab CYAN_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "purple_wool_slab")
    public static BlockSlab PURPLE_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "blue_wool_slab")
    public static BlockSlab BLUE_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "brown_wool_slab")
    public static BlockSlab BROWN_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "green_wool_slab")
    public static BlockSlab GREEN_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "red_wool_slab")
    public static BlockSlab RED_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "black_wool_slab")
    public static BlockSlab BLACK_WOOL_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "white_wool_double_slab")
    public static BlockSlab WHITE_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "orange_wool_double_slab")
    public static BlockSlab ORANGE_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "magenta_wool_double_slab")
    public static BlockSlab MAGENTA_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "light_blue_wool_double_slab")
    public static BlockSlab LIGHT_BLUE_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "yellow_wool_double_slab")
    public static BlockSlab YELLOW_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "lime_wool_double_slab")
    public static BlockSlab LIME_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "pink_wool_double_slab")
    public static BlockSlab PINK_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "gray_wool_double_slab")
    public static BlockSlab GRAY_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "silver_wool_double_slab")
    public static BlockSlab SILVER_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "cyan_wool_double_slab")
    public static BlockSlab CYAN_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "purple_wool_double_slab")
    public static BlockSlab PURPLE_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "blue_wool_double_slab")
    public static BlockSlab BLUE_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "brown_wool_double_slab")
    public static BlockSlab BROWN_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "green_wool_double_slab")
    public static BlockSlab GREEN_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "red_wool_double_slab")
    public static BlockSlab RED_WOOL_DOUBLE_SLAB;
    @GameRegistry.ObjectHolder(MCGProject.MOD_ID + ":" + "black_wool_double_slab")
    public static BlockSlab BLACK_WOOL_DOUBLE_SLAB;

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        for (EnumDyeColor color : EnumDyeColor.values()) {
            event.getRegistry().register(new BlockWoolStairs(color));
            event.getRegistry().register(new BlockWoolSlab.Half(color));
            event.getRegistry().register(new BlockWoolSlab.Double(color));
        }
    }
}
