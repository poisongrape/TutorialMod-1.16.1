package com.poisongrape.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MeguriteBlock extends Block {
    public MeguriteBlock() {
        super(
                Block.Properties.create(Material.SAND)
                .hardnessAndResistance(1.0f, 3.0f)
                .sound(SoundType.SAND)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
