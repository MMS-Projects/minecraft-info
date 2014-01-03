package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.blocks.wood.planks.DarkOakWoodPlanks;

public class DarkOakWoodStairs extends Item {

    public DarkOakWoodStairs() {
        this.addCraftingIngredient(DarkOakWoodPlanks.class, 6);
        this.setCraftingGrid(new ThreeByThree(
                DarkOakWoodPlanks.class, null, null,
                DarkOakWoodPlanks.class, DarkOakWoodPlanks.class, null,
                DarkOakWoodPlanks.class, DarkOakWoodPlanks.class, DarkOakWoodPlanks.class
        ));
    }
}
