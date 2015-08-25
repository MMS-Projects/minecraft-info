package net.mms_projects.minecraft_info.items.armor;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByTwo;

abstract public class Helmet extends Item {

    public Helmet(Class<? extends Item> material) {
        this.addCraftingIngredient(material, 5);
        this.setCraftingGrid(new ThreeByTwo(
                material, material, material,
                material, null, material
        ));
    }
}