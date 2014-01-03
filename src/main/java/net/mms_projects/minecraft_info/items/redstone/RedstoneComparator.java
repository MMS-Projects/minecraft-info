package net.mms_projects.minecraft_info.items.redstone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.blocks.Stone;
import net.mms_projects.minecraft_info.items.materials.NetherQuartz;

public class RedstoneComparator extends Item {

    public RedstoneComparator() {
        this.addCraftingIngredient(RedstoneTorch.class, 3);
        this.addCraftingIngredient(Stone.class, 3);
        this.addCraftingIngredient(NetherQuartz.class, 3);
        this.setCraftingGrid(new ThreeByThree(
            null, RedstoneTorch.class, null,
            RedstoneTorch.class, NetherQuartz.class, RedstoneTorch.class,
            Stone.class, Stone.class, Stone.class
        ));
    }
}
