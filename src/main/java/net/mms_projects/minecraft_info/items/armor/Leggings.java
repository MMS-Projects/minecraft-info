package net.mms_projects.minecraft_info.items.armor;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;

abstract public class Leggings extends Item {

    public Leggings(Class<? extends Item> material) {
        this.addCraftingIngredient(material, 7);
        this.setCraftingGrid(new ThreeByThree(
                material, material, material,
                material, null, material,
                material, null, material
        ));
    }
}
