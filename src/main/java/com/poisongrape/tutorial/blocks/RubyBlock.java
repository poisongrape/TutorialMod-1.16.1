package com.poisongrape.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {

    public RubyBlock() {
        super(
                Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f) // hardness = how hard to break block, resistance = how well block holds up against explosions
                .sound(SoundType.METAL)
                .harvestLevel(2) // material of tool that can harvest block. 0 = wood, 1 = stone/gold, 2 = iron, 3 = diamond
                .harvestTool(ToolType.PICKAXE) // type of tool to use to harvest block.
        );
    }
}
