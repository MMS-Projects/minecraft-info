package net.mms_projects.minecraft_info.items.blocks.wood.planks;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.OakWood;

public class OakWoodPlanks extends Item {

    public OakWoodPlanks() {
        this.addCraftingIngredient(OakWood.class);
        this.setCraftedAmount(4);
    }
}
