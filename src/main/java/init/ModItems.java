package init;

import java.util.ArrayList;
import java.util.List;

import kevin801.obsidianset.blocks.ObsidianBrickBlock;
import kevin801.obsidianset.items.ItemBase;
import kevin801.obsidianset.items.tools.ToolAxe;
import kevin801.obsidianset.items.tools.ToolHoe;
import kevin801.obsidianset.items.tools.ToolPickaxe;
import kevin801.obsidianset.items.tools.ToolShovel;
import kevin801.obsidianset.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final ToolMaterial TOOL_OBSIDIAN = EnumHelper.addToolMaterial("tool_obsidian", 3, 131, 8, 3F, 10);
	
	// Tools
	public static final ToolSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", TOOL_OBSIDIAN);
	public static final ToolPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", TOOL_OBSIDIAN);
	public static final ToolAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", TOOL_OBSIDIAN);
	public static final ToolHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", TOOL_OBSIDIAN);
	public static final ToolShovel OBSIDIAN_SHOVEL = new ToolShovel("obsidian_shovel", TOOL_OBSIDIAN);

	
	// armor
	
	
	public static void register() {
	}	
}
