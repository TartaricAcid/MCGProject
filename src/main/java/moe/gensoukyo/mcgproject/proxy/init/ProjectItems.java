package moe.gensoukyo.mcgproject.proxy.init;

import moe.gensoukyo.mcgproject.MCGProject;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
    }

    private static void registerItemBlock(RegistryEvent.Register<Item> event, Block block) {
        event.getRegistry().register(new ItemBlock(block).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
    }
}
