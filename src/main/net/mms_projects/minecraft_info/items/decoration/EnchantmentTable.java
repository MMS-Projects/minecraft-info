package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.Book;
import net.mms_projects.minecraft_info.items.blocks.Obsidian;
import net.mms_projects.minecraft_info.items.materials.Diamond;

public class EnchantmentTable extends Item {

    public EnchantmentTable() {
        this.addCraftingIngredient(Diamond.class, 2);
        this.addCraftingIngredient(Obsidian.class, 4);
        this.addCraftingIngredient(Book.class);
        this.setCraftingGrid(new ThreeByThree(
            null, Book.class, null,
            Diamond.class, Obsidian.class, Diamond.class,
            Obsidian.class, Obsidian.class, Obsidian.class
        ));
    }

}
