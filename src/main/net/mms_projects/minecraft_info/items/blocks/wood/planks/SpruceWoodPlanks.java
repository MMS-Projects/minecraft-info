package net.mms_projects.minecraft_info.items.blocks.wood.planks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.SpruceWood;

public class SpruceWoodPlanks extends Block {

    public SpruceWoodPlanks() {
        this.addCraftingIngredient(SpruceWood.class);
        this.setCraftedAmount(4);
    }
}
