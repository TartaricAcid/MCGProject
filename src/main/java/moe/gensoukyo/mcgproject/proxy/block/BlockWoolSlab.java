package moe.gensoukyo.mcgproject.proxy.block;

import moe.gensoukyo.mcgproject.MCGProject;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandBase;
import net.minecraft.command.NumberInvalidException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import static moe.gensoukyo.mcgproject.proxy.init.ProjectItems.BUILDING;

/**
 * @author TartaricAcid
 * @date 2019/10/22 18:01
 **/
public abstract class BlockWoolSlab extends BlockSlab {
    private static final PropertyEnum<BlockWoolSlab.Variant> VARIANT = PropertyEnum.create("variant", BlockWoolSlab.Variant.class);
    protected EnumDyeColor color;

    private BlockWoolSlab(EnumDyeColor color) {
        super(Material.CLOTH);
        this.setSoundType(SoundType.CLOTH);
        this.setHardness(0.8F);
        this.setCreativeTab(BUILDING);
        this.setTranslationKey(String.format("%s.%s_wool_slab", MCGProject.MOD_ID, color.getName()));
        this.color = color;
        IBlockState iblockstate = this.blockState.getBaseState();
        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }
        this.setDefaultState(iblockstate.withProperty(VARIANT, BlockWoolSlab.Variant.DEFAULT));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockWoolSlab.Variant.DEFAULT);
        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }
        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP) {
            i |= 8;
        }
        return i;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, VARIANT) : new BlockStateContainer(this, HALF, VARIANT);
    }

    @Override
    public String getTranslationKey(int meta) {
        return super.getTranslationKey();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return BlockWoolSlab.Variant.DEFAULT;
    }

    public static class Double extends BlockWoolSlab {
        public Double(EnumDyeColor color) {
            super(color);
            this.setRegistryName(String.format("%s_wool_double_slab", color.getName()));
        }

        @Override
        public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
            try {
                Item item = CommandBase.getItemByText(player, String.format("%s:%s_wool_slab", MCGProject.MOD_ID, color.getName()));
                return new ItemStack(item);
            } catch (NumberInvalidException ignore) {
            }
            return ItemStack.EMPTY;
        }

        @Override
        public boolean isDouble() {
            return true;
        }
    }

    public static class Half extends BlockWoolSlab {
        public Half(EnumDyeColor color) {
            super(color);
            this.setRegistryName(String.format("%s_wool_slab", color.getName()));
        }

        @Override
        public boolean isDouble() {
            return false;
        }
    }

    public enum Variant implements IStringSerializable {
        // 占位符
        DEFAULT;

        @Override
        public String getName() {
            return "default";
        }
    }
}
