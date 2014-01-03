package net.mms_projects.minecraft_info.items.redstone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.materials.Redstone;

public class RedstoneTorch extends Item {

    public RedstoneTorch() {
        this.addCraftingIngredient(Redstone.class);
        this.addCraftingIngredient(Planks.class);
    }

}
