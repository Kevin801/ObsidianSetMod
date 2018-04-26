package kevin801.obsidianset.items.tools;

import java.util.Set;

import init.ModItems;
import kevin801.obsidianset.Main;
import kevin801.obsidianset.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemTool;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material) {
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
