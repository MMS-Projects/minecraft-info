package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.Coal;

public class BlockOfCoal extends Item {

    public BlockOfCoal() {
        this.addCraftingIngredient(Coal.class, 9);
        this.setCraftingGrid(new ThreeByThree(
            Coal.class, Coal.class, Coal.class,
            Coal.class, Coal.class, Coal.class,
            Coal.class, Coal.class, Coal.class
        ));
    }

}
