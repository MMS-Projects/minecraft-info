package net.mms_projects.minecraft_info.items.tools.wood;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class WoodenShovel extends Item {

    public WoodenShovel() {
        this.addCraftingIngredient(Planks.class);
        this.addCraftingIngredient(Stick.class, 2);
    }

}
