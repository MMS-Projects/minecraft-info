package net.mms_projects.minecraft_info.items.blocks.wood.planks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.JungleWood;

public class JungleWoodPlanks extends Block {

    public JungleWoodPlanks() {
        this.addCraftingIngredient(JungleWood.class);
        this.setCraftedAmount(4);
    }
}
