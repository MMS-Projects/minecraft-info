package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.crafting.grids.TwoHigh;
import net.mms_projects.minecraft_info.items.Block;

public class PillarQuartzBlock extends Block {

    public PillarQuartzBlock() {
        this.addCraftingIngredient(BlockOfQuartz.class, 2);
        this.setCraftedAmount(2);
        this.setCraftingGrid(new TwoHigh(
            BlockOfQuartz.class,
            BlockOfQuartz.class
        ));
    }
}
