package kevin801.obsidianset.items.tools;

import java.util.Set;

import init.ModItems;
import kevin801.obsidianset.Main;
import kevin801.obsidianset.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{

	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);		
		ModItems.ITEMS.add(this);
	}	

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
