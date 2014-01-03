package net.mms_projects.minecraft_info.items.tools.wood;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class WoodenHoe extends Item {

    public WoodenHoe() {
        this.addCraftingIngredient(Planks.class, 2);
        this.addCraftingIngredient(Stick.class, 2);
    }

}
