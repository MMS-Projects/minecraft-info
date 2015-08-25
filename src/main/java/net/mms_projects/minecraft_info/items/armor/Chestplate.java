package net.mms_projects.minecraft_info.items.armor;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;

abstract public class Chestplate extends Item {

    public Chestplate(Class<? extends Item> material) {
        this.addCraftingIngredient(material, 8);
        this.setCraftingGrid(new ThreeByThree(
                material, null, material,
                material, material, material,
                material, material, material
        ));
    }
}
