package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.fake.Planks;

public class Chest extends Item {

    public Chest() {
        this.addCraftingIngredient(Planks.class, 8);
        this.setCraftingGrid(new ThreeByThree(
                Planks.class, Planks.class, Planks.class,
                Planks.class, null, Planks.class,
                Planks.class, Planks.class, Planks.class
        ));
    }
}
