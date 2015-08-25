package net.mms_projects.minecraft_info.items.armor;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.TwoByThree;

abstract public class Boots extends Item {

    public Boots(Class<? extends Item> material) {
        this.addCraftingIngredient(material, 4);
        this.setCraftingGrid(new TwoByThree(
                material, null, material,
                material, null, material
        ));
    }
}