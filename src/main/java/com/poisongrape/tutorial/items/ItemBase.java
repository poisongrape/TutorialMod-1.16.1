package com.poisongrape.tutorial.items;

import com.poisongrape.tutorial.TutorialTab;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(TAB)); // Tab item will live in.
    }

    public static final TutorialTab TAB = new TutorialTab("VaneTab");
}
