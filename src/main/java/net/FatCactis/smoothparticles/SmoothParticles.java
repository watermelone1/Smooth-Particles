package net.FatCactis.smoothparticles;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class SmoothParticles implements ModInitializer {
	public static final String MOD_ID = "smoothparticles";

	public static ArrayList<Block> allowed = new ArrayList<Block>();

	public void onInitialize() {
		addMultiple(
				Blocks.SLIME_BLOCK,
				Blocks.HONEY_BLOCK,
				Blocks.ICE,
				Blocks.ACACIA_TRAPDOOR,
				Blocks.BIRCH_TRAPDOOR,
				Blocks.CRIMSON_TRAPDOOR,
				Blocks.IRON_TRAPDOOR,
				Blocks.JUNGLE_TRAPDOOR,
				Blocks.MANGROVE_TRAPDOOR,
				Blocks.OAK_TRAPDOOR,
				Blocks.SPRUCE_TRAPDOOR,
				Blocks.WARPED_TRAPDOOR,
				Blocks.DARK_OAK_TRAPDOOR
		);
	}

	private void addMultiple(Block... blocks) {
		for (Block block : blocks) {
			allowed.add(block);
		}
	}
}
