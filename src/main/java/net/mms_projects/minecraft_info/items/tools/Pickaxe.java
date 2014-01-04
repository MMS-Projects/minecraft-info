package net.mms_projects.minecraft_info.items.tools;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.Stick;

abstract public class Pickaxe extends Item {

    public Pickaxe(Class<? extends Item> material) {
        this.addCraftingIngredient(material, 3);
        this.addCraftingIngredient(Stick.class, 3);
        this.setCraftingGrid(new ThreeByThree(
            material, material, material,
            null, Stick.class, null,
            null, Stick.class, null
        ));
    }
}
