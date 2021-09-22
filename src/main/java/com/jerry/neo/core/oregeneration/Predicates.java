package com.jerry.neo.core.oregeneration;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;

public class Predicates {

	public static final RuleTest ANDESITE = new BlockMatchRuleTest(Blocks.ANDESITE);
	public static final RuleTest DIORITE = new BlockMatchRuleTest(Blocks.DIORITE);
	public static final RuleTest GRANITE = new BlockMatchRuleTest(Blocks.GRANITE);
}
