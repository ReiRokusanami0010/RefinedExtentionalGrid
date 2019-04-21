package RefinedExtentionalGrid;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = RefinedExtentionalGrid.MODID, name = RefinedExtentionalGrid.NAME, version = RefinedExtentionalGrid.VERSION)
@Mod.EventBusSubscriber
public class RefinedExtentionalGrid {
    public static final String MODID = "refinedextentionalgrid";
    public static final String NAME = "Refined Extentional Grid";
    public static final String VERSION = "0.1.0";

    private static Logger LOGGER;

    @Mod.Instance(RefinedExtentionalGrid.MODID)
    public static RefinedExtentionalGrid INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent Event){
        LOGGER = Event.getModLog();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent Event){
        LOGGER.info("Initialization RefinedExtentionalGrid.....");

    }
}
