package net.mms_projects.minecraft_info.items.tools.stone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.Cobblestone;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class StoneHoe extends Item {

    public StoneHoe() {
        this.addCraftingIngredient(Cobblestone.class, 2);
        this.addCraftingIngredient(Stick.class, 2);
    }

}
