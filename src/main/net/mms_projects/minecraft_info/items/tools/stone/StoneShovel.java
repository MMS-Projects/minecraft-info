package net.mms_projects.minecraft_info.items.tools.stone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.Cobblestone;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class StoneShovel extends Item {

    public StoneShovel() {
        this.addCraftingIngredient(Cobblestone.class);
        this.addCraftingIngredient(Stick.class, 2);
    }

}
