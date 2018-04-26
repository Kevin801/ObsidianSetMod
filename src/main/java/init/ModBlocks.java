package init;

import java.util.ArrayList;
import java.util.List;

import kevin801.obsidianset.blocks.BlockBase;
import kevin801.obsidianset.blocks.ObsidianBrickBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OBSIDIAN_BRICK_BLOCK = new ObsidianBrickBlock("obsidian_brick_block", Material.IRON);
	
}
