package mod.more.tools.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ToolMaterial dirtToolMaterial = EnumHelper.addToolMaterial("dirtToolMaterial", 4, 10, 15.0F, 4.0F, 30);
	public static ToolMaterial gravelToolMaterial = EnumHelper.addToolMaterial("gravelToolMaterial", 4, 9, 15.0F, 2.0F, 2);
	public static ToolMaterial sandToolMaterial = EnumHelper.addToolMaterial("sandToolMaterial", 4, 5, 15.0F, 2.0F, 2);
	public static ToolMaterial netherToolMaterial = EnumHelper.addToolMaterial("netherToolMaterial", 4, 15, 15.0F, 5.0F, 2);
	
	//Why are axes doing this?
	
	public static Item testItem;
	public static Item dirtPickaxe;
	public static Item dirtSword;
	public static Item dirtSpade;
	//public static Item dirtAxe;
	public static Item gravelPickaxe;
	//public static Item gravelAxe;
	public static Item gravelSpade;
	public static Item gravelSword;
	public static Item sandPickaxe;
	//public static Item sandAxe;
	public static Item sandSpade;
	public static Item sandSword;
	public static Item netherPickaxe;
	//public static Item netherAxe;
	public static Item netherSpade;
	public static Item netherSword;
	
	public static void createItems() {
		GameRegistry.registerItem(testItem = new BasicItem("test_item"), "test_item");
		//GameRegistry.registerItem(dirtAxe = new ItemModAxe("dirtAxe", dirtToolMaterial), "dirtAxe");
		GameRegistry.registerItem(dirtSword = new ItemModSword("dirtSword", dirtToolMaterial), "dirtSword");
		GameRegistry.registerItem(dirtSpade = new ItemModSpade("dirtSpade", dirtToolMaterial), "dirtSpade");
		GameRegistry.registerItem(dirtPickaxe = new ItemModPickaxe("dirtPickaxe", dirtToolMaterial), "dirtPickaxe");
		//GameRegistry.registerItem(sandAxe = new ItemModAxe("sandAxe", sandToolMaterial), "sandAxe");
		GameRegistry.registerItem(sandSword = new ItemModSword("sandSword", sandToolMaterial), "sandSword");
		GameRegistry.registerItem(sandSpade = new ItemModSpade("sandSpade", sandToolMaterial), "sandSpade");
		GameRegistry.registerItem(sandPickaxe = new ItemModPickaxe("sandPickaxe", sandToolMaterial), "sandPickaxe");
		//GameRegistry.registerItem(gravelAxe = new ItemModAxe("gravelAxe", gravelToolMaterial), "gravelAxe");
		GameRegistry.registerItem(gravelSword = new ItemModSword("gravelSword", gravelToolMaterial), "gravelSword");
		GameRegistry.registerItem(gravelSpade = new ItemModSpade("gravelSpade", gravelToolMaterial), "gravelSpade");
		GameRegistry.registerItem(gravelPickaxe = new ItemModPickaxe("gravelPickaxe", gravelToolMaterial), "gravelPickaxe");
		//GameRegistry.registerItem(netherAxe = new ItemModAxe("netherAxe", netherToolMaterial), "netherAxe");
		GameRegistry.registerItem(netherSword = new ItemModSword("netherSword", netherToolMaterial), "netherSword");
		GameRegistry.registerItem(netherSpade = new ItemModSpade("netherSpade", netherToolMaterial), "netherSpade");
		GameRegistry.registerItem(netherPickaxe = new ItemModPickaxe("netherPickaxe", netherToolMaterial), "netherPickaxe");
	}
}
