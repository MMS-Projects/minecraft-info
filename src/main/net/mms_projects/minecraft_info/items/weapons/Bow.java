package net.mms_projects.minecraft_info.items.weapons;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.String;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class Bow extends Item {

    public Bow() {
        this.addCraftingIngredient(Stick.class, 3);
        this.addCraftingIngredient(String.class, 3);
		this.setCraftingGrid(new ThreeByThree(
            null, Stick.class, String.class,
            Stick.class, null, String.class,
            null, Stick.class, String.class
        ));
    }

}
