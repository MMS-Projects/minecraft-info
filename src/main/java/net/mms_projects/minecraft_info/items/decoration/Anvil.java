package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.blocks.BlockOfIron;
import net.mms_projects.minecraft_info.items.materials.IronIngot;

public class Anvil extends Item {

    public Anvil() {
        this.addCraftingIngredient(BlockOfIron.class, 3);
        this.addCraftingIngredient(IronIngot.class, 4);
        this.setCraftingGrid(new ThreeByThree(
                BlockOfIron.class, BlockOfIron.class, BlockOfIron.class,
                null, IronIngot.class, null,
                IronIngot.class, IronIngot.class, IronIngot.class
        ));
    }
}
