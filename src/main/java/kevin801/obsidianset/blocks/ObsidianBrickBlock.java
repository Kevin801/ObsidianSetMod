package kevin801.obsidianset.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ObsidianBrickBlock extends BlockBase {

	public ObsidianBrickBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3f);
		setResistance(16000.0F);
		setHarvestLevel("pickaxe", 1);
	}
}
