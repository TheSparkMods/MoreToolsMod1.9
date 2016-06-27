package mod.more.tools.crafting;

import mod.more.tools.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModItems.dirtSpade),new Object[]{"D", "S", "S", 'D',Blocks.DIRT, 'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.dirtPickaxe),new Object[]{"DDD", " S ", " S ", 'D',Blocks.DIRT, 'S',Items.STICK});
		//GameRegistry.addRecipe(new ItemStack(ModItems.dirtAxe),new Object[]{"DD", "DS", " S", 'D',Blocks.dirt, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.dirtSword),new Object[]{"D", "D", "S", 'D',Blocks.DIRT, 'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.gravelPickaxe),new Object[]{"GGG", " S ", " S ", 'G',Blocks.GRAVEL, 'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.gravelSpade),new Object[]{"G", "S", "S", 'G',Blocks.GRAVEL, 'S',Items.STICK});  
		GameRegistry.addRecipe(new ItemStack(ModItems.gravelSword),new Object[]{"G", "G", "S", 'G',Blocks.GRAVEL, 'S',Items.STICK});
		//GameRegistry.addRecipe(new ItemStack(ModItems.gravelAxe),new Object[]{"GG", "GS", " S", 'G',Blocks.gravel, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.sandPickaxe),new Object[]{"QQQ", " S ", " S ", 'Q',Blocks.SAND, 'S',Items.STICK});
		//GameRegistry.addRecipe(new ItemStack(ModItems.sandAxe),new Object[]{"QQ", "QS", " S", 'Q',Blocks.sand, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.sandSpade),new Object[]{"Q", "S", "S", 'Q',Blocks.SAND, 'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.sandSword),new Object[]{"Q", "Q", "S", 'Q',Blocks.SAND, 'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.netherPickaxe),new Object[]{"NNN", " S ", " S ", 'N',Blocks.NETHERRACK, 'S',Items.STICK});
		//GameRegistry.addRecipe(new ItemStack(ModItems.netherAxe),new Object[]{"NN", "NS", " S", 'N',Blocks.netherrack, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.netherSpade),new Object[]{"N", "S", "S", 'N',Blocks.NETHERRACK, 'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.netherSword),new Object[]{"N", "N", "S", 'N',Blocks.NETHERRACK, 'S',Items.STICK});
	}	
}