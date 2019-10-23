package moe.gensoukyo.mcgproject.proxy.init;

import moe.gensoukyo.mcgproject.MCGProject;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

/**
 * @author TartaricAcid
 * @date 2019/10/21 22:56
 **/
@Mod.EventBusSubscriber(modid = MCGProject.MOD_ID)
public final class ProjectItems {
    public static final CreativeTabs BUILDING = new CreativeTabs(MCGProject.MOD_ID + ".building_normal") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ProjectBlocks.WHITE_WOOL_STAIRS);
        }

        @SideOnly(Side.CLIENT)
        @Override
        public String getTranslationKey() {
            return "item_group." + getTabLabel();
        }
    };

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        registerItemBlock(event, ProjectBlocks.WHITE_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.ORANGE_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.MAGENTA_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.LIGHT_BLUE_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.LIME_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.PINK_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.GRAY_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.SILVER_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.CYAN_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.PURPLE_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.BLUE_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.BROWN_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.GREEN_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.RED_WOOL_STAIRS);
        registerItemBlock(event, ProjectBlocks.BLACK_WOOL_STAIRS);
        registerItemSlab(event, ProjectBlocks.WHITE_WOOL_SLAB, ProjectBlocks.WHITE_WOOL_SLAB, ProjectBlocks.WHITE_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.ORANGE_WOOL_SLAB, ProjectBlocks.ORANGE_WOOL_SLAB, ProjectBlocks.ORANGE_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.MAGENTA_WOOL_SLAB, ProjectBlocks.MAGENTA_WOOL_SLAB, ProjectBlocks.MAGENTA_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.LIGHT_BLUE_WOOL_SLAB, ProjectBlocks.LIGHT_BLUE_WOOL_SLAB, ProjectBlocks.LIGHT_BLUE_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.YELLOW_WOOL_SLAB, ProjectBlocks.YELLOW_WOOL_SLAB, ProjectBlocks.YELLOW_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.LIME_WOOL_SLAB, ProjectBlocks.LIME_WOOL_SLAB, ProjectBlocks.LIME_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.PINK_WOOL_SLAB, ProjectBlocks.PINK_WOOL_SLAB, ProjectBlocks.PINK_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.GRAY_WOOL_SLAB, ProjectBlocks.GRAY_WOOL_SLAB, ProjectBlocks.GRAY_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.SILVER_WOOL_SLAB, ProjectBlocks.SILVER_WOOL_SLAB, ProjectBlocks.SILVER_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.CYAN_WOOL_SLAB, ProjectBlocks.CYAN_WOOL_SLAB, ProjectBlocks.CYAN_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.PURPLE_WOOL_SLAB, ProjectBlocks.PURPLE_WOOL_SLAB, ProjectBlocks.PURPLE_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.BLUE_WOOL_SLAB, ProjectBlocks.BLUE_WOOL_SLAB, ProjectBlocks.BLUE_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.BROWN_WOOL_SLAB, ProjectBlocks.BROWN_WOOL_SLAB, ProjectBlocks.BROWN_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.GREEN_WOOL_SLAB, ProjectBlocks.GREEN_WOOL_SLAB, ProjectBlocks.GREEN_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.RED_WOOL_SLAB, ProjectBlocks.RED_WOOL_SLAB, ProjectBlocks.RED_WOOL_DOUBLE_SLAB);
        registerItemSlab(event, ProjectBlocks.BLACK_WOOL_SLAB, ProjectBlocks.BLACK_WOOL_SLAB, ProjectBlocks.BLACK_WOOL_DOUBLE_SLAB);
    }

    private static void registerItemBlock(RegistryEvent.Register<Item> event, Block block) {
        event.getRegistry().register(new ItemBlock(block).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
    }

    private static void registerItemSlab(RegistryEvent.Register<Item> event, Block block, BlockSlab singleSlab, BlockSlab doubleSlab) {
        event.getRegistry().register(new ItemSlab(block, singleSlab, doubleSlab).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
    }
}
