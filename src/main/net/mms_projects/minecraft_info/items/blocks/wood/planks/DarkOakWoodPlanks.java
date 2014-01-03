package net.mms_projects.minecraft_info.items.blocks.wood.planks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.DarkOakWood;

public class DarkOakWoodPlanks extends Block {

    public DarkOakWoodPlanks() {
        this.addCraftingIngredient(DarkOakWood.class);
        this.setCraftedAmount(4);
    }
}
