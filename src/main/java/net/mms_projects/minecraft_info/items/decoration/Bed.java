package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByTwo;
import net.mms_projects.minecraft_info.items.blocks.wool.Wool;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.fake.WoolCollection;

public class Bed extends Item {

    public Bed() {
        this.addCraftingIngredient(WoolCollection.class, 3);
        this.addCraftingIngredient(Planks.class, 3);
        this.setCraftingGrid(new ThreeByTwo(
                Wool.class, Wool.class, Wool.class,
                Planks.class, Planks.class, Planks.class
        ));
    }
}
