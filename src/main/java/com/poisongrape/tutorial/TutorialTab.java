package com.poisongrape.tutorial;

import com.poisongrape.tutorial.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TutorialTab extends ItemGroup {
    public TutorialTab(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(RegistryHandler.RUBY.get());
    }
};
