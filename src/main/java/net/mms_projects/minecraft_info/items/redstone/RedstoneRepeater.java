package net.mms_projects.minecraft_info.items.redstone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByTwo;
import net.mms_projects.minecraft_info.items.blocks.Stone;
import net.mms_projects.minecraft_info.items.materials.Redstone;

public class RedstoneRepeater extends Item {

    public RedstoneRepeater() {
        this.addCraftingIngredient(Stone.class, 3);
        this.addCraftingIngredient(Redstone.class);
        this.addCraftingIngredient(RedstoneTorch.class, 2);
        this.setCraftingGrid(new ThreeByTwo(
            RedstoneTorch.class, Redstone.class, RedstoneTorch.class,
            Stone.class, Stone.class, Stone.class
        ));
    }

}
