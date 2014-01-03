package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.BlockOfCoal;
import net.mms_projects.minecraft_info.items.blocks.ores.CoalOre;

public class Coal extends Item {

    public Coal() {
        //this.addCraftingIngredient(BlockOfCoal.class);
        this.setCraftedAmount(9);
        this.addMinedSourceBlock(CoalOre.class);
    }

}
