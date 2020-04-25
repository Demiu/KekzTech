package common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import itemBlocks.IB_TFFTStorageFieldBlockT3;
import kekztech.KekzCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Block_TFFTStorageFieldBlockT3 extends BaseGTUpdateableBlock {
	
	private static Block_TFFTStorageFieldBlockT3 instance;
	
	private Block_TFFTStorageFieldBlockT3() {
		super(Material.iron);
	}
	
	public static int getCapacity() {
		return 16000000;
	}
	
	public static Block registerBlock() {
		if(instance == null) {
			instance = new Block_TFFTStorageFieldBlockT3();
		}
		
		final String blockName = "kekztech_tfftstoragefieldblock3_block";
		instance.setBlockName(blockName);
		instance.setCreativeTab(CreativeTabs.tabMisc);
		instance.setBlockTextureName(KekzCore.MODID + ":" + "TFFTStorageFieldBlock3");
		instance.setHardness(5.0f);
		instance.setResistance(6.0f);
		GameRegistry.registerBlock(instance, IB_TFFTStorageFieldBlockT3.class, blockName);
		
		return instance;
	} 
}