package net.mms_projects.minecraft_info.items.decoration.slabs.wooden;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeWide;
import net.mms_projects.minecraft_info.items.blocks.wood.planks.OakWoodPlanks;

public class OakWoodSlab extends Item {

    public OakWoodSlab() {
        this.setId(126, "wooden_slab");
        this.setDataValue(0);
        this.addCraftingIngredient(OakWoodPlanks.class, 3);
        this.setCraftingGrid(new ThreeWide(
            OakWoodPlanks.class, OakWoodPlanks.class, OakWoodPlanks.class
        ));
    }
}
