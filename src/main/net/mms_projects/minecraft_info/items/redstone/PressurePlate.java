package net.mms_projects.minecraft_info.items.redstone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.TwoWide;
import net.mms_projects.minecraft_info.items.blocks.Stone;

public class PressurePlate extends Item {

    public PressurePlate() {
        this.addCraftingIngredient(Stone.class, 2);
        this.setCraftingGrid(new TwoWide(Stone.class, Stone.class));
    }
}
