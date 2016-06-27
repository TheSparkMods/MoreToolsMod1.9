package mod.more.tools;

import mod.more.tools.crafting.ModCrafting;
import mod.more.tools.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event){
		ModItems.createItems();
	}
	public void init(FMLInitializationEvent event){
		ModCrafting.initCrafting();
	}
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
