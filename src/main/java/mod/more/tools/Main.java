package mod.more.tools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "mtm";
	public static final String NAME = "More Tools Mod";
	public static final String VERSION = "1.9.4";
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide="mod.more.tools.ClientProxy", serverSide="mod.more.tools.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		this.proxy.preInit(event);
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		this.proxy.init(event);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		this.proxy.postInit(event);
	}
}