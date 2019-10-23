package moe.gensoukyo.mcgproject.proxy.client.init;

import moe.gensoukyo.mcgproject.MCGProject;
import moe.gensoukyo.mcgproject.proxy.init.ProjectBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

/**
 * @author TartaricAcid
 * @date 2019/10/21 22:15
 **/
@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(modid = MCGProject.MOD_ID, value = Side.CLIENT)
public final class ClientModel {
    @SubscribeEvent
    public static void register(ModelRegistryEvent event) {
        registerRender(ProjectBlocks.WHITE_WOOL_STAIRS);
        registerRender(ProjectBlocks.ORANGE_WOOL_STAIRS);
        registerRender(ProjectBlocks.MAGENTA_WOOL_STAIRS);
        registerRender(ProjectBlocks.LIGHT_BLUE_WOOL_STAIRS);
        registerRender(ProjectBlocks.LIME_WOOL_STAIRS);
        registerRender(ProjectBlocks.PINK_WOOL_STAIRS);
        registerRender(ProjectBlocks.GRAY_WOOL_STAIRS);
        registerRender(ProjectBlocks.SILVER_WOOL_STAIRS);
        registerRender(ProjectBlocks.CYAN_WOOL_STAIRS);
        registerRender(ProjectBlocks.PURPLE_WOOL_STAIRS);
        registerRender(ProjectBlocks.BLUE_WOOL_STAIRS);
        registerRender(ProjectBlocks.BROWN_WOOL_STAIRS);
        registerRender(ProjectBlocks.GREEN_WOOL_STAIRS);
        registerRender(ProjectBlocks.RED_WOOL_STAIRS);
        registerRender(ProjectBlocks.BLACK_WOOL_STAIRS);
        registerRender(ProjectBlocks.WHITE_WOOL_SLAB);
        registerRender(ProjectBlocks.WHITE_WOOL_SLAB);
        registerRender(ProjectBlocks.ORANGE_WOOL_SLAB);
        registerRender(ProjectBlocks.MAGENTA_WOOL_SLAB);
        registerRender(ProjectBlocks.LIGHT_BLUE_WOOL_SLAB);
        registerRender(ProjectBlocks.YELLOW_WOOL_SLAB);
        registerRender(ProjectBlocks.LIME_WOOL_SLAB);
        registerRender(ProjectBlocks.PINK_WOOL_SLAB);
        registerRender(ProjectBlocks.GRAY_WOOL_SLAB);
        registerRender(ProjectBlocks.SILVER_WOOL_SLAB);
        registerRender(ProjectBlocks.CYAN_WOOL_SLAB);
        registerRender(ProjectBlocks.PURPLE_WOOL_SLAB);
        registerRender(ProjectBlocks.BLUE_WOOL_SLAB);
        registerRender(ProjectBlocks.BROWN_WOOL_SLAB);
        registerRender(ProjectBlocks.GREEN_WOOL_SLAB);
        registerRender(ProjectBlocks.RED_WOOL_SLAB);
        registerRender(ProjectBlocks.BLACK_WOOL_SLAB);
    }

    private static void registerRender(Block block) {
        registerRender(Item.getItemFromBlock(block));
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()),
                        "inventory"));
    }
}
