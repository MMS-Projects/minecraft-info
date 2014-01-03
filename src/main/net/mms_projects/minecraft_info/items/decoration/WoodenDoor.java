package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.TwoByThree;
import net.mms_projects.minecraft_info.items.fake.Planks;

public class WoodenDoor extends Item {

    public WoodenDoor() {
        this.addCraftingIngredient(Planks.class, 6);
        this.setCraftingGrid(new TwoByThree(
            Planks.class, Planks.class,
            Planks.class, Planks.class,
            Planks.class, Planks.class
        ));
    }
}
