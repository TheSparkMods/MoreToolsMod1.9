package mod.more.tools;

import mod.more.tools.client.render.items.ItemRenderRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);
		
		ItemRenderRegister.registerItemRender();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}
}
