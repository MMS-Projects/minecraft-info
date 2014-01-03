package net.mms_projects.minecraft_info.items.blocks.wood.planks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.AcaciaWood;

public class AcaciaWoodPlanks extends Block {

    public AcaciaWoodPlanks() {
        this.addCraftingIngredient(AcaciaWood.class);
        this.setCraftedAmount(4);
    }
}
