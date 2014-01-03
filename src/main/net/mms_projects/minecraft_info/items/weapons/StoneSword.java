package net.mms_projects.minecraft_info.items.weapons;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.Cobblestone;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class StoneSword extends Item {

    public StoneSword() {
        this.addCraftingIngredient(Stick.class);
        this.addCraftingIngredient(Cobblestone.class, 2);
    }

}
