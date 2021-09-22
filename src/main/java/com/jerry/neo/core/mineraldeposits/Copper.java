package com.jerry.neo.core.mineraldeposits;

import java.util.List;

import net.minecraft.block.OreBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;

public class Copper extends OreBlock {

	public Copper(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}
	
	@Override
	public void appendHoverText(ItemStack p_190948_1_, IBlockReader p_190948_2_, List<ITextComponent> p_190948_3_,
			ITooltipFlag p_190948_4_) {
		p_190948_3_.add(new TranslationTextComponent("tooltip.neo.copper"));
		super.appendHoverText(p_190948_1_, p_190948_2_, p_190948_3_, p_190948_4_);
	}
}
