package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.crafting.grids.TwoByTwo;
import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.materials.NetherQuartz;

public class BlockOfQuartz extends Block {

    public BlockOfQuartz() {
        this.addCraftingIngredient(NetherQuartz.class, 4);
        this.setCraftingGrid(new TwoByTwo(
            NetherQuartz.class, NetherQuartz.class,
            NetherQuartz.class, NetherQuartz.class
        ));
    }
}
