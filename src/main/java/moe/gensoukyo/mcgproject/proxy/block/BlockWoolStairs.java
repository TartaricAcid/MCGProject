package moe.gensoukyo.mcgproject.proxy.block;

import moe.gensoukyo.mcgproject.MCGProject;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumDyeColor;

import static moe.gensoukyo.mcgproject.proxy.init.ProjectItems.BUILDING;

/**
 * @author TartaricAcid
 * @date 2019/10/21 21:54
 **/
public class BlockWoolStairs extends BlockStairs {
    private EnumDyeColor color;

    public BlockWoolStairs(EnumDyeColor color) {
        super((new Block(Material.CLOTH)).getDefaultState());
        this.setSoundType(SoundType.CLOTH);
        this.setHardness(0.8F);
        this.setRegistryName(String.format("%s_wool_stairs", color.getName()));
        this.setTranslationKey(String.format("%s.%s_wool_stairs", MCGProject.MOD_ID, color.getName()));
        this.setCreativeTab(BUILDING);
        this.color = color;
    }
}
