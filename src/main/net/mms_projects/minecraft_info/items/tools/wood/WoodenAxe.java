package net.mms_projects.minecraft_info.items.tools.wood;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class WoodenAxe extends Item {

    public WoodenAxe() {
        this.addCraftingIngredient(Planks.class, 3);
        this.addCraftingIngredient(Stick.class, 2);
    }

}