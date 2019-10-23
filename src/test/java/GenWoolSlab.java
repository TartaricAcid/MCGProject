import moe.gensoukyo.mcgproject.MCGProject;
import net.minecraft.item.EnumDyeColor;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author TartaricAcid
 * @date 2019/10/22 16:47
 **/
public class GenWoolSlab {
    public static void main(String[] args) throws IOException {
        String str0 = "@GameRegistry.ObjectHolder(MCGProject.MOD_ID + \":\" + \"%s_wool_slab\")\n" +
                "public static BlockSlab %s_WOOL_SLAB;";

        String str1 = "@GameRegistry.ObjectHolder(MCGProject.MOD_ID + \":\" + \"%s_wool_double_slab\")\n" +
                "public static BlockSlab %s_WOOL_DOUBLE_SLAB;";

        String str2 = "registerItemSlab(event, ProjectBlocks.%s_WOOL_SLAB, ProjectBlocks.%s_WOOL_SLAB, ProjectBlocks.%s_WOOL_DOUBLE_SLAB);";
        String str3 = "registerRender(ProjectBlocks.%s_WOOL_SLAB);";

        for (EnumDyeColor color : EnumDyeColor.values()) {
            if (color != EnumDyeColor.WHITE) {
                genBlockStatesFile(color.getName());
                genBlockModelFile(color.getName());
            }
            System.out.println(String.format("tile.%s.%s_wool_slab.name=%s Wool Slab",
                    MCGProject.MOD_ID, color.getName(), WordUtils.capitalizeFully(color.getName())));

        }

        for (EnumDyeColor color : EnumDyeColor.values()) {
            System.out.println(String.format(str0, color.getName(), color.getName().toUpperCase()));
        }
        for (EnumDyeColor color : EnumDyeColor.values()) {
            System.out.println(String.format(str1, color.getName(), color.getName().toUpperCase()));
        }
        for (EnumDyeColor color : EnumDyeColor.values()) {
            System.out.println(String.format(str2, color.getName().toUpperCase(), color.getName().toUpperCase(), color.getName().toUpperCase()));
        }
        for (EnumDyeColor color : EnumDyeColor.values()) {
            System.out.println(String.format(str3, color.getName().toUpperCase()));
        }
    }

    /**
     * 依据白色羊毛台阶模板 blockstates 文件，生成其他颜色的羊毛台阶 blockstates 文件
     */
    private static void genBlockStatesFile(String color) throws IOException {
        File fileOutput = new File(String.format("./src/test/resources/blockstates/%s_wool_slab.json", color));
        String strIn = FileUtils.readFileToString(new File("./src/test/resources/blockstates/white_wool_slab.json"), StandardCharsets.UTF_8);
        String strOut = strIn.replaceAll("white", color);
        FileUtils.writeStringToFile(fileOutput, strOut, StandardCharsets.UTF_8);


        File fileOutputDouble = new File(String.format("./src/test/resources/blockstates/%s_wool_double_slab.json", color));
        String strInDouble = FileUtils.readFileToString(new File("./src/test/resources/blockstates/white_wool_double_slab.json"), StandardCharsets.UTF_8);
        String strOutDouble = strInDouble.replaceAll("white", color);
        FileUtils.writeStringToFile(fileOutputDouble, strOutDouble, StandardCharsets.UTF_8);
    }

    /**
     * 依据白色羊毛台阶模板 model 文件，生成其他颜色的羊毛台阶 model 文件
     */
    private static void genBlockModelFile(String color) throws IOException {
        File fileOutput = new File(String.format("./src/test/resources/models/block/half_slab_%s_wool.json", color));
        String strIn = FileUtils.readFileToString(new File("./src/test/resources/models/block/half_slab_white_wool.json"), StandardCharsets.UTF_8);
        String strOut = strIn.replaceAll("white", color);
        FileUtils.writeStringToFile(fileOutput, strOut, StandardCharsets.UTF_8);


        File fileOutputUpper = new File(String.format("./src/test/resources/models/block/upper_slab_%s_wool.json", color));
        String strInUpper = FileUtils.readFileToString(new File("./src/test/resources/models/block/upper_slab_white_wool.json"), StandardCharsets.UTF_8);
        String strOutUpper = strInUpper.replaceAll("white", color);
        FileUtils.writeStringToFile(fileOutputUpper, strOutUpper, StandardCharsets.UTF_8);
    }
}
