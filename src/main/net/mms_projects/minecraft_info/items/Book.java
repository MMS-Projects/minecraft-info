package net.mms_projects.minecraft_info.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.materials.Leather;

public class Book extends Item {

    public Book() {
        this.addCraftingIngredient(Paper.class, 3);
        this.addCraftingIngredient(Leather.class);
    }

}
