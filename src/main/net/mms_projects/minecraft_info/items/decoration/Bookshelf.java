package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.Book;
import net.mms_projects.minecraft_info.items.fake.Planks;

public class Bookshelf extends Item {

    public Bookshelf() {
        this.addCraftingIngredient(Planks.class, 6);
        this.addCraftingIngredient(Book.class, 3);
        this.setCraftingGrid(new ThreeByThree(
            Planks.class, Planks.class, Planks.class,
            Book.class, Book.class, Book.class,
            Planks.class, Planks.class, Planks.class
        ));
    }
}
