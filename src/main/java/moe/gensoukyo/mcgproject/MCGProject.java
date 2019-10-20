package moe.gensoukyo.mcgproject;

import moe.gensoukyo.mcgproject.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author TartaricAcid
 * @date 2019/10/20 21:58
 **/
@Mod(modid = MCGProject.MOD_ID, name = MCGProject.MOD_NAME, version = MCGProject.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class MCGProject {
    public static final String MOD_ID = "mcgproject";
    public static final String MOD_NAME = "MCG Project";
    public static final String VERSION = "@version@";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Mod.Instance
    public static MCGProject INSTANCE;

    @SidedProxy(serverSide = "moe.gensoukyo.mcgproject.proxy.CommonProxy",
            clientSide = "moe.gensoukyo.mcgproject.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
