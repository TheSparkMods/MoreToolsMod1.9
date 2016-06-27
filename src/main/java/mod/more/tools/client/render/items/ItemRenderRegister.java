package mod.more.tools.client.render.items;

import mod.more.tools.Main;
import mod.more.tools.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static void registerItemRender(){
		reg(ModItems.testItem);
		reg(ModItems.dirtPickaxe);
		//reg(ModItems.dirtAxe);
		reg(ModItems.dirtSpade);
		reg(ModItems.dirtSword);
		reg(ModItems.sandPickaxe);
		//reg(ModItems.sandAxe);
		reg(ModItems.sandSpade);
		reg(ModItems.sandSword);
		reg(ModItems.netherPickaxe);
		//reg(ModItems.netherAxe);
		reg(ModItems.netherSpade);
		reg(ModItems.netherSword);
		reg(ModItems.gravelPickaxe);
		//reg(ModItems.gravelAxe);
		reg(ModItems.gravelSpade);
		reg(ModItems.gravelSword);
	}
	public static String modid = Main.MODID;
	
	public static void reg(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
