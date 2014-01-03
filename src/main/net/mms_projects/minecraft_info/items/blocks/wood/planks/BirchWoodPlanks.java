package net.mms_projects.minecraft_info.items.blocks.wood.planks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.BirchWood;

public class BirchWoodPlanks extends Block {

    public BirchWoodPlanks() {
        this.addCraftingIngredient(BirchWood.class);
        this.setCraftedAmount(4);
    }
}
