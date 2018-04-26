package kevin801.obsidianset.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import init.ModItems;
import kevin801.obsidianset.Main;
import kevin801.obsidianset.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ToolSword extends ItemSword implements IHasModel {
	
	public ToolSword(String name, ToolMaterial material) {
		super(material); 
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
