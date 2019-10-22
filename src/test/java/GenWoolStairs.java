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
public class GenWoolStairs {
    public static void main(String[] args) throws IOException {
        for (EnumDyeColor color : EnumDyeColor.values()) {
            if (color != EnumDyeColor.WHITE) {
                genBlockStatesFile(color.getName());
                genBlockModelFile(color.getName(), "wool_inner_stairs");
                genBlockModelFile(color.getName(), "wool_outer_stairs");
                genBlockModelFile(color.getName(), "wool_stairs");
            }
            System.out.println(String.format("tile.%s.%s_wool_stairs.name=%s Wool Stairs",
                    MCGProject.MOD_ID, color.getName(), WordUtils.capitalizeFully(color.getName())));
        }
    }

    /**
     * 依据白色羊毛台阶模板 blockstates 文件，生成其他颜色的羊毛台阶 blockstates 文件
     */
    private static void genBlockStatesFile(String color) throws IOException {
        File fileOutput = new File(String.format("./src/test/resources/blockstates/%s_wool_stairs.json", color));
        String strIn = FileUtils.readFileToString(new File("./src/test/resources/blockstates/white_wool_stairs.json"), StandardCharsets.UTF_8);
        String strOut = strIn.replaceAll("white", color);
        FileUtils.writeStringToFile(fileOutput, strOut, StandardCharsets.UTF_8);
    }

    /**
     * 依据白色羊毛台阶模板 model 文件，生成其他颜色的羊毛台阶 model 文件
     */
    private static void genBlockModelFile(String color, String fileSuffix) throws IOException {
        File fileOutput = new File(String.format("./src/test/resources/models/block/%s_%s.json", color, fileSuffix));
        String strIn = FileUtils.readFileToString(new File(String.format("./src/test/resources/models/block/white_%s.json", fileSuffix)), StandardCharsets.UTF_8);
        String strOut = strIn.replaceAll("white", color);
        FileUtils.writeStringToFile(fileOutput, strOut, StandardCharsets.UTF_8);
    }
}
