package net.mms_projects.minecraft_info.items.redstone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.Stone;

public class StoneButton extends Item {

    public StoneButton() {
        this.addCraftingIngredient(Stone.class);
    }

}
